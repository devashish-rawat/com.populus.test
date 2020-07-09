package com.ag.base;

import com.ag.utils.CustomActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Devashish on 08-06-2020.
 */
public class BasePage {

    WebDriver driver;
    Properties properties;
    public CustomActions customActions;

    public WebDriver initDriver(String browserName){

        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        String appURL = properties.getProperty("appURL");
        customActions = new CustomActions(driver);

        driver.get(appURL);

        return driver;
    }

    //Reads properties from java/config
    public Properties initProperties(){
        properties = new Properties();
        FileInputStream inputStream;
        try {

            String currentDirectory = System.getProperty("user.dir");

            inputStream = new FileInputStream(currentDirectory + "\\src\\main\\java\\com\\ag\\config\\config.properties");
            properties.load(inputStream);
        } catch (IOException e) {

            e.printStackTrace();
        }

        return properties;
    }
}
