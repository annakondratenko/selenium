package com.kondratenko.Lesson20;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.GoogleResultPage;
import com.kondratenko.pages.GoogleSearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by annak on 27.03.2017.
 */
public class GoogleSearchTest extends WebDriverTestBaseTestNG {
    String url = "https://www.google.com";
    String searchSelenium = "Selenium";

    @Test
    public void searchTest() {
        driver.get(url);
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
        page.searchFor(searchSelenium);

        // new impl with FindBy
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertEquals(googleResultPage.findLink().getText().contains("Selenium"), true);
    }
}
