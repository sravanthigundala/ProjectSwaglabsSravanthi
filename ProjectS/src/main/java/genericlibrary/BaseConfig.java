package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import Pagerepository.LogoutPage;
import Pagerepository.LoginPage;


public class BaseConfig {
	
public WebDriver driver;
public String url;
public String username;
public String password;

public String FirstName;
public String LastName;
public String Zipcode;
	
public static WebDriver staticDriver;	
	
	//@Parameters("BrowserName")
	
	@BeforeClass
	public void BrowserSetup()
	{
		String browser="edge";
		
		
				
		//open the browser.
		 driver=WebDriverLibrary.openBrowser(browser);
		 
		 staticDriver=driver;
		 	
	
		// Maximize the Browser
		  WebDriverLibrary.maximizeBrowser();
				
		// Wait Statement
		  WebDriverLibrary.waitstatement();
			
		//Navigate to the application.
		   WebDriverLibrary.naviToApp(PropertiesLibrary.readData("url"));
		   
		// Verify Login page
			Assert.assertEquals("Swag Labs", driver.getTitle());
				
				
				Reporter.log("BrowserSetup Done",true);
			}
	
	@BeforeMethod
	public void LogIn() {
		
		
		// Wait Statement
		  WebDriverLibrary.waitstatement();

		// Create an object for LoginPage
		LoginPage loginobj = new LoginPage(driver);
		

		// Perform Login
		
		//validate the UsernameTextfield.
		Assert.assertTrue(loginobj.getusernametextfield().isDisplayed());

		// Enter UserName in UserName Textfield.
		 WebDriverLibrary.enterTheData(loginobj.getusernametextfield(),PropertiesLibrary.readData("username"));
		 
		// Enter UserName in Password Textfield.
				 WebDriverLibrary.enterTheData(loginobj.getpasswordtextfield(),PropertiesLibrary.readData("password"));
				 
		//validate the loginbutton.
			Assert.assertTrue(loginobj.getloginbutton().isDisplayed());	 
		 

		// click on login button.
			WebDriverLibrary.elementClick(loginobj.getloginbutton());

		Reporter.log("Login successfully", true);

	}

	@AfterMethod
	public void Logout() {
		
		// Wait Statement
		  WebDriverLibrary.waitstatement();
		  
		  //create an object for LogoutPage
		LogoutPage logoutobj = new LogoutPage(driver);
		  
		  //validate the LogoutMenu
		  Assert.assertTrue(logoutobj.getmenubar().isDisplayed());
		  
		
		 //click on logoutMenu. 
		  WebDriverLibrary.elementClick(logoutobj.getmenubar());
		  
		  //validate the Logoutlink.
		  //Assert.assertTrue(logoutobj.getlogout().isDisplayed());
		  
		  //click on logoutlink.
        WebDriverLibrary.elementClick(logoutobj.getlogout());

		Reporter.log("Logout is done", true);

	}

	@AfterClass
	public void broserTerminate() {

		// Close the Browser
		WebDriverLibrary.closeAllWindows();

	}
	
	@DataProvider
	public Object[][] checkoutInfo() {
		
		Object[][] data=new Object[1][3];
		
		data[0][0]=ExcelLibrary.readsingledata("CheckInfo",1,0);
		data[0][1]=ExcelLibrary.readsingledata("CheckInfo",1,1);
		data[0][2]=ExcelLibrary.readsingledata("CheckInfo",1,2);
		
		return data;
		
		
	}
}
