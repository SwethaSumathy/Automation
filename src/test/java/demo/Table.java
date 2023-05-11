package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// To get all the rows 
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int noofRows = allrows.size();
		System.out.println(noofRows);  //7
		
        //To get all the columns 
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		int noofColumns = allcolumns.size();
		System.out.println(noofColumns);
		
		// Read all datas 
		
//		for (int row =2;row<=noofRows;row++)
//		{
//			for(int col=1;col<=noofColumns;col++)
//			{
//				String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row +"]/td[" +col+"]")).getText();
//				
//				System.out.print(text  + "   " );
//			}
//			System.out.println();
//		
//		}
		
		
		// Read the book name when author is Amod 
		
		for (int row=2;row<noofRows;row++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" +row+ "]/td[2]")).getText();
			
			if(author.equals("Amod"))
			{
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]/td[1]")).getText();
				
				System.out.println(bookname);
			}
		}
		
		//Using count function 
		
//		int count=1;
//		
//		for(WebElement row:allrows)
//		{
//			
//			  List<WebElement> datas = row.findElements(By.tagName("td"));
//
//				if(count>2)
//				{
//			  if(datas.get(1).getText().equals("Mukesh"))
//			  {
//				  System.out.println(datas.get(0).getText());
//			  }
//			}
//			  count++;
//		}
		List<WebElement> prices = driver.findElements(By.xpath("//table[@name='BookTable']//td[4]"));
		int sum=0;
		int count=0;
		for(WebElement price:prices)
		{
			String bookprice = price.getText();
			int intprice = Integer.parseInt(bookprice);
			
			sum+=intprice;
			count++;
		}
		System.out.println("Number of counts inside for loop :" +count);
		System.out.println("Sum of all the prices:" +sum);
		driver.close();
	}
}
