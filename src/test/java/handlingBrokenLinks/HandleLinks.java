package handlingBrokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class HandleLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://siamcomputing.com");
		
		driver.manage().window().maximize();
		
		//Fetch all the a tags 
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		
		int sum=0;
		
		for(WebElement tags:alltags)
		{
			String url = tags.getAttribute("href");
			int count = HelperBrokenlinkCheck.brokenLinkChecker(url);
			
			sum+=count;
		}
		
		
		System.out.println("Number of broken links are: " +sum);
		
		
		}

}
