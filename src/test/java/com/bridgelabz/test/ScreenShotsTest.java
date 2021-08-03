package com.bridgelabz.test;

import com.bridgelabz.utility.listeners.CustomListener;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotsTest {
    @Severity(SeverityLevel.NORMAL)
    @Description("Screenshots are taken for failed test cases")
    @Test()
    public void takeScreenShot() {
        Assert.assertEquals(true, true);
    }
}
