package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.AddToCart;
import com.bridgelabz.pages.CheckOutPage;
import com.bridgelabz.pages.LogOut;
import com.bridgelabz.pages.Login;
import com.bridgelabz.utility.ReadExcel;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;


public class BooksWagonTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Logging into the account using valid credentials")
    @Test(priority = 1,dataProvider = "data-provider", dataProviderClass = ReadExcel.class)
    public void login_into_application(String userName, String passWord) throws InterruptedException {
        Login login = new Login(driver);
        login.setLogin(userName, passWord);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Searching for the product and adding it into the cart")
    @Test(priority = 2)
    public void getSearch() throws InterruptedException, AWTException {
        AddToCart cart = new AddToCart(driver);
        cart.setSearch();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Updating the quantity box of the product using positive value")
    @Test(priority = 3)
    public void update_cart() throws InterruptedException {
        AddToCart cart = new AddToCart(driver);
        cart.updateQuantity();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Buy Grandma's Bag of Stories book by Sudha Murthy, Sudha, 9780143333623 - Bookswagon.com");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Placing the order by enter valid address and making payment")
    @Test(priority = 4)
    public void click_on_placeOrder() throws InterruptedException {
        CheckOutPage checkOut = new CheckOutPage(driver);
        checkOut.placeTheOrder();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Bookswagon.com: Buy Books Online: Bookstore in India: Highest Discount");
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Clicking on logout after placing the order successfully")
    @Test(priority = 5)
    public void click_on_logout(){
        LogOut logOut = new LogOut(driver);
        logOut.logoutFromTheAccount();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
}
