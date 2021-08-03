package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.KeyEvent;

public class AddToCart extends Base {
    @FindBy(xpath = "//input[@id = 'ctl00_TopSearch1_txtSearch']")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"listSearchResult\"]/div[1]/div[3]/div[1]/a")
    WebElement book;

    @FindBy(xpath = "//*[@id=\"ctl00_phBody_ProductDetail_divAddtoCart\"]/a/input")
    WebElement buyNow;

    @FindBy(xpath = "//div[@class='shopping-content'][1]/div[3]/input[1]")
    WebElement quantityBox;

    public AddToCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void setSearch() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        search.click();
        Thread.sleep(2000);
        log.info("searching the author name");
        search.sendKeys("Sudha Murthy");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        book.click();
        Thread.sleep(2000);
        buyNow.click();
        Thread.sleep(5000);
    }
    public void updateQuantity() throws InterruptedException {
        driver.switchTo().frame(1);
        quantityBox.clear();
        log.info("changing the value of the quantity box");
        quantityBox.sendKeys("2");
        quantityBox.click();
        Thread.sleep(2000);
    }

}
