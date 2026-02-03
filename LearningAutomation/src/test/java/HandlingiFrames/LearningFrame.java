package HandlingiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open the browser.
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser.
		
		driver.manage().window().maximize();
		
		//navigate to the application via url.
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//switch the driver control from main page to frame ---->using index.
		   // driver.switchTo().frame(1);
		
		//switch the driver control from main page to frame ---->using string.
		  //  driver.switchTo().frame("frame-bottom");
		    
	
        //switch the driver control from main page to frame ---->using webelement.
		    WebElement frame=  driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		    driver.switchTo().frame(frame);
		    
		    WebElement element=  driver.findElement(By.xpath("//body[contains(text(),'BOT')]"));
		    System.out.println(element.isDisplayed());
	}
}
