package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
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

    String random = RandomStringUtils.randomAlphanumeric(10);
    @Test
    public void registerTest() {
        registerSteps.navigateToHomepage();
        registerSteps.goToMyAccountPage();
        registerSteps.enterRequiredInfo(random+"@yahoo.com", "Rossignol9gs");
        registerSteps.clickRegisterButton();
        registerSteps.checkLoggedIn(random);
    }

    @Test
    public void alreadyRegisteredTest() {
        registerSteps.navigateToHomepage();
        registerSteps.goToMyAccountPage();
        registerSteps.enterRequiredInfo("vladpopa84@yahoo.com", "Rossignol9gs");
        registerSteps.clickRegisterButton();
        registerSteps.waitToLoad();
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
