package takescreenshot;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.HelperClass;

public class ScreenshotDem {
	
	public static void captureCompleteScreenshot() throws AWTException, IOException {
		
		Robot r = new Robot();
		
		// Get the screen size 
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(d);
		
		BufferedImage b = r.createScreenCapture(rect);    //Its capturing the image 
		
		File de =new File("./screenshot/Robot" +System.currentTimeMillis()+ ".png");
		
		ImageIO.write(b,"png", de);
		
	}
	
	
	public static void captureScreenshot(WebDriver driver) throws IOException                                          
	{
		TakesScreenshot tks = (TakesScreenshot)driver;           // We are downcasting to the driver 
		
		File temp = tks.getScreenshotAs(OutputType.FILE);     // Taking screenshot and keeping it in temporary file 
		
		
		File dest = new File("./screenshot/facebook "+System.currentTimeMillis()+   ".png");  //It is my destination path 
		
		FileUtils.copyFile(temp, dest);
		
		File f = new File(System.getProperty("user.dir") )
		
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("email"));
		
		uname.sendKeys("Oranium@gmail.com");
		
		captureCompleteScreenshot();
		
		//captureScreenshot(driver);
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		pass.sendKeys("oranium1234");
		captureCompleteScreenshot();
		
		//captureScreenshot(driver);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		captureCompleteScreenshot();
		//captureScreenshot(driver);
	}

}
