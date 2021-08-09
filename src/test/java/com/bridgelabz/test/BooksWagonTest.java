package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.*;
import com.bridgelabz.utility.EmailReports;
import com.bridgelabz.utility.ReadExcel;
import com.bridgelabz.utility.ScreenShots;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;


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
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Getting all the results for book name given in the search bar")
    @Test(priority = 3)
    public void getBooks() throws InterruptedException {
        AddToCart cart = new AddToCart(driver);
        cart.getBook();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("selecting and clicking the book we want to add in cart")
    @Test(priority = 4)
    public void clickOnBook() throws InterruptedException {
        AddToCart cart = new AddToCart(driver);
        cart.click_on_book();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Updating the quantity box of the product using positive value")
    @Test(priority = 5)
    public void update_cart() throws InterruptedException {
        AddToCart cart = new AddToCart(driver);
        cart.updateQuantity();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Placing the order by enter valid address and making payment")
    @Test(priority = 6)
    public void click_on_placeOrder() throws InterruptedException, IOException {
        CheckOut login = new CheckOut(driver);
        login.placeTheOrder();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Clicking on logout after placing the order successfully")
    @Test(priority = 7)
    public void click_on_logout(){
        LogOut logOut = new LogOut(driver);
        logOut.logoutFromTheAccount();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Sending the emails of reports")
    @Test(priority = 8)
    public static void sendEmailReports(){
        EmailReports email = new EmailReports();
        email.sendReportsThroughEmail();
    }
}
