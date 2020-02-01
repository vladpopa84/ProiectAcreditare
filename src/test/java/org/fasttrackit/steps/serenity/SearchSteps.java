package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductsPage;
import org.junit.Assert;

public class SearchSteps {

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
    public void searchProduct(String text) {
        productsPage.searchProduct(text);
    }

    @Step
    public void verifyShowedProducts(String searchKeyword) {
        Assert.assertTrue("Some of the returned products' names do not contain the searched keyword.",
                                    productsPage.verifySearchedProducts(searchKeyword));
    }

    @Step
    public void verifyProductsNumber(int size) {
        Assert.assertTrue(productsPage.verifyNumber(size));

    }
}
