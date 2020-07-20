package com.ag.base;

import com.ag.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

/**
 * Created by Devashish on 18-06-2020.
 */
public class BaseTest {

    public WebDriver driver;
    public Properties properties;
    public BasePage basePage;
    public HomePage homePage;

    @BeforeClass
    public void setupBase(){

        basePage = new BasePage();
        properties = basePage.initProperties();

        driver = basePage.initDriver("chrome");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
