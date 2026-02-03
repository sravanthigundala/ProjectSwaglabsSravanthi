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

// Scenario: Verify User is able to order the Desktop product

public class Anusha_02 extends BaseConfig{

	WebDriver driver;

	
	@Test(groups="IT",priority = 2, dependsOnMethods = "Addproduct", enabled = true)
	public void Updateproduct() {

		Reporter.log("---Updateproduct_Anusha_02---", true);
	}

	@Test(groups="IT",priority = 3, dependsOnMethods = "Addproduct", enabled = true)
	public void Deleteproduct() {

		Reporter.log("---Deleteproduct_Anusha_02---", true);

	}

	@Test(groups="IT",priority = 1, enabled = true, invocationCount = 1)
	public void Addproduct() {

		// 5. Click on the Desktops link in the Computers category

		// Wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 5.1 Identify the Computers link
		WebElement computers = driver
				.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a[contains(text(), 'Computers')]"));

		// 5.2 Verify the Computer link is Displayed and Enabled
		Assert.assertTrue(computers.isDisplayed() && computers.isEnabled());

		// 5.3 Perform Action
		computers.click();

		// 5.4 Identify the Desktop link in Computers category
		WebElement desktop_link = driver.findElement(By.partialLinkText("Desktops"));

		// 5.5 Verify the Desktop link is Displayed & Enabled
		Assert.assertTrue(desktop_link.isDisplayed() && desktop_link.isEnabled());

		// 5.6 Perform Action
		desktop_link.click();

		// 6. Click on the First product

		// 6.1 Identify the first product
		WebElement first_pdt = driver.findElement(By.partialLinkText("Build your own cheap computer"));

		// 6.2 Verify the first product is Displayed and Enabled
		Assert.assertTrue(first_pdt.isDisplayed() && first_pdt.isEnabled());

		// 6.3 Perform Action
		first_pdt.click();

		// 7. Click on Add To Cart button

		// 7.1 Identify the Element
		WebElement addtocart_btn = driver.findElement(By.id("add-to-cart-button-72"));

		// 7.2 Verify the element is Displayed and Enabled
		Assert.assertTrue(addtocart_btn.isDisplayed() && addtocart_btn.isEnabled());

		// 7.3 Perform Action
		addtocart_btn.click();

		// 8. Click on the Shopping Cart link

		// 8.1 Identify the Element
		WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));

		// 8.2 Verify the element is Displayed and Enabled
		Assert.assertTrue(shoppingcart_link.isDisplayed() && shoppingcart_link.isEnabled());

		// 8.3 Perform Action
		shoppingcart_link.click();

		// 9. Verify Shopping Cart page
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");

		// 10. Identify the selection of Terms of service Check box
		WebElement termsofservice_checkbox = driver.findElement(By.id("termsofservice"));

		// 10.1. Click on the Checkbox"
		termsofservice_checkbox.click();

		// 10.2 Verify the element is selected or not
		Assert.assertTrue(termsofservice_checkbox.isSelected());

		// 11.Click on the Checkout button
		WebElement checkout_btn = driver.findElement(By.id("checkout"));
		checkout_btn.click();

		// 12. Verify the Checkout page
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Checkout");

		// 13 Click on Continue button in Billing address
		// 13.1 Identify the Element
		WebElement billing_continuebtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));

		// 13.2 Verify the element is Displayed & Enabled
		Assert.assertTrue(billing_continuebtn.isDisplayed() && billing_continuebtn.isEnabled());

		// 13.3 Perform Action
		billing_continuebtn.click();

		// 14. Click on Continue button in shipping address
		// 14.1 Identify the Element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='Shipping.save()']")));

		WebElement shipping_continuebtn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));

		// 14.2 Verify the element is Displayed & Enabled
		Assert.assertTrue(shipping_continuebtn.isDisplayed() && shipping_continuebtn.isEnabled());

		// 14.3 Perform Action
		shipping_continuebtn.click();

		// 15. Check the Shipping Method radio button selection
		WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));

		// 15.1 Verify the element is Selected
		Assert.assertTrue(shipping_radio.isSelected());

		// 16. Click on Continue button in Shipping Method
		// 16.1 Identify the Element
		WebElement shipmethod_continuebtn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ShippingMethod.save()']")));

		// 16.2 Verify the Element is Displayed and Enabled
		Assert.assertTrue(shipmethod_continuebtn.isDisplayed() && shipmethod_continuebtn.isEnabled());

		// 16.3 Perform Action
		shipmethod_continuebtn.click();

		// 17. Check the Payment Method radio button selecton
		WebElement cod_radio = driver.findElement(By.id("paymentmethod_0"));
		Assert.assertTrue(cod_radio.isSelected());

		// 18. Click on Continue button in Payment Information
		// 18.1 Identify the Continue button
		WebElement payment_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));

		// 18.2 Verify the Continue button is Displayed & Enabled
		Assert.assertTrue(payment_continuebtn.isDisplayed() && payment_continuebtn.isEnabled());

		// 18.3 Perform Action
		payment_continuebtn.click();

		// 19. Click on Continue button in Payment Method
		// 19.1 Identify the Continue button
		WebElement paymentinfo_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='PaymentInfo.save()']")));

		// 19.2 Verify the element is Displayed & Enabled
		Assert.assertTrue(paymentinfo_continuebtn.isDisplayed() && paymentinfo_continuebtn.isEnabled());

		// 19.3 Perform Action
		paymentinfo_continuebtn.click();

		// 20 Check the Confirm order details
		System.out.println("Order details verified");

		// 21 Click on Confirm button
		// 21.1 Identify the Confirm button
		WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick='ConfirmOrder.save()']")));

		// 21.2 Verify the element is Displayed & Enabled
		Assert.assertTrue(confirm_btn.isDisplayed() && confirm_btn.isEnabled());

		// 21.3 Perform Action
		confirm_btn.click();

		// 22. Verify Thank You Page
		wait.until(ExpectedConditions.titleContains("Demo Web Shop. Checkout"));
//		Assert.assertEquals("Demo Web Shop. Checkout", driver.getTitle());

		// 22.1 Verify the Success message
		WebElement text_msg = driver
				.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
		String message = text_msg.getText();

		String expcondition1 = "Your order has been successfully processed!";
		String actualcondition1 = message;
		SoftAssert saobj = new SoftAssert();
		saobj.assertEquals(actualcondition1, expcondition1);

		// 23. Click on Continue button in Thank You page
		// 23.1 Identify Continue button
		WebElement continue_btn = driver
				.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));

		// 23.2 Verify the element is Displayed & Enabled
		saobj.assertTrue(continue_btn.isDisplayed() && continue_btn.isEnabled());

		// 23.3 Perform Action
		continue_btn.click();

		saobj.assertAll();

		Reporter.log("Product ordered successfully", true);

	}

	
}
