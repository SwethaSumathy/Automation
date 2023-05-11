package testngTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.MyRetryAnalyzer;

public class Test2 {

	@Test
	public void method3()
	{
		Assert.assertEquals(10, 10);
	}
	
	
	@Test
	public void method4()
	{
		Assert.assertTrue(false);
	}
}
