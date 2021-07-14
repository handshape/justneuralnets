package com.handshape.justneuralnets.repo;

import com.handshape.justneuralnets.JNNModelSpec;
import com.handshape.justneuralnets.repo.abs.BlobContainerClientImpl;
import com.handshape.justneuralnets.repo.abs.IBlobClient;
import com.handshape.justneuralnets.repo.abs.IBlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.apache.commons.codec.digest.DigestUtils;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;

import java.io.*;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/**
 * @author jturner
 */
public class AbsJnnRepository implements IJnnRepository {

    // Used for keyed-hash purposes, approved under ITSP.40.111
    // THIS MUST BE THE SAME FOR ALL REPOS
    private final MessageDigest digest = DigestUtils.getSha256Digest();
    private final IBlobContainerClient container;

    public AbsJnnRepository(String connectionString, String containerName) {
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString(connectionString)
                .buildClient();
        container = new BlobContainerClientImpl(blobServiceClient.getBlobContainerClient(containerName));
    }

    public AbsJnnRepository(IBlobContainerClient client) {
        container = client;
    }

    @Override
    public String put(byte[] byteArray) throws IOException {
        String hdigest = DigestUtils.sha256Hex(byteArray);
        IBlobClient blob = container.getBlobClient(hdigest);
        blob.upload(new ByteArrayInputStream(byteArray), byteArray.length, true);
        return hdigest;
    }

    @Override
    public String put(MultiLayerNetwork network) throws IOException {
        String hdigest = null;
        hdigest = DigestUtils.sha256Hex(network.params().data().asBytes());

        File workingFile = File.createTempFile("abstemp", ".buf");
        network.save(workingFile);
        try {
            IBlobClient blob = container.getBlobClient(hdigest);
            blob.uploadFromFile(workingFile.getAbsolutePath(), true);
        } catch (UncheckedIOException ex) {
            System.err.printf("Failed to upload from file %s%n", ex.getMessage());
        } finally {
            if (!workingFile.delete()) {
                workingFile.deleteOnExit();
            }
        }
        return hdigest;
    }

    @Override
    public String put(JNNModelSpec spec) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        spec.writeTo(baos);
        return put(baos.toByteArray());
    }

    @Override
    public MultiLayerNetwork getMultiLayerNetwork(String key) throws IOException {
        File workingFile = File.createTempFile("abstemp", ".buf");
        try {
            IBlobClient blob = container.getBlobClient(key);
            blob.downloadToFile(workingFile.getAbsolutePath(), true);
            return MultiLayerNetwork.load(workingFile, false);
        } finally {
            if (!workingFile.delete()) {
                workingFile.deleteOnExit();
            }
        }
    }

    @Override
    public JNNModelSpec getModelSpec(String key) throws IOException {
        return JNNModelSpec.readFrom(new ByteArrayInputStream(getBytes(key)));
    }

    @Override
    public byte[] getBytes(String key) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        IBlobClient blob = container.getBlobClient(key);
        blob.download(baos);
        return baos.toByteArray();
    }

}
