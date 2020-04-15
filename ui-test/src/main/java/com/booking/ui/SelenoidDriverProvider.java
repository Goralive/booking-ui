package com.booking.ui;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class SelenoidDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        DesiredCapabilities browser = new DesiredCapabilities();
        browser.setBrowserName("chrome");
        browser.setVersion("latest");
        browser.setCapability("enableVNC", true);

        try {
            RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://35.204.20.183:4444/wd/hub").toURL(),
                    browser);
            driver.manage().window().setSize(new Dimension(1200,1024));
            driver.setFileDetector(new LocalFileDetector());
            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
