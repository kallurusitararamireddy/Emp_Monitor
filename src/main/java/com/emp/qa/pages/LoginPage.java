package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
@Listeners(ITestNGListener.class)

public class LoginPage  extends BasePage{
	
	Helpers helper=new Helpers();
	
	public LoginPage(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	
	
	//ELEMENTS ON LOGIN PAGE:
	@FindBy(css = "[name='amember_login']")
	WebElement input_username;

	@FindBy(css = ".am-row-login-pass [size]")
	WebElement input_password;
	
	

	@FindBy(css = ".am-login-form-form [type='submit']")
	WebElement Button_login;
	

	
	public void login(String un, String pwd) throws InterruptedException{
		
		
		helper.highLightElement(driver, input_username);
		input_username.sendKeys(un);
		Reporter.log("<B><font color = 'orange'>Username .</font></B> Entered User ID");		
		
		helper.highLightElement(driver, input_password);
		input_password.sendKeys(pwd);
		Reporter.log("<B><font color = 'orange'>Password .</font></B> Entered Password");
		
	
		
		
		
		helper.highLightElement(driver, Button_login);
		Button_login.click();		
		Reporter.log("<B><font color = 'orange'>Sign In Button .</font></B> Clicked on Submit Button");
		
		Thread.sleep(3000);
	
		}
	}	