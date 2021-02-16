package com.agileProCrm.step_definitions;

import com.agileProCrm.pages.LoginPage;
import com.agileProCrm.utilities.ConfigurationReader;
import com.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user logs in as {string}")
    public void the_user_logs_in_as(String user) {
        LoginPage loginPage=new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.get(user+"_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get(user+"_password"));
        loginPage.loginBtn.click();
    }




    @Then("user navigates to home page")
    public void user_navigates_to_home_page() {
        Assert.assertTrue("verify page title contains:", Driver.get().getTitle().contains(") Portal"));
    }


    @Given("the user logged in")
    public void the_user_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
