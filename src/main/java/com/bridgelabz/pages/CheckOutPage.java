package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Base {
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

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void placeTheOrder() throws InterruptedException {
        placeOrder.click();
        Thread.sleep(2000);
        clickOnContinue.click();
        Thread.sleep(2000);
        log.info("setting the address of the user");
        nameOfTheRecipient.sendKeys("sathwika");
        address.sendKeys("H.No: 5-3-160/G,HarithaEnclave,kamareddy");
        selectCountry.click();
        Thread.sleep(2000);
        countryName.click();
        selectState.click();
        Thread.sleep(2000);
        stateName.click();
        pinCode.sendKeys("503111");
        mobileNumber.sendKeys("7989216041");
        selectCity.click();
        Thread.sleep(2000);
        cityName.click();
        saveAndContinue.click();
        Thread.sleep(5000);
        saveAndContinueInCart.click();
        Thread.sleep(3000);
    }
}
