package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//button [@id='remove-sauce-labs-fleece-jacket']")
    public WebElement removeBtn;

    @FindBy(xpath = "//button [@id='continue-shopping']")
    public WebElement continueShopBtn;

    @FindBy(xpath = "//button [@id='checkout']")
    public WebElement checkOutBtn;

}
