package demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHandlingWindow {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		driver.get("https://letcode.in/windows");

		driver.manage().window().maximize();


		WebElement button = driver.findElement(By.xpath("//button[text()='Open Home Page']"));

		button.click();

		String parent = driver.getWindowHandle();

		Set<String> all = driver.getWindowHandles();


		int count=0;

		for (String child : all) {


			if(count>=1)
			{

				driver.switchTo().window(child);

				WebElement t = driver.findElement(By.xpath("//p[text()=' Button ']"));

				System.out.println(t.getText());



			}

			count++;
		}








		//		driver.get("https://testautomationpractice.blogspot.com/");
		//		
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		
		//		WebElement box = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		//		box.sendKeys("selenium");
		//		box.sendKeys(Keys.ENTER);
		//		
		//		List<WebElement> links = driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]/a"));
		//		
		//		int size = links.size();
		//		System.out.println(size);
		//		
		//		for (WebElement link : links) {
		//			
		//			link.click();
		//			
		//		}
		//		
		//		
		//		String parent = driver.getWindowHandle();
		//		
		//		
		//		Set<String> allWindow = driver.getWindowHandles();
		//		
		//		
		//		
		//		for (String child : allWindow) {
		//			
		//			
		//			driver.switchTo().window(child);
		//			
		//			String t = driver.getTitle();
		//			
		//			
		//			if(t.equals("Selenium (software) - Wikipedia"))
		//			{
		//				
		//				String title = driver.getTitle();
		//				System.out.println(title);
		//				
		//				
		//			}
		//			
		//			
		//			
		//			
		//			
		//			
		//			
		//		}
		//		



		//		for (String child : allWindow) {
		//			
		//			
		//			
		//			driver.switchTo().window(child);
		//			
		//			String title = driver.getTitle();
		//			
		//			System.out.println(title);
		//			
		//			
		//		}





	}

}
