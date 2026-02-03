package WebelementVerfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open the browser---chrome
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to the application via url
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//verify the page
		
		System.out.println(driver.getTitle());
		
		//Identify the element  and store it.
		
		
		WebElement element = driver.findElement(By.cssSelector("#pollanswers-18"));
		
		
		//validate the element is Selected or not.
		
		if (element.isSelected()) {
			System.out.println("Element is already is selected.");
			
		} else {
			System.out.println("Element is not selected.");
			

		}
		//close the browser
		
		driver.close();
		
		
	}

}
