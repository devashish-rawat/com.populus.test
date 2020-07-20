package com.ag.tests;

import com.ag.base.BaseTest;
import com.ag.pages.ContactPage;
import com.ag.pages.HomePage;
import com.ag.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Devashish on 09-06-2020.
 */
public class ContactPageTest extends BaseTest {

    ContactPage contactPage;

    @BeforeMethod
    public void setupContactTest(){

        contactPage = homePage.navigateToContactPage();
    }

    @Test
    public void verifyContactPageTitle(){

        String title = contactPage.getContactPageTitle();
        Assert.assertEquals(title, Constants.CONTACTPAGE_TITLE);
    }
}
