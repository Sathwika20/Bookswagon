package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginUsingObjectRepositoryLibrary;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginUsingObjectRepositoryTest extends Base {
    @Test
    public void login_using_objectRepository() throws IOException, InterruptedException {
        LoginUsingObjectRepositoryLibrary login = new LoginUsingObjectRepositoryLibrary();
        login.getUserCredentials();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
}
