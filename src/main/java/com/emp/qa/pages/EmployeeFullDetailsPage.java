package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class EmployeeFullDetailsPage extends BasePage {

	public EmployeeFullDetailsPage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}
	Helpers helper=new Helpers();	
	
		
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	@FindBy(xpath = "//a[@id='fn24756']")
	@CacheLookup
	WebElement AutomationCode;
	
	
	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity;
	
	
	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets_Btn;
	
	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement Screenshots;
	
	@FindBy(xpath = "//a[@id='ScreenRecordingTab']")
	@CacheLookup
	WebElement ScreenRecorder;
	
	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement Webhistory;
	
	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement AppHistory;
	
	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement Keystrokes;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/a[8]")
	@CacheLookup
	WebElement Analysis;
	
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
	
	@FindBy(xpath = "//button[@id='SaveButton']")
	WebElement Save_Button;
	
	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[3]/i[1]")
	WebElement EmployeeAssigned;
	
	@FindBy(xpath = "//select[@id='CompletRoles1']")
	WebElement SelectRole;
	
	@FindBy(xpath = "//select[@id='CompletRoles1']//option[@id='340']")
	WebElement ABCDEFHKK;
	
	@FindBy(xpath = "//select[@id='AppendManagerList']")
	WebElement SelectEmployee;
	
	
	@FindBy(xpath = "//li[@id='select2-AppendManagerList-result-s02g-24614']")
	WebElement TestBulk;
	
	@FindBy(xpath = "//button[@id='AssignButton']")
	WebElement Assign_Button;
	
	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[@id='upgrade']/i[1]")
	WebElement UpdateTheRole;
	
	
	@FindBy(xpath = "//select[@id='AllRolesAppend']")
	WebElement WhichRole;
	
	@FindBy(xpath = "//button[@id='UpgradeHide']")
	WebElement Yes_Button;
	
	
	public  void EmployeeFullDetails() throws InterruptedException {
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "2");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clickedonShowEntries");
		Assert.assertTrue(true, "Failed to clickedonShowEntries");
		
		
		helper.waitFor(AutomationCode);
		helper.highLightElement(driver, AutomationCode);
		AutomationCode.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on AutomationCode");
		Assert.assertTrue(true, "Failed to click on AutomationCode");
		
		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		productivity.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on productivity Button");
		Assert.assertTrue(true, "Failed to click on productivity Button");
		
		helper.waitFor(Timesheets_Btn);
		helper.highLightElement(driver, Timesheets_Btn);
		Timesheets_Btn.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Timesheets_Btn");
		Assert.assertTrue(true, "Failed to clicke onTimesheets_Btn");
		
		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Screenshots.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Screenshots Button");
		Assert.assertTrue(true, "Failed to clicke on Screenshots Button");
		
		helper.waitFor(ScreenRecorder);
		helper.highLightElement(driver, ScreenRecorder);
		ScreenRecorder.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on ScreenRecorder Button");
		Assert.assertTrue(true, "Failed to clicke on ScreenRecorder Button");
		
		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Webhistory.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Web History Button");
		Assert.assertTrue(true, "Failed to clicke on Web History Button");
		
		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		AppHistory.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on AppHistory Button");
		Assert.assertTrue(true, "Failed to click on AppHistory Button");
		
		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Keystrokes.click();
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> click on Keystrokes Button");
		Assert.assertTrue(true, "Failed to click on Keystrokes Button");
		
		helper.waitFor(Analysis);
		helper.highLightElement(driver, Analysis);
		Analysis.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Analysis Button");
		Assert.assertTrue(true, "Failed to click on Analysis Button");
		driver.navigate().back();
		
		
