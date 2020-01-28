package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {

    @FindBy(css = "strong:first-of-type")
    public WebElementFacade wellcomeMessage;

    @FindBy(css = "strong:first-of-type")
    public WebElementFacade errorMessage;

    public boolean checkWellcomeMessage(String text) {
        return wellcomeMessage.containsOnlyText(text);
    }

    public boolean checkErrorMessage(String text) {
        return errorMessage.containsOnlyText(text);
    }
}
