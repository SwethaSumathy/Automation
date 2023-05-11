package com.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import baseTest.BaseClassTest;

public class LoginTest extends BaseClassTest {
	 
	@Test(priority=0)
	public void checkForgotPwd_linkExist() {
		
		boolean status = fblogin.checkLink();
		Assert.assertTrue(status);
	}

	@Test(priority=3)
	public void login() {
		fblogin.do_login();

	}
	
	@Test(priority=1)
	public void checkFbTitle()
	{
		String actualtitle = fblogin.checkTitle();
		Assert.assertEquals(actualtitle, "Facebook - Log In or Sign Up");
	}
	
	@Test(priority=2)
	public void checkFbUrl()
	{
		String actualurl = fblogin.checkUrl();
		Assert.assertEquals(actualurl, "https://www.facebook.com/");
	}

}
