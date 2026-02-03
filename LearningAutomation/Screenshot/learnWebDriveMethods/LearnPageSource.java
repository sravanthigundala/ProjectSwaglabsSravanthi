package learnWebDriveMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the browser
		
				WebDriver driver=new ChromeDriver();
				
				//navigate to application via url by get()
				
				driver.get("https://www.amazon.in/");
				
				//fetch the actual source code-html code
				
				String sourcecode=driver.getPageSource();
				
				//print on console
				
				System.out.println(sourcecode);

	}

}
