package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.ObjectRepositoryLibrary;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginUsingObjectRepositoryLibrary extends Base {
    public void getUserCredentials() throws IOException, InterruptedException {
        ObjectRepositoryLibrary utils = new ObjectRepositoryLibrary();
        log.info("Give the valid credentials of the user to login into Flipkart");
        driver.findElement(By.xpath(utils.click_on_login_button())).click();
        driver.findElement(By.xpath(utils.getLoginUserName())).sendKeys("gopirajsathwika1999@gmail.com");
        driver.findElement(By.xpath(utils.getPassword())).sendKeys("ABCdef123");
        driver.findElement(By.xpath(utils.getLoginButton())).click();
        Thread.sleep(2000);
        log.info("End of the test");
    }
}
