package testngTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attributes {

	@Test(priority=-2, description="Test case for login functionality" )
	public void login ()
	{
		System.out.println("Login functionality check ");
		Assert.assertTrue(false);     //hard assertion 
		
	}
	
	
	@Test(priority=-1,dependsOnMethods="login",alwaysRun=true)
	public void homepage()
	{
		System.out.println("Home page check ");
	}
	
	
	@Test(priority=0, invocationCount=3, invocationTimeOut=5000)
	public void productpage() throws InterruptedException
	{
		Thread.sleep(2100);
		System.out.println("Product check ");
	}
	
	
	@Test(priority=1, description= "Test case for addtocart page ",enabled=false)
	public void addToCart()
	{
		System.out.println("Add to cart check ");
	}
	
	
	@Test (priority=2, expectedExceptions=Exception.class)
	public void test()
	{
		int x=100;
		System.out.println(x/0);
	}
}
