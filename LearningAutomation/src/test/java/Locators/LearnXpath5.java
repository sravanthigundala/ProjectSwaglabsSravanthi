package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * verify user is able to login by using xpath--using group indexing.
 * 
 */

public class LearnXpath5 {

	public static void main(String[] args) {

		// open the browser---chrome
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// navigate to the application via url

		driver.get("https://www.saucedemo.com");

		// verify the page

		System.out.println(driver.getTitle());

		// Identify the element using xpath locator and store it.

		// xpath using xpath using group indexing---tagname

		// WebElement username_textfield = driver.findElement(By.xpath("(//input)
		// [1]"));
		// WebElement password_textfield = driver.findElement(By.xpath("(//input)
		// [2]"));
		// WebElement login_buttton = driver.findElement(By.xpath("(//input) [3]"));

		// Identify the element using xpath locator and store it.

		// xpath using xpath using group indexing--expression

		WebElement username_textfield = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		WebElement password_textfield = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		WebElement login_buttton = driver.findElement(By.xpath("(//input) [3]"));

		// validate the element is enabled and is displayed

		if (username_textfield.isDisplayed() && username_textfield.isEnabled() && password_textfield.isDisplayed()
				&& password_textfield.isEnabled() && login_buttton.isDisplayed() && login_buttton.isEnabled()) {

			System.out.println("element is verified:It is diaplayed");
			System.out.println("element is verified:It is enabled");

		} else {
			System.out.println("element is verified:It is not diaplayed");
			System.out.println("element is verified:It is not enabled");
		}

		// perform login action

		username_textfield.sendKeys("standard_user");
		password_textfield.sendKeys("secret_sauce");
		login_buttton.click();

		// close the browser
		driver.close();

	}

}
