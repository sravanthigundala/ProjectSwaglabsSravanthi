package LearningTestNG;
//priority---flag
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnFlags {
	
	@Test(priority=0)
	public void add() {
		
		Reporter.log("add",true);
	}
	@Test(priority=0)
	public void update() {
		
		Reporter.log("update",true);
	}
	@Test(priority=-10)
	public void delete() {
		
		Reporter.log("delete",true);
	}
}