//		helper.waitFor(Scroller);
//		helper.highLightElement(driver,Scroller);
//		helper.Scrollintoview(Scroller);
//		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Scroller");
//		Assert.assertTrue(true, "Failed to click on Scroller");
//		
//		
//		helper.waitFor(TrackuserSettings);
//		helper.highLightElement(driver, TrackuserSettings);
//		TrackuserSettings.click();
//		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on TrackuserSettings");
//		Assert.assertTrue(true, "Failed to click on TrackuserSettings");
//		
//		helper.waitFor(SettingsAppliedTotheuser);
//		helper.highLightElement(driver, SettingsAppliedTotheuser);
//		helper.Scrollintoview(SettingsAppliedTotheuser);
//		helper.selectDropDownValue(SettingsAppliedTotheuser, "value", "1");
//		SettingsAppliedTotheuser.click();
//		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on SettingsAppliedTotheuser");
//		Assert.assertTrue(true, "Failed to click on SettingsAppliedTotheuser");
//		
//		
//		helper.waitFor(Empmonitoriconhiden);
//		helper.highLightElement(driver, Empmonitoriconhiden);
//		Empmonitoriconhiden.click();
//		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on Stealth Button");
//		Assert.assertTrue(true, "Failed to Select  Stealth Radio Button");
//		Thread.sleep(5000);
//		
//		helper.waitFor(ScreenShots_RadioButton_Disable);
//		helper.highLightElement(driver, ScreenShots_RadioButton_Disable);
//		ScreenShots_RadioButton_Disable.click();
//		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on Screen shot RadioButton");
//		Assert.assertTrue(true, "Failed to Seletect  ScreeShots Radio Button");
//		Thread.sleep(6000);
//		
//		
//		helper.waitFor(ScreenShotsFrequency);
//		helper.highLightElement(driver, ScreenShotsFrequency);
//		helper.Scrollintoview(ScreenShotsFrequency);
//		//helper.selectDropDownValue(ScreenShotsFrequency, "value", "3");
//		ScreenShotsFrequency.click();
//		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on Screenshot Frequency DropDown");
//		Assert.assertTrue(true, "Failed to Select  Screenshot Frequency DropDown");
//	
//		
//		
//		helper.waitFor(Twelveperhour);
//		helper.highLightElement(driver, Twelveperhour);
//		Twelveperhour.click();
//		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Twelveperhour");
//		Assert.assertTrue(true, "Failed to click on Twelveperhour DropDown");
//		
//		helper.waitFor(Videoquality_DropDown);
//		helper.highLightElement(driver, Videoquality_DropDown);
//		helper.Scrollintoview(Videoquality_DropDown);
//		//helper.selectDropDownValue(ScreenShotsFrequency, "value", "1280");
//		Videoquality_DropDown.click();
//		Reporter.log("<B><font color = 'blue'>Step19.</font></B> clicked on Videoquality_DropDown");
//		Assert.assertTrue(true, "Failed to Select  Videoquality_DropDown");
//		
//		helper.waitFor(Medium);
//		helper.highLightElement(driver, Medium);
//		Medium.click();
//		Reporter.log("<B><font color = 'blue'>Step20.</font></B> Selected 1080xMediumQuality");
//		Assert.assertTrue(true, "Failed to Select 1080xMediumQuality");
//		
//		
//		helper.waitFor(AgentAutomaticUpdate);
//		helper.highLightElement(driver, AgentAutomaticUpdate);
//		AgentAutomaticUpdate.click();
//		Reporter.log("<B><font color = 'blue'>Step21.</font></B> Enabled  AgentAutomaticUpdate");
//		Assert.assertTrue(true, "Failed to Enable  AgentAutomaticUpdate");
//		
//		
//		helper.waitFor(idleTimeDropdown);
//		helper.highLightElement(driver, idleTimeDropdown);
//		idleTimeDropdown.click();
//		Reporter.log("<B><font color = 'blue'>Step22.</font></B> Selected idleTimeDropdown");
//		Assert.assertTrue(true, "Failed to Select idleTimeDropdown");
//	
//		
//		helper.waitFor(Fifteenmins);
//		helper.highLightElement(driver, Fifteenmins);
//		Fifteenmins.click();
//		Reporter.log("<B><font color = 'blue'>Step23.</font></B> Selected Fifteenmins");
//		Assert.assertTrue(true, "Failed to Select Fifteenmins");
//		
//		helper.waitFor(Save_Button);
//		helper.highLightElement(driver, Save_Button);
//		helper.Scrollintoview(Save_Button);
//		Thread.sleep(3000);
//		Save_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Cliked on SaveButton");
//		Assert.assertTrue(true, "Failed to Click on Save_Button");
//		driver.navigate().back();
//		
//		
//		//helper.Scrollintoview(Scroller);
//		helper.waitFor(EmployeeAssigned);
//		helper.highLightElement(driver, EmployeeAssigned);
//		helper.Scrollintoview(EmployeeAssigned);
//		EmployeeAssigned.click();
//		Reporter.log("<B><font color = 'blue'>Step25.</font></B> Selected EmployeeAssigned");
//		Assert.assertTrue(true, "Failed to Select EmployeeAssigned");
//	
//	
//		helper.waitFor(SelectRole);
//		helper.highLightElement(driver, SelectRole);
//		helper.Scrollintoview(SelectRole);
//		Reporter.log("<B><font color = 'blue'>Step26.</font></B> Selected EmployeeAssigned");
//		Assert.assertTrue(true, "Failed to Select EmployeeAssigned");
//		
//		
//		helper.waitFor(ABCDEFHKK);
//		helper.highLightElement(driver, ABCDEFHKK);
//		ABCDEFHKK.click();
//		Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected ABCDEFHKK");
//		Assert.assertTrue(true, "Failed to Select ABCDEFHKK");
//		
//		helper.waitFor(SelectEmployee);
//		helper.highLightElement(driver, SelectEmployee);
//		helper.selectDropDownValue(SelectEmployee, "value", "24614");
//		//SelectEmployee.click();
//		Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected SelectEmployee");
//		Assert.assertTrue(true, "Failed to Select SelectEmployee");
//		
//
////		helper.waitFor(TestBulk);
////		helper.highLightElement(driver,TestBulk);
////		TestBulk.click();
////		Reporter.log("<B><font color = 'blue'>Step28.</font></B> Selected TestBulk");
////		Assert.assertTrue(true, "Failed to Select TestBulk");
//		
//		helper.waitFor(Assign_Button);
//		helper.highLightElement(driver,Assign_Button);
//		helper.Scrollintoview(Assign_Button);
//        helper.jsCLick(Assign_Button);	
//		Reporter.log("<B><font color = 'blue'>Step28.</font></B> Clicked on Assign_Button");
//		Assert.assertTrue(true, "Failed to Click Assign_Button");
////		
////		helper.Scrollintoview(Scroller);
////		helper.waitFor(UpdateTheRole);
////		helper.highLightElement(driver,UpdateTheRole);
////	    helper.jsCLick(UpdateTheRole);
////		Reporter.log("<B><font color = 'blue'>Step29.</font></B> Selected UpdateTheRole");
////		Assert.assertTrue(true, "Failed to Select UpdateTheRole");
////		
////
////		helper.waitFor(WhichRole);
////		helper.highLightElement(driver, WhichRole);
////		helper.jsCLick(WhichRole);
////		helper.selectDropDownValue(WhichRole, "value", "230");
////		Reporter.log("<B><font color = 'blue'>Step30.</font></B> Updated the role");
////		Assert.assertTrue(true, "Failed to Update the role");
////		
////		
////		helper.waitFor(Yes_Button);
////		helper.highLightElement(driver, Yes_Button);
////		helper.jsCLick(Yes_Button);
////		Reporter.log("<B><font color = 'blue'>Step31.</font></B> Updated the role");
////		Assert.assertTrue(true, "Failed to Update the role");
////	
//	
	

		
		
		
		
		
		
		
	}

}
