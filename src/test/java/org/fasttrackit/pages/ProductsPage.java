package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ProductsPage extends PageObject {

    @FindBy(css = ".header-search a")
    private WebElementFacade searchElement;

    @FindBy(css = ".search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".searchsubmit")
    private WebElementFacade searchButton;


    @FindBy(css = ".entry-title > a")
    private List<WebElementFacade> searchedProducts;


    public void searchProduct(String text) {
        clickOn(searchElement);
        clickOn(searchField);
        typeInto(searchField, text);
        clickOn(searchButton);
    }

    public boolean verifySearchedProducts(String searchKeyword) {
        boolean match = false;
        for (WebElement productNamesElement : searchedProducts) {
             if
             (productNamesElement.getText().toLowerCase().contains(searchKeyword)){
                 match = true;
             }
             else{
                 match = false;
             }
        }
        return match;
    }
    public boolean verifyNumber(int size){
        return searchedProducts.size() == size;
    }

}
