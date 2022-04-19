package com.saucedemo.step_definitions;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

import java.util.List;

public class AddItemsStepDef {
    ProductsPage productsPage = new ProductsPage();

    @Given("User adds one item to the cart")
    public void user_adds_one_item_to_the_cart() {
        productsPage.addFleeceJacket.click();

    }
    @Given("User adds second item to the cart")
    public void user_adds_second_item_to_the_cart() {
        productsPage.addBackPack.click();

    }

    @Then("{int} items should be in the cart")
    public void itemsShouldBeInTheCart(Integer count) {
        productsPage.shoppingCartBtn.click();
        List<WebElement> actualCartItems = Driver.getDriver().findElements(By.className("inventory_item_name"));
        Integer itemCount = actualCartItems.size();
        assertEquals("Item count doesn't match ", count, itemCount);

    }
}

