package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerTest() {
        registerSteps.navigateToHomepage();
        registerSteps.goToMyAccountPage();
        registerSteps.enterRequiredInfo("vladpopa861@yahoo.com", "Rossignol9gs");
        registerSteps.clickRegisterButton();
        registerSteps.checkLoggedIn("vladpopa861");
    }

    @Test
    public void alreadyRegisteredTest() {
        registerSteps.navigateToHomepage();
        registerSteps.goToMyAccountPage();
        registerSteps.enterRequiredInfo("vladpopa84@yahoo.com", "Rossignol9gs");
        registerSteps.clickRegisterButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registerSteps.checkErrorMessage("Error:");
    }

    @Test
    public void invalidEmailFormat() {
        registerSteps.navigateToHomepage();
        registerSteps.goToMyAccountPage();
        registerSteps.enterRequiredInfo("vladpopa84@yahoo", "Rossignol9gs");
        registerSteps.clickRegisterButton();
        registerSteps.checkErrorMessage("Error:");
    }

}
