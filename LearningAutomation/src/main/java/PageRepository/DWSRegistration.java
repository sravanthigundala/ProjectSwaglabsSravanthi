package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSRegistration {

	// 1.WebElement Identification and Declaration.

	@FindBy(id = "gender-female")
	private WebElement GenderFemaleRDbtn;
	
	@FindBy(id = "gender-male")
	private WebElement GenderMaleRDbtn;

	@FindBy(id = "FirstName")
	private WebElement Firstname;

	@FindBy(id = "LastName")
	private WebElement Lastname;

	@FindBy(id = "Email")
	private WebElement Email;

	@FindBy(id = "Password")
	private WebElement Password;

	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(id = "register-button")
	private WebElement registerbtn;


	// 2.WebElement Initialization

	public DWSRegistration(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// 3.WebElement Utilization.

	public WebElement getGenderFemaleRadiobutton() {

		return GenderFemaleRDbtn;

	}
	
	public WebElement getGenderMaleRadiobutton() {

		return GenderMaleRDbtn;

	}


	public WebElement getFirstnametextfield() {

		return Firstname ;

	}

	public WebElement getLastnametextfield() {

		return Lastname;

	}

	public WebElement getEmailtextfield() {

		return Email;

	}

	public WebElement getPasswordtextfield() {

		return Password;

	}

	public WebElement getConfirmPasswordtextfield() {

		return ConfirmPassword;

	}
	
	public WebElement getregisterbtn() {
		return registerbtn;
	}
	



}
