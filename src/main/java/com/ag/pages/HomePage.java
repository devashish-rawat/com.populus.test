package com.ag.pages;

import com.ag.base.BasePage;
import com.ag.utils.CustomActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Devashish on 08-06-2020.
 */
public class HomePage extends BasePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        customActions = new CustomActions(this.driver);
    }

    /*Object Repo
    By topNavEmployers = By.xpath("//a[text()='Employers']");
    By topNavJobSeekers = By.xpath("//a[text()='JobSeekers']");
    By topNavContractorResources = By.xpath("//a[text()='//a[text()='Contractor Resources']");
    By topNavBlog = By.xpath("//a[text()='Blog']");
    By topNavAbout = By.xpath("//a[text()='About']");*/

    By topNavContact = By.xpath("//a[text()='Contact']");

    //Page Actions
    public ContactPage navigateToContactPage(){

        driver.findElement(topNavContact).click();
        return new ContactPage(driver);
    }
    public String getHomePageTitle(String expectedTitle){

        return customActions.getExpectedTitle(expectedTitle);
    }
}
