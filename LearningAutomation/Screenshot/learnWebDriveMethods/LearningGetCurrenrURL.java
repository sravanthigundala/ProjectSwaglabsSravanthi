package learnWebDriveMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetCurrenrURL {
	public static void main(String[] args) {
		//1.open the browser
		
				WebDriver driver =new ChromeDriver();
				
				//2. navigate to the application via url
				 driver.get("https://www.saucedemo.com/v1/");
				 
				 //3.verify the page with current url
				 
				 String expectedcurrenturl ="https://www.saucedemo.com/v1/";
				 String actualcurrenturl = driver.getCurrentUrl();
				 if (expectedcurrenturl.equals(actualcurrenturl)) {
					System.out.println("currenturl verified: Test Pass");
					System.out.println("currenturl is:" +actualcurrenturl);
				 }else {
					 System.out.println("currenturl verified: Test fail");
	}

	}
}
