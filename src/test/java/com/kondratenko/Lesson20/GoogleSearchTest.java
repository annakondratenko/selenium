package com.kondratenko.Lesson20;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.ResultPage;
import com.kondratenko.pages.SearchPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by annak on 27.03.2017.
 */
public class GoogleSearchTest extends WebDriverTestBaseTestNG {
    @Test
    public void searchTest() {
        SearchPage googleSearchPage = new SearchPage(driver);
        googleSearchPage.openURL("https://www.google.com");
        googleSearchPage.sendSearchData("q","Selenium");
        ResultPage googleResultPage = new ResultPage(driver);
        assertEquals(googleResultPage.findLink(".//*[@id='rso']/div/div/div[2]/div/h3/a").getText().contains("Selenium"), true);
    }
}
