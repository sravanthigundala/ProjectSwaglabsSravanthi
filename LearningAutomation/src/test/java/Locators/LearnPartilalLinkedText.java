package Locators;
/**
 * verify the Hyperlink text  on the webpage by using partial link test
 * 
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPartilalLinkedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the browser
		
		WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				
				driver.manage().window().maximize();
				
				//navigate the applicaton via url
				
				driver.get("https://demowebshop.tricentis.com/");
				
				//verify the page
				
				System.out.println("Title is"+driver.getTitle());
				
				//Identify the username textfield is enabled.
				
				WebElement element= driver.findElement(By.partialLinkText("Regi"));
				
				//verify the register hyperlink text is enabled and displayed.
				
				if (element.isEnabled()&&element.isDisplayed()) {
					
					System.out.println("Elemented is verified:It is displayed");
					System.out.println("Elemented is verified:It is enabled");
				} else {
					
					System.out.println("Elemented is verified:It is not displayed");
					System.out.println("Elemented is verified:It is not enabled");

				}
				//close the browser
				
				driver.close();


	}

}
