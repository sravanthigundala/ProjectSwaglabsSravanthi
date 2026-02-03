package LearningTestNG;
//innovacationcount---flag

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnFlag_4 {
	
	@BeforeClass
	public void browsersetup(){
		Reporter.log("Browsersetup is done.",true);
		
	}
	
	@AfterClass
    public void browserterminate() {
 
    	Reporter.log("Browser Terminated Done.",true);
    }
    
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
		
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		
	}
	@Test(invocationCount = 3)
	public void m1() {
		Reporter.log("m1",true);
		
    }
	@Test(invocationCount = 5)
	public void m2() {
		Reporter.log("m2",true);
		
    }
}
