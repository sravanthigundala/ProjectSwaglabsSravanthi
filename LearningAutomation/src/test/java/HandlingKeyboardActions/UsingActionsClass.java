package HandlingKeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open the browser.
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser.
				 driver.manage().window().maximize();
				 
				 //navigate to the application via url.
				 driver.get("https://demowebshop.tricentis.com/");
				 
				 //create an object for action.
				 Actions obj = new Actions(driver);
				 obj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"computer",Keys.ENTER).perform();
				 

	}

}
