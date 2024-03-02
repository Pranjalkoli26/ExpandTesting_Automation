package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea{

    WebDriver driver;

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    By HomeButton = By.xpath("//a[text()='Home']");

    public HomePage clickHomeButton(){

        driver.findElement(HomeButton).click();
        return new HomePage(driver);
    }
}
