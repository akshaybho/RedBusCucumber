package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DropDown;
import utils.TestContextSetup;


public class DropDownStepDef {

    TestContextSetup testdriver;

    DropDown d;


    public DropDownStepDef(TestContextSetup testdriver)
    {
        this.testdriver = testdriver;
    }

    @Given("I clicks on first dropdown box")
    public void i_clicks_on_first_dropdown_box() throws InterruptedException {

        d = new DropDown(testdriver.driver);
        d.clickOnFrom();
        Thread.sleep(3000);
    }

    @Then("I search {string} in dropdown")
    public void i_search_in_dropdown(String search) throws InterruptedException {


        d = new DropDown(testdriver.driver);
        d.searchLocation(search);

    }
    @Then("I should verify stops in Pune")
    public void i_should_verify_stops_in_pune() {

        d = new DropDown(testdriver.driver);
        d.lookAtList();
    }
}
