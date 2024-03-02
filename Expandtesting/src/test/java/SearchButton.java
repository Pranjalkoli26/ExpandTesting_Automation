
import org.example.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchButton extends HomePage
{
    WebDriver driver;
    public SearchButton(WebDriver driver)
    {
        this.driver=driver;
    }

    By SearchanExample= By.xpath("//*[@id=\"search-input\"]");
    By searchButton=By.xpath("//*[@id=\"search-button\"]");


    public SearchExample(String name)
    {
        driver.findElement(SearchanExample).sendKeys(name);
        driver.findElement(searchButton).click();
        return new RecordFound(driver);
    }


}