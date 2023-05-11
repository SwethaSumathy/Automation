package handlingDatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class DatePickerDemo {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://jqueryui.com/datepicker/");  // To open the url 
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement inputbox = driver.findElement(By.id("datepicker"));
//		inputbox.sendKeys("04/10/2023");
		inputbox.click();
		
		// mm //dd//yy 
		
		String month = "December";
		String date = "31";
		String year = "2025";
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && year.equals(yr))
			{
				break;  
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			
		}
		
		// To pick the date 
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		
		for (WebElement dat: alldates)
		{
			String datee = dat.getText();
			
			if(datee.equals(date))
			{
				dat.click();
			}
		}
		
	}

}
