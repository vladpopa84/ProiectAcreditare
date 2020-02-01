package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductsPage;
import org.junit.Assert;

public class CartSteps {

    public HomePage homePage;
    public AccountPage accountPage;
    public ProductsPage productsPage;

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
    public void clickLoginButton() {
        accountPage.clickLoginButton();
    }

    @Step
    public void goToProductsPage() {
        homePage.clickShopLink();
    }

    @Step
    public void addProductToCart(String productName) {
        productsPage.addProductToCart(productName);
    }

    @Step
    public void checkConfirmationMessage(String text) {
        Assert.assertTrue(productsPage.checkConfirmationMessage(text));
    }
}
