package handlingBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBrokenLinks {
	
	public static void main(String[] args) {
		
		int count=0;
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestinghelp.com/free-online-software-testing-qa-training-course/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

		String url = it.next().getAttribute("href");

		System.out.println(url);

		
      try {
		HttpURLConnection huc=null;
			URL u=new URL(url);
			huc = (HttpURLConnection)u.openConnection();

//			huc.setRequestMethod("HEAD");

			huc.connect();

			int respCode = huc.getResponseCode();

			if(respCode >= 400){
			count=count+1;
			System.out.println(url+" is a broken link");
			count++;
			}
			else{
			System.out.println(url+" is a valid link");
			}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
		
		System.out.println("Number of broken links: " +count);
	}
	
}


		


		
		
		
		
		
	