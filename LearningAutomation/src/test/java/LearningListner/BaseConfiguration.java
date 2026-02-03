package LearningListner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseConfiguration {
	
	public WebDriver driver;
	public static WebDriver staticdriver;
	
	@Parameters("browser")
	@BeforeClass
	public void BrowserSetup(String browsername) {
         
		// Open the Browser
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please Enter Valid Browser Name");
		}



		// Maximize the Browser
		driver.manage().window().maximize();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 1.2 Navigate to the application via URL
		driver.get("https://demowebshop.tricentis.com/");

		Reporter.log("Browser setup is Done", true);
	}

	@BeforeMethod
	public void Login() {
		// 2. Verify the Home page
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 3. Identify the Login link
		WebElement login_link = driver.findElement(By.partialLinkText("Log in"));

		// 3.1 Verify the login link is displayed & enabled
		Assert.assertTrue(login_link.isDisplayed() && login_link.isEnabled());

		// 3.2 Click on the Login link
		login_link.click();

		// 4.Identify the Elements
		WebElement email_textfield = driver.findElement(By.id("Email"));
		WebElement password_textfield = driver.findElement(By.id("Password"));
		WebElement login_btn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));

		// 4.1 Validate the Elements Is Displayed AND Is Enabled
		Assert.assertTrue(email_textfield.isDisplayed() && email_textfield.isEnabled());
		Assert.assertTrue(password_textfield.isDisplayed() && password_textfield.isEnabled());
		Assert.assertTrue(login_btn.isDisplayed() && login_btn.isEnabled());

		// 4.2 Perform Login Action
		email_textfield.sendKeys("userseleniumm14@gmail.com");
		password_textfield.sendKeys("SeleniumM14");
		login_btn.click();

		Reporter.log("Login is Done Successfully", true);

	}

	@AfterMethod
	public void Logout() {
		// Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// 24. Identify the Log out button & Perform Action
		WebElement logout_btn = driver.findElement(By.partialLinkText("Log out"));

		// 24.1 Verify the element is Displayed & Enabled
		Assert.assertTrue(logout_btn.isDisplayed() && logout_btn.isEnabled());

		// 24.2 Perform Action
		logout_btn.click();

		Reporter.log("Log Out is Done", true);
	}
}
