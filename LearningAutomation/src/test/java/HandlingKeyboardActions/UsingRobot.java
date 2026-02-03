package HandlingKeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		// Open the browser.
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser.
		 driver.manage().window().maximize();
		 
		 //navigate to the application via url.
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 // Identify the element  using locator---> id
		 
		WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		searchbox.click();
		 
		 // create an object for robot.
		 
		 Robot obj = new Robot();
		 
		 obj.keyPress(KeyEvent.VK_C);
		 obj.keyRelease(KeyEvent.VK_C);
		 obj.keyPress(KeyEvent.VK_O);
		 obj.keyRelease(KeyEvent.VK_O);
		 obj.keyPress(KeyEvent.VK_M);
		 obj.keyRelease(KeyEvent.VK_M);
		 obj.keyPress(KeyEvent.VK_P);
		 obj.keyRelease(KeyEvent.VK_P);
		 obj.keyPress(KeyEvent.VK_U);
		 obj.keyRelease(KeyEvent.VK_U);
		 obj.keyPress(KeyEvent.VK_T);
		 obj.keyRelease(KeyEvent.VK_T);
		 obj.keyPress(KeyEvent.VK_E);
		 obj.keyRelease(KeyEvent.VK_E);
		 obj.keyPress(KeyEvent.VK_R);
		 obj.keyRelease(KeyEvent.VK_R);
		 
		 //Identify the element by using locator xpath.
		 
		 WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		 searchbutton.click();
		 
		 //close the browser
		 
		 driver.close();
		 
		 
	}

}
