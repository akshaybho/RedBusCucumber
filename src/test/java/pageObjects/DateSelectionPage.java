package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class DateSelectionPage {

    Utils u;
    WebDriver driver;

    public DateSelectionPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")
    WebElement date;


    public void clickOnDate() throws InterruptedException {
        date.click();
        Thread.sleep(2000);
    }
    public void selectDate() throws InterruptedException {

        u = new Utils();
        u.tomorrowDate(date);
        Thread.sleep(3000);
    }
}
