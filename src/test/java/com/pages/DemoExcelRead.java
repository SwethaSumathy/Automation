package com.pages;

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

public class DemoExcelRead {
	
	
	@Test(dataProvider = "getData")
	public void loginFb(String uname, String pwd)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
	}

	
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, IOException
	{
		
		File f = new File("C:\\Users\\91807\\eclipse-workspace\\NewDemo\\Automation9AM\\Excel\\DemoExcelRead.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("login");
		
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cols);
		DataFormatter d = new DataFormatter();
		String data[][]=new String[rows][cols];
		for(int row=1;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				data[row-1][col] = d.formatCellValue(sheet.getRow(row).getCell(col));
				System.out.println(data[row-1][col]);
				
			}
		}
		return data;
	}
}
