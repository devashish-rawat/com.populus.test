package com.ag.tests;

import com.ag.base.BasePage;
import com.ag.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Devashish on 09-06-2020.
 */
public class HomePageTest {

    WebDriver driver;
    BasePage basePage;
    HomePage homePage;

    @BeforeTest
    public void setup(){

        basePage = new BasePage();
        driver = basePage.initDriver("firefox");

        homePage = new HomePage(driver);
    }

    @Test
    public void verifyPageTitle(){

    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
