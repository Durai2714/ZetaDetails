package org.pac;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\ZetaDetails\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		

		 //driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		// WebElement dropDown =driver.findElement(By.xpath("(//span[text()='GENERAL'])[1]"));

				
				
				 WebElement dropDown =driver.findElement(By.name("country"));	
				 dropDown.click();
				
				 Select s=new Select(dropDown);
				 s.selectByIndex(10);
				 Thread.sleep(3000);
				 s.selectByValue("194");
				 Thread.sleep(3000);
				 s.selectByVisibleText("Angola");
				//List<WebElement> op = s.getOptions();
				//for(WebElement x :op) {
					//System.out.println(x.getText());
					boolean j =s.isMultiple();
					System.out.println(j);
				}
				}
			

		

	
