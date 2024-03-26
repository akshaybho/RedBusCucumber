package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.DateSelectionPage;
import utils.TestContextSetup;

public class DateSelectionStepDef extends BaseClass {


    TestContextSetup testdriver;

    public DateSelectionStepDef(TestContextSetup testdriver)
    {
        this.testdriver = testdriver;
    }
    @Then("I click on calendar")
    public void i_click_on_calendar() throws InterruptedException {

        DateSelectionPage ds = new DateSelectionPage(testdriver.driver);
        ds.clickOnDate();
    }
    @Then("select date for next day")
    public void select_date_for_next_day() throws InterruptedException {

        DateSelectionPage ds = new DateSelectionPage(testdriver.driver);
        ds.selectDate();
    }
}
