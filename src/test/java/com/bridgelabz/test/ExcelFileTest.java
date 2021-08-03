package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LogOut;
import com.bridgelabz.pages.Login;
import com.bridgelabz.utility.ReadExcel;
import org.testng.annotations.Test;

public class ExcelFileTest extends Base {
    @Test(dataProvider = "data-provider", dataProviderClass = ReadExcel.class)
    public static void getLogin(String userName, String password) throws InterruptedException {
        Login login = new Login(driver);
        login.setLogin(userName, password);
        Thread.sleep(5000);
        LogOut logout = new LogOut(driver);
        logout.logoutFromTheAccount();
        Thread.sleep(5000);
    }

}
