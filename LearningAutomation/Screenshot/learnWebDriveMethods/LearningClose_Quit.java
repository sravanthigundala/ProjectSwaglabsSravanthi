package learnWebDriveMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningClose_Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.open the browser
		
		WebDriver driver =new ChromeDriver();
		
		//2. navigate to the application via url
		 driver.get("https://shoppersstack.com/");
		 
		 //3. click on the icon
		 driver.findElement(By.id("compare")).click();
		 
		 //4.close the browser
		 driver.close();
		 
		 
		 //quit the browser
		 driver.quit();

	}

}
