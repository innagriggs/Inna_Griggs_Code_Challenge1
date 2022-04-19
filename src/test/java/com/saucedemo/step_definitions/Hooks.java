package com.saucedemo.step_definitions;

import com.saucedemo.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUpScenario() {
        System.out.println("SetUp method is running before the scenario");
    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if(scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
        }

        System.out.println("TearDown method is running after the scenario:" + scenario.getName());
        //Driver.closeDriver();
    }
}
