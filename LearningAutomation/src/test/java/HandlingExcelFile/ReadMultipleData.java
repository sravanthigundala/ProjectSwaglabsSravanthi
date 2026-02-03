package HandlingExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	
	public static final String excelpath = "./src/test/resources/SeleniumBatchM14.xlsx";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//readmultipledata_specificRow("DWSRegister", 3);

        //readmultipledata_specificColumn("DwsRegister", 3);

		readcompletedata_excel("DwsRegister");

		
	}
		public static String readmultipledata(String sheet, int row,int cell) throws IOException {
			
			//1.convert External file into java Understandable.
			FileInputStream fis = new FileInputStream("./src/test/resources/SeleniumBatchM14.xlsx");
			
			//2.Create an workbook using Workbook Factory.
			
			Workbook book = WorkbookFactory.create(fis);
			
			
		//3.Read the Data
			String data = book.getSheet("BasicDetails").getRow(0).getCell(2).getStringCellValue();
			
			return data;
			
			
			}
		
		

			public static void readmultipledata_specificColumn(String sheet, int column)
					throws EncryptedDocumentException, IOException {

				// 1. Convert External File into Java Undersandable file
				FileInputStream fis = new FileInputStream(excelpath);

				// 2. Create an workbook using WorkBookFactory
				Workbook book = WorkbookFactory.create(fis);

				// Fetch the Last Row number
				int lastrownum = book.getSheet(sheet).getLastRowNum();
				System.out.println(lastrownum);

				for (int i = 1; i <= lastrownum; i++) {
					// Read all the data in the 3rd column
					String data = book.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
					System.out.println(data);

				}
			}

			public static void readcompletedata_excel(String sheet) throws EncryptedDocumentException, IOException {

				// 1. Convert External File into Java Undersandable file
				FileInputStream fis = new FileInputStream(excelpath);

				// 2. Create an workbook using WorkBookFactory
				Workbook book = WorkbookFactory.create(fis);

				// Fetch the Last Row number
				int lastrownum = book.getSheet(sheet).getLastRowNum();
				System.out.println(lastrownum);

				for (int i = 1; i <= lastrownum; i++) {
					// Fetch the last column number
					int lastcolumnnum = book.getSheet(sheet).getRow(i).getLastCellNum();

					for (int j = 0; j < lastcolumnnum; j++) {
						String columndata = book.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
						System.out.print(columndata);
						System.out.print("  ");

					}

					System.out.println();
				}
	}

}
