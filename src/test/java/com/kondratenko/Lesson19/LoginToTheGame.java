package com.kondratenko.Lesson19;


import com.kondratenko.core.WebDriverTestBaseTestNG;
import org.testng.annotations.*;
import org.openqa.selenium.*;
public class LoginToTheGame extends WebDriverTestBaseTestNG {

    @Test
    public void loginToTheGame()  {
        String baseUrl = "https://lordsandknights.com/";
        driver.get(baseUrl);
        driver.findElement(By.name("login-name")).clear();
        driver.findElement(By.name("login-name")).sendKeys("annakondratenko@gmail.com");
        driver.findElement(By.name("login-password")).clear();
        driver.findElement(By.name("login-password")).sendKeys("121091");
        driver.findElement(By.xpath(".//*[@id='game-frame']/div/div[2]/div[1]/div[3]/form/div[3]/button")).click();
    }

}
