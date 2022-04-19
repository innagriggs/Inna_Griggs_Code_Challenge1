package com.saucedemo.step_definitions;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class SortStepDef {
    WebDriver driver;
    ProductsPage productsPage = new ProductsPage();
    Select dropDown = new Select(productsPage.sortDropdown);
    List<Double> ItemsPriceBeforeFilter = new ArrayList<>();
    List<Double> ItemsPriceAfterFilter = new ArrayList<>();


    @Given("User is on the products page")
    public void user_is_on_the_products_page() {
        driver = Driver.getDriver();
        String expectedTitle = "Swag Labs";
        assertEquals("Title doesn't match",expectedTitle, driver.getTitle());

    }
    @When("User clicks on sort dropdown")
    public void user_clicks_on_sort_dropdown() {
        List<WebElement> pricesBeforeSorting = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement eachPrice : pricesBeforeSorting) {
            ItemsPriceBeforeFilter.add(Double.valueOf(eachPrice.getText().replace("$", "")));
        }
        productsPage.sortDropdown.click();
    }
    @When("User select price low to high")
    public void user_select_price_low_to_high() {
        dropDown.selectByVisibleText("Price (low to high)");
    }
    @Then("Products price should be sorted low to high")
    public void products_price_should_be_sorted_low_to_high() {

        List<WebElement> pricesAfterSorting = Driver.getDriver().findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement eachPrice : pricesAfterSorting) {
            ItemsPriceAfterFilter.add(Double.valueOf(eachPrice.getText().replace("$", "")));
        }
        Collections.sort(ItemsPriceBeforeFilter);
       assertEquals("Items prices doesn't match",ItemsPriceBeforeFilter, ItemsPriceAfterFilter);

    }

}
