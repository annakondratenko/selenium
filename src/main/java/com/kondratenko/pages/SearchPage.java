package com.kondratenko.pages;

/**
 * Created by annak on 27.03.2017.
 */
import org.openqa.selenium.WebDriver;

public class SearchPage extends AbstractPage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url){
        driver.get(url);
    }
}