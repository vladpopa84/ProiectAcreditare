package org.fasttrackit.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
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

    @Test
    public void checkoutTest() {
        checkoutSteps.logIntoAccount("vladpopa84@yahoo.com", "Rossignol9gs");
        checkoutSteps.addProductToCart();
        checkoutSteps.goToCart();
        checkoutSteps.goToCheckout();
        checkoutSteps.enterFirstName("Vlad");
        checkoutSteps.enterLastName("Popa");
        checkoutSteps.selectCountry("Romania");
        checkoutSteps.enterAddress("Str. Iuliu Maniu, Nr. 12");
        checkoutSteps.enterTown("Cluj-Napoca");
        checkoutSteps.enterPostcode("123456");
        checkoutSteps.enterPhoneNumber("0740123123");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkoutSteps.finishTheOrder();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkoutSteps.checkConfirmationMessage("Order received");

    }
}
