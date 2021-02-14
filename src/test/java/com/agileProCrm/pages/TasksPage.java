package com.agileProCrm.pages;

import com.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends com.agileProCrm.pages.BasePage {

    public TasksPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //driver.findElement(By.id("prependedInput"));
//    @FindAll({
//            @FindBy(id = "user-name")
//            //@FindBy(name ="_username")
//    })
//    public WebElement usernameMenu;
//
//
    @FindBy(xpath = "(//*[@class='main-buttons-item-link'])[1]")
    public WebElement All;

    @FindBy(xpath = "(//*[@class='main-buttons-item-link'])[2]")
    public WebElement ongoing;

    @FindBy(xpath = "//*[@title='Role: Ongoing']")
    public WebElement roleOngoing;

    @FindBy(id = "action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control")
    public WebElement selectAction;

    @FindBy(xpath = "(//*[@class='main-grid-cell-content'])[1]")
    public WebElement checkbox1;




//    @FindBy(xpath = "(//*[@class='menu-item-link-text'])[2]")
//    public WebElement Tasks;


}
