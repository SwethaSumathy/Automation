package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("edge");   //Edge driver got initialized 
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		//Bootstrap dropddown 
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='superheros']/option"));
		
		for(WebElement opt :options)
		{
			if(opt.getText().equals("Aquaman") || opt.getText().equals("Captain America"))
			{
				opt.click();
			}
		}
	
	     
	     
		
		
		
		
	}

}
