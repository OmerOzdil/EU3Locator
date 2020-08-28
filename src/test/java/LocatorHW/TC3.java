package LocatorHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebFactory;

public class TC3 {
    public static void main(String[] args) {
        /*
        Go to wikipedia.org (Links to an external site.)
        enter search term `selenium webdriver`
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)'
        */
        WebDriver driver = WebFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys("Selenium (software)");

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("currentUrl = " + currentUrl);
        }

        driver.quit();


    }
}
