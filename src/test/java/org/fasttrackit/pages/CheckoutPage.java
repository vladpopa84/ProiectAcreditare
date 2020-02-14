package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class CheckoutPage extends PageObject {

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#billing_address_1.input-text")
    private WebElementFacade addressField;

    @FindBy(css = "#billing_city.input-text")
    private WebElementFacade townField;

    @FindBy(css = "#billing_postcode.input-text")
    private WebElementFacade postcodeField;

    @FindBy(css = "#billing_phone")
    private WebElementFacade phoneField;

    @FindBy(css= "#billing_country")
    private WebElementFacade countryList;

    @FindBy(css = ".place-order > button")
    private WebElementFacade orderButton;

    @FindBy(css = ".entry-title")
    private WebElementFacade orderConfirmation;



    public void enterFirstName(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void selectCountry(String text) {
        countryList.selectByVisibleText(text);

    }

    public void enterAddress(String addressAndNumber) {
        typeInto(addressField, addressAndNumber);
    }

    public void enterTown(String town) {
        typeInto(townField, town);
    }

    public void enterPostCode(String postcode) {
       typeInto(postcodeField, postcode);
    }

    public void enterPhoneNumber(String phone) {
        typeInto(phoneField, phone);
    }

    public void clickOrderButton() {
        clickOn(orderButton);
    }

    public boolean checkOrderConfirmation(String text) {
        return orderConfirmation.containsOnlyText(text);
    }



}


