package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Homepage {
	
	// 1. WebElement Identification & Declaration
	
		@FindBy(partialLinkText = "Register")
		private WebElement registerlink;

		// 2. WebElement Initialization

		public DWS_Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// 3. WebElement Utilization

		public WebElement getregisterlink() {
			return registerlink;
		}

}
