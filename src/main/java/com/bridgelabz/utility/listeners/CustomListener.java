package com.bridgelabz.utility.listeners;

import com.bridgelabz.base.Base;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static com.bridgelabz.utility.ScreenShots.takeScreenShot;

public class CustomListener extends Base implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("Test cases has started "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed " + result.getName());
        log.info("Test case is Success");
        try {
            takeScreenShot(result.getName(), "success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Allure.addAttachment(result.getName(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test passed " + result.getName());
        log.warn("Test case is failed");
        try {
            takeScreenShot(result.getName(), "Failed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Allure.addAttachment(result.getName(), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test cases skipped "+result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test cases failed with success percentage "+result.getName());


    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test cases failed with Timeout "+result.getName());

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test cases started");

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test cases finished");

    }
}
