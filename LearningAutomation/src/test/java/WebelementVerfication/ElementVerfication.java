package WebelementVerfication;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser---chrome
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to the application via url
		
		driver.get("https://www.saucedemo.com");
		
		//verify the page
		
		System.out.println(driver.getTitle());
		
		//Identify the element  and store it.
		
		WebElement element = driver.findElement(By.cssSelector("login_logo"));
		
		//validate the element
		
		System.out.println("Displayed status:"+element.isDisplayed());
		System.out.println("Enabled status:"+element.isEnabled());
		
		//verify the text
		
		        String text   = element.getText();
		        
		//verify the Attribute
		        
		       
			@Nullable
			String attributevalue = element.getAttribute("class");
			
			System.out.println("attributevalue");
			
		         //verify the tagname
		         
		        String tagname = element.getTagName();
		        System.out.println("tagname ");
		        
		        
		      //verify the css property
		        
		        String cssvalue = element.getCssValue("font-family");
		        System.out.println("cssvalue");
		        		
		        //verify the Alignment or location.
		        
		        Point location = element.getLocation();
		        System.out.println("location");
		        System.out.println(element.getLocation().getX());
		        System.out.println(element.getLocation().getY()); 
		        
		        //verify the size
		        
		        Dimension sizevalue = element.getSize();
		        System.out.println("sizevalue");
		        System.out.println(element.getSize().getWidth());
		        System.out.println(element.getSize().getHeight());
		        
		        //close the browser
		        driver.close();
		        
	}
	


}
