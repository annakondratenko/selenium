package com.kondratenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by annak on 30.03.2017.
 */
public class GoogleSearchPage extends AbstractPage {

    @FindBy(how = How.NAME,using = "q")
    private WebElement searchField;
    public void searchFor(String text) {

        searchField.sendKeys(text);

        searchField.submit();
    }

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url){
        driver.get(url);
    }
}
