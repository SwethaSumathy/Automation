package com.pages;

import org.openqa.selenium.By;

import baseTest.BaseClassTest;

public class OrangeLogin extends BaseClassTest {
	
	//Locators 
	By uname = By.name("username");
	By pwd = By.name("password");
	By loginbtn =By.xpath("//button[@type='submit']");
	
	//Actions 
	
	public void doLogin() throws InterruptedException
	{
		com.enterValue(uname,"Admin");
		com.enterValue(pwd,"admin123");
		com.doClick(loginbtn);
		
		
		
	}

}
