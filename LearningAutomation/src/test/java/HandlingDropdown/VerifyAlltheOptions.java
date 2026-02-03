package HandlingDropdown;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyAlltheOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1.Open the Browser

				WebDriver driver = new ChromeDriver();
				
		       //Implicit Wait Statement
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				// 2.Navigate to the Application via Url

				driver.get("https://www.amazon.in/");
				
				Thread.sleep(1000);

				// 3. Verify the Page

				System.out.println("Title is : " + driver.getTitle());

				// 4.Identify the DropDown and Store it

				WebElement Dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));

				// 5.Create an Object for Select class and pass the DropDown

				Select text = new Select(Dropdown);

				if (text.isMultiple()) {
					System.out.println("Drop Down is Multiple");

				} else {
					System.out.println("Drop Down is Single");

				}
				// 6.Call the Non static methods to handle dropdown
				text.getOptions();
				List<WebElement> alloptions = text.getOptions();
				System.out.println("total dropdowns options:");

				int count = alloptions.size();
				for (int i = 0; i < count; i++) {
					String value = alloptions.get(i).getText();
					System.out.println(value);

				}

				// 7.close the Browser
				driver.close();


	}

}
