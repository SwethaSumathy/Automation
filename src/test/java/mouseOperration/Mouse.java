package mouseOperration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo.HelperClass;

public class Mouse {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
	   driver.get("https://www.myntra.com/shop/women");
	   
	   driver.manage().window().maximize();
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
	   
	   
//	   // Mouse hover operation 
//	   
//	   WebElement arrow = driver.findElement(By.xpath("//span[@class='nav-line-2 ']/span"));
//	   
//	   WebElement orders = driver.findElement(By.xpath("//span[text()='Your Orders']"));
//	   
//	   // Actions class 
//	   
//	   Actions act = new Actions(driver);
//	   
//	   act.moveToElement(arrow).perform();
//	   
//	   act.moveToElement(orders).click().perform();
//	   
//	   
	   
	   
	   
	   
	}

}
