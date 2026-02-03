package DWS_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RangiSumadhar_09 extends BaseConfig

{
	SoftAssert soft;
	@Test(groups="FT")
	public void Place_Order() throws InterruptedException
	{
		
	
		
//		3.	Move the cursor and place on Electronics button
		WebElement mouse_hover_electronic = driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
		
		
		soft.assertTrue(mouse_hover_electronic.isDisplayed());
		soft.assertTrue(mouse_hover_electronic.isEnabled());
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mouse_hover_electronic).perform();
		Thread.sleep(1000);
		
//		4.	Move the cursor in the dropdown
		WebElement cellphone = driver.findElement(By.xpath("//ul[@class='top-menu']/child::li[3]/child::ul/li[2]"));
		soft.assertTrue(cellphone.isDisplayed());
		soft.assertTrue(cellphone.isEnabled());
		
		
		a.moveToElement(cellphone).perform();
		Thread.sleep(1000);
		
//		5.	Click on cellphone button from dropdown
		a.click().perform();
		Thread.sleep(1000);
		
//		6.	Click on third electronic item on the list
		WebElement third_item = driver.findElement(By.xpath("(//img[@alt='Picture of Phone Cover'])[2]"));
		Assert.assertTrue(third_item.isDisplayed());
		Assert.assertTrue(third_item.isEnabled());
		third_item.click();
		
//		7.	Click on add to cart
		WebElement add_To_Cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-80']"));
		
		Assert.assertTrue(add_To_Cart.isDisplayed());
		Assert.assertTrue(add_To_Cart.isEnabled());
		
		add_To_Cart.click();
		
//		8.	Move the cursor to the shopping cart button
		WebElement shopping_cart_button = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		
		Assert.assertTrue(shopping_cart_button.isDisplayed());
		Assert.assertTrue(shopping_cart_button.isEnabled());
		
		a.moveToElement(shopping_cart_button).perform();
		Thread.sleep(1000);
		
//		9.	Click on go to cart
		shopping_cart_button.click();
		
		
//		10.	Click on select country dropdown box
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(1000);
		
		WebElement dropdown_countries_01 = driver.findElement(By.xpath("//select[@id='CountryId']"));
		
		Assert.assertTrue(dropdown_countries_01.isDisplayed());
		Assert.assertTrue(dropdown_countries_01.isEnabled());
		
		Select dropdown_country_01 = new Select(dropdown_countries_01);
				
		
		
		
//		11.	Type IND
//		12.	Click on enter
		dropdown_country_01.selectByValue("41");
		
		


//		13.	Click on Agree with T&C checkbox
		WebElement term_And_Condition = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		
		Assert.assertTrue(term_And_Condition.isDisplayed());
		Assert.assertTrue(term_And_Condition.isEnabled());
		
		term_And_Condition.click();
		
//		14.	Click on checkout button
		
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		
		Assert.assertTrue(checkout.isDisplayed());
		Assert.assertTrue(checkout.isEnabled());
		
		checkout.click();
		
		
////		15.	Click on checkout as Guest button
//		WebElement guest = driver.findElement(By.xpath("//input[@value='Checkout as Guest']"));
//		guest.click();
		
		
		
//		16.	Enter the first name in first name text field
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		WebElement first_name = driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"));
		
		Assert.assertTrue(first_name.isDisplayed());
		Assert.assertTrue(first_name.isEnabled());
		
		first_name.clear();
		first_name.sendKeys("Gutka");
				
//		17.	Enter the last name in last name text field
		WebElement last_name = driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']"));
		
		Assert.assertTrue(last_name.isDisplayed());
		Assert.assertTrue(last_name.isEnabled());
		
		last_name.clear();
		last_name.sendKeys("Pandu");
		
		
//		18.	Enter the email in email text field
		//WebElement email = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']"));
		//email.sendKeys("VimalKesari@gmail.com");
		
		
//		19.	Click on select country dropdown box
		WebElement country_dropdown = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		
		Assert.assertTrue(country_dropdown.isDisplayed());
		Assert.assertTrue(country_dropdown.isEnabled());
		
		Select c_d = new Select(country_dropdown);
		
		
		
//		20.	Type "I" 		
//		21.	Navigate to India using down arrow and press enter
//		22.	Click enter
		c_d.selectByValue("41");
		
		
		
		
//		23.	Enter city in city text field
		WebElement city = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
		
		Assert.assertTrue(city.isDisplayed());
		Assert.assertTrue(city.isEnabled());
		
		city.sendKeys("Hyderabad");
		
		
//		24.	Enter Address 1 in Address 1 text field
		WebElement address_01 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
		
		Assert.assertTrue(address_01.isDisplayed());
		Assert.assertTrue(address_01.isEnabled());
		
		address_01.sendKeys("2-3/4, Street number 03");
		
//		25.	Enter Address 2 in Address 2 text field
		WebElement address_02 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']"));
		
		soft.assertTrue(address_02.isDisplayed());
		soft.assertTrue(address_02.isEnabled());
		
		address_02.sendKeys("JNTU Pan shop, Hyderabad");
		
		
//		26.	Enter zipcode in zipcode text field
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
		
		Assert.assertTrue(zipcode.isDisplayed());
		Assert.assertTrue(zipcode.isEnabled());
		
		zipcode.sendKeys("500382");

		
//		27.	Enter Phno in Phno text field
		WebElement phone_number = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
		
		Assert.assertTrue(phone_number.isDisplayed());
		Assert.assertTrue(phone_number.isEnabled());
		
		phone_number.sendKeys("9848022338");
		
//		28.	Click on continue button
		WebElement continue_01 = driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
		
		Assert.assertTrue(continue_01.isDisplayed());
		Assert.assertTrue(continue_01.isEnabled());
		
		continue_01.click();
		
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(0,300)");
		
//		29.	Click on continue button
		WebElement continue_02 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		
		Thread.sleep(1000);
		
		Assert.assertTrue(continue_02.isDisplayed());
		Assert.assertTrue(continue_02.isEnabled());
		
		continue_02.click();
		Thread.sleep(3000);
		
		
//		30.	Click on next day air option
		WebElement next_day_air  = driver.findElement(By.xpath("//input[@value='Next Day Air___Shipping.FixedRate']"));
		
		Assert.assertTrue(next_day_air.isDisplayed());
		Assert.assertTrue(next_day_air.isEnabled());
		
		next_day_air.click();
		Thread.sleep(3000);
		
//		31.	Click on continue button
		Thread.sleep(3000);
		WebElement continue_03 = driver.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]"));
		
		Assert.assertTrue(continue_03.isDisplayed());
		Assert.assertTrue(continue_03.isEnabled());
		
		continue_03.click();
		
		
		jse.executeScript("window.scrollTo(0,400)");
		
