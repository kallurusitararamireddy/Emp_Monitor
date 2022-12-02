package com.emp.qa.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class CreateShiftPage extends BasePage {

	public CreateShiftPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

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

	@FindBy(xpath = "//*[@id='monStart']")
	@CacheLookup
	WebElement Monday_StartTime;

	@FindBy(xpath = "//*[@id='monEnd']")
	@CacheLookup
	WebElement Monday_EndTime;
	
	@FindBy(xpath = "//button[contains(text(),'Apply to all')]")
	@CacheLookup
	WebElement Applytoall;

	@FindBy(xpath = "//button[@id='save']")
	@CacheLookup
	WebElement Save_Button;



	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	@CacheLookup
	WebElement Done_Save;

	public void CreateShiftPage() throws InterruptedException {

		helper.waitFor(ShiftManagemet);		
		helper.highLightElement(driver, ShiftManagemet);
		ShiftManagemet.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings and Selected Shift Managemet Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings and Selected Shift Managemet Sub-Module");
		
		
		helper.waitFor(CreateShift);		 
		helper.highLightElement(driver, CreateShift);
		CreateShift.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Create Shift Button");
		Assert.assertTrue(true, "Failed To Click on  Create Shift Button");
		
		Random r=new Random();
		int num=r.nextInt(1000);
		String actual_name="AutomationCode";
		String expected_name=actual_name+num;
		helper.waitFor(ShiftName);		
		helper.highLightElement(driver, ShiftName);
		ShiftName.click();
		ShiftName.sendKeys(expected_name);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Shift-Name Text Field and Entered Shift Name ");
		Assert.assertTrue(true, "Failed To Select Shift-Name Text Field and Entered Shift Name");
		

		
		helper.waitFor(Selectcolor_RadioButton);		
		helper.highLightElement(driver,Selectcolor_RadioButton);
		Selectcolor_RadioButton.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on color Radio Button");
		Assert.assertTrue(true, "Failed To Click on  color_Radio Button");
		
		
		helper.waitFor(mon_checkBox);		
		helper.highLightElement(driver,mon_checkBox);
		mon_checkBox.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on monday check-Box");
		Assert.assertTrue(true, "Failed To Select monday check-Box");
		
		helper.waitFor(Monday_StartTime);		
		helper.highLightElement(driver,Monday_StartTime);
		Monday_StartTime.sendKeys("10-00");
		Monday_StartTime.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Monday Start-Time and Entered Time ");
		Assert.assertTrue(true, "Failed To Click on Monday Start-Time and Entered Time");
		
		helper.waitFor(Monday_EndTime);		
		helper.highLightElement(driver,Monday_EndTime);
		Monday_EndTime.sendKeys("07-00");
		Monday_EndTime.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Monday End-Time and Entered Time ");
		Assert.assertTrue(true, "Failed To Click on Monday End-Time and Entered Time");
		
		
		helper.waitFor(Applytoall);		
		helper.highLightElement(driver,Applytoall);
		Applytoall.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Apply-to-all Button ");
		Assert.assertTrue(true, "Failed To Select Apply-to-all Button ");
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		Save_Button.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Select Save_Button");
		
		
		helper.waitFor(Done_Save);		
		helper.highLightElement(driver,Done_Save);
		Done_Save.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Done_save");
		Assert.assertTrue(true, "Failed To Select Done_save");
		

	}

}
