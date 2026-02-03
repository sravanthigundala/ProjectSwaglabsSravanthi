package learnWebDriveMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGet {

	public static void main(String[] args) {

		// TODO Auto-generated method 
		
		//1.open the browser
		
	WebDriver driver =new ChromeDriver();
	
	//2. navigate to the application via url
	 driver.get("https://www.saucedemo.com/v1/");
	}

}
