package testngTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.MyRetryAnalyzer;

public class Test1 {

	
	@Test
	public void method1()
	{
		Assert.assertEquals(10, 100);
	}
	
	
	@Test
	public void method2()
	{
		Assert.assertTrue(true);
	}
}
