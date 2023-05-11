package mouseOperration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo.HelperClass;

public class KeyBoardActionns {
	
	public static void main(String[] args) {
		  WebDriver driver = HelperClass.browserSetup("chrome");
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		
		   WebElement email = driver.findElement(By.id("email"));
		   WebElement pass = driver.findElement(By.id("pass"));
		   WebElement login = driver.findElement(By.name("login"));
		   
		   //Actions class 
		   Actions act = new Actions(driver);
		   
		   // 1. Send the text to email box as oranium
		   
		   act.sendKeys(email,"Oranium").perform();
		   
		   //2. Select the text , Ctrl + a 
		   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();	
		   
		   //3. ctrl + c
		   
		   act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();	
		   
		   //4 To move to the password field 
		       act.sendKeys(Keys.TAB).perform();
		   
		   
		   
		   // 5. ctr+v
		   
		       
		   act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		   
		   
		   // 6. Two tabs, and then press enter 
		   
		   act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		   
		   
		   
		   
		   
	}

}
