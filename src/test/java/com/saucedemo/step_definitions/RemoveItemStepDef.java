package com.saucedemo.step_definitions;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.ShoppingCartPage;
import com.saucedemo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RemoveItemStepDef {

    ProductsPage productsPage = new ProductsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("User is on the Shopping Cart page")
    public void user_is_on_the_shopping_cart_page() {
        productsPage.shoppingCartBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
    }
    @When("User removes an item from the cart")
    public void user_removes_an_item_from_the_cart() {
        shoppingCartPage.removeBtn.click();
        shoppingCartPage.continueShopBtn.click();

    }

    @Then("User adds one more item to the cart")
    public void user_adds_one_more_item_to_the_cart() {
        productsPage.addTshirt.click();


    }
}

