package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnExpectedAlert {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept")).click();
		
		//Handling unexpected alert 
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		 Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		 alt.accept();
		
	
	}

}
