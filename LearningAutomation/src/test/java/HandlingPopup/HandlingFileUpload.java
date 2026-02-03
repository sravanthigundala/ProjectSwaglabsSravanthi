package HandlingPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // open the browser.
		
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser.
				
				driver.manage().window().maximize();
				
				//navigate to the application via url.
				
				driver.get("https://the-internet.herokuapp.com/upload");
				
				//identify the element by using css selectorand create an file.
				
				WebElement upload_button = driver.findElement(By.cssSelector("#file-upload"));
				File fileobj = new File("./Data/My_SeleniumNotes");
				
				//fetch the obsolute path.
				
				String file_path = fileobj.getAbsolutePath();
				
				//Pass the file path viasendkeys.
				upload_button.sendKeys(file_path);
				
				//WebElement upload_area = driver.findElement(By.xpath(""));
				//upload_area.sendkeys(file_path)

	}

}
