package DWS_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pooja_17 extends BaseConfig {

	WebDriver driver;
	
	SoftAssert saobj;

	
	@Test(groups="FT",priority=1,enabled=true,invocationCount = 1)
	public void Addproduct() throws InterruptedException {

		WebElement computers_link = driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"));
		Assert.assertTrue(computers_link.isDisplayed() & computers_link.isEnabled());
		computers_link.click();

		WebElement desktop_link = driver.findElement(By.partialLinkText("Desktops"));
		Assert.assertTrue(desktop_link.isDisplayed() & desktop_link.isEnabled());
		desktop_link.click();

		WebElement firstproduct_link = driver.findElement(By.partialLinkText("Build your own cheap computer"));
		Assert.assertTrue(firstproduct_link.isDisplayed() & firstproduct_link.isEnabled());
		firstproduct_link.click();

		WebElement addtocart_button = driver.findElement(By.id("add-to-cart-button-72"));
		Assert.assertTrue(addtocart_button.isDisplayed() & addtocart_button.isEnabled());
		addtocart_button.click();

		WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
		Assert.assertTrue(shoppingcart_link.isDisplayed() & shoppingcart_link.isEnabled());
		shoppingcart_link.click();

		WebElement TandC_checkbox = driver.findElement(By.id("termsofservice"));
		Assert.assertTrue(TandC_checkbox.isDisplayed() & TandC_checkbox.isEnabled());
		TandC_checkbox.click();

		WebElement checkout_button = driver.findElement(By.id("checkout"));
		Assert.assertTrue(checkout_button.isDisplayed() & checkout_button.isEnabled());
		checkout_button.click();

		WebElement billing_address = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		Assert.assertTrue(billing_address.isDisplayed() & billing_address.isEnabled());
		billing_address.click();

		WebElement billingcontinue_btn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		// Assert.assertTrue(billingcontinue_btn.isDisplayed() &
		// billingcontinue_btn.isEnabled());
		billingcontinue_btn.click();

		WebElement shipping_address = driver.findElement(By.xpath("(//h2['Shipping address'])[2]"));
		Assert.assertTrue(shipping_address.isDisplayed() & shipping_address.isEnabled());
		shipping_address.click();

		WebElement shippingcontinue_btn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		//Assert.assertTrue(shippingcontinue_btn.isDisplayed() & shippingcontinue_btn.isEnabled());
		shippingcontinue_btn.click();

		WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));
		System.out.println("Ground radio button is selected : " + shipping_radio.isSelected());

		WebElement shipmtdcontinue_btn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
		Assert.assertTrue(shipmtdcontinue_btn.isDisplayed());
		Assert.assertTrue(shipmtdcontinue_btn.isEnabled());
		Thread.sleep(1000);
		shipmtdcontinue_btn.click();

		WebElement payment_radio = driver.findElement(By.id("paymentmethod_0"));
		System.out.println("cod radio button is selected : " + payment_radio.isSelected());

		WebElement paymtdcontinue_btn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		Assert.assertTrue(paymtdcontinue_btn.isDisplayed() & paymtdcontinue_btn.isEnabled());
		paymtdcontinue_btn.click();

		WebElement payinfocontinue_btn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		Thread.sleep(1000);
		Assert.assertTrue(payinfocontinue_btn.isDisplayed() & payinfocontinue_btn.isEnabled());
		Thread.sleep(1000);
		payinfocontinue_btn.click();
		

		System.out.println("Confirm order page verified");

		WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		// Assert.assertTrue(confirm_btn.isDisplayed() & confirm_btn.isEnabled());
		confirm_btn.click();

		System.out.println("Thank you page is verified : " + driver.getTitle());
		
		saobj.assertEquals(driver.getTitle(), "Demo Web Shop.Checkout");
		//saobj.assertAll();

		WebElement tqcontinue_btn = driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
		
		saobj.assertEquals(tqcontinue_btn.isDisplayed(), true);
		Assert.assertTrue(tqcontinue_btn.isDisplayed() & tqcontinue_btn.isEnabled());
		tqcontinue_btn.click();

		Reporter.log("Product ordered successfully ", true);
		
		System.out.println("---Addproduct_Pooja_17---");

	}
	@Test(groups="FT",priority =2,dependsOnMethods = "Addproduct" ,enabled=true)
	public static void Updateproduct() {
		// TODO Auto-generated method stub

		
		
		System.out.println("---Updateproduct_Pooja_17---");
	}

	@Test(groups="FT",priority=3,dependsOnMethods = "Addproduct",enabled=true)
	public static void Deleteproduct() {
		// TODO Auto-generated method stub

		
		
		System.out.println("---Deleteproduct_Pooja_17---");
	}


	
}
