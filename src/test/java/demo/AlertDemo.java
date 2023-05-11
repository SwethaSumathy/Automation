package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = HelperClass.browserSetup("edge");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Global wait 
        
        
		//Simple alert 
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Alert alt = driver.switchTo().alert();
		alt.accept();
		String text = alt.getText();
		System.out.println(text);

		Thread.sleep(2000);

		//Confirm alert 
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		Alert alt1 = driver.switchTo().alert();
		//alt1.accept();
		alt1.dismiss();
		Thread.sleep(2000);

		//Prompt alert 
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("selenium");
		alt2.accept();


      driver.close();
      

	}

}
