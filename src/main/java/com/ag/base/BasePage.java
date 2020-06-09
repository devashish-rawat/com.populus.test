package com.ag.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Devashish on 08-06-2020.
 */
public class BasePage {

    WebDriver driver;
    Properties properties;

    public WebDriver initDriver(String browserName){

        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get("https://www.populusgroup.com/");

        return driver;
    }

    //Reads properties from java/config
    public Properties initProperties(){
        properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("\\src\\main\\java\\com\\ag\\config");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
