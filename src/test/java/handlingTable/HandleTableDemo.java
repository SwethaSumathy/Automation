package handlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.HelperClass;

public class HandleTableDemo {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// To find the number of rows 
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int rows = allrows.size();
		
		System.out.println(rows);   //7  
		
		// To find the number of columns 
		
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		int columns = allcolumns.size();
		
		System.out.println(columns );   // 4 
		
		// 1 . Read all the data present in a web table 
		
		for (int row =2; row<=rows; row++)     // row =3    row <=7
		{
			for(int col=1; col<=columns;col++ )   //col=5    col<=4
			{
				String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ row +"]/td["+ col +"]")).getText();
				System.out.print(text +   "   ");
			}
			System.out.println();
		}
		
		
		// 2. Read datas based on specific condition , when the author is Amod , fetch the respective book name 
		
		for (int row =2; row<=rows;row++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ row +"]/td[2]")).getText();
			if(author.equals("Amod"))
			{
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ row +"]/td[1]")).getText();
				
				System.out.println("When author is Amod, Our respective book  name is :" +bookname);
			}
			
		}
		
		//Get all the prices and add it together 
		List<WebElement> allprices = driver.findElements(By.xpath("//table[@name='BookTable']//td[4]"));
		
		
		int sum=0;
		
		int count=0;
		
		for(WebElement prices:allprices)
		{
			String price = prices.getText();
            System.out.println(price);
			
			//Convert the string to integer 
			int intprice = Integer.parseInt(price);    //300
			
			
			sum+= intprice; //  sum= 800+ 300     sum=1100
			
			
			count++;    //
			
			
		}
		
		
		System.out.println("Number of iterations in total: " +count);
		
		System.out.println("Sum of all the prices:" +sum);
		
		
		
		
		
		
		
		
		
	}

}
