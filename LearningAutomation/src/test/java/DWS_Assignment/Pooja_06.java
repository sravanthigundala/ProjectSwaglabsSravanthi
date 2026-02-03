
package DWS_Assignment;

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

// Scenario: Verify User is able to order the Desktop product

public class Pooja_06 extends BaseConfig{


	SoftAssert saobj;

	
	@Test(groups="IT",priority = 1, enabled = true, invocationCount = 1)
	public void Addproduct() throws InterruptedException {

		//Identify the Computers link
		WebElement computers_link = driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"));
		//Verify the Computer link is Displayed and Enabled
		Assert.assertTrue(computers_link.isDisplayed() & computers_link.isEnabled());
		computers_link.click();

		
		//Identify the Desktop link in Computers category
		WebElement desktop_link = driver.findElement(By.partialLinkText("Desktops"));
		//Verify the Desktop link is Displayed & Enable
		Assert.assertTrue(desktop_link.isDisplayed() & desktop_link.isEnabled());
		desktop_link.click();

		//verify the page
		System.out.println("Selected desktop should display along with ratings");
		
		//click on first product
		WebElement firstproduct_link = driver.findElement(By.partialLinkText("Build your own cheap computer"));
		//Verify the first product is Displayed and Enabled
		Assert.assertTrue(firstproduct_link.isDisplayed() & firstproduct_link.isEnabled());
		firstproduct_link.click();
		
		//verify the page
		System.out.println("selected first product should display");

		
		//click on add to cart button
		WebElement addtocart_button = driver.findElement(By.id("add-to-cart-button-72"));
		//Verify the element is Displayed and Enabled
		Assert.assertTrue(addtocart_button.isDisplayed() & addtocart_button.isEnabled());
		addtocart_button.click();

		
		//click on shopping cart link
		WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
		///Verify the element is Displayed and Enabled
		Assert.assertTrue(shoppingcart_link.isDisplayed() & shoppingcart_link.isEnabled());
		shoppingcart_link.click();
		
		//Verify Shopping Cart page
		Assert.assertEquals("Demo Web Shop. Shopping Cart", driver.getTitle());


		//click on term and conditions(check box)
		WebElement TermandCondition_checkbox = driver.findElement(By.id("termsofservice"));
		//Verify the element is selected or not
		Assert.assertTrue(TermandCondition_checkbox.isDisplayed() & TermandCondition_checkbox.isEnabled());
		TermandCondition_checkbox.click();

		//click on checkout button
		WebElement checkout_button = driver.findElement(By.id("checkout"));
		Assert.assertTrue(checkout_button.isDisplayed() & checkout_button.isEnabled());
		checkout_button.click();

		// verify the page
		System.out.println("Billing address should display");

		// click on billing address continue button 
		WebElement billing_address = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		// Verify the element is Displayed & Enabled
		Assert.assertTrue(billing_address.isDisplayed() & billing_address.isEnabled());
		billing_address.click();

		WebElement billingcontinue_btn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		// Assert.assertTrue(billingcontinue_btn.isDisplayed() &
		// billingcontinue_btn.isEnabled());
		billingcontinue_btn.click();

		// verify the page
		System.out.println("shipping address should display");

		
		//click on continue button (shipping address)
		WebElement shipping_address = driver.findElement(By.xpath("(//h2['Shipping address'])[2]"));
		//Verify the element is Displayed & Enabled
		Assert.assertTrue(shipping_address.isDisplayed() & shipping_address.isEnabled());
		shipping_address.click();

		WebElement shippingcontinue_btn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		// Assert.assertTrue(shippingcontinue_btn.isDisplayed() &
		// shippingcontinue_btn.isEnabled());
		shippingcontinue_btn.click();
   
		
		// verify the page
		System.out.println("shipping method page should display");

	    ////Check the Shipping Method radio button selection
		WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));
		System.out.println("Ground radio button is selected : " + shipping_radio.isSelected());

		//click on continue button (shipping method)
		WebElement shipmtdcontinue_btn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
		//identify the element
		Assert.assertTrue(shipmtdcontinue_btn.isDisplayed());
		Assert.assertTrue(shipmtdcontinue_btn.isEnabled());
		Thread.sleep(1000);
		shipmtdcontinue_btn.click();

		
		WebElement payment_radio = driver.findElement(By.id("paymentmethod_0"));
		System.out.println("cod radio button is selected : " + payment_radio.isSelected());

		WebElement paymtdcontinue_btn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		Assert.assertTrue(paymtdcontinue_btn.isDisplayed() & paymtdcontinue_btn.isEnabled());
		paymtdcontinue_btn.click();
		
		// verify the page
		System.out.println("Payment Information page should display");


		//click on continue button (payment information)
		WebElement payinfocontinue_btn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		Thread.sleep(1000);
		//Verify the element is Displayed & Enabled
		Assert.assertTrue(payinfocontinue_btn.isDisplayed() & payinfocontinue_btn.isEnabled());
		Thread.sleep(1000);
		payinfocontinue_btn.click();

		// verify the page
		System.out.println("Confirm order page verified");
		
		saobj = new SoftAssert();

		WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		// Assert.assertTrue(confirm_btn.isDisplayed() & confirm_btn.isEnabled());
		confirm_btn.click();

		System.out.println("Thank you page is verified : " + driver.getTitle());

		saobj.assertEquals(driver.getTitle(), "Demo Web Shop.Checkout");
		// saobj.assertAll();

		WebElement tqcontinue_btn = driver
				.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));

		saobj.assertEquals(tqcontinue_btn.isDisplayed(), true);
		Assert.assertTrue(tqcontinue_btn.isDisplayed() & tqcontinue_btn.isEnabled());
		tqcontinue_btn.click();

		Reporter.log("Product ordered successfully ", true);

		System.out.println("---Addproduct_Pooja_06---");

	}

	@Test(groups="IT",priority = 2, dependsOnMethods = "Addproduct", enabled = true)
	public void Updateproduct() {
		// TODO Auto-generated method stub

		System.out.println("---Updateproduct_Pooja_06---");
	}

	@Test(groups="IT",priority = 3, dependsOnMethods = "Addproduct", enabled = true)
	public void Deleteproduct() {
		// TODO Auto-generated method stub

		System.out.println("---Deleteproduct_Pooja_06---");
	}

	

}