package mouseOperration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo.HelperClass;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		   driver.get("https://www.google.com");
		   
		   driver.manage().window().maximize();
		   
		   WebElement gmail = driver.findElement(By.linkText("Gmail"));
		   
		   //Actions class 
		   
		   Actions act = new Actions(driver);
		   
		   act.contextClick(gmail).build().perform();
		   
	}

}
