package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.EmailReports;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class EmailReportsTest extends Base {
    @Description("Sending the emails of reports")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public static void sendEmailReports(){
        EmailReports email = new EmailReports();
        email.sendReportsThroughEmail();
    }
}
