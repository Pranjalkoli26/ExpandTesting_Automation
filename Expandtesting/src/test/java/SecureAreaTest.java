import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecureAreaTest extends BasePath {


    @Test
    public void clickHome(){
        new LoginPage(driver).performLogin("practice","SuperSecretPassword!").clickHomeButton();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"home-header\"]"]")).isDisplayed());
    }
}