//		32.	Click on continue button
		WebElement continue_04 = driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]"));
		
		Thread.sleep(1000);
		
		Assert.assertTrue(continue_04.isDisplayed());
		Assert.assertTrue(continue_04.isEnabled());
		
		continue_04.click();
		
		jse.executeScript("window.scrollTo(0,400)");
		
		WebElement payment_method = driver.findElement(By.xpath("//p[text()='You will pay by COD']"));
		
		
		
		Assert.assertTrue(payment_method.isDisplayed());
		Assert.assertTrue(payment_method.isEnabled());
		
		System.out.println(payment_method.getText());
		
		
//		33.	Click on continue button
		WebElement continue_05 = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
		
		Assert.assertTrue(continue_05.isDisplayed());
		Assert.assertTrue(continue_05.isEnabled());
		
		continue_05.click();
		
		
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
//		34.	Click on confirm
		WebElement confirm = driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]"));
		
		
		Assert.assertTrue(confirm.isDisplayed());
		Assert.assertTrue(confirm.isEnabled());
		
		confirm.click();
		
		
		WebElement order_succesful = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
		
		String expected_condition = "Your order has been successfully processed!";
		String actual_condition = order_succesful.getText();
		
		soft.assertEquals(actual_condition,expected_condition);
		
		System.out.println(order_succesful.getText());
		System.out.println();
		
		
//		35.	Click on Continue button
		WebElement continue_06 = driver.findElement(By.xpath("//input[@onclick= \"setLocation('/')\" ]"));
		
		Assert.assertTrue(continue_06.isDisplayed());
		Assert.assertTrue(continue_06.isEnabled());
		
		continue_06.click();
		
		Reporter.log("Order placed succesfully",true);
	}
	
}
