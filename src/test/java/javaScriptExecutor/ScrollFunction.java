package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class ScrollFunction {
	
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().window().maximize();
		
		// JavascriptExecutor 
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		// Scroll down using pixels
		
		//jse.executeScript("window.scrollBy(0,3000);");
		
		// Scroll till the particular element 
		
		WebElement politics = driver.findElement(By.id("Politics"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);", politics);
		
		// Scroll from one element to another element 
		
		// Politics to administrative divisions 
		
		
		
		
	}

}
