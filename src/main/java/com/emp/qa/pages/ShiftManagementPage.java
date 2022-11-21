package com.emp.qa.pages;

import java.util.Random;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//*[@id='monStart']")
	@CacheLookup
	WebElement LateLogin;
	
	@FindBy(xpath = "//*[@id='monEnd']")
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
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	@CacheLookup
	WebElement OK_Button;
	
	
	public void ShiftManagementPage()throws InterruptedException{
		
		helper.waitFor(ShiftManagemet);		
		helper.highLightElement(driver, ShiftManagemet);
		ShiftManagemet.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Settings Module and Selected  Shift-Managemet Sub-Module ");
		Assert.assertTrue(true, "Failed To  click on Settings Module and Selected  Shift-Managemet Sub-Module");
		
		
		helper.waitFor(CreateShift);		
		helper.highLightElement(driver, CreateShift);
		CreateShift.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Create-Shift Button ");
		Assert.assertTrue(true, "Failed To click on Create-Shift Button");
		
		Random r=new Random();
		int num=r.nextInt(100);
		String act_sn="AutomationCode";
		String exp_sn=act_sn+num;
		
		helper.waitFor(ShiftName);		
		helper.highLightElement(driver, ShiftName);
		ShiftName.sendKeys(exp_sn);
		ShiftName.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Shift-Name Text field and Entered Shift Name ");
		Assert.assertTrue(true, "Failed To click on Shift-Name Text field and Entered Shift Name ");
		
		helper.waitFor(LateLogin);		
		helper.highLightElement(driver, LateLogin);
		LateLogin.sendKeys("10-05");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Late-Login Time Set");
		Assert.assertTrue(true, "Failed To click on  Late-Login Time Set");
		
		
		helper.waitFor(EarlyLogin);		
		helper.highLightElement(driver,EarlyLogin);
		EarlyLogin.sendKeys("09-50");
		LateLogin.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Early-Login Time Set ");
		Assert.assertTrue(true, "Failed To click on  Early-Login Time Set");
		
		
		helper.waitFor(Selectcolor_RadioButton);		
		helper.highLightElement(driver,Selectcolor_RadioButton);
		Selectcolor_RadioButton.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Select-color Radio Button");
		Assert.assertTrue(true, "Failed To click on  Select-color Radio Button");
		
		
		helper.waitFor(mon_checkBox);		
		helper.highLightElement(driver,mon_checkBox);
//		EarlyLogin.sendKeys("09-50");
		mon_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on monday check Box option");
		Assert.assertTrue(true, "Failed To click on  monday check Box option ");
		
		helper.waitFor(Monday_StartTime);		
		helper.highLightElement(driver,Monday_StartTime);
//		Monday_StartTime.sendKeys("10-00");
		Monday_StartTime.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Monday Start-Time");
		Assert.assertTrue(true, "Failed To click on Monday Start-Time");
		
		helper.waitFor(Monday_EndTime);		
		helper.highLightElement(driver,Monday_EndTime);
		Monday_EndTime.sendKeys("07-00");
		Monday_EndTime.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Monday End-Time");
		Assert.assertTrue(true, "Failed To click on Monday End-Time");
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		helper.Scrollintoview(Save_Button);
		helper.jsCLick(Save_Button);
		Thread.sleep(3000);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Save Button");
		Assert.assertTrue(true, "Failed To click on  Save Button");
		Thread.sleep(2000);
		
		helper.waitFor(OK_Button);		
		helper.highLightElement(driver,OK_Button);
		OK_Button.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on ok_button");
		Assert.assertTrue(true, "Failed To click on ok_button");
		
		
	}
}

