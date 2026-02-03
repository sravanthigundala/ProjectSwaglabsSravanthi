package DWS_Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Akhil_01 extends BaseConfig {
    
	
	
			@Test(groups="FT",priority = 2, dependsOnMethods = "addproduct",enabled = true)
			
			public void updateproduct() {
				
			Reporter.log("updateproduct",true);
			
			}
			@Test(groups="FT",priority = 3,dependsOnMethods = "addproduct",enabled=true)
			
			public void deleteproduct() {
			
				Reporter.log("deleteproduct",true);
				
			}
			@Test(groups="FT",priority = 1,enabled = true)
			public void addproduct() throws InterruptedException  {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
			//  5. choose the category
				WebElement chooseele = driver.findElement(By.xpath("(//a[@href='/apparel-shoes'])[1]"));
				
				Assert.assertTrue(chooseele.isDisplayed());
				 
				 Assert.assertTrue(chooseele.isEnabled());
				 
				chooseele.click();
				
				Thread.sleep(3000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;				
				
			//  5.2.click on the product
				WebElement proele = driver.findElement(By.xpath("(//a[@href=\"/casual-belt\"])[2]"));
				Thread.sleep(1000);
				Assert.assertTrue(proele.isDisplayed());
				 
				 Assert.assertTrue(proele.isEnabled());
				 
				js.executeScript("arguments[0].click()",proele);				
				
			//  6.add the product to the shopping cart
				WebElement shocartele = driver.findElement(By.xpath("//input[@id='add-to-cart-button-40']"));
				
				Assert.assertTrue(shocartele.isDisplayed());
				 
				 Assert.assertTrue(shocartele.isEnabled());
				 
				shocartele.click();
				
			//	7.verify the shopping cart
				WebElement verifyele = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
				
				Assert.assertTrue(verifyele.isDisplayed());
				 
				 Assert.assertTrue(verifyele.isEnabled());
				 
				verifyele.click();
				
			//  8.select the country in the country text field
				WebElement drop = driver.findElement(By.xpath("//select[@class='country-input']"));
				
				Assert.assertTrue(drop.isDisplayed());
				 
				 Assert.assertTrue(drop.isEnabled());
				 
				Select dropdown = new Select(drop);
				
				dropdown.selectByVisibleText("India");
				
			//  9.click on terms of service
				WebElement terms = driver.findElement(By.xpath("//input[@id='termsofservice']"));
				
				Assert.assertTrue(terms.isDisplayed());
				 
				 Assert.assertTrue(terms.isEnabled());
				 
				terms.click();
				
			//  10.perform checkout
				WebElement checkele = driver.findElement(By.xpath("//button[@id='checkout']"));
				
				Assert.assertTrue(checkele.isDisplayed());
				 
				 Assert.assertTrue(checkele.isEnabled());
				 
				checkele.click();
				
//			//  11.select country in country text field
//				WebElement dropele = driver.findElement(By.xpath("//select[@name='BillingNewAddress.CountryId']"));
				
//				Assert.assertTrue(dropele.isDisplayed());
				 
		//		 Assert.assertTrue(dropele.isEnabled());
				 
//				Select drop1 = new Select(dropele);
				
//				drop1.selectByVisibleText("India");
//				
//			//  12. select city in city text field
				
//				WebElement cityele = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
				
//				Assert.assertTrue(cityele.isDisplayed());
				 
			//	 Assert.assertTrue(cityele.isEnabled());
				 
//				cityele.sendKeys("Hyderabad");
//				
//			//  13.enter the address in address text field
//				WebElement addele = driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address1']"));
				
//				Assert.assertTrue(addele.isDisplayed());
				 
			//	 Assert.assertTrue(addele.isEnabled());
				 
//				addele.sendKeys("Pillar No -712");
//				
//			//  14.enter the pincode in pincode text field
//				WebElement pinele = driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']"));
				
//				Assert.assertTrue(pinele.isDisplayed());
				 
			//	 Assert.assertTrue(pinele.isEnabled());
				 
//				pinele.sendKeys("500090");
//				
//			//  15.enter the phone number in phone number text field
//			    WebElement phoneele = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
				
//			    Assert.assertTrue(phoneele.isDisplayed());
				 
			//	 Assert.assertTrue(phoneele.isEnabled());
				 
//			    phoneele.sendKeys("7569462737");
//			    
			//  16.perform scrolling
			    js.executeScript("window.scrollBy(0,500)");
			    
			//  17.click on continue
			    WebElement contele = driver.findElement(By.xpath("//input[@onclick=\"Billing.save()\"]"));
			    Assert.assertTrue(contele.isDisplayed());
				 
				 Assert.assertTrue(contele.isEnabled());
				 
			    contele.click();
			    
			 // 18.click on continue
			    WebElement contiele = driver.findElement(By.xpath("//input[@onclick=\"Shipping.save()\"]"));
			    Thread.sleep(1000);
			    Assert.assertTrue(contiele.isDisplayed());
				 
				 Assert.assertTrue(contiele.isEnabled());
				 
			    contiele.click();
			    
			 // 19.click on continue
			    WebElement conele = driver.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]"));
			    Thread.sleep(1000);
			    Assert.assertTrue(conele.isDisplayed());
				 
				 Assert.assertTrue(conele.isEnabled());
				 
			    conele.click();
			    
			 // 20.click on continue
			    WebElement coniele = driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]"));
			    
			 //   Assert.assertTrue(coniele.isDisplayed());
				 
			//	 Assert.assertTrue(coniele.isEnabled());
				 
			    coniele.click();
			    
			 // 21.click on continue
			    WebElement lasele = driver.findElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]"));
			    
			    Thread.sleep(1000);
			    Assert.assertTrue(lasele.isDisplayed());
				 
				 Assert.assertTrue(lasele.isEnabled());
				 
			    lasele.click();
			    
			 // 22.click on confirm
			    WebElement firmele = driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]"));
			    Thread.sleep(1000);
			    Assert.assertTrue(firmele.isDisplayed());
				 
				 Assert.assertTrue(firmele.isEnabled());
				 
			    firmele.click();
			    
			 // 23.click on continue
			    WebElement nueele = driver.findElement(By.xpath("//input[@onclick=\"setLocation('/')\"]"));
			    
			    Assert.assertTrue(nueele.isDisplayed());
				 
				 Assert.assertTrue(nueele.isEnabled());
				 
			    nueele.click();
			    
			    Reporter.log("product ordered successful",true);
			    
			 			    
			 
			    System.out.println("---Akhil_01---");

			}		
		
		
		
		}