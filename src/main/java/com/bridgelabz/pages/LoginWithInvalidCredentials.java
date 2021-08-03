package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithInvalidCredentials extends Base {
    @FindBy(xpath = "//a[text() = 'Login']")
    WebElement loginButton;

    @FindBy(xpath = "//input[@id = 'ctl00_phBody_SignIn_txtEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id = 'ctl00_phBody_SignIn_txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id = 'ctl00_phBody_SignIn_btnLogin']")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"ctl00_phBody_SignIn_lblmsg\"]")
    WebElement errorMessage;

    public LoginWithInvalidCredentials(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setLogin() throws InterruptedException {
        loginButton.click();
        Thread.sleep(2000);
        log.info("setting the username");
        email.sendKeys("sathwika@gmail.com");
        Thread.sleep(1000);
        log.info("setting the password");
        password.sendKeys("abc77");
        Thread.sleep(1000);
        login.click();
        Thread.sleep(2000);
    }
    public String getErrorMessage() {
        String message = errorMessage.getText();
        System.out.println(message);
        return message;
    }
}
