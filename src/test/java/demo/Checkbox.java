package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();    // It will download chrome driver at the run time 
		WebDriver driver = new ChromeDriver();   // To work with multiple browsers
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize(); 
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[contains(@id,'day' ) ]"));
		
//		for(WebElement checkbox:checkboxes)
//		{
//			
//			String day = checkbox.getAttribute("id");
//			
//			if(day.equals("monday") || day.equals("friday"))
//			{
//			checkbox.click();
//			}
//		}
		
		
		for(int i=0;i<checkboxes.size();i++)
		{
			
			if(i<2)
			{
			checkboxes.get(i).click();
			}
		}
		
		
	// TASK
		//Using for loop 
				
		//click only  last 2
		
		//click only first 2 checkboxes 
		
		
		
		
	}

}
