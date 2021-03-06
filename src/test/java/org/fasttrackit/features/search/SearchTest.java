package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void searchProductTest() {
        searchSteps.navigateToHomepage();
        searchSteps.goToProductsPage();
        searchSteps.searchProduct("cap");
        registerSteps.waitToLoad();
        searchSteps.verifyShowedProducts("cap");
    }

    @Test
    public void verifyShowedProducts() {
        searchSteps.navigateToHomepage();
        searchSteps.goToProductsPage();
        searchSteps.searchProduct("t-shirt");
        registerSteps.waitToLoad();
        searchSteps.verifyShowedProducts("t-shirt");

    }

    @Test
    public void verifyProductsNumber() {
        searchSteps.navigateToHomepage();
        searchSteps.goToProductsPage();
        searchSteps.searchProduct("t-shirt");
        searchSteps.verifyProductsNumber(3);
    }

}
