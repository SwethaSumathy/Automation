package excelReader;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDemo extends Init {
	
	
	@Test(dataProviderClass=ExcelRead.class, dataProvider="fetchData")
	public void fbCheck(String uname, String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}

}
