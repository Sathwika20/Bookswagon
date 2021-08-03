package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.AddToCartWithNegativeQuantity;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AddToCartWithNegativeCredentialsTest extends Base {
    @Severity(SeverityLevel.NORMAL)
    @Description("Searching for the book and adding the product into the cart")
    @Test(priority = 1)
    public void search() throws InterruptedException, AWTException {
        AddToCartWithNegativeQuantity add = new AddToCartWithNegativeQuantity(driver);
        add.setSearch();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Updating the quantity box using negative value")
    @Test(priority = 2)
    public void addToCart() throws InterruptedException {
        AddToCartWithNegativeQuantity add = new AddToCartWithNegativeQuantity(driver);
        add.updateQuantityWithNegativeValue();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Displays the error message shown")
    @Test(priority = 3)
    public void get_error_message() throws InterruptedException {
        AddToCartWithNegativeQuantity add = new AddToCartWithNegativeQuantity(driver);
        add.getErrorMessage();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
}
