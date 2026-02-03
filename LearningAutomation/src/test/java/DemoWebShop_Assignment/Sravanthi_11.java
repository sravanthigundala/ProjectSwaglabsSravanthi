package DemoWebShop_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Test scenario: To verify is user is able to order the desktop product.


public class Sravanthi_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//1.open the browser
				WebDriver driver=new ChromeDriver();
				
		//maximize the browser
				driver.manage().window().maximize();
				
		//wait statement
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		//2.Navigate to the application via url.
				driver.get("https://demowebshop.tricentis.com/");
				
		//3.Verify the home page .
				System.out.println(driver.getTitle());
				
		//4.Identify the element and click login link.
				WebElement login_link = driver.findElement(By.xpath("//a[text()='Log in']"));
				login_link.click();
				
		//5.Identify the elements and perform Login action.
				
				//Identify the element of email textfield.
				WebElement email_textfield = driver.findElement(By.id("Email"));
				email_textfield.sendKeys("sravanthigundala.9@gmail.com");
				
				//Identify the element of password textfield.
				WebElement password_textfield = driver.findElement(By.id("Password"));
				password_textfield.sendKeys("885288");
				
				//Identify the element and click on the login button.
				WebElement login_bttn = driver.findElement(By.xpath("//input[@value='Log in']"));
				login_bttn.click();
				
		//6.click on desktop in the computer cateroty.
				WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(), 'Computers')]"));
				computer.click();
				
				WebElement desktop= driver.findElement(By.partialLinkText("Desktops"));
				desktop.click();
				
		//7.verify the page.
				System.out.println(driver.getTitle());
				
				
	    //8. Identify the element and click on the second product.
				WebElement second_prd = driver.findElement(By.partialLinkText("Build your own computer"));
				second_prd.click();
				
	    //9.verify the page.
				System.out.println(driver.getTitle());
			
				//click on radio button
				WebElement HOD_radiobtn = driver.findElement(By.id("product_attribute_16_3_6_19"));
				HOD_radiobtn .click();
				
				
	   //10.Identify the element and click on Add to cart button.
				WebElement Add_to_cart = driver.findElement(By.id("add-to-cart-button-16"));
				Add_to_cart.click();
				
	   // 11. Click on the Shopping Cart link
				WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
				shoppingcart_link.click();
				
	    //12.verify the shopping cart page.
				System.out.println("The product is added to the cart.");
				
	   	
	    //13.Identify the selection of Terms of service Check box .
				WebElement termsofservice_checkbox = driver.findElement(By.id("termsofservice"));
				termsofservice_checkbox.click();
				
	    //14.click on checkout button.
				WebElement checkout_btn = driver.findElement(By.id("checkout"));
				checkout_btn.click();
				
        //15.Click on Continue button in Billing address.
				WebElement billing_continuebtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
				billing_continuebtn.click();

       //16. Click on Continue button in shipping address
				WebElement shipping_continuebtn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
				shipping_continuebtn.click();
				
				Thread.sleep(3000);

	   //17. Check the Shipping Method radio button selection
				WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));
				System.out.println("Ground radio button is selected ");

	   //18. Click on Continue button in Shipping Method
				Thread.sleep(3000);
				WebElement shipmethod_continuebtn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
				
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
				//wait.until(ExpectedConditions.elementToBeClickable(By.id("//input[@onclick='ShippingMethod.save()']")));
				shipmethod_continuebtn.click();

	  //19.Check the Payment Method radio button selected
				WebElement cod_radio = driver.findElement(By.id("paymentmethod_0"));
				System.out.println("COD radio button is selected ");
				
	  // 20. Click on Continue button in Payment Information
				WebElement payment_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
				payment_continuebtn.click();

	 // 21. Click on Continue button in Payment Method
				WebElement paymentinfo_continuebtn = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
				paymentinfo_continuebtn.click();

	 //22.Check the Confirm order
				System.out.println("Confirm order page verified");

	   //23.Click on Confirm button
				WebElement confirm_btn = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
				confirm_btn.click();

		//24. Verify Thank You Page
				System.out.println("Thank you page is verified : " + driver.getTitle());
			
				
	  //25.Click on Continue button in Thank You page
				WebElement continue_btn = driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']"));
				continue_btn.click();
				
	   //26.Click on "Log Out" link
				WebElement logout_btn = driver.findElement(By.partialLinkText("Log out"));
				logout_btn.click();
				
				System.out.println("Execution Completed");
				
	 //27.close the browser
				driver.quit();
	}

}
