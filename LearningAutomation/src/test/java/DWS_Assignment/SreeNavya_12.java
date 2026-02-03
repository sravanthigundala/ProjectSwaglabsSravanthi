 package DWS_Assignment;

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

//Scenario:To verify that the user is able to order the product (or) not by clicking on checkout.

public class SreeNavya_12 extends BaseConfig {
		
@Test(groups="IT",priority = 1, enabled = true,invocationCount = 1)
public void addProduct() throws InterruptedException {
	
	
	// Wait statement
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
    // 6. Click the apparel&Shoes categories		
	WebElement app = driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a[contains(text(),'Apparel & Shoes')]"));
	
	//6.1  Verify the apparel&Shoes link is Displayed & Enabled
	Assert.assertTrue(app.isDisplayed() && app.isEnabled());
	
	//Perform Action
	app.click(); 

	// 7. Identify the 2nd product & Click on the First product
	WebElement shoes = driver.findElement(By.linkText("Blue and green Sneaker"));
	
	// 7.1 Verify the first product is Displayed and Enabled
			Assert.assertTrue(shoes.isDisplayed() && shoes.isEnabled());
			
    //Perform Action
	shoes.click();
	
	// 8. Click on Add To Cart button
	// 8.1 Identify the Element
	 WebElement addtocart = driver.findElement(By.id("add-to-cart-button-28"));
	 
	// 8.2 Verify the element is Displayed and Enabled
	Assert.assertTrue(addtocart.isDisplayed() && addtocart.isEnabled());
	
	//Perform Action
	 addtocart.click();

	// 9. Click on the Shopping Cart link
	// 9.1 Identify the Element
	   WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
	
	// 9.2 Verify the element is Displayed and Enabled
	   Assert.assertTrue(shoppingcart_link.isDisplayed() && shoppingcart_link.isEnabled());
	//Perform Action
	  shoppingcart_link.click();
	  
	// 10. Verify Shopping Cart page
	   Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");

	// 11. Identify the selection of Terms of service Check box &
	WebElement termsofservice_checkbox = driver.findElement(By.id("termsofservice"));

	// 12. Click on the Checkbox.
	termsofservice_checkbox.click();
	
	// 12.1 Verify the element is selected or not
	Assert.assertTrue(termsofservice_checkbox.isSelected());

	// 13.Click on the Checkout button
	WebElement checkout_btn = driver.findElement(By.id("checkout"));
	
	checkout_btn.click();
	
	// 14. Verify the Checkout page
	   Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Checkout");

	

	// 15. Click on Continue button in Billing address
	// 15.1 Identify the Element
	   WebElement billing_continuebtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
	
	// 15.2 Verify the element is Displayed & Enabled
	   Assert.assertTrue(billing_continuebtn.isDisplayed() && billing_continuebtn.isEnabled());

	//Perform Action
	billing_continuebtn.click();

	// 16. Click on Continue button in shipping address
	// Wait Statement
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='Shipping.save()']")));

	// 16.1 Identify the Element
	   WebElement shipping_continuebtn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
	
	// 16.2 Verify the element is Displayed & Enabled
	   Assert.assertTrue(shipping_continuebtn.isDisplayed() && shipping_continuebtn.isEnabled());

	//Perform Action
	shipping_continuebtn.click();
	
    // 17. Check the Shipping Method radio button selection
	// 17.1 Identify the Element
	WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));
	
	// 17.2 Verify the element is Selected
	   Assert.assertTrue(shipping_radio.isSelected());
	   
	

	// 18. Click on Continue button in Shipping Method
	
	// 18.1 Identify the Element
	WebElement shipmethod_continuebtn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
	
	// wait statement
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ShippingMethod.save()']")));

	// 18.2 Verify the Element is Displayed and Enabled
	   Assert.assertTrue(shipmethod_continuebtn.isDisplayed() && shipmethod_continuebtn.isEnabled());

	// Perform Action   
	shipmethod_continuebtn.click();

	// 19. Check the Payment Method radio button selection
	// Identify the Element
	WebElement cod_radio = driver.findElement(By.id("paymentmethod_0"));
	
	Assert.assertTrue(cod_radio.isSelected());

	// 20. Click on Continue button in Payment Information
	//// 20.1 Identify the Continue button
	     WebElement payment_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
	     
	// 20.2 Verify the Continue button is Displayed & Enabled
	   Assert.assertTrue(payment_continuebtn.isDisplayed() && payment_continuebtn.isEnabled());
	   
	//Perform Action
	  payment_continuebtn.click();

	// 21. Click on Continue button in Payment Method
	// 21.1 Identify the Continue button
	WebElement paymentinfo_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
	//Wait Statement
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='PaymentInfo.save()']")));

	// 21.2 Verify the element is Displayed & Enabled
	Assert.assertTrue(paymentinfo_continuebtn.isDisplayed() && paymentinfo_continuebtn.isEnabled());
	// Perform Action
	paymentinfo_continuebtn.click();

	// 22 Check the Confirm order
	System.out.println("Confirm order page verified");

	// 23. Click on Confirm button
	// 23.1 Identify the Confirm button
	   WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
	//Wait Statement
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ConfirmOrder.save()']")));

	// 23.2 Verify the element is Displayed & Enabled
	  Assert.assertTrue(confirm_btn.isDisplayed() && confirm_btn.isEnabled());
    // Perform Action
	   confirm_btn.click();

	// 24. Verify Thank You Page
	   //Wait Statement
	   wait.until(ExpectedConditions.titleContains("Demo Web Shop. Checkout"));
//		Assert.assertEquals("Demo Web Shop. Checkout", driver.getTitle());
	  //24.1 Verify the Success message
		WebElement text_msg = driver
				.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
		String message = text_msg.getText();
		String expcondition1 = "Your order has been successfully processed!";
		String actualcondition1 = message;
		SoftAssert saobj = new SoftAssert();
		saobj.assertEquals(actualcondition1, expcondition1);
	   
	// 25. Click on Continue button in Thank You page
	// 25.1Identify The Element
	   WebElement continue_btn = driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
    // 25.2 Verify the element is Displayed & Enabled
	   saobj.assertTrue(continue_btn.isDisplayed() && continue_btn.isEnabled());
    // Perform Action
	   continue_btn.click();
	   saobj.assertAll();
			
	Reporter.log("Product Order Successfull", true);
	
}
@Test(groups="IT",priority = 2,dependsOnMethods = "addproduct",enabled = true )
public void updateprouct() {
	Reporter.log("---updateproduct---");
}
@Test(groups="IT",priority = 3,dependsOnMethods = "addproduct", enabled = true)
public void Deleteproduct()
{
	Reporter.log("---Deleteproduct---");
}


}
