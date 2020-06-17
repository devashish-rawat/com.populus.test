package com.ag.tests;

import com.ag.base.BasePage;
import com.ag.pages.ContactPage;
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
public class ContactPageTest {

    WebDriver driver;
    BasePage basePage;
    HomePage homePage;
    ContactPage contactPage;

    @BeforeTest
    public void setup(){

        basePage = new BasePage();
        driver = basePage.initDriver("chrome");

        homePage = new HomePage(driver);
        contactPage = homePage.navigateToContactPage();
    }

    @Test
    public void verifyContactPageTitle(){

        String title = contactPage.getContactPageTitle();
        Assert.assertEquals(title, Constants.CONTACTPAGE_TITLE);
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }

}
