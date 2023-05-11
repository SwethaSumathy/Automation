package demo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, IOException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("oranium");
		completeScreenshot();
		
//		captureScreenshot();
		driver.findElement(By.id("pass")).sendKeys("oranium");
//		captureScreenshot();
		completeScreenshot();
		
		
		
	}
		
		public static void captureScreenshot() throws IOException
		{
			TakesScreenshot tks = (TakesScreenshot)driver;
			File temp = tks.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/google "+System.currentTimeMillis()  +".png");
			FileUtils.copyFile(temp, dest);
		}
		
		
		public static void completeScreenshot() throws AWTException, IOException {
			
			Robot r = new Robot();
		
			 // Get the screen size
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			
			Rectangle rect = new Rectangle();
			
			BufferedImage b = r.createScreenCapture(rect);
			
			
			File f =new File("./screenshot/RobotScreen" +System.currentTimeMillis() +".png");
			
			ImageIO.write(b, "png", f);
			
		
			
		}

	

}
