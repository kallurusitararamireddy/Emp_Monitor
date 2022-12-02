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


public class AbsentOptionToTimesheetsPage extends BasePage {

	public AbsentOptionToTimesheetsPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//div[@id='reportranges']")
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
	 
	@FindBy(xpath = "//input[@id='checklocDownload']")
	@CacheLookup
	WebElement selectall;
	
	@FindBy(xpath = "//*[@id='Absent_employeeCheckbox']")
	@CacheLookup
	WebElement Absent_option;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath = "//button[@id='download_btn']")
	@CacheLookup
	WebElement PDF;
	
	
	
	
	
	public void AbsentOptionToTimesheetsPage()throws InterruptedException, IOException, AWTException, CsvException{
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked  on Location  Drop-down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click  on Location  Drop-down and  Selected Any Location");
		  
  
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked  on Department Drop-down and  Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department drop-down & Selected Any  Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.move_to_element_click_target(Employee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Employee Drop-down and  Selected Any Employee");
		Assert.assertTrue(true, "Failed to Click on Employee dropdown and  Selected Any  Employee ");
		
		helper.waitFor(selectdateranges);
		helper.highLightElement(driver, selectdateranges);
		selectdateranges.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Calender Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to Click on  select-date-Ranges and Selected Day's");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Selected  on Last-30-days ");
		Assert.assertTrue(true, "Failed to Select on  Last-30-days");
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on CSV Button");
		Assert.assertTrue(true, "Failed to Click on CSV Button");
		
		helper.waitFor(Absent_option);
		helper.highLightElement(driver, Absent_option);
		helper.Scrollintoview(Absent_option);
		Absent_option.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on Time-in-total check-Box ");
		Assert.assertTrue(true, "Failed to Click on Time-in-total Check-Box");
		

	
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Thread.sleep(3000);
		helper.jsCLick(Submit); 
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(5000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(2000);
		
		


		
	
	}
}
	
