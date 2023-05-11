package baseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {

	WebDriver driver;
	@Test(dataProvider = "getData")
	public void loginFacebook(String uname, String pwd)
	{

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);

		WebElement pass = driver.findElement(By.id("pass"));

		pass.sendKeys(pwd);

	}
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, IOException
	{

		File f = new File("C:\\Users\\91807\\eclipse-workspace\\NewDemo\\Automation9AM\\TestData\\ExcelRead.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("login");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int columns = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columns);
		DataFormatter data = new DataFormatter();
		String[][] s = new String[rows][columns];
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<columns;col++)
			{

				s[row][col]	=data.formatCellValue(sheet.getRow(row).getCell(col));

				System.out.println(s[row][col]);
			}
		}
		return s;
	}
}
