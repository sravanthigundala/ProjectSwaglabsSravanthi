package DWS_Assignment;

import java.awt.AWTException;
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

public class Nikhil_05 extends BaseConfig{


	
	@Test(groups="FT",priority = 2, dependsOnMethods = "Addproduct", enabled = false)
	public void Updateproduct() {

		Reporter.log("---Updateproduct_Nikhil_05---", true);
	}

	@Test(groups="FT",priority = 3, dependsOnMethods = "Addproduct", enabled = false)
	public void Deleteproduct() {

		Reporter.log("---Deleteproduct_Nikhil_05---", true);

	}
	@Test(groups="FT",priority = 1, enabled = true, invocationCount = 1)
	   public void Addproduct() throws InterruptedException {

			// 5. Verify user is able to see products
		   
		   SoftAssert sa=new SoftAssert();

			// 6.Search for product laptop
			WebElement searchbox = driver.findElement(By.id("small-searchterms"));
			searchbox.click();
			searchbox.sendKeys("Laptop");

			WebElement searchbox1 = driver.findElement(By.xpath("//input[@value='Search']"));
			searchbox1.click();

			// 7.click on add to cart
			WebElement add_to_Cart_btn = driver.findElement(By.xpath("//input[@value='Add to cart']"));	
			Assert.assertTrue(add_to_Cart_btn.isDisplayed());
			Assert.assertTrue(add_to_Cart_btn.isEnabled());
			add_to_Cart_btn.click();

			// 8.click on shopping cart
			WebElement shoppingcart_icon = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
			Assert.assertTrue(shoppingcart_icon.isDisplayed());
			Assert.assertTrue(shoppingcart_icon.isEnabled());
			
			shoppingcart_icon.click();
			
			//Verifying shopping cart page
             Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
             
			// 9.Click on terms and conditonterm box
			WebElement terms_and_Conditions_checkbox = driver.findElement(By.xpath("//input[@id='termsofservice']"));
			terms_and_Conditions_checkbox.click();

			// 10.Verify Shopping cart price ,discount and click on checkout button
			WebElement checkoutbtn = driver.findElement(By.cssSelector("#checkout"));
			checkoutbtn.click();

			// 11.Enter firstname
			/*WebElement first_name = driver.findElement(By.xpath("//input[@name='BillingNewAddress.FirstName']"));
			first_name.sendKeys("Nikhil");

			// 12.Enter Lastname
			WebElement last_name = driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']"));
			last_name.sendKeys("Sai");

			// 13.enter email
			WebElement Email = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']"));
			Email.sendKeys("mnik1256@gmail.com");

			// 14.Enter company details
			WebElement company = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']"));
			company.sendKeys("HCS");
			// 15.click on country dropdown
			WebElement country_dropdown = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
			Select count_drop = new Select(country_dropdown);

			count_drop.selectByValue("41");

			// 16.click on city
			WebElement city = driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
			city.sendKeys("Hyderabad");
			// 17.click on address1
			WebElement address1 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
			address1.sendKeys("3-419");

			// 18.click on address2
			WebElement address_2 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']"));
			address_2.sendKeys("Jntu-H");

			// 19.Enter zipcode in zipcode text field
			WebElement zipcode = driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
			zipcode.sendKeys("50012");

			// 20.Enter Phoneno in Phno text field
			WebElement phone_number = driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
			phone_number.sendKeys("9128022338");

			WebElement fax_number = driver.findElement(By.xpath("//*[@id=\"shipping-new-address-form\"]/div/div/div/div[12]/span"));
			fax_number.sendKeys("1234"); */
		
			// 21.Click on continue button
			WebElement continue1= driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
			continue1.click();
			// 22. Click on continue button
			WebElement continue_2 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
			continue_2.click();

			// 23.Click on next day air option
			WebElement next_day_air = driver.findElement(By.xpath("//input[@value='Next Day Air___Shipping.FixedRate']"));
			next_day_air.click();
			Thread.sleep(3000);

			// 24.Click on continue button
			Thread.sleep(3000);
			WebElement continue_3 = driver.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]"));

			continue_3.click();

			// 25. Click on continue button
			WebElement continue_4 = driver.findElement(By.xpath("//input[@ onclick='PaymentMethod.save()']"));
			continue_4.click();

			WebElement payment_method = driver.findElement(By.xpath("//p[text()='You will pay by COD']"));
			String expectedcondition1="You will pay by COD";
			String actualconditon1=payment_method.getText();
			sa.assertEquals(actualconditon1, expectedcondition1);	
			System.out.println(payment_method.getText());

			// 26. Click on continue button
			WebElement continue_5 = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
			continue_5.click();

			// 27.Click on confirm
			WebElement confirm = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
			confirm.click();

			WebElement order_succesful = driver
					.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
			
			String expectedcondition2="Your order has been successfully processed!";
			String actualcondition2=order_succesful.getText();
			sa.assertEquals(expectedcondition2,actualcondition2);
			
			System.out.println(order_succesful.getText());
			System.out.println();

			// 28.Click on Continue button
			WebElement continue_06 = driver.findElement(By.xpath("//input[@onclick= \"setLocation('/')\" ]"));
			continue_06.click();
			
			Reporter.log("product ordered sucessfully",true);
	   }
	   
	  
}
