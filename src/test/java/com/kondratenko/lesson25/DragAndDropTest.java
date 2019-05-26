package com.kondratenko.lesson25;

import com.kondratenko.core.WebDriverTestBaseTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;


/**
 * Created by annak on 20.04.2017.
 */
@Listeners({com.kondratenko.core.TestListener.class})
public class DragAndDropTest extends WebDriverTestBaseTestNG {
    @Test
    public void tryDragAndDropElement() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
        driver.switchTo().frame("iframeResult");


        WebElement fromElem =

                driver.findElement(By.xpath(".//*[@id='drag1']"));

        WebElement toElem =

                driver.findElement(By.xpath(".//*[@id='div1']"));
        Actions builder = new Actions(driver);

        Action dragAndDrop =

                builder.clickAndHold(fromElem)

                        .moveToElement(toElem).release(toElem).build();
        dragAndDrop.perform();
        toElem =

                driver.findElement(By.xpath(".//*[@id='div1']"));
        assertEquals (toElem.findElement(By.id("drag1")), true);
    }
}
