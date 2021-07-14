package com.handshape.justneuralnets.repo.abs;

import com.handshape.justneuralnets.repo.abs.IBlobContainerClient;
import com.handshape.justneuralnets.repo.abs.IBlobClient;
import java.util.HashMap;

/**
 *
 * @author jturner
 */
public class BlobContainerClientMock implements IBlobContainerClient {

    HashMap<String, IBlobClient> map = new HashMap<>();

    @Override
    public IBlobClient getBlobClient(String key) {
        if (!map.containsKey(key)) {
            map.put(key, new BlobClientMock());
        }
        return map.get(key);
    }

}
