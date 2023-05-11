package baseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	
	@Test
	public void test1()
	{
		Assert.assertTrue(false);   // condition fails 
		
		System.out.println("Next lines of code after assertion ");
		
		
	}
	
	@Test
	public void tc2()
	{
		SoftAssert s = new SoftAssert();
		s.assertEquals(10, 11);
		
		System.out.println("Next lines of code after assertion ");
		s.assertAll();
	}

}
