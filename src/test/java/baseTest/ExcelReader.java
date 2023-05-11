package baseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	
	@DataProvider               // supply the data to your test case 
	public String [][]  getData() throws EncryptedDocumentException, IOException
	{
		
		String excelsheetname="Login";
		File f = new File(System.getProperty("user.dir") +"\\src\\test\\resources\\TestData\\9AMTestData.xlsx");
	   
		// Step1:
		FileInputStream fis = new FileInputStream(f);  // Reading the file 
		
		
		//Step 2 :
	  Workbook wb = WorkbookFactory.create(fis);
	  
	  //Step 3:
	 Sheet sheetname = wb.getSheet(excelsheetname);
	  
	  // Step4:To find rows and columns 
	  
	  int rows = sheetname.getPhysicalNumberOfRows();   
	   
	  System.out.println("Number of rows:" +rows);   //4
	  
	 int columns = sheetname.getRow(0).getPhysicalNumberOfCells();
	 
	 System.out.println("Number of columns:" + columns );   //2
	 
	 
	 // Step 5 
	 
	 DataFormatter format = new DataFormatter();
	 
	 String[][] testdata= new String[rows][columns];   //4  2 
	
	 for(int row =1; row<rows; row++)   //1
	 {
		 for(int col=0; col<columns;col++)  //0 
		 {
		testdata[row-1][col]=format.formatCellValue(sheetname.getRow(row).getCell(col));
		
		System.out.println(testdata[row-1][col]);
		 }
	 }
	 
	 return testdata;
	 
	  
	  
		
		
	
	}

}
