package com.handshape.justneuralnets.repo.abs;

import com.handshape.justneuralnets.repo.abs.IBlobClient;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author jturner
 */
public class BlobClientMock implements IBlobClient {

    byte[] store = null;

    @Override
    public void upload(InputStream is, int length, boolean b) {
        try {
            store = IOUtils.readFully(is, length);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void uploadFromFile(String absolutePath, boolean b) {
        try {
            store = FileUtils.readFileToByteArray(new File(absolutePath));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void downloadToFile(String absolutePath, boolean b) {
        try {
            FileUtils.writeByteArrayToFile(new File(absolutePath), store);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void download(OutputStream baos) {
        try {
            baos.write(store);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
