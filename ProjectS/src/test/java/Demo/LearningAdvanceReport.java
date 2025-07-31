package Demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create the sparkReport.
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the SparkReport Information.
		spark.config().setDocumentTitle("Regression Testing For the SwagLabs");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.STANDARD);
		
		
		//Create the Extent Report.
		ExtentReports report=new ExtentReports();
		
		//Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
		//Configure the System Information in Extent Report.
		report.setSystemInfo("DeviceName:","Sravanthigundala");
		report.setSystemInfo("OperatingSystem","WINDOWS 11");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("BrowserVersion","chrome-138.0.7204.169");
		
		//create the Test Information.
		ExtentTest test=report.createTest("Regressiontest");
		
		//Step Information
		test.log(Status.INFO, "Step1:Launch the Browser Succesfully");
		
		test.log(Status.INFO, "Step2:Navigating To the Application via url Succesfully");
		
		test.log(Status.PASS, "Step3:Verified the Webpage Successfully");
		
		if(true==true) {
			
		test.log(Status.PASS, "Step4:Verified the WebElement Displayed");
		}
		 else {
			test.log(Status.SKIP, "Step5:Element is Hidden");
			
		}
		
		//Flush the Report Information.
		report.flush();
		
		System.out.println("execution Done");

	}

}
