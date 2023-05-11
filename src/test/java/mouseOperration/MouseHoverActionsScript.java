package mouseOperration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverActionsScript {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.amazon.in/");
//
//		driver.manage().window().maximize();
//
//		WebElement hello = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//
//
//
//		Actions h = new Actions(driver);
//
//
//		h.moveToElement(hello).build().perform();
//
//
//		WebElement baby = driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));	
//
//		h.moveToElement(baby).contextClick(baby).build().perform();
		
		
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("draggable"));

		
		
		WebElement dest = driver.findElement(By.id("droppable"));



		Actions a = new Actions(driver);
		
		a.dragAndDrop(source, dest).build().perform();
		
		
		
		
		
		



	}

}
