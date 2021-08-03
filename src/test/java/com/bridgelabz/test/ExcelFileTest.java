package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LogOut;
import com.bridgelabz.pages.Login;
import com.bridgelabz.utility.ReadExcel;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class ExcelFileTest extends Base {
    @Severity(SeverityLevel.NORMAL)
    @Description("Logging into the account using excel data")
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
