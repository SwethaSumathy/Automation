package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoAlert {

	public static void add (int a,int b)
	
	{
		System.out.println(a+b);
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		add(89,100);
		driver.get("www.google.co.in");
		
//		driver.get("https://www.google.co.in");
//
//		
//		driver.manage().window().maximize();
//		
//		WebElement user = driver.findElement(By.name("q"));
//		
//		user.sendKeys("ORANIUM CHROMPET");
//		
////		user.sendKeys(Keys.ENTER);
//		
//		//user.sendKeys(Keys.F5);
		
		
		
		
		
//		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
//		
//		driver.manage().window().maximize();
//		
//		WebElement s = driver.findElement(By.xpath("//button[@onclick=\"myFunctionOne()\"]"));
//		
//		s.click();
//		
//		Alert a = driver.switchTo().alert();
//		
//		String text = a.getText();
//		
//		System.out.println(text);
//		
//		Thread.sleep(3000);
//		
//		a.accept();
//		
//		
//		Thread.sleep(3000);
//		
//		WebElement c = driver.findElement(By.xpath("//button[@onclick=\"myFunctionTwo()\"]"));
//		
//		
//		c.click();
//		
//		
//		Alert b = driver.switchTo().alert();
//		
//		System.out.println(b.getText());
//		
//		Thread.sleep(3000);
//		
//		b.dismiss();
//		
//		
//		Thread.sleep(3000);
//		
//		
//		WebElement p = driver.findElement(By.xpath("//button[@onclick=\"myFunctionThree()\"]"));
//		p.click();
////		
////		
////		Alert d = driver.switchTo().alert();
////		
////		
////		System.out.println(d.getText());
////		
////		d.sendKeys("Oranium");
////		
////		Thread.sleep(3000);
////		
////		
////		d.dismiss();
////		
//		
//		
//		driver.get("https://letcode.in/dropdowns");
//		
//		driver.manage().window().maximize();
//		
//		WebElement si = driver.findElement(By.id("fruits"));
//		
//		Select j = new Select(si);
//		
//		j.selectByIndex(2);
//		
//		Thread.sleep(3000);
//		
//		j.selectByVisibleText("Orange");
//		
//		Thread.sleep(3000);
//		
//		j.selectByValue("4");
//		
//		
//		WebElement firstSelectedOption = j.getFirstSelectedOption();
//		
//		
//		System.out.println(firstSelectedOption.getText());
//		
//		
	}

}
