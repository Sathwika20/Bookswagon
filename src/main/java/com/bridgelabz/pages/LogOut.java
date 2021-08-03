package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends Base {
    @FindBy(xpath = "//span[@id = 'ctl00_lblUser']")
    WebElement userAccountName;

    @FindBy(xpath = "//a[@id = 'ctl00_lnkbtnLogout']")
    WebElement logoutButton;

    public LogOut(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void logoutFromTheAccount(){
        log.info("Hovering to the accountNmae");
        Actions actions = new Actions(driver);
        actions.moveToElement(userAccountName).build().perform();
        log.info("clicking on logout button");
        logoutButton.click();
    }
}
