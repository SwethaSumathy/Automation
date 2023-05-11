import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDrop {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		
		WebElement hameed = driver.findElement(By.id("superheros"));
		
		Select multi = new Select(hameed);
		
		List<WebElement> s = multi.getOptions();
		s.forEach(a->System.out.println(a.getText()));
		
		
		
		
		
		
		
	}

}
