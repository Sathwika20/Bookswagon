package com.bridgelabz.utility;

import com.bridgelabz.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenShots extends Base {
    public static void takeScreenShot(String ScreenShotName, String result) throws IOException {
        //TakeScreenShot is the interface to capture the screen shots of the application
        log.info("Capturing ScreenShot");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //save the image as jpg or png format and save the picture in the particular directory that is given as pathname
        FileUtils.copyFile(source, new File("./ScreenShots//" + result + "\\" + ScreenShotName + "_" + ".jpg"));
        log.info("ScreenShot saved in file");
    }
}
