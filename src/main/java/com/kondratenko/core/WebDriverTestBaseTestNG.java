package com.kondratenko.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by annak on 23.03.2017.
 */
public class WebDriverTestBaseTestNG {

    protected WebDriver driver;

    @BeforeClass

    public void setUp() {
        //for FF version if not esr
        System.setProperty("webdriver.gecko.driver",WebDriverTestBaseTestNG.class.getClassLoader().getResource("geckodriver.exe").getPath());


                //initializes browser
        driver = new FirefoxDriver();
        //Maximize a window size
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(50,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    @AfterClass

    public void tearDown() {
        //driver.close(); // close only tab in browser
        driver.quit(); //close all browser's tabs
    }
}


