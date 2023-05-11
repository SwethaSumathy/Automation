package baseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	
	
	@Test
	public void tc1()
	{
		
		
		System.out.println("Test case method 1");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void tc2()
	{
		
		System.out.println("Test case method 2");
		
		Assert.assertTrue(true);
	}
	
	
	

}
