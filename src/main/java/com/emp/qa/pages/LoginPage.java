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
	@FindBy(css = "[name='username']")
	
	WebElement input_username;

	@FindBy(xpath  = "//input[@id='password']")
	WebElement input_password;
	
	
	@FindBy(css  = "#isNewClientLogin")
	WebElement  Client_check_Box;
	
	

	@FindBy(css = "#loginButtonDiv")
	WebElement Button_login;
	

	
	public void login(String un, String pwd) throws InterruptedException{
		
		
		helper.highLightElement(driver, input_username);
		input_username.sendKeys(un);
		Reporter.log("<B><font color = 'orange'>Username .</font></B> Entered User ID");		
		
		helper.highLightElement(driver, input_password);
		input_password.sendKeys(pwd);
		Reporter.log("<B><font color = 'orange'>Password .</font></B> Entered Password");
		
		
		
		helper.highLightElement(driver, Client_check_Box);
		helper.move_to_element_click_target(Client_check_Box)	;	
		Reporter.log("<B><font color = 'orange'>Client_check_Box .</font></B> Clicked on Client_check_Box");
		
	
		
		helper.highLightElement(driver, Button_login);
		Button_login.click();		
		Reporter.log("<B><font color = 'orange'>Sign In Button .</font></B> Clicked on Submit Button");
		
		Thread.sleep(3000);
	
		}
	}	