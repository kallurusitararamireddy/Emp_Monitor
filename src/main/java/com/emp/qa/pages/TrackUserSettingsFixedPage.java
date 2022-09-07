package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class TrackUserSettingsFixedPage extends BasePage{
	public TrackUserSettingsFixedPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	Helpers helper=new Helpers();	
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[1]/i[1]")
	WebElement TrackuserSettings;
	
	@FindBy(xpath = "//select[@id='AppliedSetting']")
	WebElement SettingsAppliedTotheuser;
	
	@FindBy(xpath = "//input[@id='stealth']")
	WebElement Empmonitoriconhiden;
	
	@FindBy(xpath = "//input[@id='SS0']")
	WebElement ScreenShots_RadioButton_Disable;
	
	@FindBy(xpath = "//select[@id='SSFrequencySelected']")
	WebElement ScreenShotsFrequency;
	
	@FindBy(xpath = "//option[@id='12']")
	WebElement Twelveperhour;
	
	@FindBy(xpath = "//select[@id='videoQuality']")
	WebElement Videoquality_DropDown;
	
	@FindBy(xpath = "//option[@id='vid1080']")
	WebElement Medium;
	
	@FindBy(xpath = "//label[@for='autoUpdates_id'][contains(.,'Off')]")
	WebElement AgentAutomaticUpdate;
	
	@FindBy(xpath = "//select[@id='IdleTime']")
	WebElement idleTimeDropdown;
	
	@FindBy(xpath = "//option[@id='15']")
	WebElement Fifteenmins;
	
	@FindBy(xpath = "//input[@id='Scenario2']")
	WebElement Fixed;
	
	
	@FindBy(xpath = "//input[@id='FixedMonday']")
	WebElement Monday;
	
	@FindBy(xpath = "//input[@id='MONDAYstartTime']")
	WebElement ShiftStart;
	
	@FindBy(xpath = "//input[@id='MONDAYendTime']")
	WebElement Shiftend;
	
	@FindBy(xpath = "//input[@id='FixedTuesday']")
	WebElement 	Tuesday;
	
	@FindBy(xpath = "//input[@id='TUESDAYstartTime']")
	WebElement 	Tuesdaystart;
	
	@FindBy(xpath = "//input[@id='TUESDAYendTime']")
	WebElement 	Tuesdayend;
	
	@FindBy(xpath = "//input[@id='FixedWEDNESDAY']")
	WebElement Wednesday;
	
	@FindBy(xpath = "//input[@id='WEDNESDAYstartTime']")
	WebElement WednesdaystartTime;
	
	@FindBy(xpath = "//input[@id='WEDNESDAYendTime']")
	WebElement Wednesdayend;
	
	@FindBy(xpath = "//input[@id='FixedTHURSDAY']")
	WebElement Thursday;
	
	@FindBy(xpath = "//input[@id='THURSDAYstartTime']")
	WebElement Thursdaystart;
	
	@FindBy(xpath = "//input[@id='THURSDAYendTime']")
	WebElement Thursdayend;
	
	@FindBy(xpath = "//input[@id='FixedFRIDAY']")
	WebElement Friday;
	
	@FindBy(xpath = "//input[@id='FRIDAYstartTime']")
	WebElement Fridaystart;
	
	@FindBy(xpath = "//input[@id='FRIDAYendTime']")
	WebElement Fridayend;
	
	@FindBy(xpath = "//input[@id='FixedSATURDAY']")
	WebElement Saturday;
	
	@FindBy(xpath = "//input[@id='SATURDAYstartTime']")
	WebElement Saturdaystart;
	
	@FindBy(xpath = "//input[@id='SATURDAYendTime']")
	WebElement Saturdayend;
	
	@FindBy(xpath = "//input[@id='FixedSUNDAY']")
	WebElement Sunday;
	
	@FindBy(xpath = "//input[@id='SUNDAYstartTime']")
	WebElement Sundaystart;
	
	@FindBy(xpath = "//input[@id='SUNDAYendTime']")
	WebElement Sundayend;
	
	@FindBy(xpath = "//button[@id='SaveButton']")
	WebElement Save_Button;
	
	public  void TrackUserSettings() throws InterruptedException {
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(TrackuserSettings);
		helper.highLightElement(driver, TrackuserSettings);
		TrackuserSettings.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on TrackuserSettings");
		Assert.assertTrue(true, "Failed to click on TrackuserSettings");
		
		helper.waitFor(SettingsAppliedTotheuser);
		helper.highLightElement(driver, SettingsAppliedTotheuser);
		helper.Scrollintoview(SettingsAppliedTotheuser);
		helper.selectDropDownValue(SettingsAppliedTotheuser, "value", "3");
		SettingsAppliedTotheuser.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on SettingsAppliedTotheuser");
		Assert.assertTrue(true, "Failed to click on SettingsAppliedTotheuser");
		
		
		helper.waitFor(Empmonitoriconhiden);
		helper.highLightElement(driver, Empmonitoriconhiden);
		Empmonitoriconhiden.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on Stealth Button");
		Assert.assertTrue(true, "Failed to Select  Stealth Radio Button");
		Thread.sleep(5000);
		
		helper.waitFor(ScreenShots_RadioButton_Disable);
		helper.highLightElement(driver, ScreenShots_RadioButton_Disable);
		ScreenShots_RadioButton_Disable.click();
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on Screen shot RadioButton");
		Assert.assertTrue(true, "Failed to Seletect  ScreeShots Radio Button");
		Thread.sleep(6000);
		
		
		helper.waitFor(ScreenShotsFrequency);
		helper.highLightElement(driver, ScreenShotsFrequency);
		helper.Scrollintoview(ScreenShotsFrequency);
		//helper.selectDropDownValue(ScreenShotsFrequency, "value", "3");
		ScreenShotsFrequency.click();
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on Screenshot Frequency DropDown");
		Assert.assertTrue(true, "Failed to Select  Screenshot Frequency DropDown");
	
		
		
		helper.waitFor(Twelveperhour);
		helper.highLightElement(driver, Twelveperhour);
		Twelveperhour.click();
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Twelveperhour");
		Assert.assertTrue(true, "Failed to click on Twelveperhour DropDown");
		
		helper.waitFor(Videoquality_DropDown);
		helper.highLightElement(driver, Videoquality_DropDown);
		helper.Scrollintoview(Videoquality_DropDown);
		//helper.selectDropDownValue(ScreenShotsFrequency, "value", "1280");
		Videoquality_DropDown.click();
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> clicked on Videoquality_DropDown");
		Assert.assertTrue(true, "Failed to Select  Videoquality_DropDown");
		
		helper.waitFor(Medium);
		helper.highLightElement(driver, Medium);
		Medium.click();
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> Selected 1080xMediumQuality");
		Assert.assertTrue(true, "Failed to Select 1080xMediumQuality");
		
		
		helper.waitFor(AgentAutomaticUpdate);
		helper.highLightElement(driver, AgentAutomaticUpdate);
		AgentAutomaticUpdate.click();
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> Enabled  AgentAutomaticUpdate");
		Assert.assertTrue(true, "Failed to Enable  AgentAutomaticUpdate");
		
		
		helper.waitFor(idleTimeDropdown);
		helper.highLightElement(driver, idleTimeDropdown);
		idleTimeDropdown.click();
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> Selected idleTimeDropdown");
		Assert.assertTrue(true, "Failed to Select idleTimeDropdown");
	
		
		helper.waitFor(Fifteenmins);
		helper.highLightElement(driver, Fifteenmins);
		Fifteenmins.click();
		Reporter.log("<B><font color = 'blue'>Step23.</font></B> Selected Fifteenmins");
		Assert.assertTrue(true, "Failed to Select Fifteenmins");
		
		helper.waitFor( Fixed);
		helper.highLightElement(driver,  Fixed);
		Fixed.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Fixed");
		Assert.assertTrue(true, "Failed to Select  Fixed");
		
		helper.waitFor( Monday);
		helper.highLightElement(driver,  Monday);
		Monday.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Monday");
		Assert.assertTrue(true, "Failed to Select  Monday");
		
		
		
		helper.waitFor( ShiftStart);
		helper.highLightElement(driver,  ShiftStart);
		ShiftStart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  ShiftStart");
		Assert.assertTrue(true, "Failed to Select  ShiftStart");
		
		helper.waitFor( Shiftend);
		helper.highLightElement(driver,  Shiftend);
		Shiftend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step25.</font></B> Selected  Shiftend");
		Assert.assertTrue(true, "Failed to Select  Shiftend");
		
		helper.waitFor( Tuesday);
		helper.highLightElement(driver,  Tuesday);
		Tuesday.click();
		Reporter.log("<B><font color = 'blue'>Step26.</font></B> Selected  Tuesday");
		Assert.assertTrue(true, "Failed to Select  Tuesday");
		
		helper.waitFor(Tuesdaystart);
		helper.highLightElement(driver,  Tuesdaystart);
		Tuesdaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected  Tuesdaystart");
		Assert.assertTrue(true, "Failed to Select  Tuesdaystart");
		
		helper.waitFor( Tuesdayend);
		helper.highLightElement(driver,  Tuesdayend);
		Tuesdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Tuesdayend");
		Assert.assertTrue(true, "Failed to Select  Tuesdayend");
		
		helper.waitFor( Wednesday);
		helper.highLightElement(driver,  Wednesday);
		Wednesday.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Wednesday");
		Assert.assertTrue(true, "Failed to Select  Wednesday");
		
		helper.waitFor( WednesdaystartTime);
		helper.highLightElement(driver,  WednesdaystartTime);
		WednesdaystartTime.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  WednesdaystartTime");
		Assert.assertTrue(true, "Failed to Select  WednesdaystartTime");
		
		helper.waitFor( Wednesdayend);
		helper.highLightElement(driver, Wednesdayend);
		Wednesdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Wednesdayend");
		Assert.assertTrue(true, "Failed to Select  Wednesdayend");
		
		helper.waitFor(Thursday);
		helper.highLightElement(driver,  Thursday);
		Thursday.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Fixed");
		Assert.assertTrue(true, "Failed to Select  Fixed");
		
		helper.waitFor( Thursdaystart);
		helper.highLightElement(driver,  Thursdaystart);
		Thursdaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Thursdaystart");
		Assert.assertTrue(true, "Failed to Select  Thursdaystart");
		
		helper.waitFor( Thursdayend);
		helper.highLightElement(driver,  Thursdayend);
		Thursdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Thursdayend");
		Assert.assertTrue(true, "Failed to Select  Thursdayend");
		
		helper.waitFor( Friday);
		helper.highLightElement(driver,  Friday);
		Friday.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Friday");
		Assert.assertTrue(true, "Failed to Select  Friday");
		
		helper.waitFor( Fridaystart);
		helper.highLightElement(driver,  Fridaystart);
		Fridaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Fridaystart");
		Assert.assertTrue(true, "Failed to Select  Fridaystart");
		
		helper.waitFor( Fridayend);
		helper.highLightElement(driver,  Fridayend);
		Fridayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Fridayend ");
		Assert.assertTrue(true, "Failed to Select  Fridayend");
		
		helper.waitFor( Saturday);
		helper.highLightElement(driver,  Saturday);
		Saturday.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Saturday");
		Assert.assertTrue(true, "Failed to Select  Saturday");
		
		helper.waitFor(Saturdaystart );
		helper.highLightElement(driver,  Saturdaystart);
		Saturdaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Saturdaystart");
		Assert.assertTrue(true, "Failed to Select  Saturdaystart");
		
		helper.waitFor(Saturdayend);
		helper.highLightElement(driver,  Saturdayend);
		Saturdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Selected  Saturdayend");
		Assert.assertTrue(true, "Failed to Select  Saturdayend");
		

		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.Scrollintoview(Save_Button);
		Thread.sleep(3000);
		helper.jsCLick(Save_Button);
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step25.</font></B> Cliked on SaveButton");
		Assert.assertTrue(true, "Failed to Click on Save_Button");
		
	
}
}

