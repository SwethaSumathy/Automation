package handlingBrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HelperBrokenlinkCheck {
	
	
	public static int brokenLinkChecker(String str) {
		int count=0;
		try {
			HttpURLConnection httpurl=null;

			URL url = new URL(str);
			
			httpurl=(HttpURLConnection)url.openConnection();
			
			httpurl.connect();
			
			int statuscode= httpurl.getResponseCode();
			
			if(statuscode>=400)
			{
				System.out.println("Given link is a broken link: " +str);
				count++;    //1
			}
			else
			{
				System.out.println("Given link is a valid link: " +str);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(ClassCastException e)
		{
			System.out.println("handled ");
		}
	
		
		
		
		return count;
		
		
		
	}

}
