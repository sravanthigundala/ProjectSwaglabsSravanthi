package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Verify the nth product name by using xpath---Textvalue.
 * */
public class LearnXpath_3 {
	public static void main(String[] args) {
		
		        //open the browser---chrome
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to the application via url
				
				driver.get("https://www.saucedemo.com");
				
				//verify the page
				
				System.out.println(driver.getTitle());
				
				//Identify the element using xpath locator and store it.
				
				//xpath using textvalue and its value
				
				WebElement username_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'User')]"));
				WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));
				WebElement login_buttton = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
				
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
				

              //Identify the first product name
				
				WebElement firstprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
						
				//fetch the text value of the 1st product name
						
					String firstprd_name = firstprd.getText();
				
				//print on console
				
				System.out.println("First product name is"+firstprd_name );
				
				
           //Identify the second product name
				
				WebElement secondprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
						
				//fetch the text value of the 2nd product name
						
					String secondprd_name = secondprd.getText();
				
				//print on console
				
				System.out.println("second product name is"+secondprd_name );
				
             //Identify the third product name
				
				WebElement thirdprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
						
				//fetch the text value of the 3rd product name
						
					String thirdprd_name = thirdprd.getText();
				
				//print on console
				
				System.out.println("third product name is"+thirdprd_name );
				
				
				
				//Identify the fourth product name
				
				WebElement fourthprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
						
				//fetch the text value of the 4th product name
						
					String fourthprd_name = fourthprd.getText();
				
				//print on console
				
				System.out.println("fourth product name is"+fourthprd_name );
				
				
                //Identify the fifth product name
				
				WebElement fifthprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
						
				//fetch the text value of the 5th product name
						
					String fifthprd_name = fifthprd.getText();
				
				//print on console
				
				System.out.println("fifth product name is"+fifthprd_name );
				
				
                 
				//Identify the sixth product name
				
				WebElement sixthprd=driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
						
				//fetch the text value of the 6th product name
						
					String sixthprd_name = sixthprd.getText();
				
				//print on console
				
				System.out.println("sixth product name is"+sixthprd_name );
		
				
				//close the browser
				
				driver.close();
				
				
	}

}
