package com.handshape.justneuralnets.repo.abs;

import com.azure.storage.blob.BlobClient;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author jturner
 */
public class BlobClientImpl implements IBlobClient {

    private final BlobClient blob;

    public BlobClientImpl(BlobClient base) {
        this.blob = base;
    }

    @Override
    public void upload(InputStream byteArrayInputStream, int length, boolean b) {
        blob.upload(byteArrayInputStream, length, b);
    }

    @Override
    public void uploadFromFile(String absolutePath, boolean b) {
        blob.uploadFromFile(absolutePath, b);
    }

    @Override
    public void downloadToFile(String absolutePath, boolean b) {
        blob.downloadToFile(absolutePath, b);
    }

    @Override
    public void download(OutputStream baos) {
        blob.download(baos);
    }

}
