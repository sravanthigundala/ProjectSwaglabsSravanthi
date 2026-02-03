package WebelementVerfication;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductElementVerfication {

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
				
				//Identify the element using xpath locator and store it.
				
				//xpath using partial text value
				
				WebElement username_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'User')]"));
				WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));
				WebElement login_buttton = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
				
				//validate the element is enabled and is displayed
				
				if (username_textfield.isDisplayed()&&username_textfield.isEnabled()&&password_textfield.isDisplayed()&&password_textfield.isEnabled()
						&&login_buttton.isDisplayed()&&login_buttton.isEnabled()) {
					
					System.out.println("element is verified:It is diaplayed");
					System.out.println("element is verified:It is enabled");
					
				} else {
					System.out.println("element is verified:It is not diaplayed");
					System.out.println("element is verified:It is not enabled");
				}
				
				//perform login action
				
				username_textfield.sendKeys("standard_user");
				password_textfield.sendKeys("secret_sauce");
				login_buttton.click();
				
				 //Identify the first product name
				
				WebElement firstprd=driver.findElement(By.xpath("//div[contains(text()='Sauce')]"));
						
				//fetch the partial text value of the 1st product name
						
					String firstprd_name = firstprd.getText();
			
	               validate_element(firstprd);
	               
	             //Identify the second product name
	       		
	       		WebElement secondprd=driver.findElement(By.xpath("//div[contains(text()='Light')]"));
	       				
	       		//fetch the partial text value of the 2nd product name
	       				
	       			String secondprd_name = secondprd.getText();
	       		
	       			validate_element(secondprd);
	       		
	            //Identify the third product name
	       		
	       		WebElement thirdprd=driver.findElement(By.xpath("//div[contains(text()='T-Shirt')]"));
	       				
	       		//fetch the  partial text value of the 3rd product name
	       				
	       			String thirdprd_name = thirdprd.getText();
	       	
	       			validate_element(thirdprd);
		       		
	       		
	       		//Identify the fourth product name
	       		
	       		WebElement fourthprd=driver.findElement(By.xpath("//div[contains(text()='Fleece Jacket')]"));
	       				
	       		//fetch the partial text value of the 4th product name
	       				
	       			String fourthprd_name = fourthprd.getText();
	       		
	       			validate_element(fourthprd); 		
	       		
	               //Identify the fifth product name
	       		
	       		WebElement fifthprd=driver.findElement(By.xpath("//div[contains(text()='Onesie')]"));
	       				
	       		//fetch the partial text value of the 5th product name
	       				
	       			String fifthprd_name = fifthprd.getText();
	       		
	       			validate_element(fifthprd); 
	       		
	      
	       		//Identify the sixth product name
	       		
	       		WebElement sixthprd=driver.findElement(By.xpath("//div[contains(text()='T-Shirt (Red)')]"));
	       				
	       		//fetch the  partial text value of the 6th product name
	       				
	       			String sixthprd_name = sixthprd.getText();
	       		
	       			validate_element(sixthprd); 
	       			
	       			//close the browser
	       			driver.close();
		       		
		
	}
		
	public static void validate_element(WebElement element) {
		
		//validate the element
		
				System.out.println("Displayed status:"+element.isDisplayed());
				System.out.println("Enabled status:"+element.isEnabled());
				
				//verify the text
				
				        String text   = element.getText();
				        
				//verify the Attribute
				        
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
				        
				     
				       
				        

	}
	


}
