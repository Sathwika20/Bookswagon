package com.bridgelabz.test;

import com.bridgelabz.utility.listeners.CustomListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotsTest {
    @Description("Screenshots are taken for failed test cases")
    @Test()
    public void takeScreenShot() {
        Assert.assertEquals(true, true);
    }
}
