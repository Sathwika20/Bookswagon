package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.NetworkConnection;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.io.IOException;

public class NetworkConnectionTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Checking the network connection")
    @Test()
    public void check_network_connection() throws IOException, InterruptedException {
        NetworkConnection connection = new NetworkConnection();
        connection.checkNetworkConnection();
    }
}
