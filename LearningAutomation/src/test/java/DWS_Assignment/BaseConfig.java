package DWS_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseConfig {
	public WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeClass
	public void BrowserSetup(String browsername)
	{
		//open the browser
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();	
		}
		else if(browsername.equals("edge")) {
			driver=new EdgeDriver();	
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		//Navigate to the application.
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("BrowserSetup Done",true);
	}
	
	@BeforeMethod
	public void Login()
	{
	//  Verify the Home page
			Assert.assertEquals(driver.getTitle(), "Demo Web Shop");

			// Wait Statement
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    	
	    	//Identify the element of loginlink.
	    	WebElement loginlink = driver.findElement(By.partialLinkText("Log in"));
	    	
	    	// Verify the login link is displayed & enabled
			Assert.assertTrue(loginlink.isDisplayed() && loginlink.isEnabled());
			
	        //click on loginlink.
	    	loginlink.click();
	    	
	    	//Identify the elements.
	    	WebElement email_textfield = driver.findElement(By.id("Email"));
	    	WebElement password_textfield = driver.findElement(By.id("Password"));
	    	WebElement login_button = driver.findElement(By.cssSelector("input[value='Log in']"));
	    
	    	//Validate the Elements Is Displayed AND Is Enabled
	    			Assert.assertTrue(email_textfield.isDisplayed() && email_textfield.isEnabled());
	    			Assert.assertTrue(password_textfield.isDisplayed() && password_textfield.isEnabled());
	    			Assert.assertTrue(login_button.isDisplayed() && login_button.isEnabled());

	    	//perform login action.
	    	email_textfield.sendKeys("userseleniumm14@gmail.com");
	    	password_textfield.sendKeys("SeleniumM14");
	    	login_button.click();
	    	
		Reporter.log("Login Done",true);
	}
	
	
	@AfterMethod
	public void Logout()
	{
		// wait statement
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	//Identify the logout button.
    	WebElement logout_button = driver.findElement(By.partialLinkText("Log out"));
    	
    	//Verify the element is Displayed & Enabled
    			Assert.assertTrue(logout_button.isDisplayed() && logout_button.isEnabled());

    	//perform logout.		
    	logout_button.click();
    	
		Reporter.log("Logout Done",true);
	}
	
	@AfterClass
	public void BrowserTerminate()
	{
		//close the browser.
    	driver.quit();
    	
		Reporter.log("BrowserTerminate",true);
		System.out.println("sravanthi_11");
	}
}
