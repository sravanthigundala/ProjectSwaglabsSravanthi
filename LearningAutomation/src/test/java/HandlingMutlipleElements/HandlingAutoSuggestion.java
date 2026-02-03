package HandlingMutlipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
	
		
	String data = "selenium";
	
		       //open the browser---chrome
				WebDriver driver=new ChromeDriver();
				
				//wait method
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to the application via url
				
				driver.get("https://www.google.com/");
				
				//verify the page
				
				System.out.println(driver.getTitle());
				
				//Identify the element  and store it.
				
				
				WebElement searchbox = driver.findElement(By.xpath("//textarea[@name='q']"));
				
		       //validate the search box and store it
				
				System.out.println("Display status:"+ searchbox.isDisplayed());
				System.out.println("Enabled status:"+ searchbox.isEnabled() );
				
				//perform action-----> enter search box data in the search box
				
				searchbox.sendKeys(data);
				
				//fetch/Identify all the suggestions and store it.
				
				 List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
				
				//fetch the count of list
						 int count = allsuggestions.size();
                     System.out.println("count of the suggestions"+ count);
                     
                     //verif the all suggestions text
                     
                     for(int i=0;i<count;i++) {
                    	 
                    	 String text=allsuggestions.get(i).getText();
                    	 System.out.println(text);
                     }
                    	 
                    	//click on the nth suggestions
                    	        int n=5; 
                    	for (int i=0;i<count;i++){
                    	 if(i==n) {
                    		 Thread.sleep(4000);
                    		 allsuggestions.get(i).click();
                    	 }
                    	 
                    	 //close the browser
                    	 
                    	 driver.close();
                     }
	}

}
