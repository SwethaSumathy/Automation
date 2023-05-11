package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HelperBrokenLink {
	
	public  static int brokenLinkChecker(String str)
	{
		int count=0;
		int rcount=0;
		
		try {
			HttpURLConnection httpurl=null;
			URL url= new URL(str);
			
			httpurl=(HttpURLConnection)url.openConnection();
			
			httpurl.connect();
			
			int statuscode = httpurl.getResponseCode();
			
			
			if(statuscode>=400)
			{
				System.out.println("Given link is broken link: " +str);
				count++;
			}
			
			else
			{
				System.out.println("Given link is valid link: " +str);
				rcount++;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r;
	
		

		


		
		
	}

}
