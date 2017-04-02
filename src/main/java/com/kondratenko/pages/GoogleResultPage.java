package com.kondratenko.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by annak on 30.03.2017.
 */
public class GoogleResultPage extends AbstractPage {

    public GoogleResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    @FindBy(how = How.XPATH, using= ".//*[@id='rso']/div/div/div[1]/div/h3/a")
    private WebElement seleniumLink;
    public WebElement findLink(){
        webDriverUtils.waitForExpectedCondition(ExpectedConditions.visibilityOf(seleniumLink));
        return seleniumLink;
    }
}
