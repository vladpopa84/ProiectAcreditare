package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-64>a")
    private WebElementFacade myAccountLink;

    @FindBy(css = "#menu-item-66>a")
    private WebElementFacade shopLink;

    public void clickMyAccountTab() {
        clickOn(myAccountLink);
    }

    public void clickShopLink() {
        clickOn(shopLink);
    }
}
