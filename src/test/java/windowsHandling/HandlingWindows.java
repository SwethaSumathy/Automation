package windowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class HandlingWindows {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement inputbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		inputbox.sendKeys("selenium");
		inputbox.sendKeys(Keys.ENTER);
		
	   // Getting all the links 
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		
		for(WebElement link:alllinks)
		{
			link.click();   // It will open each one of the links from the parent window 
		}
		
		
		// Windows handling 
		String parentwindowid = driver.getWindowHandle();   // Get the parent window id 
		
		System.out.println("Parent window id is:" +parentwindowid);   // CDwindow-59CF528660C639554901E2B501FF869A
		
		Set<String> allhandles = driver.getWindowHandles();  // Each one of the window id will be unique .  
		
		
		//Switching to all the child windows using if  condition 
		
		
		for (String currhandle:allhandles)
		{
			if(parentwindowid!=currhandle)   
			{
				driver.switchTo().window(currhandle);
				String title = driver.getTitle();
				System.out.println(title);
			}
		}
		
		// Using count 
		
		int count=1;
		
		for(String currhandle:allhandles)
		{
			if (count>1)   
			{
				driver.switchTo().window(currhandle);
				String title = driver.getTitle();
				System.out.println(title);
			}
			
			count++;   // 3
		}
		
		
		
		
		
				

	
		
		
		
		
		
		
		
	}
	
	

}
