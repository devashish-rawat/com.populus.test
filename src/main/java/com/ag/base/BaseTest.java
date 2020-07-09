package com.ag.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

/**
 * Created by Devashish on 18-06-2020.
 */
public class BaseTest {

    public WebDriver driver;
    public Properties properties;
    public BasePage basePage;

    @BeforeTest
    public void setupBase(){

        basePage = new BasePage();
        properties = basePage.initProperties();

        driver = basePage.initDriver("chrome");
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
