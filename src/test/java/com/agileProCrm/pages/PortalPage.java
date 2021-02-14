package com.agileProCrm.pages;

import com.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage extends BasePage{
    public PortalPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //driver.findElement(By.id("prependedInput"));
    @FindAll({
            @FindBy(id = "user-name")
            //@FindBy(name ="_username")
    })
    public WebElement usernameMenu;


    @FindBy(xpath = "//*[@class='menu-popup-item menu-popup-no-icon '][5]")
    public WebElement loginOut;

    @FindBy(xpath = "(//*[@class='menu-item-link-text'])[2]")
    public WebElement Tasks;






}
