package handlingTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo.HelperClass;

public class WaitDemo {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		// Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Global wait 
		
		//EXplicit wait 
		
		WebElement inputbox = driver.findElement(By.name("q"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement ib = wait.until(ExpectedConditions.elementToBeClickable( inputbox));
		
		ib.sendKeys("Selenium");
		
		Boolean until = wait.until(ExpectedConditions.titleIs("Google"));
		
		System.out.println(until);
		
		Boolean until2 = wait.until(ExpectedConditions.textToBe(By.linkText("Gmail"), "Gmail"));
		
		System.out.println(until2);
	}

}
