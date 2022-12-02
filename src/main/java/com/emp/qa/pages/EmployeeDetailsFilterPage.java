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
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee_Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on on Employee Module and Selected  Employee_Details Sub-Module ");
		
		helper.waitFor(EmployeeDetailsfilter);
		helper.highLightElement(driver, EmployeeDetailsfilter);
		helper.Double_click(EmployeeDetailsfilter);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Employee Details filter");
		Assert.assertTrue(true, "Failed to Click on Employee Details filter");
		Thread.sleep(4000);
		
		helper.waitFor(EmployeeDetailsfilterEmail);
		helper.highLightElement(driver, EmployeeDetailsfilterEmail);
		helper.jsCLick(EmployeeDetailsfilterEmail);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Employee_Details_filter Email Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Email option ");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterLocation);
		helper.highLightElement(driver, EmployeeDetailsfilterLocation);
		helper.jsCLick(EmployeeDetailsfilterLocation);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Details_filter Location option");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Location option ");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterDepartment);
		helper.highLightElement(driver, EmployeeDetailsfilterDepartment);
		helper.jsCLick(EmployeeDetailsfilterDepartment);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Employee_Details_filter Department option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Department option ");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterRole);
		helper.highLightElement(driver, EmployeeDetailsfilterRole);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Employee_Details_filter Role Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Role option ");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterEmpcode);
		helper.highLightElement(driver, EmployeeDetailsfilterEmpcode);
		helper.jsCLick(EmployeeDetailsfilterRole);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Employee_Details_filter Empcode Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter Empcode Option ");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterComputername);
		helper.highLightElement(driver, EmployeeDetailsfilterComputername);
		helper.jsCLick(EmployeeDetailsfilterComputername);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Employee_Details_filter Computer-name Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter_Computer-name Option ");
		Thread.sleep(2000);
		
		helper.waitFor(EmployeeDetailsfilterversion);
		helper.highLightElement(driver, EmployeeDetailsfilterversion);
		helper.jsCLick(EmployeeDetailsfilterversion);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Employee_Details_filter version Option ");
		Assert.assertTrue(true, "Failed to Click on Employee_Details_filter version option ");
		Thread.sleep(2000);

		
	
		
	}
}
