package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnTagName {

    public static void main(String[] args) {

     
       //1.open the browser
        WebDriver driver = new ChromeDriver();

        //2. Maximize the browser
        driver.manage().window().maximize();

        // 3. navigate to the application via url 
        driver.get("https://www.google.co.in/");

       //verify the page
        System.out.println("Title is: " + driver.getTitle());

       //Identify the element(search box)-using tagname locator and store it.
        WebElement element = driver.findElement(By.tagName("textarea"));

        // Verify if element is displayed and enabled
        
        if (element.isEnabled() && element.isDisplayed()) {
        	
            System.out.println("Element is verified: It is displayed and enabled.");
        }
        else {
            System.out.println("Element is not properly displayed or not enabled.");
        }

        // Close the browser
        driver.quit();
    }
}
