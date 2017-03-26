package com.kondratenko.pages;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;



import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by annak on 23.03.2017.
 */
public class SearchPage extends WebDriverTestBaseTestNG {

    @Test
    public void searchtest() {
        //opens url
        driver.get("https://www.google.com");
        //Finds an element by name
        WebElement searchField = driver.findElement(By.name("q"));
        // Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();
        //Finds first link with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        //Verifies a result
        assertEquals(seleniumLink.getText().contains("Selenium"), true);
    }
}
