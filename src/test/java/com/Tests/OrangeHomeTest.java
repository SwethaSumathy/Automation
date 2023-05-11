package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class OrangeHomeTest extends BaseClassTest {
	
	
	@Test(priority=1)
	public void  checkDashboard()
	{
		String actualtext = h.verifyDashboard();
		Assert.assertEquals(actualtext, "Dashboard");
	}

}
