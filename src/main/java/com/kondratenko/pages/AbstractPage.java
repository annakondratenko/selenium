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

    public void sendSearchData(String searchFiledParameter, String textInput) {
        WebElement searchField = driver.findElement(By.name(searchFiledParameter));
        searchField.sendKeys(textInput);
        searchField.submit();
    }

    public void findSearchButton(String searchButtonParameter){
        WebElement searchButton = driver.findElement(By.id(searchButtonParameter));
        searchButton.click();
    }

}
