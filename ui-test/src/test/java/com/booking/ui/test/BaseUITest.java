package com.booking.ui.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.booking.api.ProjectConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void setUpBrowser() {
        ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
        RestAssured.baseURI = config.baseUrl();
        Configuration.baseUrl = config.baseUrl();
       // Configuration.browser = "com.booking.ui.SelenoidDriverProvider";
        Configuration.browser = "firefox";
    }

    @AfterMethod
    public void tearDown(){
        Selenide.close();
    }

    protected <T> T at(Class<T> pageClass){
        return Selenide.page(pageClass);
    }
}
