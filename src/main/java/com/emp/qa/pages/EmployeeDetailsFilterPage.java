package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class EmployeeDetailsFilterPage extends BasePage {

	public EmployeeDetailsFilterPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();	
	
	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(css = ".add-tab-icon.fa-columns.fas")
	@CacheLookup
	WebElement EmployeeDetailsfilter;
	
	
	@FindBy(css = "li:nth-of-type(2) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterEmail;
	
	@FindBy(css = "li:nth-of-type(3) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterLocation;
	
	@FindBy(css = "li:nth-of-type(4) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterDepartment;
	
	@FindBy(css = "li:nth-of-type(5) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterRole;
	
	@FindBy(css = "li:nth-of-type(6) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterEmpcode;
	
	@FindBy(css = "li:nth-of-type(7) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterComputername;
	
	@FindBy(css = "li:nth-of-type(8) > .mr-2.selectCheckbox")
	@CacheLookup
	WebElement EmployeeDetailsfilterversion;
	
	
	
	
	
	
	
	public  void EmployeeDetailsFilter() throws InterruptedException, AWTException {
		
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee_Details");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details");
		
		helper.waitFor(EmployeeDetailsfilter);
		helper.highLightElement(driver, EmployeeDetailsfilter);
		helper.Double_click(EmployeeDetailsfilter);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Employee_Details_filter");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter");
		Thread.sleep(4000);
		
		helper.waitFor(EmployeeDetailsfilterEmail);
		helper.highLightElement(driver, EmployeeDetailsfilterEmail);
		helper.jsCLick(EmployeeDetailsfilterEmail);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Employee_Details_filter_Email");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_Email");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterLocation);
		helper.highLightElement(driver, EmployeeDetailsfilterLocation);
		helper.jsCLick(EmployeeDetailsfilterLocation);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Employee_Details_filter_Location");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_Location");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterDepartment);
		helper.highLightElement(driver, EmployeeDetailsfilterDepartment);
		helper.jsCLick(EmployeeDetailsfilterDepartment);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Employee_Details_filter_Department");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_Department");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterRole);
		helper.highLightElement(driver, EmployeeDetailsfilterRole);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Employee_Details_filter_Role");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_Role");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterEmpcode);
		helper.highLightElement(driver, EmployeeDetailsfilterEmpcode);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Employee_Details_filter_Empcode");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_Empcode");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterComputername);
		helper.highLightElement(driver, EmployeeDetailsfilterComputername);
		helper.jsCLick(EmployeeDetailsfilterComputername);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Employee_Details_filter_Computername");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_Computername");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterversion);
		helper.highLightElement(driver, EmployeeDetailsfilterversion);
		helper.jsCLick(EmployeeDetailsfilterversion);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on Employee_Details_filter_version");
		Assert.assertTrue(true, "Failed to clicked on Employee_Details_filter_version");
		Thread.sleep(2000);

		
	
		
	}
}
