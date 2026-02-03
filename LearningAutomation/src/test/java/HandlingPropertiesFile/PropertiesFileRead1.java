package HandlingPropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileRead1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String data1 = readData("url"); System.out.println(data1);
		  
		  String data2 = readData("username"); System.out.println(data2);
		  
		  String data3 = readData("password"); System.out.println(data3);
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get(data1);
		 
		
		  WebElement username = driver.findElement(By.id("user-name"));
		  username.sendKeys(data2);
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys(data3);
		  
		  WebElement login = driver.findElement(By.id("login-button")); login.click();
		 

		
		  writeData("Batch1", "M14"); writeData("Batch2", "M15");
		  
		  System.out.println("Wrirte Data Successfully");
		 

		//WebDriver driver = new ChromeDriver();
		driver.get(readData("url"));

		// Identify the Element Using Locator ---> Xpath and Store it
		WebElement element = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

		// Validate ---> Display and Enabled Status

		// Fetch the Values ---> Text Value
		String textvalue = element.getText();

		writeData("Logo", textvalue);
		System.out.println(textvalue);
		/*
		 * WebElement username = driver.findElement(By.id("user-name"));
		 * username.sendKeys(readData("username"));
		 * 
		 * WebElement password = driver.findElement(By.id("password"));
		 * password.sendKeys("password");
		 * 
		 * WebElement login = driver.findElement(By.id("login-button")); login.click();
		 */

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
