package com.kondratenko.pages;
import com.kondratenko.util.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by annak on 27.03.2017.
 */
public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtils webDriverUtils;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(this.driver);
    }

    // old ThomasCoocResultPage
    public void sendSearchData(String searchFiledParameter, String textInput) {
        WebElement searchField = driver.findElement(By.name(searchFiledParameter));
        searchField.sendKeys(textInput);
        searchField.submit();
    }
}
