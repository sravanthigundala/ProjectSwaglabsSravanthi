package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Verify Username Textfield is displayed or not
 */

public class Learnid {

	public static void main(String[] args) {

		//open the browser-edge
		
		WebDriver driver=new EdgeDriver();
		
		//navigateto the application via url
		
		driver.get("https://www.saucedemo.com");
		
		//Identify the username Text field using locator(id) and store it.
		 
		WebElement element =driver.findElement(By.id("user-name"));
		
		
		
		if (element.isDisplayed()) {
			
			System.out.println(" Test pass");
		}
			
			else {
				
				System.out.println(" Test fail");
			}
			
	}
}
			
		
		
	
		
	




