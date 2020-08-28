package LocatorHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebFactory;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebFactory.getDriver("chrome");

        driver.get("https://www.ebay.co.uk/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));

        searchBox.sendKeys("iphone 11");

        //Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));

        searchButton.click();


        WebElement SearchNumber = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span[1]"));

        System.out.println(SearchNumber.getText());
        driver.quit();
    }
}
