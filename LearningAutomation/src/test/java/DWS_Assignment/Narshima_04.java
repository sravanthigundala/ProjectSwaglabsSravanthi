package DWS_Assignment;

//import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Narshima_04 extends BaseConfig{
	
		
		
		SoftAssert soft; 
		
		
		
		@Test(groups="IT",priority = 0, enabled=true, invocationCount=1)
		public void AddProduct(){
			
			
			Reporter.log(driver.getTitle(),true);
			
			WebElement addtocartButton = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
			// click the loginButton
			addtocartButton.click();
			
			// identify addtocart of nth product
			WebElement addtocartLink = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
			// click on addtocart link
			addtocartLink.click();
			Reporter.log(driver.getTitle(),true);
	
			soft.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
			
			// identify checkin button
			WebElement radioButton = driver.findElement(By.xpath("//input[@id='termsofservice']"));
			// click on checkinButton
			radioButton.click();
	
			// identify checkout Button
			WebElement checkinButton = driver.findElement(By.xpath("//button[@class='button-1 checkout-button']"));
			// click on checkoutButton link
			checkinButton.click();
			
			Reporter.log(driver.getTitle(),true);
			soft.assertEquals(driver.getTitle(), "Demo Web Shop. Checkout");
			
	
			// identify the continueButton1
			WebElement continueButton_1 = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
			// click on checkoutButton1 button
			continueButton_1.click();
	
			// identify the continueButton2
			WebElement continueButton_2 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
			// click on checkoutButton2 button
			continueButton_2.click();
	
			// identify the continueButton3
			WebElement continueButton_3 = driver
					.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']"));
			// click on checkoutButton2 button
			continueButton_3.click();
	
			// identify the continueButton4
			WebElement continueButton_4 = driver
					.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
			// click on checkoutButton4 button
			continueButton_4.click();
	
			// identify the continueButton5
			WebElement continueButton_5 = driver
					.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
			// click on checkoutButton5 button
			continueButton_5.click();
	
			// identify the continueButton6
			WebElement continueButton_6 = driver
					.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));
			// click on checkoutButton6 button
			continueButton_6.click();
	
			// identify the continueButton7
			WebElement continueButton_7 = driver
					.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
			// click on checkoutButton7 button
			continueButton_7.click();
			
			}
	
			
			@Test(groups="IT",priority = 1)
			public void UpdateProduct()
			{
				Reporter.log("The product is updated :",true);
			}
			
			
			@Test(groups="IT",priority = 2, dependsOnMethods ="AddProduct", enabled = false)
			public void DeleteProduct()
			{
				Reporter.log("The product is deleted :",true);
			}
	}


