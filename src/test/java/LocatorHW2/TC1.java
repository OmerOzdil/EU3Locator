package LocatorHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebFactory;

public class TC1 {
    public static void main(String[] args) {
        /*
        XPATH PRACTICES
        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
        3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        4.Print text of a,b,c,e and put some email to d
        */
        WebDriver driver = WebFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement HomeLinkButton = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println("HomeLinkButton.getText() = " + HomeLinkButton.getText());

        WebElement FPHeader = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        System.out.println("FPHeader.getText() = " + FPHeader.getText());

        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("emailText.getText() = " + emailText.getText());

        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys("omerozdil54@gmail.com");

        WebElement RPButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println("RPButton.getText() = " + RPButton.getText());

        driver.quit();
    }
}
