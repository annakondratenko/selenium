package com.kondratenko.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by annak on 27.03.2017.
 */
public abstract class AbstractPage {
    protected WebDriver driver;


    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public AbstractPage() {

    }

    public void sendSearchData(String search) {
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys(search);
        searchField.submit();
    }


}
