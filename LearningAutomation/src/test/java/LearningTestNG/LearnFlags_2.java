package LearningTestNG;
//depends---flag
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnFlags_2 {
	
	@Test()
	public void parent() {
		Reporter.log("parent",true);
	}
   
	@Test(dependsOnMethods="parent")
	public void child() {
		Reporter.log("child",true);
}
}
