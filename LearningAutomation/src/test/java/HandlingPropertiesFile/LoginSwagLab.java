package HandlingPropertiesFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSwagLab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 1.Open the Browser
				WebDriver driver = new ChromeDriver();

				// Maximize the Browser
				driver.manage().window().maximize();

				// 2.Navigate to the Application via Url
				String url = readData("url");
				driver.get(url);

				// Perform Login
				WebElement userNameTextfeild = driver.findElement(By.id("user-name"));
				userNameTextfeild.sendKeys(readData("username"));

				WebElement PasswordTextfeild = driver.findElement(By.xpath("//input[@placeholder='Password']"));
				PasswordTextfeild.sendKeys(readData("password"));

				WebElement loginButton = driver.findElement(By.id("login-button"));
				loginButton.submit();

				// Identify the First Product and store it
				WebElement Product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
				String prod1 = Product1.getText();
				writeData("Product1", prod1);

				WebElement Product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
				String prod2 = Product2.getText();
				writeData("Product2", prod2);

				WebElement Product3 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
				String prod3 = Product3.getText();
				writeData("Product3", prod3);

				WebElement Product4 = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
				String prod4 = Product4.getText();
				writeData("Product4", prod4);

				WebElement Product5 = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
				String prod5 = Product5.getText();
				writeData("Product5", prod5);

				WebElement Product6 = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
				String prod6 = Product6.getText();
				writeData("Product6", prod6);

				driver.close();

			}

			public static String readData(String key) throws IOException {

				// 1.Convert external file into java Readable
				FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.Properties");

				// 2.Create an object For Properties class
				Properties propertyobj = new Properties();

				// 3.Load the Properties
				propertyobj.load(fis);

				// 4.Read the Data
				return propertyobj.getProperty(key);

			}

			public static void writeData(String newkey, String newValue) throws IOException {

				// 1.Convert external file into java Readable
				FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.Properties");

				// 2.Create an object For Properties class
				Properties propertyobj = new Properties();

				// 3.Load the Properties
				propertyobj.load(fis);

				// 4.put the new data inside Properties file
				propertyobj.put(newkey, newValue);

				// 5.Convert java readable into external file
				FileOutputStream fos = new FileOutputStream("./src/test/resources/Commondata.Properties");

				// 6.store the New data
				propertyobj.store(fos, "Updated  New Key And Value");
				System.out.println("Write Data Successfully");

		

	}

}
