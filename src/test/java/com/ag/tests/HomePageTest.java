package com.ag.tests;


import com.ag.base.BaseTest;
import com.ag.pages.HomePage;
import com.ag.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Devashish on 09-06-2020.
 */
public class HomePageTest extends BaseTest{

    @Test
    public void verifyHomePageTitle(){

        String title = homePage.getHomePageTitle(Constants.HOMEPAGE_TITLE);
        Assert.assertEquals(title, Constants.HOMEPAGE_TITLE);
    }
}
