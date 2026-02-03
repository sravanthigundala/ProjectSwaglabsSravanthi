package LearningListner;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(LearningListner.ListnerImplementation.class)
public class A extends BaseConfiguration {
	@Test

	public void demo() {
	
	//Assert.fail();
		Reporter.log("Demo",true);
	}

}



