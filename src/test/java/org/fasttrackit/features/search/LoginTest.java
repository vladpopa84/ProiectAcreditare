package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialsLoginTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToMyAccountPage();
        loginSteps.enterRequiredInfo("vladpopa84@yahoo.com", "Rossignol9gs");
        loginSteps.clickRememberMeCheckbox();
        loginSteps.clickLoginButton();
        loginSteps.checkLoggedIn("vladpopa84");
    }

    @Test
    public void invalidEmailLoginTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToMyAccountPage();
        loginSteps.enterRequiredInfo("vladpopa@yahoo.com", "Rossignol9gs");
        loginSteps.clickRememberMeCheckbox();
        loginSteps.clickLoginButton();
        loginSteps.checkLoggedIn("vladpopa84");
    }

    @Test
    public void invalidPassLoginTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToMyAccountPage();
        loginSteps.enterRequiredInfo("vladpopa84@yahoo.com", "Rossignol9");
        loginSteps.clickRememberMeCheckbox();
        loginSteps.clickLoginButton();
        loginSteps.checkLoggedIn("vladpopa84");

    }


}
