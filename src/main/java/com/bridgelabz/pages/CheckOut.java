package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.ObjectRepositoryLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class CheckOut extends Base {
    @FindBy(xpath = "//input[@id = 'BookCart_lvCart_imgPayment']")
    WebElement placeOrder;

    @FindBy(xpath = "//div[@class = 'continue-button']")
    WebElement clickOnContinue;

    @FindBy(xpath = "//input[@id = 'ctl00_cpBody_txtNewRecipientName']")
    WebElement nameOfTheRecipient;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_txtNewAddress\"]")
    WebElement address;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_ddlNewCountry\"]")
    WebElement selectCountry;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_ddlNewCountry\"]/option[77]")
    WebElement countryName;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_ddlNewState\"]")
    WebElement selectState;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_ddlNewState\"]/option[35]")
    WebElement stateName;

    @FindBy(xpath = "//input[@id = 'ctl00_cpBody_txtNewPincode']")
    WebElement pinCode;

    @FindBy(xpath = "//input[@id = 'ctl00_cpBody_txtNewMobile']")
    WebElement mobileNumber;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_ddlNewCities\"]")
    WebElement selectCity;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_ddlNewCities\"]/option[25]")
    WebElement cityName;

    @FindBy(xpath = "//*[@id=\"ctl00_cpBody_plnShippingAdd\"]/div[14]/div")
    WebElement saveAndContinue;

    @FindBy(xpath = "//input[@id = 'ctl00_cpBody_ShoppingCart_lvCart_savecontinue']")
    WebElement saveAndContinueInCart;

    @FindBy(xpath = "//*[@id=\"cc\"]")
    WebElement paymentPage;

    public CheckOut(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void placeTheOrder() throws InterruptedException, IOException {
        ObjectRepositoryLibrary utils = new ObjectRepositoryLibrary();
        placeOrder.click();
        Thread.sleep(2000);
        clickOnContinue.click();
        Thread.sleep(2000);
        log.info("setting the address of the user");
        nameOfTheRecipient.sendKeys(utils.enter_name_of_recipient());
        address.sendKeys(utils.enter_address());
        log.info("select country");
        selectCountry.click();
        Thread.sleep(2000);
        countryName.click();
        log.info("select state");
        selectState.click();
        Thread.sleep(2000);
        stateName.click();
        log.info("enter the pinCode");
        pinCode.sendKeys(utils.enter_pinCode());
        log.info("enter the mobileNumber");
        mobileNumber.sendKeys(utils.enter_mobileNumber());
        log.info("select city");
        selectCity.click();
        Thread.sleep(2000);
        cityName.click();
        saveAndContinue.click();
        Thread.sleep(5000);
        saveAndContinueInCart.click();
        Thread.sleep(3000);
        Assert.assertTrue(paymentPage.isDisplayed());
    }
}
