package com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class OrangeHomePage extends BaseClassTest{
	
	By dashboard = By.xpath("//h6[text()='Dashboard']");
	
	
	public String  verifyDashboard()
	{
		String text = driver.findElement(dashboard).getText();
		return text;
	}
	
	

}
