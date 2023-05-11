package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	
	public static WebDriver browserSetup(String browserName)
	
	{
		WebDriver driver=null;
		switch(browserName)
		{
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 break;
			 
	     default: 
	    	 System.out.println("Provide valid browser name ..");
		}
		return driver;
		
		
	}

}
