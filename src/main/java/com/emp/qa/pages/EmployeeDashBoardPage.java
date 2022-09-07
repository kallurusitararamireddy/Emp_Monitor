package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class EmployeeDashBoardPage extends BasePage {

	public EmployeeDashBoardPage(WebDriver driver) {
		super(driver);
		
	}

	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-calendar')]")
	@CacheLookup
	WebElement Calender;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days;
	
	@FindBy(xpath = "//a[@id='ProductivityTab']")
	@CacheLookup
	WebElement Productivitytab;
	
	@FindBy(xpath = "//a[@id='TimesheetsTab']")
	@CacheLookup
	WebElement Timesheetstab;
	
	@FindBy(xpath = "//a[@id='ScreenshotsTab']")
	@CacheLookup
	WebElement ScreenshotsTab;
	
	@FindBy(xpath = "//a[@id='BrowserHistoryTab']")
	@CacheLookup
	WebElement WebHistoryTab;
	
	@FindBy(xpath = "//a[@id='AppHistoryTab']")
	@CacheLookup
	WebElement ApphistoryTab;
	
	@FindBy(xpath = "//a[@id='keyLoggerTab']")
	@CacheLookup
	WebElement KeyStrokes;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/a[7]")
	@CacheLookup
	WebElement Analysis;
	
	@FindBy(xpath = "//span[contains(text(),'Alerts Notifications')]")
	@CacheLookup
	WebElement AlertsNotification;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement LocationDropDown;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement DepartmentsDropdown;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement EmployeeDropDown;
	
	@FindBy(xpath = "//div[@id='alertRange']")
	@CacheLookup
	WebElement AlertsCalenderDropDown;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//a[contains(.,'Time Claim')]")
	@CacheLookup
	WebElement Timeclaim;
	
	@FindBy(xpath = "//select[@id='statusField']")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//input[@id='offline-btn']")
	@CacheLookup
	WebElement RequestType_offline_Radiobutton;
	
	public  void EmployeeDashBoardPage() throws InterruptedException{
		
		
		helper.waitFor(Calender);
		helper.highLightElement(driver, Calender);
		helper.Scrollintoview(Calender);
		helper.jsCLick(Calender);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Calender");
		Assert.assertTrue(true, "Failed to click on Calender");
		
		helper.waitFor(Last7days);
		helper.highLightElement(driver, Last7days);
		helper.Scrollintoview(Last7days);
		Last7days.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Last7days");
		Assert.assertTrue(true, "Failed to click on Last7days");
		
		helper.waitFor(Productivitytab);
		helper.highLightElement(driver, Productivitytab);
		helper.Scrollintoview(Productivitytab);
		Productivitytab.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Productivitytab");
		Assert.assertTrue(true, "Failed to click on Productivitytab");
		
		
		helper.waitFor(Timesheetstab);
		helper.highLightElement(driver, Timesheetstab);
		helper.Scrollintoview(Timesheetstab);
		Timesheetstab.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Timesheetstab");
		Assert.assertTrue(true, "Failed to click on Timesheetstab");
		
		
		helper.waitFor(ScreenshotsTab);
		helper.highLightElement(driver, ScreenshotsTab);
		helper.Scrollintoview(ScreenshotsTab);
		ScreenshotsTab.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on ScreenshotsTab");
		Assert.assertTrue(true, "Failed to click on ScreenshotsTab");
		
		helper.waitFor(WebHistoryTab);
		helper.highLightElement(driver, WebHistoryTab);
		helper.Scrollintoview(WebHistoryTab);
		WebHistoryTab.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on WebHistoryTab");
		Assert.assertTrue(true, "Failed to click on WebHistoryTab");
		
		helper.waitFor(ApphistoryTab);
		helper.highLightElement(driver, ApphistoryTab);
		helper.Scrollintoview(ApphistoryTab);
		ApphistoryTab.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on ApphistoryTab");
		Assert.assertTrue(true, "Failed to click on ApphistoryTab");
		
		helper.waitFor(KeyStrokes);
		helper.highLightElement(driver, KeyStrokes);
		helper.Scrollintoview(KeyStrokes);
		KeyStrokes.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on KeyStrokes");
		Assert.assertTrue(true, "Failed to click on KeyStrokes");
		
		
		driver.navigate().refresh();
		
		helper.waitFor(AlertsNotification);
		helper.highLightElement(driver, AlertsNotification);
		helper.Scrollintoview(AlertsNotification);
		AlertsNotification.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on AlertsNotification");
		Assert.assertTrue(true, "Failed to click on AlertsNotification");
		
		
		helper.waitFor(LocationDropDown);
		helper.highLightElement(driver, LocationDropDown);
		helper.Scrollintoview(LocationDropDown);
		helper.selectDropDownValue(LocationDropDown, "value", "378");
		LocationDropDown.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on LocationDropDown");
		Assert.assertTrue(true, "Failed to click on LocationDropDown");
		
		helper.waitFor(DepartmentsDropdown);
		helper.highLightElement(driver, DepartmentsDropdown);
		helper.Scrollintoview(DepartmentsDropdown);
		helper.selectDropDownValue(DepartmentsDropdown, "value", "97");
		DepartmentsDropdown.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on DepartmentsDropdown");
		Assert.assertTrue(true, "Failed to click on DepartmentsDropdown");
		

		helper.waitFor(EmployeeDropDown);
		helper.highLightElement(driver, EmployeeDropDown);
		helper.Scrollintoview(EmployeeDropDown);
		helper.selectDropDownValue(EmployeeDropDown, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on EmployeeDropDown");
		Assert.assertTrue(true, "Failed to click on EmployeeDropDown");
		
		helper.waitFor(AlertsCalenderDropDown);
		helper.highLightElement(driver, AlertsCalenderDropDown);
		helper.Scrollintoview(AlertsCalenderDropDown);
		helper.jsCLick(AlertsCalenderDropDown);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on AlertsCalenderDropDown");
		Assert.assertTrue(true, "Failed to click on AlertsCalenderDropDown");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		helper.Scrollintoview(Last30days);
		helper.jsCLick(Last30days);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Last30days");
		Assert.assertTrue(true, "Failed to click on Last30days");
		
		driver.navigate().refresh();
		
		helper.waitFor(Timeclaim);
		helper.highLightElement(driver, Timeclaim);
		helper.Scrollintoview(Timeclaim);
		helper.jsCLick(Timeclaim);
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> clicked on Timeclaim");
		Assert.assertTrue(true, "Failed to click on Timeclaim");
		
		helper.waitFor(Status);
		helper.highLightElement(driver, Status);
		helper.Scrollintoview(Status);
		helper.selectDropDownValue(Status, "value", "1");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> clicked on Status");
		Assert.assertTrue(true, "Failed to click on Status");
		
		helper.waitFor(RequestType_offline_Radiobutton);
		helper.highLightElement(driver, RequestType_offline_Radiobutton);
		helper.Scrollintoview(RequestType_offline_Radiobutton);
		helper.jsCLick(RequestType_offline_Radiobutton);
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> clicked on RequestType_offline_Radiobutton");
		Assert.assertTrue(true, "Failed to click on RequestType_offline_Radiobutton");
		
		
		
	}
	
	
}
