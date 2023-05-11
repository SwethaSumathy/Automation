package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WaitsInSelenium {
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in");
//		driver.manage().window().maximize();
//		WebElement user = driver.findElement(By.name("q"));
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(user));
//		until.sendKeys("oranium tech chrompet");
//		Boolean until2 = wait.until(ExpectedConditions.titleIs("Google"));
//		System.out.println(until2);
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();

	WebElement button = driver.findElement(By.xpath("//button[text()='Display button after 10 seconds']"));
	
	button.click();
	
	
	
	
	}
}