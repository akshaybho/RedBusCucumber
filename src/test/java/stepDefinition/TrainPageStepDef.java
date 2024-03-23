package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.TrainPage;
import utils.TestContextSetup;

public class TrainPageStepDef extends BaseClass {

    TestContextSetup testdriver;

    public  TrainPageStepDef(TestContextSetup testdriver)
    {
        this.testdriver = testdriver;
    }

    @Then("I click on TrainTickets")
    public void i_click_on_train_tickets() {

        TrainPage tp = new TrainPage(testdriver.driver);
        tp.clickOnTrainBtn();
        log.info("User clicks on train ticket");
    }

    @Then("I should be on the TrainTicket Homepage")
    public void i_should_be_on_the_train_ticket_homepage() {
        TrainPage tp = new TrainPage(testdriver.driver);
        tp.verifyPage();
        log.info("User validate the train ticket Homepage");
    }
}
