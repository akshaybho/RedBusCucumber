package utils;

import java.io.FileInputStream;
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
}
