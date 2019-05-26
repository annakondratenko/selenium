package bdd.steps;

/**
 * Created by annak on 24.04.2017.
 */

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EntrepreneurSteps {
    protected WebDriver driver;
    private WebElement fieldFio;
    private WebElement fieldCity;
    private WebElement fieldPhone;
    private WebElement fieldEmailAddress;
    private WebElement fieldPassword;
    private String checkBoxXpath = ".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[5]/div[3]/div/label";
    private String goTo = ".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[6]/button";
    private By fieldFioLocator = By.xpath(".//*[@id='fio']");
    private By fieldCityLocator = By.xpath(".//*[@id='city']");
    private By fieldPhoneLocator = By.xpath(".//*[@id='tel']");
    private By fieldMailLocator = By.xpath(".//*[@id='mail']");
    private By fieldPasswordLocator = By.xpath(".//*[@id='pass']");

    public void fillData(By locator, String fillData) {
        WebElement searchElement = driver.findElement(locator);
        searchElement.clear();
        searchElement.sendKeys(fillData);
        Assert.assertEquals(searchElement.getAttribute("value"), fillData);
    }

    @Given("^I am on new project registration page \"([^\"]*)\"$")
    public void setup(String url) {
//        System.setProperty("webdriver.gecko.driver", "C:\\KIT\\AboutTheCodeAutomationE2E\\e2e_automation\\src\\test\\resources\\geckodriver\\geckodriver.exe")
        System.setProperty("webdriver.chrome.driver", "D:\\QAAuto\\javacore\\maven\\selenium\\src\\test\\resources\\browser_drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^I fill my First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" into Full Name field$")
    public void iFillMyFirstNameAndLastNameIntoFullNameField(String firstName, String lastName) throws Throwable {
        String fullName = firstName + " " + lastName;
        fieldFio = driver.findElement(fieldFioLocator);
        fieldFio.clear();
        fieldFio.sendKeys(fullName);
        Assert.assertEquals(fieldFio.getAttribute("value"), fullName);
    }

    @And("^I fill my City \"([^\"]*)\" into City field$")
    public void IfillmyCityintoCityfield(String city) throws Throwable {
        String cityE = city;
        fieldCity = driver.findElement(fieldCityLocator);
        fieldCity.clear();
        fieldCity.sendKeys(cityE);
        Assert.assertEquals(fieldCity.getAttribute("value"), cityE);
    }

    @And("^I fill my phone number \"([^\"]*)\" into Phone field$")
    public void iFillMyPhoneNumberIntoPhonelField(String phoneNumber) throws Throwable {
        String phoneNumbers = phoneNumber;
        fieldPhone = driver.findElement(fieldPhoneLocator);
        fieldPhone.clear();
        fieldPhone.sendKeys(phoneNumbers);
        Assert.assertEquals(fieldPhone.getAttribute("value"), phoneNumbers);
    }

    @And("^I fill my email address \"([^\"]*)\" into Email field$")
    public void iFillMyEmailAddressIntoEmailField(String emailAddresse) throws Throwable {
        String emailAddress = emailAddresse;
        fieldEmailAddress = driver.findElement(fieldMailLocator);
        fieldEmailAddress.clear();
        fieldEmailAddress.sendKeys(emailAddress);
        Assert.assertEquals(fieldEmailAddress.getAttribute("value"), emailAddress);
    }

    @And("^I fill my desired password \"([^\"]*)\" into Password field$")
    public void iFillMyDesiredPasswordIntoPasswordField(String password) throws Throwable {
        String passwords = password;
        fieldPassword = driver.findElement(fieldPasswordLocator);
        fieldPassword.clear();
        fieldPassword.sendKeys(password);
        Assert.assertEquals(fieldPassword.getAttribute("value"), passwords);

    }


   @And ("^I set checkbox to show my password$")
    public void iSeTCheckboxToShowMyPassword(){
        WebElement checkboxClick = driver.findElement(By.xpath(checkBoxXpath));
        checkboxClick.click();
   }

   @And ("^I go next to second project registration page$")
    public void iGoNextToSecondProjectRegistrationPage(){
       WebElement clickGoToButton = driver.findElement(By.xpath(goTo));
       clickGoToButton.click();
   }

   @Then("^I should see form field with \"([^\"]*)\" title$")
    public void iShouldSeeFormFieldWithTitles (String pageName){
        String pageNames = pageName;
        //Assert.assertEquals();
   }


}
