package com.kondratenko.lesson18;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.FirefoxDriver;


public class IsElementPresentJUnit {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","D:\\QAAuto\\javacore\\maven\\selenium\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com.ua/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testIsElementPresent() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("next")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
