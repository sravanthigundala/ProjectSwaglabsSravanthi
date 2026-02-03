package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * verify the Login button is displayed and enabled
 * 
 * */

public class LearnClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the browser
		
		WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				
				driver.manage().window().maximize();
				
				//navigate the applicaton via url
				
				driver.get("https://www.saucedemo.com");
				
				//verify the page
				
				System.out.println("Title is"+driver.getTitle());
				
				//Identify the login button is enabled and store it.
				
				WebElement element= driver.findElement(By.className("submit-button"));
				
				//verify the login button is enabled and displayed.
				
				if (element.isEnabled()&&element.isDisplayed()) {
					
					System.out.println("Elemented is verified:It is displayed");
					System.out.println("Elemented is verified:It is enabled");
				} else {
					
					System.out.println("Elemented is verified:It is not displayed");
					System.out.println("Elemented is verified:It is not enabled");

				}
				//close the browser

	}

}
