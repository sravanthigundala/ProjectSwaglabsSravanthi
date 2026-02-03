package DWS_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pranitha_07 extends BaseConfig{
	
	
	@Test(groups="FT",priority=2,dependsOnMethods ="Updateproduct",enabled = false)
	public void deleteproduct() {
		Reporter.log("---Deleteproduct_Pranitha_07---");
	
	}
	@Test(groups="FT",priority=2,dependsOnMethods ="Addproduct",enabled = false)
	public void Updateproduct() {
	
	Reporter.log("---Update_Pranitha_07---");
	
	}	
	
	@Test(groups="FT",priority=1,enabled = true,invocationCount=1)
	public void Addproduct() {
		

		// 8.click on computer category
		WebElement computers_link = driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"));
		
		//Verify the Computer link is Displayed and Enabled
		Assert.assertTrue(computers_link.isDisplayed() && computers_link.isEnabled());
				
		computers_link.click();

		// 9.verify the page
		System.out.println("computer related products should display");
		
		// 10.click on desktop
		WebElement desktop_link = driver.findElement(By.partialLinkText("Desktops"));
		
		//Verify the Desktop link is Displayed & Enabled
		Assert.assertTrue(desktop_link.isDisplayed() && desktop_link.isEnabled());
				
		desktop_link.click();

		// 11.verify the page
		System.out.println("Selected desktop should display along with ratings");

		// 12.click on first product
		WebElement firstproduct_link = driver.findElement(By.partialLinkText("Build your own cheap computer"));
		
		//Verify the first product is Displayed and Enabled
		Assert.assertTrue(firstproduct_link.isDisplayed() && firstproduct_link.isEnabled());
				
		firstproduct_link.click();

		// 13.verify the page
		System.out.println("selected first product should display");

		// 14.click on add to cart button
		WebElement addtocart_button = driver.findElement(By.id("add-to-cart-button-72"));
		
		//Verify the element is Displayed and Enabled
		Assert.assertTrue(addtocart_button.isDisplayed() && addtocart_button.isEnabled());
				
		addtocart_button.click();

		// 15.click on shopping cart link
		WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
		
		//Verify the element is Displayed and Enabled
		Assert.assertTrue(shoppingcart_link.isDisplayed() && shoppingcart_link.isEnabled());
		shoppingcart_link.click();
		
		//Verify Shopping Cart page
		Assert.assertEquals("Demo Web Shop. Shopping Cart", driver.getTitle());

		// 16.click on term and conditions(check box)
		WebElement termsandconditions_checkbox = driver.findElement(By.id("termsofservice"));
		termsandconditions_checkbox.click();
		
		//Verify the element is selected or not
		Assert.assertTrue(termsandconditions_checkbox.isSelected());

		// 17.click on checkout button
		WebElement checkout_button = driver.findElement(By.id("checkout"));
		checkout_button.click();
		
		//Verify the Checkout page
		Assert.assertEquals("Demo Web Shop. Checkout", driver.getTitle());
		
		// 18.Check auto fill first name in first name text field
		// WebElement
		// firstname_TextFiled=driver.findElement(By.id("BillingNewAddress_FirstName"));
		// firstname_TextFiled.sendKeys("Pranitha");

		// 19.check auto fill last name in last name text field
		// WebElement
		// lastname_TextFiled=driver.findElement(By.id("BillingNewAddress_LastName"));
		// firstname_TextFiled.sendKeys("Prani");

		// 20.enter emalid in email id text field
		// WebElement email_id=driver.findElement(By.id("BillingNewAddress_Email"));
		// email_id.clear();
		// email_id.sendKeys("pranitha@gmail.com");

		// perform the action
		// JavascriptExecutor jsc=(JavascriptExecutor)driver;

		// call the execution script code
		// jsc.executeScript("window.scrollBy(0,500)");
		// Thread.sleep(5000);

		// jsc.executeScript("window.scrollBy(0,500)");
		// Thread.sleep(5000);

		// System.out.println("execution done");

		// 21.click on drop down
		// WebElement dropdown=driver.findElement(By.id("BillingNewAddress_CountryId"));
		// Select S = new Select(dropdown);

		// 22.scroll down and select India
		// S.selectByValue("41");

		// 23.enter city name in city text field
		// WebElement
		// city_TextField=driver.findElement(By.id("BillingNewAddress_City"));
		// city_TextField.sendKeys("Hyderabad");

		// 24.Enter address 1 in address 1 text field
		// WebElement address1_Text
		// field=driver.findElement(By.id("BillingNewAddress_Address1"));
		// address1_Textfield.sendKeys("1-2-12");

		// 25.Enter address 2 in address 2 text field
		// WebElement
		// address2_Textfield=driver.findElement(By.id("BillingNewAddress_Address2"));
		// address2_Textfield.sendKeys("1-2-12");

		// 26.enter postal code in postal code text field
		// WebElement
		// postalcode_Textfield=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		// postalcode_Textfield.sendKeys("400233");

		// 27.enter phone number in phone number text field
		// WebElement
		// phonenumber_Textfield=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		// phonenumber_Textfield.sendKeys("9876543210");

		// 28.click on continue button

		// verify the page
		System.out.println("Billing address should display");

		// 29.click on continue button (billing)
		WebElement continue_button1 = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		
		// 13.2 Verify the element is Displayed & Enabled
		Assert.assertTrue(continue_button1.isDisplayed() && continue_button1.isEnabled());
		continue_button1.click();

		// verify the page
		System.out.println("shipping address should display");

		// 30.click on continue button (shipping address)
		WebElement continue_button2 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));

		//Verify the element is Displayed & Enabled
	//	Assert.assertTrue(continue_button2.isDisplayed()&& continue_button2.isEnabled());
		continue_button2.click();

		// verify the page
		System.out.println("shipping method page should display");

		// 31.click on "Ground" radio button
		WebElement radio_button = driver.findElement(By.id("shippingoption_0"));
		Assert.assertTrue(radio_button.isSelected());
		radio_button.click();

		// 32.click on continue button (shipping method)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement continue_button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ShippingMethod.save()']")));
		
		
		//Verify the Element is Displayed and Enabled
		Assert.assertTrue(continue_button3.isDisplayed() && continue_button3.isEnabled());

		continue_button3.click();

		// verify the page
		System.out.println("Payment Method Should display");

		// 33.click on cash on delivery radio button
		WebElement cashradio_button = driver.findElement(By.id("paymentmethod_0"));
		Assert.assertTrue(cashradio_button.isSelected());
		cashradio_button.click();

		// 34.click on continue button (payment method)
		WebElement continue_button4 = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		
		//Verify the Continue button is Displayed & Enabled
		Assert.assertTrue(continue_button4.isDisplayed() && continue_button4.isEnabled());
				
		continue_button4.click();

		// verify the page
		System.out.println("Payment Information page should display");

		// 35.click on continue button (payment information)
		WebElement continue_button5 = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		
		// 19.2 Verify the element is Displayed & Enabled
//		Assert.assertTrue(paymentinfo_continuebtn.isDisplayed() && paymentinfo_continuebtn.isEnabled());
		continue_button5.click();

		// verify the page
		System.out.println("confirm order page should display");

		// 36.click on confirm button
		WebElement confirm_button = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		confirm_button.click();

		// verify the page
		Assert.assertEquals("Demo Web Shop. Checkout", driver.getTitle());
		
		// 22.1 Verify the Success message
		WebElement text_msg = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
			
		String message = text_msg.getText();

		String expcondition1 = "Your order has been successfully processed!";
		String actualcondition1 = message;
		SoftAssert saobj = new SoftAssert();
		saobj.assertEquals(actualcondition1, expcondition1);

		// 37.click on continue button
		WebElement continue_button6 = driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
				
		//Verify the element is Displayed & Enabled
		saobj.assertTrue(continue_button6.isDisplayed() && continue_button6.isEnabled());
		continue_button6.click();
		
		saobj.assertAll();
		
		Reporter.log("Product ordered successfully", true);
		System.out.println("---Addproduct_Pranitha_07---");

	}




}
