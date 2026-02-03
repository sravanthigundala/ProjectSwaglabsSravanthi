package Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Verify the nth product by using xpath.
 * 
 * The product is userchoice.
 * 
 *If user gives the  1st product name only the product name should print in console.
 *
 *  I f user gives the wrong product name then it should ask input again  
 *  by giving warning message*/

public class Assignment_UserChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner Sc = new Scanner(System.in);
         
       //open the browser---chrome
         
 		WebDriver driver=new ChromeDriver();
 		
 		//maximize the browser
 		
 		driver.manage().window().maximize();
 		
 		//navigate to the application via url
 		
 		driver.get("https://www.saucedemo.com");
 		
 		//verify the page
 		
 		System.out.println(driver.getTitle());
 		
 		//Identify the element using xpath locator and store it.
 		
 		//xpath using text value
 		
 		WebElement username_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'User')]"));
 		WebElement password_textfield = driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]"));
 		WebElement login_buttton = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
 		
 		//validate the element is enabled and is displayed
 		
 		if (username_textfield.isDisplayed()&&username_textfield.isEnabled()&&password_textfield.isDisplayed()&&password_textfield.isEnabled()
 				&&login_buttton.isDisplayed()&&login_buttton.isEnabled()) {
 			
 			System.out.println("element is verified:It is diaplayed");
 			System.out.println("element is verified:It is enabled");
 			
 		} else {
 			System.out.println("element is verified:It is not diaplayed");
 			System.out.println("element is verified:It is not enabled");
 		}
 		
 		//perform login action
 		
 		username_textfield.sendKeys("standard_user");
 		password_textfield.sendKeys("secret_sauce");
 		login_buttton.click();
 		

       //Identify the first product name
 		
 		WebElement firstprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
 				
 		//fetch the partial text value of the 1st product name
 				
 			String firstprd_name = firstprd.getText();
 		
 		//print on console
 		
 		//System.out.println("First product name is"+firstprd_name );
 		
 		
    //Identify the second product name
 		
 		WebElement secondprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
 				
 		//fetch the partial text value of the 2nd product name
 				
 			String secondprd_name = secondprd.getText();
 		
 		//print on console
 		
 		//System.out.println("second product name is"+secondprd_name );
 		
      //Identify the third product name
 		
 		WebElement thirdprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
 				
 		//fetch the  partial text value of the 3rd product name
 				
 			String thirdprd_name = thirdprd.getText();
 		
 		//print on console
 		
 		//System.out.println("third product name is"+thirdprd_name );
 		
 		
 		
 		//Identify the fourth product name
 		
 		WebElement fourthprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
 				
 		//fetch the partial text value of the 4th product name
 				
 			String fourthprd_name = fourthprd.getText();
 		
 		//print on console
 		
 		//System.out.println("fourth product name is"+fourthprd_name );
 		
 		
         //Identify the fifth product name
 		
 		WebElement fifthprd=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
 				
 		//fetch the partial text value of the 5th product name
 				
 			String fifthprd_name = fifthprd.getText();
 		
 		//print on console
 		
 		//System.out.println("fifth product name is"+fifthprd_name );
 		
 		
          
 		//Identify the sixth product name
 		
 		WebElement sixthprd=driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
 				
 		//fetch the  partial text value of the 6th product name
 				
 			String sixthprd_name = sixthprd.getText();
 		
 		//print on console
 		
 		//System.out.println("sixth product name is"+sixthprd_name );
 			
 			boolean valid = false;

 	        while (!valid) {
 	            System.out.println("Enter a productnumber ");
 	            String product_num= Sc.nextLine();
 			
 			switch (product_num) {
 		    case "product1":
 		    	System.out.println("First product name is"+firstprd_name );
 		    	valid = true; 
 		        break;
 		    case "product2":
 		    	System.out.println("second product name is"+secondprd_name );
 		    	valid = true; 
 		        break;
 		   case "product3":
		    	System.out.println("third product name is"+thirdprd_name );
		    	valid = true; 
		        break;
 		  case "product4":
		    	System.out.println("fourth product name is"+fourthprd_name );
		    	valid = true; 
		        break;
 		 case "product5":
		    	System.out.println("fifth product name is"+fifthprd_name );
		    	valid = true; 
		        break;
 		case "product6":
		    	System.out.println("sixth product name is"+sixthprd_name );
		    	valid = true; 
		        break;
 		       
 		    
 		    default:
 		    	System.out.println("Invalid productnumber,please enter the valid productnumber.");
 		
 			 
 			}
 		
 		//close the browser
 		
 		driver.close();
 		
 		
      
 			
 	        }

	}

}
