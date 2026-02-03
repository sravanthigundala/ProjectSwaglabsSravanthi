package LearningDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductTest {
	
	@DataProvider
	public Object[][]BatchData(){
		
		
		Object[][] data=new Object[3][3];
		
		data[0][0]=8;
		data[0][1]="user1";
		data[0][2]=true;
		
		data[1][0]=12;
		data[1][1]="user2";
		data[1][2]=false;
		
		data[2][0]=14;
		data[2][1]="user3";
		data[2][2]=true;
		
		return data;
		
		
	}
	@Test(dataProvider = "BatchData")
	
	public void DemoTest(int batchcode,String name,boolean status) {
		
		System.out.println(batchcode);
		System.out.println(name);
		System.out.println(status);
		System.out.println("---------------------------");
		
		
	}
	

}
