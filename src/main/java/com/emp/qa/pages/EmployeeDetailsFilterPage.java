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
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		helper.waitFor(EmployeeDetailsfilter);
		helper.highLightElement(driver, EmployeeDetailsfilter);
		helper.Double_click(EmployeeDetailsfilter);
		helper.jsCLick(EmployeeDetailsfilter);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on EmployeeDetailsfilter");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilter");
		Thread.sleep(9000);
		
		helper.waitFor(EmployeeDetailsfilterEmail);
		helper.highLightElement(driver, EmployeeDetailsfilterEmail);
		helper.jsCLick(EmployeeDetailsfilterEmail);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on EmployeeDetailsfilterEmail");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterEmail");
		Thread.sleep(3000);
		
		helper.waitFor(EmployeeDetailsfilterLocation);
		helper.highLightElement(driver, EmployeeDetailsfilterLocation);
		helper.jsCLick(EmployeeDetailsfilterLocation);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on EmployeeDetailsfilterLocation");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterLocation");
		Thread.sleep(3000);
		
		helper.waitFor(EmployeeDetailsfilterDepartment);
		helper.highLightElement(driver, EmployeeDetailsfilterDepartment);
		helper.jsCLick(EmployeeDetailsfilterDepartment);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on EmployeeDetailsfilterDepartment");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterDepartment");
		Thread.sleep(3000);
		
		helper.waitFor(EmployeeDetailsfilterRole);
		helper.highLightElement(driver, EmployeeDetailsfilterRole);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on EmployeeDetailsfilterRole");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterRole");
		Thread.sleep(3000);
		
		helper.waitFor(EmployeeDetailsfilterEmpcode);
		helper.highLightElement(driver, EmployeeDetailsfilterEmpcode);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on EmployeeDetailsfilterEmpcode");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterEmpcode");
		Thread.sleep(3000);
		
		helper.waitFor(EmployeeDetailsfilterComputername);
		helper.highLightElement(driver, EmployeeDetailsfilterComputername);
		helper.jsCLick(EmployeeDetailsfilterComputername);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on EmployeeDetailsfilterComputername");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterComputername");
		Thread.sleep(3000);
		
		helper.waitFor(EmployeeDetailsfilterversion);
		helper.highLightElement(driver, EmployeeDetailsfilterversion);
		helper.jsCLick(EmployeeDetailsfilterversion);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on EmployeeDetailsfilterversion");
		Assert.assertTrue(true, "Failed to click on EmployeeDetailsfilterversion");
		Thread.sleep(3000);

		
		
		
		
		
		
	}
}
