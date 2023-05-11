package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	
	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--incognito");
		
		//c.setHeadless(true);
	
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver(c);
	   
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	   
	   String title = driver.getTitle();
	   
	   System.out.println(title);
	   
	   
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   
	}

}
