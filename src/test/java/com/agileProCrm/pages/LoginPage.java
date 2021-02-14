package com.agileProCrm.pages;

import com.agileProCrm.utilities.ConfigurationReader;
import com.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //driver.findElement(By.id("prependedInput"));
    @FindAll({
            @FindBy (name = "USER_LOGIN")
            //@FindBy(name ="_username")
    })
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;



    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsHr(){

        String username = ConfigurationReader.get("hr_username");
        String password = ConfigurationReader.get("hr_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

//    public void loginAsDriver(){
//
//        String username = ConfigurationReader.get("driver_username");
//        String password = ConfigurationReader.get("driver_password");
//
//        usernameInput.sendKeys(username);
//        passwordInput.sendKeys(password);
//        loginBtn.click();
//    }


}
