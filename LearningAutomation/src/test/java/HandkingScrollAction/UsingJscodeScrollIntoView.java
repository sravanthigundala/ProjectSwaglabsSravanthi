package HandkingScrollAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJscodeScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1.Open the Browser

				WebDriver driver = new ChromeDriver();

				// 2.Navigate to the application via Url
				driver.get("https://www.selenium.dev/");

				// 1.Perform TypeCasting
				JavascriptExecutor jre = (JavascriptExecutor) driver;
				
				WebElement element = driver.findElement(By.xpath("//h2[text()='News']"));

				// 2.call the execute script method
				jre.executeScript("arguments[0].scrollIntoView(true)", element);

				Thread.sleep(5000);
				jre.executeScript("arguments[0].scrollIntoView(false)", element);

				System.out.println("Execution Done");


	}

}
