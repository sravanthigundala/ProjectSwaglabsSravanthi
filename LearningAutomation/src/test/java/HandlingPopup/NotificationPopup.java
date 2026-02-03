package HandlingPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crete an object for browser setting class
		ChromeOptions option=new ChromeOptions();
		
		//customize the browser settings---> disable settings
		
		option.addArguments("--disable-notifications");
		
		//open the browser
		WebDriver driver=new ChromeDriver(option);
		
		//navigate to the application via url.
		driver.get("https://www.easemytrip.com/");

	}

}
