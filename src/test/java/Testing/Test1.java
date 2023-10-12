package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Test1 {


    public static WebDriver driver;
    @Test
    public void H(){


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://ww.google.com");

   }
}
