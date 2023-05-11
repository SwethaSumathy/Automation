package testngTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResueableMethods {
	
	
	public static void dynamicText(WebDriver driver, String Pradeep)
	{
		
		
		driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr/td[text()="+"'"+Pradeep+"'"+"]/following-sibling::td/input")).click();
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		
		driver.manage().window().maximize();
		
		dynamicText(driver, "Yashwanth");
		
	}

}
