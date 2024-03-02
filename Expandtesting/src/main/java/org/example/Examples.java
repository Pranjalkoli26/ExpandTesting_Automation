package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  Examples
{
    WebDriver driver;
    public  Examples(WebDriver driver)
    {
        this.driver=driver;
    }


    public static By Examples()
    {
        return By.xpath("//*[@id=\"examples-sections\"]");
    }



}