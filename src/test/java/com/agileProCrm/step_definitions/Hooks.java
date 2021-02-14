package com.agileProCrm.step_definitions;

import com.agileProCrm.utilities.ConfigurationReader;
import com.agileProCrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @Before
    public void setUp(){

        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        //wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));;
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();
    }
    @Before("@db")
    public void setUp1(){
        System.out.println("\t\tconnecting to database...");
    }

    @After("@db")
    public void tearDown1(){
        System.out.println("\t\tdisconnecting from database...");
    }

}
