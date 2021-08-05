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
    public String click_on_login_button(){
        log.info("click on login button");
        return pro.getProperty("login_xpath");
    }
    public String getLoginUserName(){
        log.info("Provide the userName");
        return pro.getProperty("userName_xpath");
    }
    public String getPassword(){
        log.info("Provide the password");
        return pro.getProperty("password_xpath");
    }
    public String getLoginButton(){
        log.info("click on login button after entering valid credentials");
        return pro.getProperty("loginButton_xpath");
    }

}
