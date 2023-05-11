package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOrderOfAnnotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		
	System.out.println("Before Suite");	
	}
	@BeforeTest
	public void beforeTest()
	{
	System.out.println("Before Test");	
		
	}
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("before Class");
	}
	
	@BeforeMethod

	public void beforeMethod()
	{
		System.out.println("before method");
		
	}
	@Test
	public void testCaseOne()
	{
		
	System.out.println("Test Case One");	
	}
	@Test
	public void testCaseTwo()
	{
		System.out.println("Test Case Two");
		
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
		
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");

	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
		
	}
}

