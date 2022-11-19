package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class TrackUserSettingsPage extends BasePage {

	public TrackUserSettingsPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();	
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//*[@id=\"act25499\"]/a[1]/i")
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
	
	public  void TrackUserSettings() throws InterruptedException {
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected  Employee_Details Sub-Module ");
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Scroller view ");
		Assert.assertTrue(true, "Failed to click on Scroller view ");
		
		helper.waitFor(TrackuserSettings);
		helper.highLightElement(driver, TrackuserSettings);
		TrackuserSettings.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on Track_user_Settings field ");
		Assert.assertTrue(true, "Failed to click on Track_user_Settings field");
		
		helper.waitFor(SettingsAppliedTotheuser);
		helper.highLightElement(driver, SettingsAppliedTotheuser);
		helper.Scrollintoview(SettingsAppliedTotheuser);
		helper.selectDropDownValue(SettingsAppliedTotheuser, "value", "3");
		SettingsAppliedTotheuser.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on Settings_Applied_To_the_user Drop-down and Selcted Any Value ");
		Assert.assertTrue(true, "Failed to click on Settings_Applied_To_the_user Drop-down and Selcted Any Value");
		
		
		helper.waitFor(Empmonitoriconhiden);
		helper.highLightElement(driver, Empmonitoriconhiden);
		Empmonitoriconhiden.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on Stealth Button");
		Assert.assertTrue(true, "Failed to Select  Stealth Radio Button");
		Thread.sleep(5000);
		
		helper.waitFor(ScreenShots_RadioButton_Disable);
		helper.highLightElement(driver, ScreenShots_RadioButton_Disable);
		ScreenShots_RadioButton_Disable.click();
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on Screen-shot Radio Button");
		Assert.assertTrue(true, "Failed to click on   Scree-Shots Radio Button");
		Thread.sleep(6000);
		
		
		helper.waitFor(ScreenShotsFrequency);
		helper.highLightElement(driver, ScreenShotsFrequency);
		helper.Scrollintoview(ScreenShotsFrequency);
		//helper.selectDropDownValue(ScreenShotsFrequency, "value", "3");
		ScreenShotsFrequency.click();
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on Screenshot Frequency Drop-down");
		Assert.assertTrue(true, "Failed to click on Screenshot Frequency Drop-down");
	
		
		
		helper.waitFor(Twelveperhour);
		helper.highLightElement(driver, Twelveperhour);
		Twelveperhour.click();
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Twelveper-hour option");
		Assert.assertTrue(true, "Failed to click on Twelveperhour option");
		
		helper.waitFor(Videoquality_DropDown);
		helper.highLightElement(driver, Videoquality_DropDown);
		helper.Scrollintoview(Videoquality_DropDown);
		//helper.selectDropDownValue(ScreenShotsFrequency, "value", "1280");
		Videoquality_DropDown.click();
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> clicked on Video-Quality Drop-down");
		Assert.assertTrue(true, "Failed to Select  Video-Quality Drop-down");
		
		helper.waitFor(Medium);
		helper.highLightElement(driver, Medium);
		Medium.click();
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> Selected 1080xMediumQuality");
		Assert.assertTrue(true, "Failed to Select 1080xMediumQuality");
		
		
		helper.waitFor(AgentAutomaticUpdate);
		helper.highLightElement(driver, AgentAutomaticUpdate);
		AgentAutomaticUpdate.click();
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> clicked on Enabled  Agent_Automatic_Update");
		Assert.assertTrue(true, "Failed to click on  Enable  Agent_Automatic_Update");
		
		
		helper.waitFor(idleTimeDropdown);
		helper.highLightElement(driver, idleTimeDropdown);
		idleTimeDropdown.click();
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> clicked on idle-Time Drop-down");
		Assert.assertTrue(true, "Failed to click on  idle-Time Drop-down");
	
		
		helper.waitFor(Fifteenmins);
		helper.highLightElement(driver, Fifteenmins);
		Fifteenmins.click();
		Reporter.log("<B><font color = 'blue'>Step23.</font></B> clicked on  Fifteen-mins");
		Assert.assertTrue(true, "Failed to click on  Fifteen-mins");
		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.Scrollintoview(Save_Button);
		Thread.sleep(3000);
		Save_Button.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> Cliked on Save Button");
		Assert.assertTrue(true, "Failed to Click on Save Button");
		
		

}
}

