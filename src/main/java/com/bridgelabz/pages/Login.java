package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
    @FindBy(xpath = "//a[text() = 'Login']")
    WebElement loginButton;

    @FindBy(xpath = "//input[@id = 'ctl00_phBody_SignIn_txtEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id = 'ctl00_phBody_SignIn_txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id = 'ctl00_phBody_SignIn_btnLogin']")
    WebElement login;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setLogin(String userName, String passWord) throws InterruptedException {
        loginButton.click();
        Thread.sleep(2000);
        log.info("setting the username");
        email.sendKeys(userName);
        Thread.sleep(1000);
        log.info("setting the password");
        password.sendKeys(passWord);
        Thread.sleep(1000);
        login.click();
        Thread.sleep(2000);
    }
}
