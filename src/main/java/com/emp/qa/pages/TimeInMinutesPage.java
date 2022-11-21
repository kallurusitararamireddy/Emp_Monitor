package com.emp.qa.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
import com.opencsv.exceptions.CsvException;


public class TimeInMinutesPage extends BasePage {

	public TimeInMinutesPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id='select2-employee-container']")
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
	
	@FindBy(xpath = "//*[@id='mytimesheetdataDownload']/li[2]/input")
	@CacheLookup
	WebElement TimeInMinutes;
	
	@FindBy(xpath = "//input[@value='submit']")
	@CacheLookup
	WebElement Submit;
	
	
	public void  TimeInMinutes() throws InterruptedException, IOException, AWTException, CsvException{
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", " See All");
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on  loction Drop-down and Selected Any Location ");
		Assert.assertTrue(true, "Failed to Click on  loction Drop-down and Selected Any Location");
		
 
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Department Drop-down & Selected Any Department");
		Assert.assertTrue(true, "Failed to click on  Department Drop-down & Selected Any Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		helper.move_to_element_click_target(Employee);
		helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Employee Drop-down &  Selected Employee");
		Assert.assertTrue(true, "Failed to click on Employee Drop-down &  Selected Employee");
		
		helper.waitFor(selectdateranges);
		helper.highLightElement(driver, selectdateranges);
		selectdateranges.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Calendar Drop-down and Select Day's");
		Assert.assertTrue(true, "Failed to click on Calendar Drop-down and Select Day's");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Last_30_days");
		Assert.assertTrue(true, "Failed to click on  Last_30_days");
		
		
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on CSV Button");
		Assert.assertTrue(true, "Failed to click on CSV Button");
		
		helper.waitFor(TimeInMinutes);
		helper.highLightElement(driver, TimeInMinutes);
		helper.Scrollintoview(TimeInMinutes);
		TimeInMinutes.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Time_In_Minutes  check_Box");
		Assert.assertTrue(true, "Failed to click on Time_In_Minutes Chek_Box");
		
		
		helper.waitFor(Submit);
		helper.highLightElement(driver, Submit);
		helper.Scrollintoview(Submit);
		Thread.sleep(3000);
		helper.jsCLick(Submit);
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Submit Button");
		Assert.assertTrue(true, "Failed to click on Submit Button");
		Thread.sleep(4000);
		
		helper.Time_Sheets_CSV_Dot_files();
		
		Thread.sleep(3000);
		
		
	}
	

}
