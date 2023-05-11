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
public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("C:\\Users\\91807\\eclipse-workspace\\NewDemo\\Automation9AM\\TestData\\ExcelRead.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("login");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cols);
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				Cell cell = sheet.getRow(row).getCell(col);
				DataFormatter d = new DataFormatter();
				String value = d.formatCellValue(cell);
				System.out.println(value);
			}
		}
	}
}