package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {


    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "img.rb_logo")
    WebElement logo;

    @FindBy(css = "h1.sc-cvbbAY.jcDPOJ")
    WebElement content;
    public void verifyLogo()
    {
        try {
            if (logo.isDisplayed()) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Logo is not found on the page");
        }
    }

    public void verfyContent()
    {
        String expectedContent = "India's No. 1 Online Bus Ticket Booking Site";

        String actualContent = content.getText();


            if (expectedContent.equals(actualContent)) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }


    }
}
