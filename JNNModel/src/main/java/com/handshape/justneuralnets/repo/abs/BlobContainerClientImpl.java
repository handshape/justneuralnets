package com.handshape.justneuralnets.repo.abs;

import com.azure.storage.blob.BlobContainerClient;

/**
 *
 * @author jturner
 */
public class BlobContainerClientImpl implements IBlobContainerClient {

    private final BlobContainerClient containerClient;

    public BlobContainerClientImpl(BlobContainerClient base) {
        this.containerClient = base;
    }

    public IBlobClient getBlobClient(String key) {
        return new BlobClientImpl(containerClient.getBlobClient(key));
    }
}
