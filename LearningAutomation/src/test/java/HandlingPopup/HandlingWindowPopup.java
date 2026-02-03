package HandlingPopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// open the browser.
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser.
		
		driver.manage().window().maximize();
		
		//Implicitly wiat statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to the application via url.
		
		driver.get("https://in.indeed.com/");
		
		//Identify the signin and click on it.
		WebElement sign_in = driver.findElement(By.partialLinkText("Sign"));
		
		 sign_in.click();
		 
		 //Identify the continue with apple button and click on it.
		 WebElement continue_with_apple = driver.findElement(By.cssSelector("#apple-signin-button"));
		 continue_with_apple.click();
		 
		 //verify the Id----> parent Id AND child Id
		 String parent_id = driver.getWindowHandle();
		 System.out.println("parent_id");
		 
		 Set<String> allwindow_id = driver.getWindowHandles();
		 System.out.println("allwindow_id");
		 
		 for(String window_id:allwindow_id) {
			 
			 //switch the control from main page to window 
			 driver.switchTo().window(window_id);
			 
			 if (parent_id.equals(window_id)) {
				 System.out.println("parent_id");
				
			} else {
				System.out.println("child_id");
				
				//perform action inside the window
				WebElement textfield = driver.findElement(By.cssSelector("#account_name_text_field"));
				textfield.sendKeys("aa1ccd52de6hh666wNNkk22");
				
				//close the browser
				driver.quit();

			}
			 
		 }

	}


}
