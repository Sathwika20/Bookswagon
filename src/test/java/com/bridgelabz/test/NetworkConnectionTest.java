package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.NetworkConnection;
import org.testng.annotations.Test;

import java.io.IOException;

public class NetworkConnectionTest extends Base {
    @Test()
    public void check_network_connection() throws IOException, InterruptedException {
        NetworkConnection connection = new NetworkConnection();
        connection.checkNetworkConnection();
    }
}
