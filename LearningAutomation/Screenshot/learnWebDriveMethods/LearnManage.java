package learnWebDriveMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnManage {
	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver= new ChromeDriver();
		
		//navigate the application via url
		 driver.get("https://shoppersstack.com/");

		 //maximize the browser
		 
		 driver.manage().window().maximize();
		 
		 //minimize the browser
		 
		 driver.manage().window().minimize();
		 
		 //fullscreen of the browser
		 
		 driver.manage().window().fullscreen();
		 
		 
		 //fetch the size of the browser
		 
		 driver.manage().window().getSize();
		 
		 //fetch the position of the browser
		 driver.manage().window().getPosition();
		 
		 // set the size of the browser
		  driver.manage().window().setSize(new Dimension(500, 700));
		  
		  //set the position of the browser
		  
		  driver.manage().window().setPosition(new Point(200, 100));
	}

}
