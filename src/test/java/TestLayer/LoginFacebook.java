package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageLayer.BaseClassImplementation;
import PageLayer.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFacebook extends BaseClassImplementation {
	@Test	
	public void loginFacebook()
	{
		LoginPage l = new LoginPage(driver);
		l.loginDetails("Oranium@gmail.com", "Pass@123");
	}
	
}
