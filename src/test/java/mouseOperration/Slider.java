package mouseOperration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo.HelperClass;

public class Slider {
	public static void main(String[] args) {
	   WebDriver driver = HelperClass.browserSetup("chrome");
	   driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	   driver.manage().window().maximize();
	   
	   
	   WebElement minSlider = driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
	   WebElement maxSlider = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
	   
	   // Actions
	   
	   Actions act = new Actions(driver);
	   
	   Point location = minSlider.getLocation();      
	   
	   System.out.println(location);     // (59, 250)  
	   
	   Point location2 = maxSlider.getLocation();
	   
	   System.out.println(location2);     // (510, 250)
	   
	   act.dragAndDropBy(minSlider, 100, 250).perform();
	   
	   act.dragAndDropBy(maxSlider, -200, 250).perform();
	   
	   
	}

}
