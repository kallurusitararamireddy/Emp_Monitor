package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.emp.qa.base.TestBase;

public class BasePage {
	
	protected WebDriver driver;
	
	protected BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}