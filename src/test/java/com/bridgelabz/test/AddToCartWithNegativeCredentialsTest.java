package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.AddToCartWithNegativeQuantity;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AddToCartWithNegativeCredentialsTest extends Base {
    @Test(priority = 1)
    public void search() throws InterruptedException, AWTException {
        AddToCartWithNegativeQuantity add = new AddToCartWithNegativeQuantity(driver);
        add.setSearch();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
    @Test(priority = 2)
    public void addToCart() throws InterruptedException {
        AddToCartWithNegativeQuantity add = new AddToCartWithNegativeQuantity(driver);
        add.updateQuantityWithNegativeValue();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
    @Test(priority = 3)
    public void get_error_message() throws InterruptedException {
        AddToCartWithNegativeQuantity add = new AddToCartWithNegativeQuantity(driver);
        add.getErrorMessage();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
}
