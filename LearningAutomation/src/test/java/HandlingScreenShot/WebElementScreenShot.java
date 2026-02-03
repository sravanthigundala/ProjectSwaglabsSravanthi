package HandlingScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1.Open the Browser

		WebDriver driver = new ChromeDriver();

		// 2.Navigate to the application via Url
		driver.get("https://www.saucedemo.com/");

		// Capture the Screenshot
		// Identify the Web Element
		WebElement element = driver.findElement(By.xpath("//input[@id='login-button']"));

		// 2.Call thre Screenshot Method
		// 3.Store the Screenshot in Temp path

		File src = element.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String currentdate = sdf.format(new Date());
		System.out.println(currentdate);

		// 4.Create an Permanent path to Store the Screenshot
		File dest = new File("./Scrrenshot/FirstScreenshot'" + currentdate + "'.png");
		// 5.Copy the Screenshot From src to dest
		FileHandler.copy(src,dest );

		// 6.Close thr browser
		driver.close();

		System.out.println("Execution Done");

	}

}