package com.ag.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Devashish on 18-06-2020.
 */
public class CustomActions {

    WebDriver driver;

    public CustomActions(WebDriver driver) {
        this.driver = driver;
    }

    public String getExpectedTitle(String expectedTitle){

        String actualTitle;

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        actualTitle = driver.getTitle();

        return actualTitle;
    }
}
