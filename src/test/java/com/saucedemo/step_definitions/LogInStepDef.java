package com.saucedemo.step_definitions;

import com.saucedemo.pages.LogInPage;
import com.saucedemo.utils.ConfigurationReader;
import com.saucedemo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;


public class LogInStepDef {
    WebDriver driver;
    LogInPage logInPage = new LogInPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("sauceDemo.url"));
    }
    @When("User enters valid  {string} and {string}")
    public void user_enters_valid_and(String login, String password) {
        logInPage.logIn(login,password);

    }
    @When("User clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        logInPage.signInBtn.click();

    }
    @Then("Page title should be as expected")
    public void page_title_should_be_as_expected() {
        assertEquals("Swag Labs", driver.getTitle());
    }


}
