package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HelperBrokenLinkChecker {
	
	public static int brokenLinkChecker(String u) 
	{
		int count=0;
		
		try {
			HttpURLConnection httpurl = null ; 
			
			URL url = new URL(u);
			
			httpurl=(HttpURLConnection)url.openConnection();
			
			httpurl.connect();
			int statuscode = httpurl.getResponseCode();
			
			
			if(statuscode>=400)
			{
				System.out.println("Given link is broken :" +u);
				count++;
			}
			else
			{
				System.out.println("Given link is valid link: " +u);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	


}
