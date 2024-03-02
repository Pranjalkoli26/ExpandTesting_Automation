import org.example.SecureArea;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasePath{



//    @Test
//    public void validLoginTest(){
//
//        new LoginPage(driver).performLogin("practice","SuperSecretPassword!");
//        Assert.assertTrue(driver.getCurrentUrl().contains("SecureArea"));

        @Test
        public void validLogin()
        {
            new LoginPage(driver).performLogin("Practice", "SuperSecretPassword!");
            Assert.assertTrue(driver.findElement(SecureArea.SecureArea()).isDisplayed());

        }

        @Test
        public void invalidLogin()
        {
            new LoginPage(driver).performLogin("Practice", "2nndj");
            Assert.assertTrue((driver.findElement(LoginPage.error())).isDisplayed());
        }

    }

}