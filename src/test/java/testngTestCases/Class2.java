package testngTestCases;

import org.testng.annotations.Test;

public class Class2 {

	
	@Test(groups="smoke")
	public void m2()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 2 ");
	}
	
	@Test (groups= {"Regression","sanity"})
	public void m7()
	{
		System.out.println("Method 7");
	}
}
