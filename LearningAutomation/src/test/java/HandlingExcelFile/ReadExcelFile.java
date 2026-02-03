package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	
	public static String excelpath=("./src/test/resources/SeleniumBatchM14.xlsx");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				
		String data = readsingledata("BasicDetails", 0, 1 );
	     System.out.println(data);
		
		writeNewdata("BatchDetails_4", 1, 0, "Hridan");
		
		updateNewdata("BasicDetails", 1, 1, "Hansini");

	}
   
	
	public static String readsingledata(String sheet,int row, int cell) throws IOException {
			
		//1.convert External file into java Understandable.
		FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumBatchM14.xlsx");
		
		//2.Create an workbook using Workbook Factory.
		
		Workbook book = WorkbookFactory.create(fis);
		
		//3.Read the Data
		String data = book.getSheet("BasicDetails").getRow(0).getCell(1).getStringCellValue();
		
		return data;
		
		
		}
	
	
	public static void writeNewdata(String sheet, int row, int column, String data) throws EncryptedDocumentException, IOException {

		// 1. Convert External File into Java Understandable
		FileInputStream fis = new FileInputStream(excelpath);

		// 2. Create an workbook using WorkBookFactory
		Workbook book = WorkbookFactory.create(fis);

		// 3. Write the New Data in new sheet, row, column
		book.createSheet(sheet).createRow(row).createCell(column).setCellValue(data);

		// 4. Convert java understandable into External file
		FileOutputStream fos = new FileOutputStream(excelpath);

		// 5. Call the write method and pass fos reff
		book.write(fos);

		// 6. Close the workbook
		book.close();

		System.out.println("New data Written successfully");

	}

	public static void updateNewdata(String sheet, int row, int column, String data) throws EncryptedDocumentException, IOException {

		// 1. Convert External File into Java Understandable
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



