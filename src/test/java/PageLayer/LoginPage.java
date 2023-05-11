package PageLayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	// using By locators
//	WebElement user = driver.findElement(By.id("email"));
//	user.sendKeys("oranium@gmail.com");
//	WebElement pass = driver.findElement(By.id("pass"));
//	pass.sendKeys("pass123");
	//By locators
//	By user =By.id("email");
//	
//	By pass =By.id("pass");
	@FindBy(id="email")
	WebElement user;
																																																																																																		@FindBy(id="pass")
	WebElement pass;
	public void loginDetails(String uname, String pwd)
	{
		user.sendKeys(uname);
		pass.sendKeys(pwd);
//		driver.findElement(user).sendKeys(uname);
//		driver.findElement(pass).sendKeys(pwd);
		
	}
}
