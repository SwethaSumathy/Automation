package property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class PropertyDemo {
	
	
	
	public static void main(String[] args) throws IOException {
		File f = new File(System.getProperty("user.dir") +"\\src\\test\\resources\\configuration\\configuration.properties");
	    
		FileReader fis= new FileReader(f);
		
	   Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("testUrl"));
	}
	
	
}
