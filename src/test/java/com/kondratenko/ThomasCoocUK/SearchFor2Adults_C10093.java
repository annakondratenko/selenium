package com.kondratenko.ThomasCoocUK;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import com.kondratenko.pages.ThomasCoocSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by annak on 30.03.2017.
 */
public class SearchFor2Adults_C10093 extends WebDriverTestBaseTestNG {
    @Test //not ready yet
    public void searchForTwoAdults(){
        ThomasCoocSearchPage searchForTwoAdults = new ThomasCoocSearchPage(driver);
        searchForTwoAdults.openURL("https://www.thomascook.com/");
        searchForTwoAdults.sendSearchParameters("SearchbarForm-originContainer", "London Gatwick");
        searchForTwoAdults.sendSearchParameters("SearchbarForm-destinationContainer", "Spain, Any");
     //   searchForTwoAdults.findSearchButton("SearchbarForm-duration");
        Select dropdown = new Select(driver.findElement(By.id("SearchbarForm-duration")));
        dropdown.selectByValue("string:7");
        searchForTwoAdults.findSearchButton("SearchbarForm-submitBtn");
    }

}
