package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class ActivatingSuspendedEmployeesPage extends BasePage {

	public ActivatingSuspendedEmployeesPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement EmployeeDetails;
	

	@FindBy(css = "button#inActiveStatus")
	@CacheLookup
	WebElement SuspendedEmployeesButton;
	
	@FindBy(css = "input#SelectAllCheckBox")
	@CacheLookup
	WebElement SelectallSuspendedCheckbox;
	
	@FindBy(css = "button#Active_btn")
	@CacheLookup
	WebElement ActiveButton;
	
	@FindBy(css = "button#activeMod")
	@CacheLookup
	WebElement ActivateEmployee;
	
public  void suspendedemployee() throws InterruptedException, AWTException {
		
		 
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Employee Module and Selected Employee Details Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Employee Module and Selected Employee Details Sub-Module  ");
		 
		helper.waitFor(SuspendedEmployeesButton); 
		helper.highLightElement(driver, SuspendedEmployeesButton);
		SuspendedEmployeesButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Suspended Employees Button");
		Assert.assertTrue(true, "Failed to click on Suspended Employees Button");
		
		helper.waitFor(SelectallSuspendedCheckbox);
		helper.highLightElement(driver, SelectallSuspendedCheckbox);
		SelectallSuspendedCheckbox.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Selected  All Suspended Check Box");
		Assert.assertTrue(true, "Failed to Select All Suspended Check Box");
		 
		helper.waitFor(ActiveButton);
		helper.highLightElement(driver, ActiveButton);
		ActiveButton.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Active Button");
		Assert.assertTrue(true, "Failed to click on Active Button");
		Thread.sleep(5000);
		
		helper.waitFor(ActivateEmployee);
		helper.highLightElement(driver, ActivateEmployee);
		ActivateEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Selected  Employees and Clicked on  Activated Employees Button ");
		Assert.assertTrue(true, "Failed to  Select  Employees and Clicked on  Activated Employees Button");
		Thread.sleep(5000);

}
}
