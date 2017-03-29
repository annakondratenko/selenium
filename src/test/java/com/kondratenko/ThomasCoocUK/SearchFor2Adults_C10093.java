package com.kondratenko.ThomasCoocUK;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.SearchPage;
import org.testng.annotations.Test;

/**
 * Created by annak on 30.03.2017.
 */
public class SearchFor2Adults_C10093 extends WebDriverTestBaseTestNG {
    @Test //not ready yet
    public void searchForTwoAdults(){
        SearchPage searchForTwoAdults = new SearchPage(driver);
        searchForTwoAdults.openURL("https://www.thomascook.com/");
        searchForTwoAdults.sendSearchParameters("SearchbarForm-originContainer", "London Gatwick");
        searchForTwoAdults.selectElementFromDropDown(".//*[@id='SearchbarForm-originContainer']/div/div/div/tc-typeahead/div/div[1]/div");
        searchForTwoAdults.sendSearchParameters("SearchbarForm-destinationContainer", "Spain, Any");
        searchForTwoAdults.selectElementFromDropDown(".//*[@id='SearchbarForm-destinationContainer']/div/div/div/tc-typeahead/div/div[1]/div/div[1]/ul/li[1]");

    }

}
