package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductsPage;
import org.junit.Assert;

public class SortProductsSteps {

    private HomePage homePage;
    private ProductsPage productsPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToProductsPage() {
        homePage.clickShopLink();
    }

    @Step
    public void selectPriceAscending() {
       productsPage.selectPriceAscending("Sort by price: low to high");
    }

    @Step
    public void checkPriceAscending(){
        Assert.assertTrue(productsPage.checkProductsPrices());
    }
}
