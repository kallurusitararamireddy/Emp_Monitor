package com.emp.qa.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
import com.opencsv.exceptions.CsvException;


public class SplitSheetPage extends BasePage {

	public SplitSheetPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//i[@class='menu-icon icon-home4']")
	@CacheLookup
	WebElement Timesheets;
	
	@FindBy(xpath = "//*[@id='locationdept']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//*[@id='getDepartments']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//*[@id='employee']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//*[@id='reportranges']")
	@CacheLookup
	WebElement selectdateranges;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//li[contains(text(),'Last 7 Days')]")
	@CacheLookup
	WebElement Last7days;
	
	
	
	@FindBy(xpath = "//button[@id='download_btn_csv']")
	@CacheLookup
	WebElement CSV;
	
	
	@FindBy(xpath = "//*[@id='Split_Excel_ListCheckbox']")
	@CacheLookup
	WebElement Splitsheet;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	
	
	
	public void SplitSheetPage()throws InterruptedException, IOException, AWTException, CsvException{
		
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
		
		helper.waitFor(Splitsheet);
		helper.highLightElement(driver, Splitsheet);
		helper.Scrollintoview(Splitsheet);
		Splitsheet.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Splitsheet  checkBox");
		Assert.assertTrue(true, "Failed to click on Splitsheet ChekBox");
		Thread.sleep(2000);
		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Thread.sleep(3000);
		helper.jsCLick(Submit);
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(4000);
		
//		helper.Time_Sheets_CSV_Dot_files();
		helper.Attendance_History_sheet_Excel_data();
		
		Thread.sleep(4000);
		
	}
		

}
