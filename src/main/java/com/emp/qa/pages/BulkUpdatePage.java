package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class BulkUpdatePage extends BasePage {


		public BulkUpdatePage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}

	Helpers helper= new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	
	@FindBy(xpath = "//button[@id='editBulkRegBtn']")
	@CacheLookup
	WebElement BulkUpdate_Button;
	
	@FindBy(xpath = "//label[contains(text(),'Bulk Update')]")
	@CacheLookup
	WebElement Browse_Button;
	
	@FindBy(xpath = "//button[@id='editBulkDomainBtn']")
	@CacheLookup
	WebElement Update_Button;

	
	public void BulkUpdate()throws InterruptedException, AWTException{
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clickedonEmployeeDetails");
		Assert.assertTrue(true, "Failed to clickedonEmployeeDetails");
		
		
		helper.waitFor(BulkUpdate_Button);
		helper.highLightElement(driver, BulkUpdate_Button);
		BulkUpdate_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on BulkUpdate_Button");
		Assert.assertTrue(true, "Failed to clicke on BulkUpdate_Button");
		
		
		helper.waitFor(Browse_Button);
		helper.highLightElement(driver, Browse_Button);
		Browse_Button.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Browse_Button");
		Assert.assertTrue(true, "Failed to click on Browse_Button");
		helper.uploadFile("C:\\Users\\Official\\Downloads\\Untitled spreadsheet (10).xlsx");
		Thread.sleep(6000);

		helper.waitFor(Update_Button);
		helper.highLightElement(driver, Update_Button);
		Update_Button.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to click on Update_Button");
		Thread.sleep(6000);

		
	}
		
	
		
	}


