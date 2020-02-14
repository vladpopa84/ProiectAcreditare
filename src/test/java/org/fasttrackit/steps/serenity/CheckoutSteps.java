package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class CheckoutSteps {

    public HomePage homePage;
    public AccountPage accountPage;
    public ProductsPage productsPage;
    public CartPage cartPage;
    public CheckoutPage checkoutPage;

    @Step
    public void logIntoAccount(String email, String pass) {
        homePage.open();
        homePage.clickMyAccountTab();
        accountPage.inputEmail(email);
        accountPage.inputPass(pass);
        accountPage.clickLoginButton();
    }

    @Step
    public void addProductToCart() {
        homePage.clickShopLink();
        productsPage.addProductToCart();
    }

    @Step
    public void goToCart() {
        productsPage.clickCartButton();
    }

    @Step
    public void goToCheckout() {
        cartPage.proceedToCheckout();
    }

    @Step
    public void enterFirstName(String firstName) {
        checkoutPage.enterFirstName(firstName);
    }

    @Step
    public void enterLastName(String lastName) {
        checkoutPage.enterLastName(lastName);
    }

    @Step
    public void selectCountry(String text) {
        checkoutPage.selectCountry(text);
    }

    @Step
    public void enterAddress(String addressAndNumber) {
        checkoutPage.enterAddress(addressAndNumber);
    }

    @Step
    public void enterTown(String town) {
        checkoutPage.enterTown(town);
    }

    @Step
    public void enterPostcode(String postcode) {
        checkoutPage.enterPostCode(postcode);
    }

    @Step
    public void enterPhoneNumber(String phoneNumber) {
        checkoutPage.enterPhoneNumber(phoneNumber);
    }

    @Step
    public void finishTheOrder() {
        checkoutPage.clickOrderButton();
    }

    @Step
    public void checkConfirmationMessage(String text) {
        Assert.assertTrue(checkoutPage.checkOrderConfirmation(text));
    }
}
