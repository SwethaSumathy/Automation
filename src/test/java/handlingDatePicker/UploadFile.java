package handlingDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class UploadFile {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");  // To open the url 
		driver.manage().window().maximize();
		
		WebElement choosefile = driver.findElement(By.name("upfile"));
		
		choosefile.sendKeys("C:\\Users\\91807\\Desktop\\Selenium.txt");
		
		driver.findElement(By.xpath("//input[@value='Press']")).click();
		
	}
	
	

}
