package com.handshape.justneuralnets.repo.abs;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Interface describing the portion of MS' ABS blob client that we consume (and mock)
 * @author jturner
 */
public interface IBlobClient {

    public void upload(InputStream byteArrayInputStream, int length, boolean b);

    public void uploadFromFile(String absolutePath, boolean b);

    public void downloadToFile(String absolutePath, boolean b);

    public void download(OutputStream baos);
    
}
