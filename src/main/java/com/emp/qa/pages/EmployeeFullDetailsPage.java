package com.emp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class EmployeeFullDetailsPage extends BasePage {

	public EmployeeFullDetailsPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	@FindBy(xpath = "//*[@id=\"fn25486\"]")
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

	public void EmployeeFullDetails() throws InterruptedException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected  Employee-Details Sub-Module");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "2");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Show-Entries Drop-down and Selected Any Value");
		Assert.assertTrue(true, "Failed to click on Show-Entries Drop-down and Selected Any Value");

		Thread.sleep(5000);
		 
		helper.waitFor(AutomationCode);
		helper.highLightElement(driver, AutomationCode);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fn25486\"]"))).click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Any Employee");
		Assert.assertTrue(true, "Failed to click on Any Employee");

		Thread.sleep(3000);
		
		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ProductivityTab']"))).click();
		productivity.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on productivity Button");
		Assert.assertTrue(true, "Failed to click on productivity Button");

		helper.waitFor(Timesheets_Btn);
		helper.highLightElement(driver, Timesheets_Btn);
		Timesheets_Btn.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Timesheets_Btn");
		Assert.assertTrue(true, "Failed to click onTimesheets_Btn");

		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Screenshots.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Screenshots Button");
		Assert.assertTrue(true, "Failed to clicke on Screenshots Button");

		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Webhistory.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Web History Button");
		Assert.assertTrue(true, "Failed to click on Web History Button");

		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		AppHistory.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on App-History Button");
		Assert.assertTrue(true, "Failed to click on App-History Button");

		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Keystrokes.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> click on Keystrokes Button");
		Assert.assertTrue(true, "Failed to click on Keystrokes Button");
        Thread.sleep(9000);
		

	}

}
