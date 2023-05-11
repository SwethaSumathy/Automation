package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NavigationCommands {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.google.com");
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().to("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
	driver.navigate().to("https://www.instagram.com/");
	for (int i=1;i<=4;i++)
	{
		driver.navigate().back();
		Thread.sleep(2000);
	}
	driver.navigate().refresh();
	Thread.sleep(2000);
	for(int i=1;i<=4;i++)
	{
		driver.navigate().forward();
		Thread.sleep(2000); 
	}
	//driver.close();
	driver.quit();
}
}