package org.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.base.BaseClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.page.MyDigiRecordsLoginPage;

import java.net.MalformedURLException;

public class MyDigiRecordsStep {
    private BaseClass base = new BaseClass();
    private MyDigiRecordsLoginPage loginPage;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        base.launchApplication("Pixel8Pro",
                "C:\\Testing\\MyDigiRecordsProjects\\src\\test\\resources\\MyDigiRecords.apk");
        loginPage = new MyDigiRecordsLoginPage();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("noReset", true);
    }


    @Given("I select a country")
    public void selectCountry() {
        
    }

    @And("I click on India")
    public void selectIndia() {
       
    }

    @And("I click continue")
    public void clickContinue() {
      
    }

    @When("I enter username {string}")
    public void enterUsername(String username) {
        loginPage.getUsernameField().sendKeys("ArulAmson@gmail.com");
    }

    @And("I enter password {string}")
    public void enterPassword(String password) {
        loginPage.getPasswordField().sendKeys("Digi@123");
    }

    @And("I click login")
    public void clickLogin() {
        loginPage.getLoginButton().click();
    }

    @Then("I should be logged in successfully")
    public void verifyLoginSuccess() {
        // Add assertions here to verify successful login
    }

    @After
    public void tearDown() {
      //  if (BaseClass.getDriver() != null) {
       //     BaseClass.getDriver().quit();
       // }
    }
}
