package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.HomePage;
import utils.TestContextSetup;
import utils.Utils;

import java.util.concurrent.TimeUnit;

public class HomePageStepDef {



TestContextSetup testdriver;
HomePage hp;
Utils u = new Utils();
public HomePageStepDef(TestContextSetup testdriver)
{
    this.testdriver = testdriver;
}

    @Before
    public void launchApp()
    {
        u.readConfigFile();
        System.out.println("Launching Browser");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        testdriver.driver = new ChromeDriver(option);
        testdriver.driver.manage().window().maximize();
        testdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void tearDown()
    {
        testdriver.driver.quit();
    }

    @Given("I am a user")
    public void i_am_a_user() {
        System.out.println("I started Testing");
    }

    @When("I open the website")
    public void i_open_the_website() {
        System.out.println("Url is opening");
        testdriver.driver.get(Utils.p.getProperty("baseUrl"));
    }

    @Then("I should be on the homepage")
    public void i_should_be_on_the_homepage() {

        hp = new HomePage(testdriver.driver);
        hp.verifyLogo();

    }
    @Then("I should see the homepage content")
    public void i_should_see_the_homepage_content() {

        hp = new HomePage(testdriver.driver);
        hp.verfyContent();
    }

}
