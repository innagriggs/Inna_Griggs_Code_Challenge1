package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {


    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement usernameFiled;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordFiled;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement signInBtn;

    public void logIn(String userName, String password){
        usernameFiled.sendKeys(userName);
        passwordFiled.sendKeys(password);




    }


}
