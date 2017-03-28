package com.kondratenko.Lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by annak on 28.03.2017.
 */
public class GoogleSearchTestOldPractice {
    WebDriver driver;

    //Preconditions
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\QAAuto\\javacore\\maven\\selenium\\src\\test\\resources\\geckodriver.exe");
        //Initializes a browser
        driver = new FirefoxDriver();
        //Maximizes a window size
        driver.manage().window().maximize();
        //Opens a url
        driver.get("https://www.google.com.ua");
    }

    @Test
    public void searchTest() {
        //Finds an element by name
        WebElement searchField = driver.findElement(By.name("q"));
        // Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();
        //Finds first link with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/li[1]/div/h3/a"));
        //Verifies a result
        assertEquals(seleniumLink.getText().contains("Selenium"), true);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
