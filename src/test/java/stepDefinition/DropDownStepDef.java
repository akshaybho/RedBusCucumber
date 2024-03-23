package stepDefinition;


import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import pageObjects.DropDown;
import utils.TestContextSetup;


public class DropDownStepDef extends BaseClass {

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
        log.info("User clicks on the first Dropdown");
        Thread.sleep(3000);
    }

    @Then("I search {string} in dropdown")
    public void i_search_in_dropdown(String search) throws InterruptedException {


        d = new DropDown(testdriver.driver);
        d.searchLocation(search);
        log.info("User search the location");

    }
    @Then("I should verify stops in Pune")
    public void i_should_verify_stops_in_pune() {

        d = new DropDown(testdriver.driver);
        d.lookAtList();
        log.info("User verifying the location");
    }
}
