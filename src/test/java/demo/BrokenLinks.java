package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		int c=0;
		for(WebElement link:alltags)
		{
			String url = link.getAttribute("href");
			int count = HelperBrokenLinkChecker.brokenLinkChecker(url);
			c=c+count;
		}
		
		
		System.out.println("Number of broken  links are : " +c);
	}
		
}
