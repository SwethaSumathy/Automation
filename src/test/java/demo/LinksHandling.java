package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksHandling {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://www.softwaretestingmaterial.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		
		int sum=0;
		
		for(WebElement tag : alltags)
		{
			String url = tag.getAttribute("href");
			int count = HelperBrokenLink.brokenLinkChecker(url);
			
			sum+=count;
			
			
			
			
		}
		System.out.println("Number  of broken links are : " +sum );
	}

}
