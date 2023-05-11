package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class OrangeLoginTest extends BaseClassTest {

	
   @Test(priority=0)
   public void login() throws InterruptedException
   {
	  o.doLogin();
	  Thread.sleep(5000);
	  
	 
   }
	
	
	
	
}
