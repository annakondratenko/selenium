package com.kondratenko.pages;

/**
 * Created by annak on 27.03.2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class ThomasCookSearchPage extends AbstractPage {

    // DefaultSearch_C4315
    public void findSearchButton(String searchButtonParameter){
        WebElement searchButton = driver.findElement(By.id(searchButtonParameter));
        searchButton.click();
    }

    // SearchFor2Adults_C10093
    public void sendSearchParameters(String searchFiledParameter, String textInput) {
        WebElement searchField = driver.findElement(By.id(searchFiledParameter));
        webDriverUtils.waitForExpectedCondition(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(textInput);
        searchField.submit();
    }

    public ThomasCookSearchPage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url){
        driver.get(url);
    }
}