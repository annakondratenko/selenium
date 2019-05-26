package com.kondratenko.lesson18;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class IsElementPresentTestNG extends WebDriverTestBaseTestNG {

    private String baseUrl;

    @Test
    public void testIsElementPresent() throws Exception {
        baseUrl = "https://www.google.com.ua/";
        driver.get(baseUrl + "/");
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("next")).click();

    }

}