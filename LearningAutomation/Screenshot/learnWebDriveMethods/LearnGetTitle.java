package learnWebDriveMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.open the browser
		
		WebDriver driver =new ChromeDriver();
		
		//2. navigate to the application via url
		 driver.get("https://www.saucedemo.com/v1/");
		 
		 //3.verify the page using Title
		 
		 String expectedtitle ="Swag Labs";
		 String actualtitle = driver.getTitle();
		 if (expectedtitle.equals(actualtitle)) {
			System.out.println("Title verified: Test Pass");
			System.out.println("Title is: actualtitle");
		 }else {
			 System.out.println("Title verified: Test fail");
		 }
	}
}
