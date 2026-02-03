package HandlingMouseActions;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.lang.model.element.Element;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnHandligMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigato to the application via url.
		driver.get("https://demowebshop.tricentis.com/");
		
		//I dentify the element
		 WebElement element = driver.findElement(By.xpath("	//ul[@class='top-menu']/li[2]"));
		
		//create an object for Actions class pass driver cotrol.
		Actions obj=new Actions(driver);
		
		//call the static method 
		//call the mandatory method.
		
		obj.moveToElement(element).perform();
			
		//single actions
		//obj.click(element).perform();
		//obj.doubleClick(element).perform();
        obj.contextClick(element).perform();
        //multiple actions
        //obj.moveToElement(element).click().perform();
        //obj.moveToElement(element).doubleClick().perform();
        obj.moveToElement(element).contextClick().perform();
        
	}

	
}
