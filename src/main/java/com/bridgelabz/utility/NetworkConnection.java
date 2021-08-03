package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkConnection extends Base {
    public void checkNetworkConnection() throws InterruptedException, IOException {
        try {
            log.info("checking the network connection");
            URL url = new URL(driver.getCurrentUrl());
            Thread.sleep(1000);
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet connected");
            log.info("Network is connected");
        } catch (CustomException e) {
            e.printStackTrace();
            System.out.println("Internet not connected");
            log.warn("Network is not connected/disconnected");
        }
    }
}

