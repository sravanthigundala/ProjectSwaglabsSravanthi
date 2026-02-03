package HandlingPropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Write_SwaglabText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Open the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				// Navigate to the application
				driver.get("https://www.saucedemo.com/");

				// Identify the logo and fetch text
				WebElement logo_element = driver.findElement(By.className("login_logo"));
				String logo_text = logo_element.getText();
				System.out.println("Logo Text is : " + logo_text);

				// Write to properties file
				writeData("logoText", logo_text, "Fetched logo text from Swag Labs");

			}

			public static void writeData(String newkey, String newdata, String message) throws IOException {

				// 1. Convert the External File into Jva Understandable
				FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");

				// 2. Create an object for Properties class
				Properties propertyobj = new Properties();

				// 3. Load all the Properties
				propertyobj.load(fis);

				// 4. Put the new dat in properties file
				propertyobj.put(newkey, newdata);

				// 5. Convert the Jva Understandable into External File
				FileOutputStream fos = new FileOutputStream("./src/test/resources/commondata.properties");

				// 6. Store the new dat with message
				propertyobj.store(fos, message);


	}

}
