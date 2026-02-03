package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_DWS_Register {

		public static final String excelpath = "./src/test/resources/SeleniumBatchM14.xlsx";

		public static void main(String[] args) throws EncryptedDocumentException, IOException {

			String firstname = readsingledata("DWSRegister", 2, 1);
			String lastname = readsingledata("DWSRegister", 2, 2);
			String email = readsingledata("DWSRegister", 2, 3);
			String password = readsingledata("DWSRegister", 2, 4);
			String confirmpassword = readsingledata("DWSRegister", 2, 5);

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.get("https://demowebshop.tricentis.com/");

			WebElement register_link = driver.findElement(By.partialLinkText("Register"));
			register_link.click();

			// Identify the Element

			WebElement gender_btn = driver.findElement(By.id("gender-female"));
			gender_btn.click();

			WebElement firstname_textfield = driver.findElement(By.id("FirstName"));
			WebElement lastname_textfield = driver.findElement(By.id("LastName"));
			WebElement email_textfield = driver.findElement(By.id("Email"));
			WebElement password_textfield = driver.findElement(By.id("Password"));
			WebElement confirmpassword_textfield = driver.findElement(By.id("ConfirmPassword"));
			WebElement register_btn = driver.findElement(By.id("register-button"));

			// Perform Action

			firstname_textfield.sendKeys(firstname);
			lastname_textfield.sendKeys(lastname);
			email_textfield.sendKeys(email);
			password_textfield.sendKeys(password);
			confirmpassword_textfield.sendKeys(confirmpassword);
			register_btn.click();

			WebElement result_msg = driver.findElement(By.xpath("//div[@class='result']"));
			String data = result_msg.getText();

			updateNewdata("DWSRegister", 1, 6, data);
			updateNewdata("DWSRegister", 2, 6, data);
			updateNewdata("DWSRegister", 3, 6, data);
			updateNewdata("DWSRegister", 4, 6, data);
			updateNewdata("DWSRegister", 5, 6, data);

		}

		public static String readsingledata(String sheet, int row, int column)
				throws EncryptedDocumentException, IOException {

			// 1. Convert External File into Java Undersandable file
			FileInputStream fis = new FileInputStream(excelpath);

			// 2. Create an workbook using WorkBookFactory
			Workbook book = WorkbookFactory.create(fis);

			// 3. Read the Data
			String data = book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			System.out.println("Read data is completed");

			return data;

		}

		public static void updateNewdata(String sheet, int row, int column, String data)
				throws EncryptedDocumentException, IOException {

			// 1. Convert External File into Java Undersandable
			FileInputStream fis = new FileInputStream(excelpath);

			// 2. Create an workbook using WorkBookFactory
			Workbook book = WorkbookFactory.create(fis);

			// 3. Write the New Data in new sheet, row, column
			book.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);

			// 4. Convert java understandable into External file
			FileOutputStream fos = new FileOutputStream(excelpath);

			// 5. Call the write method and pass fos reff
			book.write(fos);

			// 6. Close the workbook
			book.close();

			System.out.println("New data updated successfully");

		
		
		
		
		
		
	}

}
