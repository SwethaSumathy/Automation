package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
public static void main(String[] args) {
	
	WebDriver driver = HelperClass.browserSetup("edge");
	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	
	WebElement inputbox = driver.findElement(By.name("q"));   // By is an abstract class 
	
	WebDriverWait wait = new WebDriverWait(driver,10);	
	
	WebElement ib = wait.until(ExpectedConditions.elementToBeClickable(inputbox));
	
	ib.sendKeys("Abdul Kalam SIR");
	
	Boolean a = wait.until(ExpectedConditions.titleIs("Google"));
	
	Boolean b = wait.until(ExpectedConditions.textToBe(By.linkText("Gmail"), "gmail"));
	
	System.out.println(b);
	System.out.println(a);
	

	
	
	
	
	
	
	
}
}
