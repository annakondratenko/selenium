package com.kondratenko.ThomasCookUK;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.ThomasCookResultPage;
import com.kondratenko.pages.ThomasCookSearchPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.AssertJUnit.assertEquals;


/**
 * Created by annak on 28.03.2017.
 */
public class DefaultSearch_C4315 extends WebDriverTestBaseTestNG {
    @Title("Check search field on home page")
    @Description("Open url, check search button present")
    @Test
    public void checkSearchOnHomePage(){
        ThomasCookSearchPage thomasCoocSearchPage = new ThomasCookSearchPage(driver);
        thomasCoocSearchPage.openURL("https://www.thomascook.com/");
        thomasCoocSearchPage.findSearchButton("SearchbarForm-submitBtn");
        ThomasCookResultPage resultPage = new ThomasCookResultPage(driver);
        assertEquals(resultPage.findLink(".//*[@id='paginationSearchResultsPanel']/div[2]").isDisplayed(), true);

    }
}
