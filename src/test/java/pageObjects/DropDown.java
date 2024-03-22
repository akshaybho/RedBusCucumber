package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;

public class DropDown {

    WebDriver driver;
    public DropDown(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='src']")
    WebElement FromBox;

    @FindBy(xpath = "//li[contains(@class, 'sc-iwsKbI jTMXri')]")
    List<WebElement> stopList;

    public void clickOnFrom()
    {
        FromBox.click();
    }

    public void searchLocation(String location) throws InterruptedException {

        FromBox.sendKeys(location);
        Thread.sleep(5000);
    }

    public void lookAtList()
    {
        String data = "";
        stopList = new ArrayList<>();
        for(WebElement e : stopList)
        {
             data = e.getText();
            if(data.equalsIgnoreCase("Swargate"))
            {
                Assert.assertTrue(true);
            }
        }


    }
}
