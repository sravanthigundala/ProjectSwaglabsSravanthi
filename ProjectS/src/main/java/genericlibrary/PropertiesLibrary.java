package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLibrary implements FrameWorkConstant {
	
	 static FileInputStream fis;
	 static FileOutputStream fOs;
	 static Properties property;
	 
	 public  static String readData(String key)  {
			
			//1.convert ExternalFile into java readable.
			
			 try {
				fis = new FileInputStream(propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//2.create an object for properties class
			property = new Properties();
			
			//3.load the properties.
			try {
				property.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//4.Read/Fetch the data.
			 return property.getProperty(key);
		}
	 
	 public static void writeData(String newkey, String newdata, String message)  {

			// 1. Convert the External File into Java Understandable
			 try {
				fis = new FileInputStream(propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 2. Create an object for Properties class
			property= new Properties();

			// 3. Load all the Properties
			try {
				property.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 4. Put the new data in properties file
			property.put(newkey, newdata);

			// 5. Convert the Java Understandable into External File
			try {
				fOs = new FileOutputStream(propertypath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 6. Store the new data with message
			try {
				property.store(fOs, message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}
