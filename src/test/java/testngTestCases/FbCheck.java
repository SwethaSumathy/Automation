package testngTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class FbCheck extends BaseClassTest {
	
	
	@Test
	public void fbTitle()
	{
		String actualtitle = driver.getTitle();
		String expectedtitle= "Facebook – log in or sign up";
		Assert.assertEquals(actualtitle,expectedtitle);
	}
	
	@Test
	public void fbUrl()
	{
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/";
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, expectedurl);
	}

}
