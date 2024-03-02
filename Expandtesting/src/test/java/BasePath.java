



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class BasePath {
    WebDriver driver;
    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.navigate().to("https://practice.expandtesting.com/");
    }
        @AfterMethod
        public void finish()
        {
            driver.quit();
        }
    }


}