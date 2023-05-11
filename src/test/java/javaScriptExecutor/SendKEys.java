package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class SendKEys {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
	    //Page refresh 
		
		Thread.sleep(2000);
		
		
		 String url = jse.executeScript("return document.URL;").toString();
		 
		 System.out.println(url);
		 
		 String title = jse.executeScript("return document.title;").toString();
		 System.out.println(title);
		
//		jse.executeScript("history.go(0);");
//		
//		jse.executeScript("location.reload();");
//		
//		
//		jse.executeScript("arguments[0].click();", register);
//		
//		WebElement fname = driver.findElement(By.id("FirstName"));
//		
//		WebElement male = driver.findElement(By.id("gender-male"));
//		
//		jse.executeScript("arguments[0].click();arguments[1].value='Java'; ", male, fname);
		
		
	}
	
	

}
