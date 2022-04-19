package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortDropdown;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    public WebElement addFleeceJacket;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addBackPack;


    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public  WebElement shoppingCartBtn;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    public WebElement addTshirt;


}
