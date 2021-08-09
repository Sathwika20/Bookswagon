package com.bridgelabz.utility;

import com.bridgelabz.base.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepositoryLibrary extends Base {
    Properties pro;

    public ObjectRepositoryLibrary() throws IOException {
        log.info("Set the path name for the file");
        File src = new File("C:\\Users\\gopir\\IdeaProjects\\Bookswagon\\src\\test\\java\\com\\bridgelabz\\test\\config.properties");
        FileInputStream fis = new FileInputStream(src);
        pro = new Properties();
        pro.load(fis);
    }
    public String enter_name_of_recipient(){
        log.info("enter name of the recipient");
        return pro.getProperty("nameOfTheRecipient");
    }
    public String enter_address(){
        log.info("enter address");
        return pro.getProperty("address");
    }
    public String enter_pinCode(){
        log.info("enter pinCode");
        return pro.getProperty("pinCode");
    }
    public String enter_mobileNumber(){
        log.info("enter mobile number");
        return pro.getProperty("mobileNumber");
    }
}
