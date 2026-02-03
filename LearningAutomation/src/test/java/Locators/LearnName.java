package Locators;
/**
 * verify the user name text field is enabled or not
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnName {

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
		
		//Identify the username textfield is enabled or not
		
		WebElement element= driver.findElement(By.name("user-name"));
		
		//verify the username text field is enabled or not
		
		if (element.isEnabled()) {
			System.out.println("username name textfield is enabled:test pass");
			
		} else {
			
			System.out.println("username name textfield is not  enabled:test fail");
			
		}
		//close the browser
		
		driver.close();

	}

}
