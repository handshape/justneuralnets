package com.handshape.justneuralnets.repo.abs;

/**
 * Interface describing the portion of MS' ABS client that we consume (and mock)
 * @author jturner
 */
public interface IBlobContainerClient {
    public IBlobClient getBlobClient(String key);
}
