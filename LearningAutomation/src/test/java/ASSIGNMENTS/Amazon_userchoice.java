package ASSIGNMENTS;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_userchoice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Data");
		
	         sc.next();
	         
	    // open the browser
	       WebDriver driver=new ChromeDriver();
	       
	    //waitstatement
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	    //Maximize the brower
	       driver.manage().window().maximize();
	    
	    //Navigate to the application via url.
	       driver.get("https://www.amazon.in/");
	       
	    //Verify the page
	       System.out.println("Title is:"+ driver.getTitle());
	       
	    //Identify the element-----> Searchbox  by Xpath and store it.
	       WebElement srchbx = driver.findElement(By.xpath("//input[@type='text']"));
	     
	    //Validate the element is displayed and enabled.
	       
	       System.out.println("Element is Displayed:"+ srchbx.isDisplayed());
	       System.out.println("Element is Enabled:"+ srchbx.isEnabled());
	       
	     //perform actions.
	       
	       srchbx.sendKeys("handbag");
	       
	     //fetch and Identify the all the suggestions and store it.
	        List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div[@role='row']"));
	       
	     //fetch the count of list.
	        
	        int count = allsuggestions.size();
	        
	        System.out.println("count of allsuggestions:"+ count);
	        
	      //fetch the List of all suggestions.
	        
	        for (WebElement el :allsuggestions ) {
	            System.out.println(el.getText());
	        }
	        
	      //Capture the screenshot
	        //Perform typecasting.
	        TakesScreenshot ts =(TakesScreenshot)driver;
	        
	        //call the screenshot method.
	        //store it in a temporary path.
	      
	        File src = ts.getScreenshotAs(OutputType.FILE);      
	        

	        //copy the temporary path into permanent path.

	        
	        
	        
	        
	       
	       
	       
	       


	
	
	}
}
