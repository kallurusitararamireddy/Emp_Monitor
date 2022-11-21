package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;


public class WebsiteandApplicationPage extends BasePage {

	public WebsiteandApplicationPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Web App Usage')]")
	@CacheLookup
	WebElement WebAPPusage;
	
	@FindBy(xpath = "//select[@id='LocationData']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='DepartmentAppendweb']")
	@CacheLookup
	WebElement Department;
	
	
	@FindBy(xpath = "//span[@id='select2-EmployeeData-container']")
	@CacheLookup
	WebElement Employee;
	
	@FindBy(xpath = "//option[contains(text(),'See All Employee')]")
	@CacheLookup
	WebElement All_Employee;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[3]/div[1]/i[2]")
	@CacheLookup
	WebElement reportrange;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	
	@FindBy(xpath = "//button[@id='BothButton']")
	@CacheLookup
	WebElement Both_Button;
	
	@FindBy(xpath = "//button[@id='WebButton']")
	@CacheLookup
	WebElement Website_Button;
	

	@FindBy(xpath = "//button[@id='AppButton']")
	@CacheLookup
	WebElement Aplication_Button;
	
	
	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement ExceltButton;
	
	@FindBy(xpath = "//button[@id='PDFButton']")
	@CacheLookup
	WebElement PDFButton;
	

	@FindBy(xpath = "//select[@name='EmployeeReportTable_length']")
	@CacheLookup
	WebElement Show_entries_Dropdown;
	

	@FindBy(xpath = "//button[@id='ExportButton']")
	@CacheLookup
	WebElement web_and_app_Export_Excel;
	
	

	@FindBy(xpath = "//button[@id='exportReport']")
	@CacheLookup
	WebElement full_details_Export_Excel;
	
	
	public void WebsiteandApplicationPage() throws InterruptedException, AWTException, IOException{
		
		
		helper.waitFor(WebAPPusage);
		helper.highLightElement(driver, WebAPPusage);
		WebAPPusage.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Reports Module and Selected  Web-APP-usage Sub-Module ");
		Assert.assertTrue(true, "Failed To click on Reports Module and Selected  Web-APP-usage Sub-Module");
 
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "See All Location");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Location Drop-down and  Selected Any Location ");
		Assert.assertTrue(true, "Failed To click on Location Drop-down and Selected Any  Location ");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "visibletext", "See All Department");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department Drop-down and  Selected Any Department ");
		Assert.assertTrue(true, "Failed to click on Department Drop-down and Selected Any Department");
		
		helper.waitFor(Employee);
		helper.highLightElement(driver, Employee);
		Employee.click();
	    helper.robot_Zero_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Employee Drop-down and Selected Any Employee ");
		Assert.assertTrue(true, "Failed to  click on Employee Drop-down and Selected Any Employee");
	
	
		
		helper.waitFor(reportrange);
		helper.highLightElement(driver, reportrange);
		helper.jsCLick(reportrange);
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Calendar Drop-down and Selected Day's");
		Assert.assertTrue(true, "Failed to click on Calendar Drop-down and Selected Day's");
		
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on Last-30-days");
		Assert.assertTrue(true, "Failed to click on  Last-30-days");
		Thread.sleep(2000);
		
		helper.waitFor(Both_Button);
		helper.highLightElement(driver, Both_Button);
		Both_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on Both_Button");
		Assert.assertTrue(true, "Failed to click on  Both_Button");
		Thread.sleep(2000); 
		
		helper.waitFor(web_and_app_Export_Excel);
		helper.highLightElement(driver, web_and_app_Export_Excel);
		helper.Scrollintoview(web_and_app_Export_Excel);
		web_and_app_Export_Excel.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on Excel Button ");
		Assert.assertTrue(true, "Failed to click on Excel Button");
		Thread.sleep(3000);
		
        helper.Both_web_app__button();
		
		Thread.sleep(4000);
		
		System.out.print("                                      ");
		
		helper.waitFor(full_details_Export_Excel);
		helper.highLightElement(driver, full_details_Export_Excel);
		helper.Scrollintoview(full_details_Export_Excel);
		full_details_Export_Excel.click();
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on full_details_Export Button ");
		Assert.assertTrue(true, "Failed to click on full_details_Export Button");
		Thread.sleep(3000);
		
		 helper.Cumulative_Report_Sheet_button();
			
	     Thread.sleep(6000);
		
				
}

}
