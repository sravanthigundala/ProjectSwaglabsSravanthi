package LearningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageRepository.HomePage;
import PageRepository.LoginPage;

public class ProductTest {
	
	@Test
	public void Addproduct() {
	
	//open the browser
	WebDriver driver=new ChromeDriver();
	
	//navigate to the application
	driver.get("https://www.saucedemo.com/");
	
	//create an object for pom class
	 
LoginPage lgobj=new LoginPage(driver);
	
	//use the webelement for pom class.
	
	lgobj.getusernametextfield().sendKeys("standard_user");
	lgobj.getpasswordtextfield().sendKeys("secret_sauce");
	lgobj.getloginbutton().click();
	
	//create an object for home page
	
	HomePage hmpg =new HomePage(driver);
	
	//use the webelement for pom class.
	
	hmpg.getProduct1();
	//hmpg.getProduct2();
	//hmpg.getProduct3();
	//hmpg.getProduct4();
	//hmpg.getProduct5();
	//hmpg.getProduct6();

}
}
