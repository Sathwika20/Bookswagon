package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginWithInvalidCredentials;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithInvalidCredentialsTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Logging into the account using invalid credentials")
    @Test(priority = 1)
    public void login_with_invalid_credentials() throws InterruptedException {
        LoginWithInvalidCredentials login = new LoginWithInvalidCredentials(driver);
        login.setLogin();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Displays the error message shown")
    @Test(priority = 2)
     public void get_error_message() {
        LoginWithInvalidCredentials login = new LoginWithInvalidCredentials(driver);
         login.getErrorMessage();
         System.out.println(driver.getTitle());
         Assert.assertEquals(driver.getTitle(),"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
     }

}
