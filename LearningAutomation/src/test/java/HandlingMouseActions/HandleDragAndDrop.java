package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigato to the application via url.
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				// identify the drag element
		       WebElement dragle1 = driver.findElement(By.id("box2"));
		       WebElement dragle2 = driver.findElement(By.id("box4"));
		       WebElement dragle3 = driver.findElement(By.id("box6"));
		       WebElement dragle4 = driver.findElement(By.id("box7"));
		       WebElement dragle5 = driver.findElement(By.id("box1"));
		       WebElement dragle6 = driver.findElement(By.id("box3"));
		       WebElement dragle7 = driver.findElement(By.id("box5"));
		       
		       //identify the drop element
		       
		       WebElement drople1 = driver.findElement(By.id("box102"));
		       WebElement drople2 = driver.findElement(By.id("box104"));
		       WebElement drople3 = driver.findElement(By.id("box106"));
		       WebElement drople4 = driver.findElement(By.id("box107"));
		       WebElement drople5 = driver.findElement(By.id("box101"));
		       WebElement drople6 = driver.findElement(By.id("box103"));
		       WebElement drople7 = driver.findElement(By.id("box105"));
		       
		       //create an action class and pass the driver control
		       
		       Actions obj=new Actions(driver);
		       obj.dragAndDrop(dragle1, drople1).perform();
		       obj.dragAndDrop(dragle2, drople2).perform();
		       obj.dragAndDrop(dragle3, drople3).perform();
		       obj.dragAndDrop(dragle4, drople4).perform();
		       obj.dragAndDrop(dragle5, drople5).perform();
		       obj.dragAndDrop(dragle6, drople6).perform();
		       obj.dragAndDrop(dragle7, drople7).perform();
		       
		       //call the method using click and hold then release.
		       
		       obj.clickAndHold(dragle1).release(drople1).perform();
		       obj.clickAndHold(dragle2).release(drople2).perform();
		       obj.clickAndHold(dragle3).release(drople3).perform();
		       obj.clickAndHold(dragle4).release(drople4).perform();
		       obj.clickAndHold(dragle5).release(drople5).perform();
		       obj.clickAndHold(dragle6).release(drople6).perform();
		       obj.clickAndHold(dragle7).release(drople7).perform();
		       
		       //call the method by using compound actions.
		       
		       obj.moveToElement(dragle1).clickAndHold().perform();
		       obj.moveToElement(drople1).release().perform();
		       
		       obj.moveToElement(dragle2).clickAndHold().perform();
		       obj.moveToElement(drople2).release().perform();
		       
		       obj.moveToElement(dragle3).clickAndHold().perform();
		       obj.moveToElement(drople3).release().perform();
		       
		       obj.moveToElement(dragle4).clickAndHold().perform();
		       obj.moveToElement(drople4).release().perform();
		       
		       obj.moveToElement(dragle5).clickAndHold().perform();
		       obj.moveToElement(drople5).release().perform();
		       
		       obj.moveToElement(dragle6).clickAndHold().perform();
		       obj.moveToElement(drople6).release().perform();
		       
		       obj.moveToElement(dragle7).clickAndHold().perform();
		       obj.moveToElement(drople7).release().perform();
		       
		       //close the browser
		       driver.close();
		       
		       
		       
	}

}
