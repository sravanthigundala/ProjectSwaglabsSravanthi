package LearningListner;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class ListnerImplementation implements ITestListener {

@Override
public void onTestFailure(ITestResult result)  {
	//provide the steps to capture the screenshot
	//perform typecasting
	TakesScreenshot tsobj = (TakesScreenshot)BaseConfiguration.staticdriver;
	
	//call the screenshot method and store it into temp path
	File src = tsobj.getScreenshotAs(OutputType.FILE);
	
	//create a permanent path and store it
	
	File dest = new File("./screenshot/selenium.png");
	
	//copy the path from src to dest
	
	try {
		FileHandler.copy(src,dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}