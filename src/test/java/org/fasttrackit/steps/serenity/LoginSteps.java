package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.junit.Assert;

public class LoginSteps {

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
        accountPage.inputEmail(email);
        accountPage.inputPass(pass);
    }

    @Step
    public void clickRememberMeCheckbox() {
        accountPage.checkRememberMe();
    }

    @Step
    public void clickLoginButton() {
        accountPage.clickLoginButton();
    }

    @Step
    public void checkLoggedIn(String user) {
        Assert.assertTrue(accountPage.checkWellcomeMessage(user));
    }

    @Step
    public void goToShop() {
        accountPage.goToShopLink();
    }

    @Step
    public void checkEmailErrorMsg() {
        Assert.assertTrue(accountPage.checkEmailError().contains("Invalid email address."));
    }

    @Step
    public void checkPassErrorMsg() {
        Assert.assertTrue(accountPage.checkPassError().contains("The password you entered"));
    }
}
