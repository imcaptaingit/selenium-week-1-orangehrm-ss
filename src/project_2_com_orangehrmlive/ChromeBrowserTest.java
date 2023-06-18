package project_2_com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        // Base URL
        String baseUrl = " https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        //Set the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL in to the browser
        driver.get(baseUrl);
        
        //added wait Time 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the title of the page.
        System.out.println("Page title is : " + driver.getTitle());

        //Print the current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Print the source
        System.out.println("Page Source Code is : " + driver.getPageSource());

        //Print the email to email field
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("iamboss@googly.com");

        //Enter the password in to the password field
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("iamboss");

        //close the browser
        driver.close();

        //Please note the website has some issues. It does enter the email and password sometime and sometimes it doesn't.

    }

}
