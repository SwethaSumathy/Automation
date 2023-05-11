package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();    // It will download chrome driver at the run time 
		WebDriver driver = new ChromeDriver();   // To work with multiple browsers
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize(); 
		
		WebElement inputbox = driver.findElement(By.name("q"));
		inputbox.sendKeys("A.P.J Abdul Kalam");
		String attribute = inputbox.getAttribute("value");
		System.out.println(attribute);
		String classname = inputbox.getAttribute("class");
		System.out.println(classname);
		String name = inputbox.getAttribute("name");
		System.out.println(name);
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		String gmailtxt = gmail.getAttribute("innerHTML");
		System.out.println(gmailtxt);
	}

}
