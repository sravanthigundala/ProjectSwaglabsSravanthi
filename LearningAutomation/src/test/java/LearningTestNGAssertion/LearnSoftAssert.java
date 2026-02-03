package LearningTestNGAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert {

	@Test
	public void m1()
	{
		
		String expectedCondition1 = "NEWSLETTER";
		
		boolean expectedCondition2 = true;
		
		int expectedCondition3 = 10;
		
		String actualCondition1 = "NEWSLETTERddhddjf";
		
		boolean actualCondition2 = true;
		
		int actualCondition3 = 10;
		
		
		SoftAssert saobj = new SoftAssert();
		
		//saobj.assertEquals(actualCondition1, expectedCondition1);
		
		//saobj.assertNotEquals(actualCondition1, expectedCondition1);
		
		saobj.assertTrue(actualCondition2);
		
		//saobj.assertFalse(actualCondition2);
		
		System.out.println("Line 6");
		
		saobj.assertAll();

	}
}
