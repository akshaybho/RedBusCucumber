package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SwappingPage;
import utils.TestContextSetup;

public class SwapStepDef extends BaseClass {

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
        log.info("User clicks on second dropdown box");

    }
    @Then("I swap the cities")
    public void i_swap_the_cities() throws InterruptedException {

        sp = new SwappingPage(testdriver.driver);
        sp.clickOnSwap();
        log.info("User swapping the cities");

    }
    @Then("I validate cities are swapping")
    public void i_validate_cities_are_swapping() {

        sp = new SwappingPage(testdriver.driver);
        sp.verifySwap();
        log.info("User is able to validate the swap");
    }

    @Then("I search {string} in ToBox dropdown")
    public void i_search_in_to_box_dropdown(String toName) throws InterruptedException {

        sp = new SwappingPage(testdriver.driver);
        sp.clickOntoBox();
        sp.searchLocation(toName);
        log.info("User search the destination location");
    }
}
