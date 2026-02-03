package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to the application via url
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	 WebElement alertpopup = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
	 alertpopup.click();
	 
	//wait method
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
       wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Alert is Present");
		
		// 1. Fetch the Alert text
	
		System.out.println(driver.switchTo().alert().getText());
		
		// 2. To Pass the data
		
		driver.switchTo().alert().sendKeys("selenium");
		
		//3. Click on Ok button
		
  	driver.switchTo().alert().accept();
		
		//4. Click on Cancel button
		
		driver.switchTo().alert().dismiss();
		

	}

}
