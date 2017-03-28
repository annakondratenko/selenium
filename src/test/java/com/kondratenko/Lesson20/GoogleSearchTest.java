package com.kondratenko.Lesson20;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.AbstractPage;
import com.kondratenko.pages.GoogleResultPage;
import com.kondratenko.pages.GoogleSearchPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by annak on 27.03.2017.
 */
public class GoogleSearchTest extends WebDriverTestBaseTestNG {
    @Test
    public void searchTest() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openURL("https://www.google.com");
        googleSearchPage.sendSearchData("Selenium");
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertEquals(googleResultPage.findLink().getText().contains("Selenium"), true);
    }
}
