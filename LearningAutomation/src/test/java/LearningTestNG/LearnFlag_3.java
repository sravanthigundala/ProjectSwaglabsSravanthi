package LearningTestNG;
//enabled --flag
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnFlag_3 {
	
	@Test(priority=1,enabled=true)
	public void add() {
		
		Reporter.log("add",true);
	}
	@Test(priority=2,enabled=false)
	public void update() {
		
		Reporter.log("update",true);
	}
	@Test(priority=-13,dependsOnMethods = "add",enabled=false)
	public void delete() {
		
		Reporter.log("delete",true);
	}
}


