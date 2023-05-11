package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoStatic {
	public static void loginDetails(String uname, String pwd, WebDriver driver)
	{
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(uname);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
	}
}
