package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {

    public HomePage homePage;
    public RegisterPage registerPage;
    public AccountPage accountPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToRegisterPage() {
        homePage.clickMyAccountTab();
    }

    @Step
    public void enterRequiredInfo(String email, String pass) {
        registerPage.setEmailField(email);
        registerPage.setPassField(pass);
    }

    @Step
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void checkLoggedIn(String user) {
        Assert.assertTrue(accountPage.checkWellcomeMessage(user));
    }

    @Step
    public void checkErrorMessage(String error) {
        Assert.assertTrue(accountPage.checkErrorMessage(error));
    }
}
