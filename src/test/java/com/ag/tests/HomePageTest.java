package com.ag.tests;

import com.ag.base.BasePage;
import com.ag.pages.HomePage;
import com.ag.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
        driver = basePage.initDriver("chrome");

        homePage = new HomePage(driver);
    }

    @Test
    public void verifyHomePageTitle(){

        String title = homePage.getHomePageTitle();
        Assert.assertEquals(title, Constants.HOMEPAGE_TITLE);
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
