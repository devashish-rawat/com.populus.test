package com.ag.pages;

import com.ag.base.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Devashish on 08-06-2020.
 */
public class ContactPage extends BasePage{

    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public String getContactPageTitle(){

        return driver.getTitle();
    }
}
