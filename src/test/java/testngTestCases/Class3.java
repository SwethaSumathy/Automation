package testngTestCases;

import org.testng.annotations.Test;

public class Class3 {

	
	@Test(groups="sanity")
	public void m3()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 3");
	}
	
	@Test(groups= {"Regression", "sanity"})
	public void m4()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 4 ");
	}
}
