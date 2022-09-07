package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class CreateShiftPage extends BasePage{

	public CreateShiftPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}

Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Shift Management')]")
	@CacheLookup
	WebElement ShiftManagemet;
	
	@FindBy(xpath = "//a[contains(text(),'Create Shift')]")
	@CacheLookup
	WebElement CreateShift;
	
	@FindBy(xpath = "//input[@id='shiftname']")
	@CacheLookup
	WebElement ShiftName;
	
	
	
	@FindBy(xpath = "//input[@id='lateLogin']")
	@CacheLookup
	WebElement LateLogin;
	
	@FindBy(xpath = "//input[@id='earlyLoginAndLogout']")
	@CacheLookup
	WebElement EarlyLogin;
	
	@FindBy(xpath = "//input[@id='red']")
	@CacheLookup
	WebElement Selectcolor_RadioButton;
	
	@FindBy(xpath = "//input[@id='mon']")
	@CacheLookup
	WebElement mon_checkBox;
	
	@FindBy(xpath = "//input[@id='monStart']")
	@CacheLookup
	WebElement Monday_StartTime;
	
	@FindBy(xpath = "//input[@id='monEnd']")
	@CacheLookup
	WebElement Monday_EndTime;
	
	@FindBy(xpath = "//button[@id='save']")
	@CacheLookup
	WebElement Save_Button;
	
	@FindBy(xpath = "//button[contains(text(),'Apply to all')]")
	@CacheLookup
	WebElement Applytoall;
	
	
	public void CreateShiftPage()throws InterruptedException{
		
		helper.waitFor(ShiftManagemet);		
		helper.highLightElement(driver, ShiftManagemet);
		ShiftManagemet.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on ShiftManagemet");
		Assert.assertTrue(true, "Failed To Select ShiftManagemet");
		
		
		helper.waitFor(CreateShift);		
		helper.highLightElement(driver, CreateShift);
		CreateShift.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on CreateShift");
		Assert.assertTrue(true, "Failed To Select CreateShift");
		
		helper.waitFor(ShiftName);		
		helper.highLightElement(driver, ShiftName);
		ShiftName.sendKeys("AutomationCode");
		ShiftName.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on ShiftName");
		Assert.assertTrue(true, "Failed To Select ShiftName");
		
		helper.waitFor(LateLogin);		
		helper.highLightElement(driver, LateLogin);
		LateLogin.sendKeys("00");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on LateLogin");
		Assert.assertTrue(true, "Failed To Select LateLogin");
		
		
		helper.waitFor(EarlyLogin);		
		helper.highLightElement(driver,EarlyLogin);
		EarlyLogin.sendKeys("00");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on EarlyLogin");
		Assert.assertTrue(true, "Failed To Select EarlyLogin");
		
		helper.waitFor(Selectcolor_RadioButton);		
		helper.highLightElement(driver,Selectcolor_RadioButton);
		Selectcolor_RadioButton.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Selectcolor_RadioButton");
		Assert.assertTrue(true, "Failed To Selectcolor_RadioButton");
		
		
		helper.waitFor(mon_checkBox);		
		helper.highLightElement(driver,mon_checkBox);
		//EarlyLogin.sendKeys("09-50");
		mon_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on mon_checkBox");
		Assert.assertTrue(true, "Failed To Select mon_checkBox");
		
		helper.waitFor(Monday_StartTime);		
		helper.highLightElement(driver,Monday_StartTime);
		Monday_StartTime.sendKeys("10-00");
		Monday_StartTime.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Monday_StartTime");
		Assert.assertTrue(true, "Failed To Select LateLogin");
		
		helper.waitFor(Monday_EndTime);		
		helper.highLightElement(driver,Monday_EndTime);
		Monday_EndTime.sendKeys("07-00");
		Monday_EndTime.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Monday_EndTime");
		Assert.assertTrue(true, "Failed To Select Monday_EndTime");
		
		
		helper.waitFor(Applytoall);		
		helper.highLightElement(driver,Applytoall);
		Applytoall.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Applytoall");
		Assert.assertTrue(true, "Failed To Select Applytoall");
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		Save_Button.click();
		Thread.sleep(9000);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Select Save_Button");
		
	}


	
		
	}
	

