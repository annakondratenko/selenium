package com.kondratenko.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by annak on 27.03.2017.
 */
public class ResultPage extends AbstractPage {

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findLink(String xpath) {
        WebElement seleniumLink = driver.findElement(By.xpath(xpath));
        return seleniumLink;
    }
}
