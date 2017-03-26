package com.kondratenko.Lesson19;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by annak on 26.03.2017.
 */
public class SignInToMail extends WebDriverTestBaseTestNG{
    private String baseUrl;
    @Test
    public void signInAsExistingUser(){
        baseUrl = "https://www.google.com";
        driver.get(baseUrl+"/gmail/about/");
        WebElement findRegistrationButton = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
        findRegistrationButton.click();
        findRegistrationButton.findElement(By.id("gaia_firstform"));
        findRegistrationButton.findElement(By.id("next"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        findRegistrationButton.click();
        assertEquals(findRegistrationButton.getText().contains("Enter an email or phone number."), true);
    }

}
