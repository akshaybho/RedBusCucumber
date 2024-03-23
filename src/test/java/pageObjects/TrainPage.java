package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainPage {

    WebDriver driver;
    public TrainPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Train Tickets')]")
    WebElement trainBtn;

    @FindBy(xpath = "//div[@class='logo']/span")
    WebElement logoText;

    public void clickOnTrainBtn()
    {
        trainBtn.click();
    }

    public void verifyPage()
    {
        String actualTitle = logoText.getText();
        String expectedTitle = "redRail: Train Ticket Booking";

        if(actualTitle.equals(expectedTitle))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }

    }
}
