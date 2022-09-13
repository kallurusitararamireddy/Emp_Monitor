package com.emp.qa.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
@Listeners(ITestNGListener.class)
public class ShiftManagementPage extends BasePage{
	
	public  ShiftManagementPage(WebDriver driver) {
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
	
	
	public void ShiftManagementPage()throws InterruptedException{
		
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
		
		Random r=new Random();
		int num=r.nextInt(100);
		String act_sn="AutomationCode";
		String exp_sn=act_sn+num;
		
		helper.waitFor(ShiftName);		
		helper.highLightElement(driver, ShiftName);
		ShiftName.sendKeys(exp_sn);
		ShiftName.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on ShiftName");
		Assert.assertTrue(true, "Failed To Select ShiftName");
		
		helper.waitFor(LateLogin);		
		helper.highLightElement(driver, LateLogin);
		LateLogin.sendKeys("10-05");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on LateLogin");
		Assert.assertTrue(true, "Failed To Select LateLogin");
		
		
		helper.waitFor(EarlyLogin);		
		helper.highLightElement(driver,EarlyLogin);
		EarlyLogin.sendKeys("09-50");
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
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		helper.Scrollintoview(Save_Button);
		helper.jsCLick(Save_Button);
		Thread.sleep(8000);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Select Save_Button");
		Thread.sleep(80000);
		
	}
}

