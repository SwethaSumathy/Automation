package testngTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testngListeners.MyRetryAnalyzer;

public class FailedTestCases {
	
	@Test
	public void tc1()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void tc2()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void tc3()
	{
		Assert.assertTrue(false);
	}
	

}
