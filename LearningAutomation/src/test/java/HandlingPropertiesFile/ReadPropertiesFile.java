package HandlingPropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		  String data1 = readData("url");
		  System.out.println(data1);
		  
		  String data2 = readData("username");
		  System.out.println(data2);
		  
		  String data3 = readData("password");
		  System.out.println(data3);
		  
		  //open the  browser
		  WebDriver driver = new ChromeDriver();
		  
		  //navigate to the application via url.
		     driver.get(data1);
		  
		  //identify the element
		  
		  WebElement username = driver.findElement(By.id("user-name"));
		  username.sendKeys(data2);
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys(data3);
		  
		  WebElement login = driver.findElement(By.id("login-button"));
		  login.click();
		  
		  driver.get(readData("url"));
		  
		  //identify the element using Locator ------>xpath and store it.
		  WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
		  //validate the element--->display and enabled.
		  
		  //fetch the value --->Text value
		  String textvalue = element.getText();
		  
		  writeData("Logo",textvalue);
		  System.out.println(textvalue);
		  

	}
	public  static String readData(String key) throws IOException {
		
		//1.convert externalfile into java readable.
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commaondata.properties");
		
		//2.create an object for properties class
		Properties propertyobj = new Properties();
		
		//3.load the properties.
		propertyobj.load(fis);
		
		//4.read the data.
		 return propertyobj.getProperty(key);
	}
	public static void writeData(String newkey,String newvalue) throws IOException {
		
		//1.convert externalfile into java readable.
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commaondata.properties");
		
		
		//2.create an object for properties class
		
		Properties propertyobj = new Properties();
		
		//3.load the properties.
		
		propertyobj.load(fis);
		
		//4.put the new data inside properties file.
		propertyobj.put(newkey, newvalue);
		
		//5.convert java readable into external file.
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commaondata.properties");
		
		//store the new data.
		propertyobj.store(fos,"updated new key and value");
		System.out.println("WriteData Successfully");
		
		
		
	}

}
