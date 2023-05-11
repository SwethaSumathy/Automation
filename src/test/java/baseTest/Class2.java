package baseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {

	
	@Test
	public void tc3()
	{
	
		System.out.println("Test case method 3");
		Assert.assertEquals(10, 11);
	}
	
	
	@Test(dependsOnMethods="tc3")
	public void tc4()
	{
		
		System.out.println("Test case method 4");
	}
	
	
	
}
