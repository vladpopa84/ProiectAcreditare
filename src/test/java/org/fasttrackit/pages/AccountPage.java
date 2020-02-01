package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {

    @FindBy(css = "#reg_email")
    public WebElementFacade regEmailField;

    @FindBy(css = "#reg_password")
    public WebElementFacade regPassField;

    @FindBy(css = ".button[name=register]")
    public WebElementFacade registerButton;

    @FindBy(css = ".woocommerce-MyAccount-content strong:first-child")
    public WebElementFacade wellcomeMessage;

    @FindBy(css = "li strong")
    public WebElementFacade errorMessage;

    @FindBy(css = ".form-row-wide #username")
    public WebElementFacade emailField;

    @FindBy(css = ".form-row-wide #password")
    public WebElementFacade passField;

    @FindBy(css = ".u-column1 #rememberme")
    public WebElementFacade rememberMeCheckbox;

    @FindBy(css = ".woocommerce-Button[value='Login']")
    public WebElementFacade loginButton;

    @FindBy(css = "#menu-item-66>a")
    public WebElementFacade shopLink;


    public void setEmailField(String email) {
        typeInto(regEmailField, email);
    }

    public void setPassField(String pass) {
        typeInto(regPassField, pass);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public boolean checkWellcomeMessage(String text) {
        return wellcomeMessage.containsOnlyText(text);
    }

    public boolean checkErrorMessage(String text) {
        return errorMessage.containsOnlyText(text);
    }



    public void inputEmail(String email) {
        typeInto(emailField, email);
    }

    public void inputPass(String pass) {
        typeInto(passField, pass);
    }

    public void checkRememberMe() {
        clickOn(rememberMeCheckbox);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }


    public void goToShopLink() {
        clickOn(shopLink);
    }

}
