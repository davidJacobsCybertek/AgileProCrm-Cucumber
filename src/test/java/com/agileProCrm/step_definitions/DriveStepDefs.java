package com.agileProCrm.step_definitions;

import com.agileProCrm.pages.BasePage;
import com.agileProCrm.pages.DrivePage;
import com.agileProCrm.utilities.BrowserUtils;
import com.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Locale;

public class DriveStepDefs  {

DrivePage drivePage=new DrivePage();

    @Given("the user navigates to {string} page")
    public void the_user_navigates_to_page(String tab) {

       // drivePage.driveTab.click();
        drivePage.navigateToMenu(tab);

    }
    @When("the user clicks {string}")
    public void the_user_clicks(String drive) {
        switch (drive.toLowerCase(Locale.ROOT)){
            case "my drive":
                drivePage.myDrive.click();
                break;
            case "company drive":
                drivePage.companyDrive.click();
                break;
            default:
                System.out.println("no such drive exists");

        }

    }
    @Then("the user can display {string} window")
    public void the_user_can_display_window(String drive) {
//        BrowserUtils.waitFor(5);
       Assert.assertTrue(Driver.get().getTitle().toLowerCase(Locale.ROOT).contains(") "+drive.toLowerCase(Locale.ROOT)));
    }
}
