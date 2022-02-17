package org.pac;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MoneyDetails {

public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\ZetaDetails\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
     
	//driver.switchTo().frame("login_page");
    
	WebElement userClk =driver.findElement(By.xpath("//input[@type = 'text']"));
	userClk.sendKeys("Sathyapriya");
	
	//Alert al =driver.switchTo().alert();
	//Thread.sleep(2000);
	//al.accept();
	
	
	
}

}

 























//WebElement login=driver.findElement(By.name("login"));
	//JavascriptExecutor j=(JavascriptExecutor)driver;
	//j.executeScript("arguments[0].setAttribute('value', 'Sathya')",user);
	//Object o= j.executeScript("return arguments[0].getAttribute('value')",user); 
	//System.out.println(o);
	//j.executeScript("arguments[0].click()",login);