package com.emp.qa.pages;

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
@Listeners(ITestNGListener.class)
public class EmployeeDetailspage extends BasePage  {

	public EmployeeDetailspage(WebDriver driver) {
		super(TestBase.getDriver());
		
}
	Helpers helper=new Helpers();	
	
	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//button[@id='activeStatus']")
	@CacheLookup
	WebElement Active;
	
	@FindBy(xpath = "//button[@id='inActiveStatus']")
	@CacheLookup
	WebElement Suspended;
	
	@FindBy(xpath = "//button[contains(text(),'Deleted Users History')]")
	@CacheLookup
	WebElement DeletedusersHistory;
	
	@FindBy(xpath = "//*[@id='DeletedUserList']/div/div/div[1]/button/span")
	@CacheLookup
	WebElement close;
	
	
public  void EmployeeDetails() throws InterruptedException {
	
	
	helper.waitFor(EmployeeDetails);
	helper.highLightElement(driver, EmployeeDetails);
	EmployeeDetails.click();
	Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected  Employee_Details Sub-Module ");
	Assert.assertTrue(true, "Failed to click on Employee Module and Selected  Employee_Details Sub-Module");
	
	helper.waitFor(Active);
	helper.highLightElement(driver, Active);
	Active.click();
	Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Active_Button");
	Assert.assertTrue(true, "Failed to click on Active_Button");
	
	helper.waitFor(Suspended);
	helper.highLightElement(driver, Suspended);
	Suspended.click();
	Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Suspended_Button");
	Assert.assertTrue(true, "Failed to click on Suspended_Button");
	

	helper.waitFor(DeletedusersHistory);
	helper.highLightElement(driver, DeletedusersHistory);
	DeletedusersHistory.click();
	Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on DeletedusersHistory_Button");
	Assert.assertTrue(true, "Failed to click on DeletedusersHistory_Button");
	 
	helper.waitFor(close);
	helper.highLightElement(driver, close);
	Thread.sleep(2000);
	close.click();
	Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on close_Button");
	Assert.assertTrue(true, "Failed to click on close_Button");
	
	
}
}

