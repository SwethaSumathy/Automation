package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTest.BaseClassTest;

public class LoginPage extends BaseClassTest {

	// By locators
	
	private static By uname = By.id("email");
	private static By pwd = By.id("pass");
	By login = By.name("login");
	By forgot_Pwd = By.linkText("Forgotten password?");

	// Actions or methods
	public boolean checkLink() {
		boolean status = driver.findElement(forgot_Pwd).isDisplayed();
		return status;
	}

	public void do_login() {

		com.enterValue(uname, "oranium");
		com.enterValue(pwd, "4343940");
		com.doClick(login);
		
	}
	
	public String checkTitle()
	{
		String title = com.fetchTitle();
		return title;
	}
	
	public String checkUrl()
	{
		String url = com.fetchUrl();
		return url;
	}

}
