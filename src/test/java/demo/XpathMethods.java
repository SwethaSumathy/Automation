package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathMethods {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
//		
//		
//		driver.manage().window().maximize();
//		
//		WebElement user = driver.findElement(By.xpath("(//input)[last()-3]"));
//		user.sendKeys("oranium");
		
		//to automating radio buttons and check boxes
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		driver.manage().window().maximize();
		
		
//		WebElement male = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
//		
////		male.click();
//		
//		boolean s = male.isSelected();
//		
//		System.out.println(s);
//		
//		
//		//check box
		
		
//		WebElement movies = driver.findElement(By.id("checkbox2"));
//		
//		movies.click();
		
		//ArrayList<Object> a = new ArrayList();
		
		//List--> interface--> ArrayList, LinkedList
		
		
		List<WebElement> ch = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		int size = ch.size();
		System.out.println(size);
		
//		
//		for(WebElement k:ch)
//		
//		{
//			k.click();
//			
//			
//		}
//		
		
		for(int i=0;i<ch.size();i++)
		{
			ch.get(i).click();
		}
		
		
		
		
		
		
		
		
	}

}
