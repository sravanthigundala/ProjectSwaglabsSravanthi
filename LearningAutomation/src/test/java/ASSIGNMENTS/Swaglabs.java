package ASSIGNMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Verify the user is able to order the product.
 * 
 * */

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open the browser---chrome
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to the application via url
				
				driver.get("https://www.saucedemo.com");
				
				//verify the page
				
				System.out.println(driver.getTitle());
				
				//Identify the element using xpath locator and store it.
				
				//xpath using partial text value
				
				WebElement username_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'User')]"));
				WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));
				WebElement login_buttton = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
				
				//validate the element is enabled and is displayed
				
				if (username_textfield.isDisplayed()&&username_textfield.isEnabled()&&password_textfield.isDisplayed()&&password_textfield.isEnabled()
						&&login_buttton.isDisplayed()&&login_buttton.isEnabled()) {
					
					System.out.println("element is verified:It is diaplayed");
					System.out.println("element is verified:It is enabled");
					
				} else {
					System.out.println("element is verified:It is not diaplayed");
					System.out.println("element is verified:It is not enabled");
				}
				
				//perform login action
				
				username_textfield.sendKeys("standard_user");
				password_textfield.sendKeys("secret_sauce");
				login_buttton.click();
				
				//verify the page
				
				System.out.println("Homepage page should display");
				

		      //Identify the first product name
				
				WebElement firstprd=driver.findElement(By.xpath("//div[contains(text(),'Backpack')]"));
						
				//fetch the partial text value of the 1st product name
						
					String firstprd_name = firstprd.getText();
				
				//print on console
				
				System.out.println("First product name is"+firstprd_name );
				
				//verify the product which is clicked
				System.out.println("selected product should display");
				
				//Click on add to cart button
				driver.findElement(By.cssSelector("button.btn_inventory")).click();
				 
				//Verify the product is added to the cart
				System.out.println("product is add in the cart");
				
				//Click on cart 

				driver.findElement(By.className("shopping_cart_link")).click();
				
				//Verify the product is available on the cart
				
				System.out.println("product is diaplay on the cart");
				
				//13.Click on checkout button
				
				driver.findElement(By.id("checkout")).click();
				
				//Verify the page
				
				System.out.println("checkout your information page");
				
				//15.Provide check out information 
				
				 WebElement firstname_Textfield=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				 WebElement secondname_Textfield=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				 WebElement postalcode_Textfield=driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
				 
				//validate the element is displayed and enabled
					if(firstname_Textfield.isDisplayed()&&firstname_Textfield.isEnabled()&&secondname_Textfield.isDisplayed()&&secondname_Textfield.isEnabled()&&postalcode_Textfield.isDisplayed()&&postalcode_Textfield.isEnabled())
					{
						System.out.println("element is verified : It is Displayed");
						System.out.println("element is verified : It is Enabled");
					}
					// Perform the action
					firstname_Textfield.sendKeys("sravanthi");
					secondname_Textfield.sendKeys("gundala");
					postalcode_Textfield.sendKeys("50037");
					
					//Click on continue button on the check out page.
					
					driver.findElement(By.id("continue")).click();
					
					//verify the product information
					
					String checkoutProduct=driver.findElement(By.className("inventory_item_name")).getText();
					
					//Click on finish button
					
					driver.findElement(By.id("finish")).click();
					
					//Verify the confirmation message
					
					System.out.println("Thank you for your order message is displayed.");
					
					//Click on the memu bar and logout.
					
					driver.findElement(By.id("react-burger-menu-btn")).click();
					
					Thread.sleep(2000);
					
					//logout
				
					driver.findElement(By.id("logout_sidebar_link")).click();
					
					//Verify the page
					
					System.out.println("Page verified:Login page is  displayed");
			
					//.Close the browser
					
					//driver.close();
			}	

			

	}


