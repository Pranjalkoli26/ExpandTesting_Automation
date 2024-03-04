
import org.example.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By usernameField = By.xpath("//*[@id='Username']");
    By passwordField = By.xpath("//*[@id='Password']");
    By loginButton = By.xpath("//*[@id=\"login\"]/button");

//*[@id="login"]/button

    public SecureArea performLogin(String username, String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton) .click();

        return new SecureArea(driver);

    }

 public static By error()
    {
        By errorMsg = By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']");
        return errorMsg;
    }

}
