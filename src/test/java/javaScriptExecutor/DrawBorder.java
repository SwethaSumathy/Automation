package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class DrawBorder {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value='Oranium' ;", email);
		
		//Draw a border over the email element 
		
		jse.executeScript("arguments[0].style.border='3px solid red' ;", email);
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		String loginbgcolor = login.getCssValue("background-color");
		
		System.out.println(loginbgcolor);    // rgba(24, 119, 242, 1)
		
		String logincolor = login.getCssValue("color");
		
		System.out.println(logincolor);   //  rgba(24, 119, 242, 1)
		
		// To know where the operation is going on , We can perform Flash operation 
		
		
		String bgcolor="rgb(245, 66, 233)";   //purple
		
		for (int i =0;i<100;i++)
		{
			
			jse.executeScript("arguments[0].style.backgroundColor= '" +loginbgcolor+ " '  ;" , login);
			
			jse.executeScript("arguments[0].style.backgroundColor= '" + bgcolor+ " '  ;" , login);
		}
		
		jse.executeScript("arguments[0].click();", login);
		
		
		
		
	}

}
