package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	@Test
	@org.testng.annotations.Parameters({"username","password"})
	public void loginDetails(String uname, String pwd)
	{

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);

		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		login.click();
	}
}