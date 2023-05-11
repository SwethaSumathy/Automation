package mouseOperration;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo.HelperClass;

public class RobotKeyboard {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		// Right click on gmail 
		
		Actions act = new Actions(driver);
		
		act.moveToElement(gmail).contextClick().build().perform();
		
		// Create an object for Robot class 
		
		Robot r = new Robot();
		
		
		
		for (int i =1; i<=3;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	}

}
