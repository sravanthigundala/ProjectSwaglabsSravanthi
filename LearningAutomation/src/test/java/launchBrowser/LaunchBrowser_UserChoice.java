package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser_UserChoice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser");

		String browsername=sc.nextLine();
		if(browsername.equalsIgnoreCase("chrome")) {
			new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("Edge")) {
			new EdgeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		sc.close();
		
		}
		
	}

