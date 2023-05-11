package windowsHandling;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllWindowHandling {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement box = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		box.sendKeys("selenium");
		box.sendKeys(Keys.ENTER);
		
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]/a"));
		
		
		for (WebElement link : links) {
			
			
			link.click();
		}
		
		
		String parent = driver.getWindowHandle();
		
		Set<String> all = driver.getWindowHandles();
		
		
		for (String child : all) {
			
			
			if(!parent.equals(child))
			{
				
				driver.switchTo().window(child);
				
				String title = driver.getTitle();
				
				System.out.println(title);
				
				
			}
			
		}
		
		
		
		
		
	}
	
	
}
