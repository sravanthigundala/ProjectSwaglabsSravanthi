package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//1.Webelement Identification and Declaration.
	
	@FindBy(partialLinkText = "Sauce Labs Backpack")
	private WebElement Product1;
	
	
	@FindBy(partialLinkText = "Sauce Labs Bike Light")
	private WebElement Product2;
	
	@FindBy(partialLinkText = "Sauce Labs Bolt T-Shirt")
	private WebElement Product3;
	
	@FindBy(partialLinkText = "Sauce Labs Fleece Jacket")
	private WebElement Product4;
	
	@FindBy(partialLinkText = "Sauce Labs Onesie")
	private WebElement Product5;
	
	@FindBy(partialLinkText = "Test.allTheThings() T-Shirt (Red)")
	private WebElement Product6;
	
	//2.Webelement  Intialization
	
	public HomePage(WebDriver driver) {
		
       PageFactory.initElements(driver,this);
	}
	
	//3.Webelement  Utailization
	
      public WebElement getProduct1() {
    	  
		return Product1;
    	  
      }
      
      public WebElement getProduct2() {
    	  
  		return Product2;
      	  
        }
      
      public WebElement getProduct3() {
    	  
  		return Product3;
      	  
        }
      
      public WebElement getProduct4() {
    	  
  		return Product4;
      	  
        }
      public WebElement getProduct5() {
    	  
  		return Product5;
      	  
        }
      public WebElement getProduct6() {
    	  
  		return Product6;
      	  
        }
}
