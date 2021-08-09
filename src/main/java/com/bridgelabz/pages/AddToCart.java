package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddToCart extends Base {
    @FindBy(xpath = "//input[@id = 'ctl00_TopSearch1_txtSearch']")
    WebElement search;

    @FindBy(xpath = "//div[@class = 'title']")
    List<WebElement> Books;

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
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"sudha murthy - Books - 24x7 online bookstore Bookswagon.com");
    }
    public void getBook() throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < Books.size(); i++) {
            String books = Books.get(i).getText();
            list.add(books);
            System.out.println(books);
        }
    }
    public void click_on_book() throws InterruptedException {
       Books.get(6).click();
       Thread.sleep(2000);
       buyNow.click();
       Thread.sleep(2000);
        Assert.assertTrue(Books.get(6).isDisplayed());
    }
    public void updateQuantity() throws InterruptedException {
        driver.switchTo().frame(1);
        quantityBox.clear();
        log.info("changing the value of the quantity box");
        quantityBox.sendKeys("2");
        quantityBox.click();
        Thread.sleep(2000);
        Assert.assertTrue(quantityBox.isDisplayed());
    }
}
