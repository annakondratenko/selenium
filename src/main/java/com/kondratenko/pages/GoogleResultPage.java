package com.kondratenko.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by annak on 27.03.2017.
 */
public class GoogleResultPage extends AbstractPage {

    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findLink() {
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[2]/div/h3/a"));
        return seleniumLink;
    }
}
