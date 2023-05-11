package windowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownExample {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

//		driver.get("https://letcode.in/dropdowns");
//
//		
//		List<WebElement> mul = driver.findElements(By.xpath("//select[@id=\"superheros\"]/option"));
//		
//		int size = mul.size();
//		System.out.println(size);
//		
//		for(int i=0;i<mul.size();i++)
//		{
//			
//			
//			mul.get(i).click();
//		}
		
		
		
		
		//WebElement m = driver.findElement(By.id("superheros"));

		//Select s = new Select(m);


		//getOptions--> List<WebElement>

		//List<WebElement> o = s.getOptions();


//		for(int i=0;i<o.size();i++)
//		
		
		//		for (WebElement a : o) {
		//			
		//			System.out.println(a.getText());
		//			
		//		}

//
//		for (WebElement k : o) {
//
////			if(k.getText().equals("Black Panther"))
////			{
////
////				k.click();
////
////
////			}
//			
//			
//			k.click();
//
//
//
//
//		}
//




		//		s.selectByIndex(0);
		//		s.selectByIndex(1);
		//		s.selectByIndex(2);
		//		s.selectByIndex(3);
		//		
		//		Thread.sleep(3000);
		//		
		//		s.deselectByIndex(0);
		//		s.deselectByIndex(1);
		//		s.deselectByIndex(2);
		//		s.deselectByIndex(3);


		driver.get("https://letcode.in/windows");
		
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Open Home Page']"));

		button.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows);
		
		List<String> u = new ArrayList(allWindows);
		
		
		driver.switchTo().window(u.get(1));
		
		WebElement t = driver.findElement(By.xpath("//p[text()=' Button ']"));
		System.out.println(t.getText());
		
		driver.switchTo().window(u.get(0));
		
		WebElement t1 = driver.findElement(By.xpath("//h1[text()=' Windows']"));
		System.out.println(t1.getText());
		
	

	}

}
