package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SwappingPage;
import utils.TestContextSetup;

public class SwapStepDef {

    SwappingPage sp;
    TestContextSetup testdriver;

    public SwapStepDef(TestContextSetup testdriver)
    {
        this.testdriver = testdriver;
    }

    @Given("I click on second dropdown box")
    public void i_click_on_second_dropdown_box() {

        sp = new SwappingPage(testdriver.driver);
        sp.clickOntoBox();

    }
    @Then("I swap the cities")
    public void i_swap_the_cities() throws InterruptedException {

        sp = new SwappingPage(testdriver.driver);
        sp.clickOnSwap();

    }
    @Then("I validate cities are swapping")
    public void i_validate_cities_are_swapping() {

        sp = new SwappingPage(testdriver.driver);
        sp.verifySwap();
    }

    @Then("I search {string} in ToBox dropdown")
    public void i_search_in_to_box_dropdown(String toName) throws InterruptedException {

        sp = new SwappingPage(testdriver.driver);
        sp.clickOntoBox();
        sp.searchLocation(toName);
    }
}
