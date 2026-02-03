package HandkingScrollAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJScodeScrollTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1.Open the Browser

		WebDriver driver = new ChromeDriver();

		// 2.Navigate to the application via Url
		driver.get("https://www.selenium.dev/");

		// 1.Perform TypeCasting
		JavascriptExecutor jre = (JavascriptExecutor) driver;

		// 2.call the execute script method
		jre.executeScript("window.scrollTo(0,500)");

		Thread.sleep(5000);
		jre.executeScript("window.scrollTo(0,1000)");

		Thread.sleep(5000);
		jre.executeScript("window.scrollTo(0,500)");

		Thread.sleep(5000);
		jre.executeScript("window.scrollTo(0,500)");

		System.out.println("Execution Done");

		

}
}