package DWS_Assignment;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Scenario: Verify User is able to order the Desktop product

public class Sravanthi_11 extends BaseConfig {


    @Test(groups="FT",priority=1,enabled=true,invocationCount=1)
    public void Addproduct() throws InterruptedException {
    	
    	
    	
    	//click on desktop in the computer category.
    	//Identify the computerlink
		WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(), 'Computers')]"));
		
		// Verify the Computer link is Displayed and Enabled
		Assert.assertTrue(computers.isDisplayed() && computers.isEnabled());

		//clck on computer
		computers.click();
		
		//Identify the Desktop link in Computers category
		WebElement desktop= driver.findElement(By.partialLinkText("Desktops"));
		
		//Verify the Desktop link is Displayed & Enabled
		Assert.assertTrue(desktop.isDisplayed() && desktop.isEnabled());

		//click on desktop.
		desktop.click();
		
       //verify the page.
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops");
		
     //Identify the element and click on the second product.
		WebElement second_prd = driver.findElement(By.partialLinkText("Build your own computer"));
		
	  //	Verify the second product is Displayed and Enabled
		Assert.assertTrue(second_prd.isDisplayed() && second_prd.isEnabled());
		
	 //cick on second product.
		second_prd.click();
		
     //verify the page.
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Build your own computer");
		
		//click on radio button
		WebElement HOD_radiobtn = driver.findElement(By.id("product_attribute_16_3_6_19"));
		HOD_radiobtn .click();
		// Verify the element is selected or not
		Assert.assertTrue(HOD_radiobtn.isSelected());
		
        
		
    //Identify the element. 
		WebElement Add_to_cart = driver.findElement(By.id("add-to-cart-button-16"));
		
		//Verify the element is Displayed and Enabled
		Assert.assertTrue(Add_to_cart.isDisplayed() && Add_to_cart.isEnabled());

		//click on Add to cart button.
		Add_to_cart.click();
		
     // Click on the Shopping Cart link
		WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
		
	// Verify the element is Displayed and Enabled
		Assert.assertTrue(shoppingcart_link.isDisplayed() && shoppingcart_link.isEnabled());
    
		//peform action.
		shoppingcart_link.click();
		
    //verify the shopping cart page .
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
		
   //Identify the selection of Terms of service Check box .
		WebElement termsofservice_checkbox = driver.findElement(By.id("termsofservice"));
		termsofservice_checkbox.click();
		//Verify the element is selected or not
		Assert.assertTrue(termsofservice_checkbox.isSelected());
		
		
  //click on checkout button.
		WebElement checkout_btn = driver.findElement(By.id("checkout"));
		checkout_btn.click();
		//. Verify the Checkout page
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Checkout");
		
		
		
		
  //Click on Continue button in Billing address.
		WebElement billing_continuebtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		//Verify the element is Displayed & Enabled
		Assert.assertTrue(billing_continuebtn.isDisplayed() && billing_continuebtn.isEnabled());
		//click on continue.
		billing_continuebtn.click();

   // Click on Continue button in shipping address
		WebElement shipping_continuebtn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Verify the element is Displayed & Enabled
		Assert.assertTrue(shipping_continuebtn.isDisplayed() && shipping_continuebtn.isEnabled());
		shipping_continuebtn.click();
		
		// wait statement
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ShippingMethod.save()']")));

  //Check the Shipping Method radio button selection
		WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));
		// Verify the element is Selected
		Assert.assertTrue(shipping_radio.isSelected());
		

  //Click on Continue button in Shipping Method
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement shipmethod_continuebtn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
		
		
		//Verify the Element is Displayed and Enabled
		Assert.assertTrue(shipmethod_continuebtn.isDisplayed() && shipmethod_continuebtn.isEnabled());
        //perform action.
		shipmethod_continuebtn.click();

   //Check the Payment Method radio button  is selected.
		WebElement cod_radio = driver.findElement(By.id("paymentmethod_0"));
		//verify the element is selected.
		Assert.assertTrue(cod_radio.isSelected());
		
		// Click on Continue button in Payment Information
			//  Identify the Continue button
			WebElement payment_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
             // Verify the Continue button is Displayed & Enabled
			Assert.assertTrue(payment_continuebtn.isDisplayed() && payment_continuebtn.isEnabled());
			 // 18.3 Perform Action
			payment_continuebtn.click();

			
	//Click on Continue button in Payment Method
		    WebElement paymentinfo_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='PaymentInfo.save()']")));

			//Verify the element is Displayed & Enabled
			Assert.assertTrue(paymentinfo_continuebtn.isDisplayed() && paymentinfo_continuebtn.isEnabled());
             //Perform Action
			paymentinfo_continuebtn.click();

			//Check the Confirm order details
			System.out.println("Order details verified");

		
	//Identify the Confirm button
			WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ConfirmOrder.save()']")));

			//Verify the element is Displayed & Enabled
			Assert.assertTrue(confirm_btn.isDisplayed() && confirm_btn.isEnabled());
			//Perform Action
			confirm_btn.click();

	//Verify Thank You Page
			wait.until(ExpectedConditions.titleContains("Demo Web Shop. Checkout"));
			Assert.assertEquals("Demo Web Shop. Checkout", driver.getTitle());
			
	//Verify the Success message
			WebElement text_msg = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
			String message = text_msg.getText();

			String expcondition1 = "Your order has been successfully processed!";
			String actualcondition1 = message;
			SoftAssert saobj = new SoftAssert();
			saobj.assertEquals(actualcondition1, expcondition1);
	
		
  //Click on Continue button in Thank You page
		WebElement continue_btn = driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
		//Verify the element is Displayed & Enabled
		saobj.assertTrue(continue_btn.isDisplayed() && continue_btn.isEnabled());
		//perform action.
		continue_btn.click();
		
		saobj.assertAll();
    	
    	
		Reporter.log("product Added.",true);
		
    }
		@Test(groups="FT",priority=2,dependsOnMethods = "Addproduct",enabled=true)
		public void Updateproduct() {
			
			Reporter.log("Updateproduct",true);
		}
		@Test(groups="FT",priority=3,dependsOnMethods = "Addproduct",enabled=true)
		public void Deleteproduct() {
			
			Reporter.log("Deleteproduct",true);
		}
		
	  
}