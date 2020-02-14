package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;



    public void proceedToCheckout() {
        clickOn(checkoutButton);

    }

}
