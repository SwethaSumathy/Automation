package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAlert {
	
	public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetup("edge");
		
		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.id("accept"));
		
		alert.click();
		
		//Explicit wait for handling unexpected alerts 
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		
		alt.accept();
		
		
		
	}

}
