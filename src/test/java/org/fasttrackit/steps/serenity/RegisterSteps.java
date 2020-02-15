package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class RegisterSteps {

    public HomePage homePage;
    public AccountPage accountPage;


    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToMyAccountPage() {
        homePage.clickMyAccountTab();
    }

    @Step
    public void enterRequiredInfo(String email, String pass) {
        accountPage.setEmailField(email);
        accountPage.setPassField(pass);
    }

    @Step
    public void clickRegisterButton() {
        accountPage.clickRegisterButton();
    }

    @Step
    public void checkLoggedIn(String user) {
        Assert.assertTrue(accountPage.checkWellcomeMessage(user));
    }

    @Step
    public void checkErrorMessage(String error) {
        Assert.assertTrue(accountPage.checkErrorMessage(error));
    }

    @Step
    public void waitToLoad() {
        homePage.wait2Sec();
    }
}
