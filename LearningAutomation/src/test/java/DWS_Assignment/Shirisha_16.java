package DWS_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Shirisha_16 extends BaseConfig {

	
	SoftAssert saobj;

	
	@Test(groups="IT",priority=1,enabled = true,invocationCount=1)
	public void Addproduct() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement computer_button = driver
				.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a[contains(text(), 'Computers')]"));

		Assert.assertTrue(computer_button.isDisplayed());
		Assert.assertTrue(computer_button.isEnabled());

		computer_button.click();

		WebElement desktop_link = driver.findElement(By.partialLinkText("Desktops"));

		Assert.assertTrue(desktop_link.isDisplayed());
		Assert.assertTrue(desktop_link.isEnabled());

		desktop_link.click();

		WebElement first_prd = driver.findElement(By.partialLinkText("Build your own cheap computer"));

		Assert.assertTrue(first_prd.isDisplayed());
		Assert.assertTrue(first_prd.isEnabled());

		first_prd.click();
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button-72"));

		Assert.assertTrue(addtocart.isDisplayed());
		Assert.assertTrue(addtocart.isEnabled());

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Build your own cheap computer");

		addtocart.click();
		WebElement shoppingcart_link = driver
				.findElement(By.xpath("//span [@class=\"cart-label\" and text() = 'Shopping cart']"));

		Assert.assertTrue(shoppingcart_link.isDisplayed());
		Assert.assertTrue(shoppingcart_link.isEnabled());

		shoppingcart_link.click();
		WebElement termsofservice_checkbox = driver.findElement(By.id("termsofservice"));

		Assert.assertTrue(termsofservice_checkbox.isDisplayed());
		Assert.assertTrue(termsofservice_checkbox.isEnabled());

		termsofservice_checkbox.click();
		WebElement checkout_btn = driver.findElement(By.id("checkout"));

		Assert.assertTrue(checkout_btn.isDisplayed());
		Assert.assertTrue(checkout_btn.isEnabled());

		checkout_btn.click();
		System.out.println("Checkout page Verified : " + driver.getTitle());

		WebElement billing_continuebtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));

		Assert.assertTrue(billing_continuebtn.isDisplayed());
		Assert.assertTrue(billing_continuebtn.isEnabled());

		billing_continuebtn.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		Thread.sleep(2000);

		
		WebElement shipping_address = driver.findElement(By.xpath("(//input[@onclick=\"Shipping.save()\"])"));

		Assert.assertTrue(shipping_address.isDisplayed());
		Assert.assertTrue(shipping_address.isEnabled());

		Thread.sleep(1000);
		shipping_address.click();
		
		js.executeScript("window.scrollBy(0,300)");

		Thread.sleep(1000);
		WebElement shipingmethod_continuebtn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));

		Assert.assertTrue(shipingmethod_continuebtn.isDisplayed());
		Assert.assertTrue(shipingmethod_continuebtn.isEnabled());

		Thread.sleep(1000);
		shipingmethod_continuebtn.click();

		WebElement cod_radio = driver.findElement(By.id("paymentmethod_0"));

		Assert.assertTrue(cod_radio.isDisplayed());
		Assert.assertTrue(cod_radio.isEnabled());

		Thread.sleep(1000);
		System.out.println("Cash on Delivery radio button is selected : " + cod_radio.isSelected());

		WebElement payment_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));

		Assert.assertTrue(payment_continuebtn.isDisplayed());
		Assert.assertTrue(payment_continuebtn.isEnabled());

		Thread.sleep(1000);
		
		payment_continuebtn.click();

		WebElement paymentinfo_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		Thread.sleep(1000);
		
		Assert.assertTrue(paymentinfo_continuebtn.isDisplayed());
		Assert.assertTrue(paymentinfo_continuebtn.isEnabled());

		Thread.sleep(1000);
		
		paymentinfo_continuebtn.click();

		js.executeScript("window.scrollBy(0,500)");

		System.out.println("Confirm order page verified");
		
		Thread.sleep(1000);
		
		WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		Thread.sleep(1000);
		
		Assert.assertTrue(confirm_btn.isDisplayed());
		Assert.assertTrue(confirm_btn.isEnabled());

		confirm_btn.click();

		System.out.println("Thank you page is verified : " + driver.getTitle());

		saobj.assertEquals(driver.getTitle(), "Demo Web Shop. Checkout");
		saobj.assertAll();
		WebElement continue_btn = driver
				.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));

		saobj.assertEquals(continue_btn.isDisplayed(), true);

		Assert.assertTrue(continue_btn.isDisplayed());
		Assert.assertTrue(continue_btn.isEnabled());

		continue_btn.click();

		Reporter.log("product ordered successfully", true);
		
		
		System.out.println("----Addproduct_Shirisha_16----");

	}

	@Test(groups="IT",priority = 2, dependsOnMethods = "Addproduct",enabled=true)
	public void Updateproduct() {

		System.out.println("----Updateproduct_Shirisha_16----");

	}

	@Test(groups="IT",priority = 3, dependsOnMethods = "Addproduct",enabled=true)
	public void Deleteproduct() {
		System.out.println("----Deleteproduct_Shirisha_16----");

	}
	

	
}