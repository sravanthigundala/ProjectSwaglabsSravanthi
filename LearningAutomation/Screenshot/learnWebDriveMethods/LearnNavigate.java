package learnWebDriveMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigate {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//open the browser
		
		WebDriver driver=new ChromeDriver();
		
		//navigate to application via url by get()
		
		driver.get("https://www.netflix.com/in/");
		
		//navigate the application by using to(string url)
		
		driver.navigate().to("https://www.amazon.in/");
		
		//naigate to the application by using to(Url url)
		
	   URL url_app=new URL("https://www.flipkart.com/");
		
		driver.navigate().to("url_app");
		
		//perform backward navigation
		driver.navigate().back();

		//perform the forward navigation
		 driver.navigate().forward();
		 
		 //reload the page   n
		 
		driver.navigate().refresh();
	}

}
