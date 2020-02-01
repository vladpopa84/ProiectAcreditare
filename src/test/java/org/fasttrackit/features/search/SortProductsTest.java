package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.steps.serenity.SortProductsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SortProductsTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SortProductsSteps sortProductsSteps;

    @Test
    public void sortByPrice() {
        sortProductsSteps.navigateToHomepage();
        sortProductsSteps.goToProductsPage();
        sortProductsSteps.selectPriceAscending();
        sortProductsSteps.checkPriceAscending();


    }


}
