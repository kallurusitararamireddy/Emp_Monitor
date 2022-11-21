package com.emp.qa.pages;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class TrackingUserSettingsPage extends BasePage {

	public TrackingUserSettingsPage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//button[@id='add_btn']")
	@CacheLookup
	WebElement RegisterEmployee;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement Firstname;

	@FindBy(xpath = "//input[@id='f_name']")
	@CacheLookup
	WebElement Lastname;

	@FindBy(xpath = "//input[@id='emp_email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@id='c_passwd']")
	@CacheLookup
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id='telephone']")
	@CacheLookup
	WebElement Mobilenumber;

	@FindBy(xpath = "//input[contains(@name,'empCode')]")
	@CacheLookup
	WebElement Employeecode;

	@FindBy(xpath = "//select[@id='locations-addEmp']")
	@CacheLookup
	WebElement Location;

//	@FindBy(xpath = "//select[@id='role-addEmp']")
	@FindBy(xpath = "//*[@id=\"emp-register\"]/div[1]/div/div[9]/div/span[1]/span[1]/span/ul")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath= "//li[@class='select2-selection__choice'][contains(.,'×Software Tester')]")
	@CacheLookup
	WebElement SoftwareTester;

	@FindBy(xpath= "//select[@id='EmpReg_departments']")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//input[@id='date_joinCalender']")
	@CacheLookup
	WebElement Dateofjoining;

	@FindBy(xpath = "//select[@id='timeZoneAppend']")
	@CacheLookup
	WebElement Timezone;
	
	@FindBy(xpath = "//select[@id='timeZoneAppend']//option[@id='tz-opt-32']")
	@CacheLookup
	WebElement AsiaKolkata;

	@FindBy(xpath = "//select[@id='Shiftfilteradd']")
	@CacheLookup
	WebElement selectshift;

	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = "//button[@id='empReg']")
	@CacheLookup
	WebElement Register;

	@FindBy(xpath = "//li[@id='select2-role-addEmp-result-8oh9-81']")
	WebElement SoftwareDev;
	
	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller;
	
	
    /*
     *  Must be Change id number     
     */
	
	@FindBy(xpath = "//*[@id='act25502']/a[1]/i")
	@CacheLookup
	WebElement Trackusersettings;
	
	
	
	
	
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

	
	public void TrackingUserSettingsPage() throws InterruptedException, AWTException {
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Slected Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to clicked on Employee Module and Slected Employee-Details Sub-Module");

		helper.waitFor(RegisterEmployee);
		helper.highLightElement(driver, RegisterEmployee);
		RegisterEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Register-Employee Button");
		Assert.assertTrue(true, "Failed to click on Register-Employee Button");

		helper.waitFor(Firstname);
		helper.highLightElement(driver, Firstname);
		Firstname.sendKeys("Auto");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on First-Name Text Field and Entered First Name ");
		Assert.assertTrue(true, "Failed to click on First-Name Text Field and Entered First Name ");

		helper.waitFor(Lastname);
		helper.highLightElement(driver, Lastname);
		Lastname.sendKeys("Code");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Last-Name Text Field and Entered Last Name");
		Assert.assertTrue(true, "Failed to click on Last-Name Text Field and Entered Last Name");

		helper.waitFor(email);
		helper.highLightElement(driver, email);
		email.sendKeys("abcdefgh@gmail.com");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on E-mail Text Field and Entered E-mail");
		Assert.assertTrue(true, "Failed to click on E-mail Text Field and Entered E-mail");

		helper.waitFor(password);
		helper.highLightElement(driver, password);
		password.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Password Text Field and Entered Password");
		Assert.assertTrue(true, "Failed to click on Password Text Field and Entered Password");

		helper.waitFor(confirmpassword);
		helper.highLightElement(driver, confirmpassword);
		confirmpassword.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on confirm_Password Text Field and Entered confirm_Password");
		Assert.assertTrue(true, "Failed to click on confirm_Password Text Field and Entered confirm_Password");

		helper.waitFor(Mobilenumber);
		helper.highLightElement(driver, Mobilenumber);
		Mobilenumber.sendKeys("9876543210");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Mobile_number Text Field and Entered Mobile_number");
		Assert.assertTrue(true, "Failed to click on Mobile_number Text Field and Entered Mobile_number");

		helper.waitFor(Employeecode);
		helper.highLightElement(driver, Employeecode);
		Employeecode.sendKeys("CODE-123");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on Employee_Code Text Field and Entered Employee_Code");
		Assert.assertTrue(true, "Failed to clicked on Employee_Code Text Field and Entered Employee_Code");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Location Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to click on Location Drop-down and Selected Any Location");
		
		

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		helper.jsCLick(Role); 
		helper.move_to_element(Role);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Role Drop-down and Selected Any Role ");
		Assert.assertTrue(true, "Failed to click  on Role Drop-down and Selected Any Role");
		
		

		
		helper.waitFor(Department);
		Department.click();
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "Testing");
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Department Drop-down and Selected Any Departement");
		Assert.assertTrue(true, "Failed to click  on Department Drop-down and Selected Any Departement");
		
	

		helper.waitFor(Dateofjoining);
		helper.highLightElement(driver, Dateofjoining);
		Dateofjoining.sendKeys("01-03-2021");
		Dateofjoining.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on Calendar Drop-down and Entered Date-of-joining");
		Assert.assertTrue(true, "Failed to click on Calendar Drop-down and Entered Date-of-joining");
		

		helper.waitFor(Timezone);
		helper.highLightElement(driver, Timezone);
		Timezone.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on Time_zone Drop-down and Selected Any Time_Zone");
		Assert.assertTrue(true, "Failed to click on Time_zone Drop-down and Selected Any Time_Zone");
		
		
		helper.waitFor(AsiaKolkata);
		helper.highLightElement(driver, AsiaKolkata);
		AsiaKolkata.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on AsiaKolkata");
		Assert.assertTrue(true, "Failed to click on  AsiaKolkata");

		

		helper.waitFor(selectshift);
		helper.highLightElement(driver, selectshift);
		helper.selectDropDownValue(selectshift, "value", "475");
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on select_shift Drop-down and Selected Shift");
		Assert.assertTrue(true, "Failed to click on select_shift Drop-down and Selected Shift");

		helper.waitFor(Address);
		helper.highLightElement(driver, Address);
		Address.sendKeys("Hno:123,Banglore");
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on Address Text Field and Entered Data");
		Assert.assertTrue(true, "Failed to click on Address Text Field and Entered Data");

		
		helper.waitFor(Register);
		helper.highLightElement(driver, Register);
		helper.Scrollintoview(Register);
		helper.jsCLick(Register);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Register Button");
		Assert.assertTrue(true, "Failed to click on Register Button");
		Thread.sleep(7000);
		driver.navigate().refresh();
		
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> clicked on Scroller View");
		Assert.assertTrue(true, "Failed to click on Scroller View");
		
		helper.waitFor(Trackusersettings);
		helper.highLightElement(driver,Trackusersettings);
		helper.Scrollintoview(Trackusersettings);
		helper.jsCLick(Trackusersettings);
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> clicked on Track_user_settings field");
		Assert.assertTrue(true, "Failed to click on Track_user_settings field");
        
		
		
		helper.waitFor(SettingsAppliedTotheuser);
		helper.highLightElement(driver, SettingsAppliedTotheuser);
		helper.Scrollintoview(SettingsAppliedTotheuser);
		helper.selectDropDownValue(SettingsAppliedTotheuser, "value", "3");
		SettingsAppliedTotheuser.click();
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> clicked on Settings_Applied_To_the_user Drop-down and Selected Value");
		Assert.assertTrue(true, "Failed to click on Settings_Applied_To_the_user Drop-down and Selected Value");
		
		
		helper.waitFor(Empmonitoriconhiden);
		helper.highLightElement(driver, Empmonitoriconhiden);
		Empmonitoriconhiden.click();
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> clicked on Stealth Radio Button");
		Assert.assertTrue(true, "Failed to click on  Stealth Radio Button");
		Thread.sleep(5000);
		
		helper.waitFor(ScreenShots_RadioButton_Disable);
		helper.highLightElement(driver, ScreenShots_RadioButton_Disable);
		ScreenShots_RadioButton_Disable.click();
		Reporter.log("<B><font color = 'blue'>Step23.</font></B> clicked on Screenshots Radio Button");
		Assert.assertTrue(true, "Failed to clcik on  ScreeShots Radio Button");
		Thread.sleep(6000);
		
		
		helper.waitFor(ScreenShotsFrequency);
		helper.highLightElement(driver, ScreenShotsFrequency);
		helper.Scrollintoview(ScreenShotsFrequency);
		helper.selectDropDownValue(ScreenShotsFrequency, "value", "3");
		ScreenShotsFrequency.click();
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> clicked on Screenshot Frequency Drop-down and Selected Any value ");
		Assert.assertTrue(true, "Failed to click on Screenshot Frequency Drop-down and Selected Any value");
	
		
		
		helper.waitFor(Twelveperhour);
		helper.highLightElement(driver, Twelveperhour);
		Twelveperhour.click();
		Reporter.log("<B><font color = 'blue'>Step25.</font></B> clicked on Time Drop-down");
		Assert.assertTrue(true, "Failed to click on Time  DropDown");
		
		helper.waitFor(Videoquality_DropDown);
		helper.highLightElement(driver, Videoquality_DropDown);
		helper.Scrollintoview(Videoquality_DropDown);
		helper.selectDropDownValue(ScreenShotsFrequency, "value", "1280");
		Videoquality_DropDown.click();
		Reporter.log("<B><font color = 'blue'>Step26.</font></B> clicked on Video-quality Drop-down and Selected Any Value ");
		Assert.assertTrue(true, "Failed to click on Video-quality Drop-down and Selected Any Value");
		
		helper.waitFor(Medium);
		helper.highLightElement(driver, Medium);
		Medium.click();
		Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected 1080xMediumQuality");
		Assert.assertTrue(true, "Failed to Select 1080xMediumQuality");
		
		
		helper.waitFor(AgentAutomaticUpdate);
		helper.highLightElement(driver, AgentAutomaticUpdate);
		AgentAutomaticUpdate.click();
		Reporter.log("<B><font color = 'blue'>Step28.</font></B> clicked on  Enabled  AgentAutomaticUpdate");
		Assert.assertTrue(true, "Failed to click on Enable  AgentAutomaticUpdate");
		
		
		helper.waitFor(idleTimeDropdown);
		helper.highLightElement(driver, idleTimeDropdown);
		idleTimeDropdown.click();
		Reporter.log("<B><font color = 'blue'>Step29.</font></B> clciked on  idle-Time Drop-down");
		Assert.assertTrue(true, "Failed to click on idle-Time  Drop-down");
	
		
		helper.waitFor(Fifteenmins);
		helper.highLightElement(driver, Fifteenmins);
		Fifteenmins.click();
		Reporter.log("<B><font color = 'blue'>Step30.</font></B> Selected Fifteen-mins");
		Assert.assertTrue(true, "Failed to clcick on  Fifteen-mins");
		
		helper.waitFor( Fixed);
		helper.highLightElement(driver,  Fixed);
		Fixed.click();
		Reporter.log("<B><font color = 'blue'>Step31.</font></B> clciked on  Fixed");
		Assert.assertTrue(true, "Failed to click on Fixed");
		
		helper.waitFor( Monday);
		helper.highLightElement(driver,  Monday);
		Monday.click();
		Reporter.log("<B><font color = 'blue'>Step32.</font></B> Selected  Monday");
		Assert.assertTrue(true, "Failed to Select  Monday");
		
		
		
		helper.waitFor( ShiftStart);
		helper.highLightElement(driver,  ShiftStart);
		ShiftStart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step33.</font></B> clciked on  Shift-Start Text field and Entered Value ");
		Assert.assertTrue(true, "Failed to clcik on  Shift-Start Text field and Entered Value");
		
		helper.waitFor( Shiftend);
		helper.highLightElement(driver,  Shiftend);
		Shiftend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step34.</font></B> clciked on  Shift-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Shift-End Text field and Entered Value");
		
		helper.waitFor( Tuesday);
		helper.highLightElement(driver,  Tuesday);
		Tuesday.click();
		Reporter.log("<B><font color = 'blue'>Step35.</font></B> Selected  Tuesday");
		Assert.assertTrue(true, "Failed to Select  Tuesday");
		
		helper.waitFor(Tuesdaystart);
		helper.highLightElement(driver,  Tuesdaystart);
		Tuesdaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step36.</font></B> clciked on  Tuesday-start Text field and Entered Value  ");
		Assert.assertTrue(true, "Failed to clcik on  Tuesday-start Text field and Entered Value");
		
		helper.waitFor( Tuesdayend);
		helper.highLightElement(driver,  Tuesdayend);
		Tuesdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step37.</font></B> clciked on  Tuesday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Tuesday-End Text field and Entered Value");
		
		helper.waitFor( Wednesday);
		helper.highLightElement(driver,  Wednesday);
		Wednesday.click();
		Reporter.log("<B><font color = 'blue'>Step38.</font></B> Selected  Wednesday ");
		Assert.assertTrue(true, "Failed to Select  Wednesday");
		
		helper.waitFor( WednesdaystartTime);
		helper.highLightElement(driver,  WednesdaystartTime);
		WednesdaystartTime.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step39.</font></B>  clciked on  Wednesday-Start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Wednesday-Start Text field and Entered Value");
		
		helper.waitFor( Wednesdayend);
		helper.highLightElement(driver, Wednesdayend);
		Wednesdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step40.</font></B> clciked on  Wednesday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Wednesday-End Text field and Entered Value");
		
		helper.waitFor(Thursday);
		helper.highLightElement(driver,  Thursday);
		Thursday.click();
		Reporter.log("<B><font color = 'blue'>Step41.</font></B> Selected  Thursday");
		Assert.assertTrue(true, "Failed to Select  Thursday");
		
		helper.waitFor( Thursdaystart);
		helper.highLightElement(driver,  Thursdaystart);
		Thursdaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step42.</font></B> clciked on  Thursday-start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clcik on  Thursday-start Text field and Entered Value");
		
		helper.waitFor( Thursdayend);
		helper.highLightElement(driver,  Thursdayend);
		Thursdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step43.</font></B> clciked on  Thursday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clciked on  Thursday-End Text field and Entered Value");
		
		helper.waitFor( Friday);
		helper.highLightElement(driver,  Friday);
		Friday.click();
		Reporter.log("<B><font color = 'blue'>Step44.</font></B> Selected  Friday");
		Assert.assertTrue(true, "Failed to Select  Friday");
		
		helper.waitFor( Fridaystart);
		helper.highLightElement(driver,  Fridaystart);
		Fridaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step45.</font></B> clciked on  Friday-Start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to click  on  Friday-Start Text field and Entered Value ");
		
		helper.waitFor( Fridayend);
		helper.highLightElement(driver,  Fridayend);
		Fridayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step46.</font></B> clciked on  Friday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clciked on  Friday-End Text field and Entered Value");
		
		helper.waitFor( Saturday);
		helper.highLightElement(driver,  Saturday);
		Saturday.click();
		Reporter.log("<B><font color = 'blue'>Step47.</font></B> Selected  Saturday");
		Assert.assertTrue(true, "Failed to Select  Saturday");
		
		helper.waitFor(Saturdaystart );
		helper.highLightElement(driver,  Saturdaystart);
		Saturdaystart.sendKeys("1000");
		Reporter.log("<B><font color = 'blue'>Step48.</font></B> clciked on  Saturday-Start Text field and Entered Value");
		Assert.assertTrue(true, "Failed to clciked on  Saturday-Start Text field and Entered Value");
		
		helper.waitFor(Saturdayend);
		helper.highLightElement(driver,  Saturdayend);
		Saturdayend.sendKeys("0700");
		Reporter.log("<B><font color = 'blue'>Step49.</font></B> clciked on  Saturday-End Text field and Entered Value");
		Assert.assertTrue(true, "Failed to   clcik on  Saturday-End Text field and Entered Value");
		

		
		helper.waitFor(Save_Button);
		helper.highLightElement(driver, Save_Button);
		helper.Scrollintoview(Save_Button);
		Thread.sleep(3000);
		helper.jsCLick(Save_Button);
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step50.</font></B> Cliked on SaveButton");
		Assert.assertTrue(true, "Failed to Click on Save_Button");
		

	}

}
