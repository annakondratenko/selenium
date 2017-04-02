package com.kondratenko.ThomasCoocUK;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.ThomasCoocResultPage;
import com.kondratenko.pages.ThomasCoocSearchPage;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;


/**
 * Created by annak on 28.03.2017.
 */
public class DefaultSearch_C4315 extends WebDriverTestBaseTestNG {
    @Test
    public void checkSearchOnHomePage(){
        ThomasCoocSearchPage thomasCoocSearchPage = new ThomasCoocSearchPage(driver);
        thomasCoocSearchPage.openURL("https://www.thomascook.com/");
        thomasCoocSearchPage.findSearchButton("SearchbarForm-submitBtn");
        ThomasCoocResultPage resultPage = new ThomasCoocResultPage(driver);
        assertEquals(resultPage.findLink(".//*[@id='paginationSearchResultsPanel']/div[2]").isDisplayed(), true);

    }
}
