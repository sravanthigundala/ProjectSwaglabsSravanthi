package Locators;
/**
 * verify the user is able to login with valid credentials
 * 
 * Identify using ---.xpath locator----->using complete attribute and its value.
 * 
 * validate username,password Textfield
 * 
 * validate login button
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

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
				
				//Identify the element using xpath locator and store it.
				
				//xpath using complete attribute and its value
				
				WebElement username_textfield = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				WebElement password_textfield = driver.findElement(By.xpath("//input[@name='password']"));
				WebElement login_buttton = driver.findElement(By.xpath("//input[@value='Login']"));
				
				//validate the element is enabled and is displayed
				
				if (username_textfield.isDisplayed()&&username_textfield.isEnabled()&&password_textfield.isDisplayed()&&password_textfield.isEnabled()
						&&login_buttton.isDisplayed()&&login_buttton.isEnabled()) {
					
					System.out.println("element is verified:It is diaplayed");
					System.out.println("element is verified:It is enabled");
					
				} else {
					System.out.println("element is verified:It is not diaplayed");
					System.out.println("element is verified:It is not enabled");
				}
				
				//perform login action
				
				username_textfield.sendKeys("standard_user");
				password_textfield.sendKeys("secret_sauce");
				login_buttton.click();
				
				//close the browser
				
				driver.close();

			}

		

	}


