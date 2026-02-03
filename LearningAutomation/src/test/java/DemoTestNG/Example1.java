package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void browsersetup(){
		
		//open the browser
		driver=new ChromeDriver();
		
		//navigate to the application.
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("Browsersetup is done.",true);
	}
	
    @BeforeMethod
    public void login() {
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	//Identify the element and perform login
    	
    	WebElement loginlink = driver.findElement(By.partialLinkText("Log in"));
    	loginlink.click();
    	WebElement email_textfield = driver.findElement(By.id("Email"));
    	WebElement password_textfield = driver.findElement(By.id("Password"));
    	WebElement login_button = driver.findElement(By.cssSelector("input[value='Log in']"));
    	
    	email_textfield.sendKeys("sravanthigundala.9@gmail.com");
    	password_textfield.sendKeys("885288");
    	login_button.click();
    	
    	Reporter.log("Login Done",true);
    }
    
    @Test
    public void orderproduct() throws InterruptedException {
    	
    	
    	//click on desktop in the computer cateroty.
		WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(), 'Computers')]"));
		computer.click();
		
		WebElement desktop= driver.findElement(By.partialLinkText("Desktops"));
		desktop.click();
		
       //verify the page.
		System.out.println(driver.getTitle());
		
		
     //Identify the element and click on the second product.
		WebElement second_prd = driver.findElement(By.partialLinkText("Build your own computer"));
		second_prd.click();
		
     //verify the page.
		System.out.println(driver.getTitle());
	
		//click on radio button
		WebElement HOD_radiobtn = driver.findElement(By.id("product_attribute_16_3_6_19"));
		HOD_radiobtn .click();
		
		
    //Identify the element and click on Add to cart button.
		WebElement Add_to_cart = driver.findElement(By.id("add-to-cart-button-16"));
		Add_to_cart.click();
		
     // Click on the Shopping Cart link
		WebElement shoppingcart_link = driver.findElement(By.partialLinkText("Shopping cart"));
		shoppingcart_link.click();
		
    //verify the shopping cart page.
		System.out.println("The product is added to the cart.");
		
   //Identify the selection of Terms of service Check box .
		WebElement termsofservice_checkbox = driver.findElement(By.id("termsofservice"));
		termsofservice_checkbox.click();
		
  //click on checkout button.
		WebElement checkout_btn = driver.findElement(By.id("checkout"));
		checkout_btn.click();
		
  //Click on Continue button in Billing address.
		WebElement billing_continuebtn = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		billing_continuebtn.click();

   // Click on Continue button in shipping address
		WebElement shipping_continuebtn = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		shipping_continuebtn.click();
		
		Thread.sleep(3000);

  //Check the Shipping Method radio button selection
		WebElement shipping_radio = driver.findElement(By.id("shippingoption_0"));
		System.out.println("Ground radio button is selected ");

  //Click on Continue button in Shipping Method
		Thread.sleep(3000);
		WebElement shipmethod_continuebtn = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("//input[@onclick='ShippingMethod.save()']")));
		shipmethod_continuebtn.click();

   //Check the Payment Method radio button selecton
		WebElement cod_radio = driver.findElement(By.id("paymentmethod_0"));
		System.out.println("COD radio button is selected ");
		
  //Click on Continue button in Thank You page
		WebElement continue_btn = driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
		continue_btn.click();
    	
    	
    	Reporter.log("Product ordered successfully.",true);
    	
    }
    @AfterMethod
    public void logout() {
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	WebElement logout_button = driver.findElement(By.partialLinkText("Log out"));
    	logout_button.click();
    	
    	Reporter.log("Logout Done.",true);
    }
    @AfterClass
    public void browserterminate() {
    	driver.quit();
    	
    	Reporter.log("Browser Terminated Done.",true);
    }
    
}
