package com.saucedemo.step_definitions;

import com.github.javafaker.Faker;
import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.ShoppingCartPage;
import com.saucedemo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.*;

public class CheckoutStepDef {

    ProductsPage productsPage = new ProductsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    Faker faker = new Faker();

    @Given("User is on Shopping Cart page")
    public void userIsOnShoppingCartPage() {
        productsPage.shoppingCartBtn.click();
       assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
    }

    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        productsPage.shoppingCartBtn.click();
        shoppingCartPage.checkOutBtn.click();
    }
    @When("User enters first name and last name and zipcode")
    public void user_enters_first_name_and_last_name_and_zipcode() {
        checkOutPage.firstNameField.sendKeys(faker.name().firstName());
        checkOutPage.lastNameField.sendKeys(faker.name().lastName());
        checkOutPage.zipCodeField.sendKeys(faker.address().zipCode());
    }
    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        checkOutPage.continueBtnCheckOut.click();
    }


    @When("User clicks on the finish button")
    public void user_clicks_on_the_finish_button() {
        checkOutPage.finishCheckOut.click();

    }
    @Then("User should be able to see confirmation message")
    public void user_should_be_able_to_see_confirmation_message() {
      assertTrue(checkOutPage.message.getText().contains("THANK YOU FOR YOUR ORDER"));

    }

    }

