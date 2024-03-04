package org.example;

import org.openqa.selenium.WebDriver;

public class SearchButton {
    public SearchButton(WebDriver driver) {
        this.driver = driver;
    }
    By Examples=By.xpath("//*[@id="search-input"]");
     By searchButton=By.xpath("//*[@id="search-button"]");


     public RecordFound SearchAnExamples(String Examples)
     {
         driver.findElement(SearchAnExample).sendKeys(Examples);
         driver.findElement(searchButton).click();
         return new Examples(driver);
     }
}
