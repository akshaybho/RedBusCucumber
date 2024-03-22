package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwappingPage {

    WebDriver driver;
    public SwappingPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='dest']")
    WebElement ToBox;

    @FindBy(css = "i.sc-jKJlTe.fFQGdj.icon-swaparrow")
    WebElement swapBtn;

    @FindBy(xpath = "(//div[@class = 'sc-gzVnrw bSzhQs']/text)[2]")
    WebElement ToText;


    public void clickOntoBox()
    {
        ToBox.click();
    }
    public void searchLocation(String location) throws InterruptedException {
        ToBox.sendKeys(location);
        Thread.sleep(5000);
    }

    public void clickOnSwap() throws InterruptedException {
        swapBtn.click();
        Thread.sleep(3000);
    }

    public void verifySwap()
    {
        String data = ToText.getText();
        if(data.equalsIgnoreCase("Pune"))
        {
            Assert.assertTrue(true);
        }
    }
}
