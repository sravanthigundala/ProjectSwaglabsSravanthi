package ASSIGNMENTS;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingPopup {

	public static void main(String[] args) throws InterruptedException {
		

		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				
				driver.manage().window().maximize();
				
				driver.get("https://shoppersstack.com/");
				
				WebElement electronics_Button = driver.findElement(By.xpath("//a[@id='electronics' and text()='Electronic']"));
				
				electronics_Button.click();
				
				driver.navigate().refresh();
				
				
				
				Thread.sleep(5000);
				WebElement product = driver.findElement(By.xpath("//span[text()='HP 15s- 11th Gen Intel Core i5 -8GB...']"));
				
				product.click();
				
				
				
				WebElement compare_button = driver.findElement(By.xpath("//button[@name='compare']"));
				
				compare_button.click();
				
				
				
				
				String mainpage_ID = driver.getWindowHandle();
				
				Set<String> pop_pageID = driver.getWindowHandles();
				
				System.out.println("Main page ID is :" + mainpage_ID);
				
				System.out.println("popup page ID is :" + pop_pageID);
				
				int size = pop_pageID.size();
				
				System.out.println(size);		
				
				
				
					for (String child_page_loop : pop_pageID) 	
					{	
						
						
						
						

						driver.switchTo().window(child_page_loop);
						
//						String url = driver.getCurrentUrl();
//						String title = driver.getTitle();
											
							if(mainpage_ID.equals(child_page_loop))
							{
								//System.out.println("URL is : " + url + " and title is : " + title);
								driver.close();
							}
							else if(!mainpage_ID.equals(child_page_loop)&& size!=1 && size>0)	 
							{
								//System.out.println("URL is : " + url + " and title is : " + title);
								driver.close();
							}
							size--;
						
					}
						
				System.out.println("Execution succesful");

			}

	}

	

