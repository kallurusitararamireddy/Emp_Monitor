package com.emp.qa.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
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
import com.opencsv.exceptions.CsvException;

@Listeners(ITestNGListener.class)
public class TimeSheetsPage extends BasePage {

	public  TimeSheetsPage(WebDriver driver) {
		super(TestBase.getDriver());
	
	
}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(css = "div#reportranges > .fa.fa-calendar")
	@CacheLookup
	WebElement selectdateranges;
	
	@FindBy(css = ".daterangepicker.ltr.show-ranges  ul > li:nth-of-type(4)")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSVDownload;
	
	@FindBy(xpath = "(//a[@title='View Full Details'][contains(.,'GLB-110-PC - GLB-110')])[1]")
	@CacheLookup
	WebElement Name;
	
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
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF;
	
	
	

	
	public void Time_Sheets_Page_CSV_File()throws InterruptedException, IOException, CsvException, AWTException{
		
		
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Selected  See All from the loction Dropdown");
		Assert.assertTrue(true, "Failed to Select a  See All from the Locaton Drpdown");
		 

		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Department dropdown & Select Department");
		Assert.assertTrue(true, "Failed to click on Department dropdown & Select Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.move_to_element_click_target(Employee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Employee dropdown & Select Employee");
		Assert.assertTrue(true, "Failed to Select Employee & Select Employee ");
		
		helper.waitFor(selectdateranges);
		helper.highLightElement(driver, selectdateranges);
		selectdateranges.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on select-Date-Ranges");
		Assert.assertTrue(true, "Failed to click on  select-date-Ranges");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to select Last-30-days");
		
		 
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on CSV Button");
		Assert.assertTrue(true, "Failed to click on CSV Button");
		
		helper.waitFor(selectall);
		helper.highLightElement(driver, selectall);
		selectall.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Select All check Box");
		Assert.assertTrue(true, "Failed to click on selectall Check Box");
		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Thread.sleep(3000);
		helper.jsCLick(Submit);
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(5000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(5000);
	
		
		
	}
public void Time_Sheets_Page_PDF_File()throws InterruptedException, IOException, CsvException, AWTException{
		
		
		
	helper.waitFor(Location);
	helper.highLightElement(driver, Location);
	helper.selectDropDownValue(Location, "visibletext", " See All");
	Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Selected  See All from the loction Dropdown");
	Assert.assertTrue(true, "Failed to Select a  See All from the Locaton Drpdown");
	 

	helper.waitFor(Department);
	helper.highLightElement(driver, Department);
	helper.selectDropDownValue(Department, "value", "0");
	Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Department dropdown & Select Department");
	Assert.assertTrue(true, "Failed to click on Department dropdown & Select Department");
	
	helper.waitFor(Employee);
	helper.highLightElement(driver, Employee);
	helper.move_to_element_click_target(Employee);
	helper.robot_Zero_option_selectClick();
	Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Employee dropdown & Select Employee");
	Assert.assertTrue(true, "Failed to Select Employee & Select Employee ");
	
	helper.waitFor(selectdateranges);
	helper.highLightElement(driver, selectdateranges);
	selectdateranges.click();
	Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on select-Date-Ranges");
	Assert.assertTrue(true, "Failed to click on  select-date-Ranges");
	
	helper.waitFor(Last30days);
	helper.highLightElement(driver, Last30days);
	Last30days.click();
	Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Last-30-days");
	Assert.assertTrue(true, "Failed to select Last-30-days");

		/*
		 * pdf
		 */
		

		helper.waitFor( PDF);
		helper.highLightElement(driver,  PDF);
		helper.Scrollintoview(PDF);
		helper.jsCLick(PDF);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on PDF Button");
		Assert.assertTrue(true, "Failed to click on PDF Button");
		
		helper.waitFor(selectall);
		helper.highLightElement(driver, selectall);
		helper.jsCLick(selectall);
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on select All CheckBox ");
		Assert.assertTrue(true, "Failed to click on selectall CheckBox");
		 
		helper.waitFor(Submit);
		helper.Scrollintoview(Submit);
		helper.highLightElement(driver, Submit);
		helper.jsCLick(Submit);
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(5000);
		
		helper.Time_sheet_PDF_Reader();
		
		Thread.sleep(3000);
}
}

