package com.emp.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

@Listeners(ITestNGListener.class)
public class EmployeeAttendanePage extends BasePage {

	public EmployeeAttendanePage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Employee-Attendance')]")
	@CacheLookup
	WebElement EmployeeAttendance;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Showentries;

	@FindBy(xpath = "//input[@id='EmployeedateOfjoin']")
	@CacheLookup
	WebElement Monthyear;

	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//select[@id='DepartementData']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement Select_list;

	@FindBy(xpath = "//button[@id='DownloadButton']")
	@CacheLookup
	WebElement ExportExcel;


	@FindBy(xpath = "//*[@id='AttendanceListData']/tr[3]/td[1]/a")
	@CacheLookup
	WebElement Employeename;

	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement productivity;

	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheets;

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

	public void EmployeeAttendance() throws InterruptedException, IOException {

		helper.waitFor(EmployeeAttendance);
		helper.highLightElement(driver, EmployeeAttendance);
		EmployeeAttendance.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected  EmployeeAttendance Sub-Module");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected  EmployeeAttendance Sub-Module");

		helper.highLightElement(driver, Showentries);
		helper.selectDropDownValue(Showentries, "index", "4"); 
		Showentries.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Show-Entries DropDown and Selected Number");
		Assert.assertTrue(true, "Failed to click on Show-Entries DropDown and Selected Number");

		helper.waitFor(Monthyear);
		helper.highLightElement(driver, Monthyear);
		Monthyear.clear();
		Monthyear.sendKeys("05-2021");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Month-year DropDown and Selected Date");
		Assert.assertTrue(true, "Failed to send data to Monthyear");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "null");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location_DropDown and Select Any Location ");
		Assert.assertTrue(true, "Failed click on Location_DropDown and Select Any Location ");

		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "id", "null");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Department_DropDown ");
		Assert.assertTrue(true, "Failed to click on Department_DropDown");
		
		helper.waitFor(Select_list);
		helper.highLightElement(driver, Select_list);
		helper.selectDropDownValue(Department, "id", "null");
		Select_list.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Select_list Option (Check Box) ");
		Assert.assertTrue(true, "Failed to click on Select_list   Option (Check Box) ");
		

		helper.waitFor(ExportExcel);
		helper.highLightElement(driver, ExportExcel);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='DownloadButton']"))).click();

		ExportExcel.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Export Excel_Button");
		Assert.assertTrue(true, "Failed to click on Export Excel_Button");
		Thread.sleep(7000);
		
		
		

		/*
		 *  Select Employee
		 */
		
		helper.waitFor(Employeename);
		helper.highLightElement(driver, Employeename);
		Employeename.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> click on Employeename");
		Assert.assertTrue(true, "Failed to click on Employeename");

		helper.waitFor(productivity);
		helper.highLightElement(driver, productivity);
		productivity.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on productivity_Button");
		Assert.assertTrue(true, "Failed to click on productivity_Button");

		helper.waitFor(Timesheets);
		helper.highLightElement(driver, Timesheets);
		Timesheets.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> click on Timesheets_Button");
		Assert.assertTrue(true, "Failed to click onTimesheets_Button");

		helper.waitFor(Screenshots);
		helper.highLightElement(driver, Screenshots);
		Screenshots.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Screenshots_Button");
		Assert.assertTrue(true, "Failed to click Screenshots_Button");


		helper.waitFor(Webhistory);
		helper.highLightElement(driver, Webhistory);
		Webhistory.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Webhistory_Button");
		Assert.assertTrue(true, "Failed to click on Webhistory_Button");

		helper.waitFor(AppHistory);
		helper.highLightElement(driver, AppHistory);
		AppHistory.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on AppHistory_Button");
		Assert.assertTrue(true, "Failed to click on AppHistory_Button");

		helper.waitFor(Keystrokes);
		helper.highLightElement(driver, Keystrokes);
		Keystrokes.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on Keystrokes Button");
		Assert.assertTrue(true, "Failed to click on Keystrokes Button");
		
		
		Thread.sleep(3000);
		
		helper.Employee_Attendance_sheet_Excel_data();
		
		Thread.sleep(6000);
 


	}

}
