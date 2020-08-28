package LocatorHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebFactory;

public class TC2 {
    public static void main(String[] args) {
        /*
        Go to Ebay
        search Selenium
        click on search button
        verify title contains Selenium
        */
        WebDriver driver = WebFactory.getDriver("chrome");

        driver.get("https://www.ebay.co.uk/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

        String title = driver.getTitle().trim();

        if(title.contains("Selenium")){
            System.out.println("Contians");
        }else{
            System.out.println("title = " + title + ", does not contains");
        }

    }
}
