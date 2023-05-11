package testngTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	
	@Test
	public void l ()
	{
		//Assert.assertTrue(false);
		Assert.assertEquals(11, 10);     //hard assert 
		System.out.println("After hard assertion .. ");
	}
	
	
	@Test
	public void h()
	{
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		
		System.out.println("After soft assertion ");
		s.assertAll();
	}

	
	
}
