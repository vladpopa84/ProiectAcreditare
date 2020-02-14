package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCart() {

        cartSteps.logIntoAccount("vladpopa84@yahoo.com", "Rossignol9gs");
        cartSteps.goToProductsPage();
        cartSteps.addProductToCart();
        cartSteps.checkConfirmationMessage("has been added to your cart.");

    }

}
