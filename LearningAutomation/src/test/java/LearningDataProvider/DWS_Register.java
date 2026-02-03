package LearningDataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageRepository.DWSRegistration;
import PageRepository.DWS_Homepage;

public class DWS_Register {

	@DataProvider
	public Object[][] Register() {

		Object[][] data = new Object[6][6];

		// user1 details
		data[0][0] = "Female";
		data[0][1] = "sravanthi";
		data[0][2] = "gundala";
		data[0][3] = "sravanthigundala.9@gmail.com";
		data[0][4] = "885288";
		data[0][5] = "885288";

		// user2 details
		data[1][0] = "Male";
		data[1][1] = "Naveen";
		data[1][2] = "Kadthala";
		data[1][3] = "navin4f.9@gmail.com";
		data[1][4] = "navi5822236";
		data[1][5] = "navi5822236";

		// user3 details
		data[2][0] = "Male";
		data[2][1] = "Hridan";
		data[2][2] = "gundala";
		data[2][3] = "Hridangundala.5@gmail.com";
		data[2][4] = "gundala@3244";
		data[2][5] = "gundala@3244";

		// user4 details
		data[3][0] = "Female";
		data[3][1] = "Hansini";
		data[3][2] = "Kadthala";
		data[3][3] = "Hansinikadthala.9@gmail.com";
		data[3][4] = "kadthala.55236";
		data[3][5] = "kadthala.55236";

		// user5 details
		data[4][0] = "Female";
		data[4][1] = "Dharvi";
		data[4][2] = "gundala";
		data[4][3] = "Dharavigundala.9@gmail.com";
		data[4][4] = "Dharavi@12345";
		data[4][5] = "Dharavi@12345";

		// user6 details
		data[5][0] = "Female";
		data[5][1] = "Dharvi";
		data[5][2] = "gundala";
		data[5][3] = "Dharavigundala.9@gmail.com";
		data[5][4] = "Dharavi@12345";
		data[5][5] = "Dharavi@12345";

		return data;
	}

	@Test(dataProvider = "Register")

	public void DemoTest(String Gender, String Firstname, String Lastname, String Email, String Password,
			String Confirmpassword) {
		
		//Open the browser
		 WebDriver driver =new ChromeDriver();
		 
		 //Navigate to the application
		 driver.get("https://demowebshop.tricentis.com/");

			// Create an object for DWSHome
			DWS_Homepage homeobj = new DWS_Homepage(driver);

			// Use the webElement from POM class

			// Click on Register
			homeobj.getregisterlink().click();

			// Create an object for DWSRegistration
			DWSRegistration regobj = new DWSRegistration(driver);
			
			if (Gender.equals("Female")) {
				
				regobj.getGenderFemaleRadiobutton().click();
				
				
			} else if (Gender.equals("Male")) {
				
				regobj.getGenderMaleRadiobutton().click();
				
			} 
			
			
			regobj.getFirstnametextfield().sendKeys(Firstname);
			regobj.getLastnametextfield().sendKeys(Lastname);
			regobj.getEmailtextfield().sendKeys(Email);
			regobj.getPasswordtextfield().sendKeys(Password);
			regobj.getConfirmPasswordtextfield().sendKeys(Confirmpassword);
			regobj.getregisterbtn().click();
		 

		System.out.println(Gender);
		System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(Email);
		System.out.println(Password);
		System.out.println(Confirmpassword);
		System.out.println("---------------------------");
		
		//close the browser
		driver.close();

	}

}
