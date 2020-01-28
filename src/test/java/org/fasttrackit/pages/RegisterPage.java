package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class RegisterPage extends PageObject {

    @FindBy(css = "#reg_email")
    public WebElementFacade emailField;

    @FindBy(css = "#reg_password")
    public WebElementFacade passField;

    @FindBy(css = ".button[name=register]")
    public WebElementFacade registerButton;


    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass) {
        typeInto(passField, pass);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }


}
