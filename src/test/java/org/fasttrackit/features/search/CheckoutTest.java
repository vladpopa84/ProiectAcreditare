package org.fasttrackit.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void checkoutTest() {
        checkoutSteps.logIntoAccount("vladpopa84@yahoo.com", "Rossignol9gs");
        checkoutSteps.addProductToCart();
        checkoutSteps.goToCart();
        checkoutSteps.goToCheckout();
        checkoutSteps.enterFirstName();
        checkoutSteps.enterLastName();
        checkoutSteps.selectCountry();
        checkoutSteps.enterAddress();
        checkoutSteps.enterTown();
        checkoutSteps.enterPostcode();
        checkoutSteps.enterPhoneNumber();

        registerSteps.waitToLoad();

        checkoutSteps.finishTheOrder();

        registerSteps.waitToLoad();

        checkoutSteps.checkConfirmationMessage("Order received");

    }
}
