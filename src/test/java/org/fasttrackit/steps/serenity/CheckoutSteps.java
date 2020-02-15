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
    public void enterFirstName() {
        checkoutPage.enterFirstName("Vlad");
    }

    @Step
    public void enterLastName() {
        checkoutPage.enterLastName("Popa");
    }

    @Step
    public void selectCountry() {
        checkoutPage.selectCountry("Romania");
    }

    @Step
    public void enterAddress() {
        checkoutPage.enterAddress("Str. Iuliu Maniu, Nr. 12");
    }

    @Step
    public void enterTown() {
        checkoutPage.enterTown("Cluj-Napoca");
    }

    @Step
    public void enterPostcode() {
        checkoutPage.enterPostCode("123456");
    }

    @Step
    public void enterPhoneNumber() {
        checkoutPage.enterPhoneNumber("0740123123");
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
