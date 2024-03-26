package utils;

import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class Utils {
    public static Properties p;
    public static FileInputStream input;

    static String Path = System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties";
    public void readConfigFile()
    {
        try
        {
            p = new Properties();
            input = new FileInputStream(Path);
            p.load(input);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void tomorrowDate(WebElement datePicker)
    {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate tomorrow = today.plusDays(1);
        String formattedTomorrow = tomorrow.format(formatter);

        datePicker.sendKeys(formattedTomorrow);
    }
}
