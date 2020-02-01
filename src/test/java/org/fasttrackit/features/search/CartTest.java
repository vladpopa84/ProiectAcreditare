package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCart() {
        loginSteps.navigateToHomepage();
        loginSteps.goToMyAccountPage();
        loginSteps.enterRequiredInfo("vladpopa84@yahoo.com", "Rossignol9gs");
        loginSteps.clickLoginButton();
        loginSteps.goToShop();
        cartSteps.addProductToCart();
        cartSteps.checkConfirmationMessage("has been added to your cart.");

    }

}
