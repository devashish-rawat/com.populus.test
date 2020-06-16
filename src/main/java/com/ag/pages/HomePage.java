package com.ag.pages;

import com.ag.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Devashish on 08-06-2020.
 */
public class HomePage extends BasePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Object Repo
    By topNavEmployers = By.xpath("//a[text()='Employers']");
    By topNavJobSeekers = By.xpath("//a[text()='JobSeekers']");
    By topNavContractorResources = By.xpath("//a[text()='//a[text()='Contractor Resources']");
    By topNavBlog = By.xpath("//a[text()='Blog']");
    By topNavAbout = By.xpath("//a[text()='About']");

    //Page Actions
    public void clickTopNavItem(By locator){

    }

    public String getHomePageTitle(){

        return driver.getTitle();
    }

}
