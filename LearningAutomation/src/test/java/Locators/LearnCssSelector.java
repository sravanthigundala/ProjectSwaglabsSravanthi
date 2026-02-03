package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * verify the user is able to login with valid credentials
 * 
 * Identify using ---.cssSelector
 * 
 * validate username,password Textfield
 * 
 * validate login button
 * */
public class LearnCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser---chrome
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to the application via url
		
		driver.get("https://www.saucedemo.com");
		
		//verify the page
		
		System.out.println(driver.getTitle());
		
		//Identify the element using cssSelector locator and store it.
		
		
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder=\'Username\']"));
		WebElement element2 = driver.findElement(By.cssSelector("input[placeholder=\'Password\']"));
		WebElement element3 = driver.findElement(By.cssSelector("input[data-test=\'login-button\']"));
		
		//validate the element is enabled and is displayed
		
		if (element1.isDisplayed()&&element1.isEnabled()&&element2.isDisplayed()&&element2.isEnabled()
				&&element3.isDisplayed()&&element3.isEnabled()) {
			
			System.out.println("element is verified:It is diaplayed");
			System.out.println("element is verified:It is enabled");
			
		} else {
			System.out.println("element is verified:It is not diaplayed");
			System.out.println("element is verified:It is not enabled");
		}
		
		//perform login action
		
		element1.sendKeys("standard_user");
		element2.sendKeys("secret_sauce");
		element3.click();
		
		//close the browser
		
		driver.close();

	}

}
