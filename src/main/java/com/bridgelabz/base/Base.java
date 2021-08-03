package com.bridgelabz.base;


import com.bridgelabz.utility.MyScreenRecorder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    public static WebDriver driver;
    public static Logger log = LogManager.getLogger(String.valueOf(Base.class));
    //Before execution
    @BeforeTest
    public void setUp() throws Exception {
        MyScreenRecorder.startRecording("Test started");
        //launches the chromedriver using WebDriver interface
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.info("launching chrome broswer");
        //Used to maximise the window
        driver.manage().window().maximize();
        log.info("entering application URL");
        driver.get("https://www.bookswagon.com/");
        Thread.sleep(3000);
    }
    //After execution
    @AfterTest
    public void tearDown() throws Exception {
        //used to close the current window
        log.info("Browser is closed");
        driver.close();
        MyScreenRecorder.stopRecording();
    }
}
