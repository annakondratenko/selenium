package com.kondratenko.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import java.io.File;
import java.lang.invoke.MethodHandles;

import static com.google.common.io.Files.toByteArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by annak on 30.03.2017.
 */
public class WebDriverUtils {
    private static final Logger LOG = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private WebDriverWait wait;
    public WebDriverUtils(WebDriver driver){
        wait = new WebDriverWait(driver, 40 );
    }
    public void waitForExpectedCondition(ExpectedCondition expectedCondition){
        wait.until(expectedCondition);
    }
    @Attachment(value = "{2}")
    public byte[] saveScreenshot(WebDriver driver, String pathToFolder, String screenshotName) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(pathToFolder + screenshotName + ".png"));
            return toByteArray(scrFile);
        } catch (Exception e) {
            System.out.println("Is not saved screenshot" + e);
        }
        return new byte[0];
    }
}
