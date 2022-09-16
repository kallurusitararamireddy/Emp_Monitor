package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class EmployeeRoleUpdatePage extends BasePage {

	public EmployeeRoleUpdatePage(WebDriver driver) {
		super(driver);
		
	}
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[contains(text(),'Employee-Details')]")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(css = ".stickyCol-wrapper")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(css = "#fetch_Details tr:nth-of-type(1) [data-toggle='modal']:nth-of-type(4) [data-toggle]")
	@CacheLookup
	WebElement UpdateRoleButton;
	
	@FindBy(css = "select#AllRolesAppend")
	@CacheLookup
	WebElement UpdateRoleSearchbar;
	
	@FindBy(css = "button#UpgradeHide")
	@CacheLookup
	WebElement UpdateRoleSaveButton;
	
	@FindBy(css = "tr:nth-of-type(1) > .stickyCol-sticky-col > a[title='View Full Details']")
	@CacheLookup
	WebElement EmloyeeFullDetails;
	
	@FindBy(css = ".content-header > a:nth-of-type(1)")
	@CacheLookup
	WebElement EmployeeEditButton;
	
	@FindBy(css = "#Emp-edit [data-dismiss]")
	@CacheLookup
	WebElement ExitButton;
	
	
	
	
public  void EmployeeDetailsFilter() throws InterruptedException, AWTException {
		
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		Scroller.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		helper.waitFor(UpdateRoleButton);
		helper.highLightElement(driver, UpdateRoleButton);
		helper.Scrollintoview(UpdateRoleButton);
	    helper.jsCLick(UpdateRoleButton);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on UpdateRoleButton");
		Assert.assertTrue(true, "Failed to click on UpdateRoleButton");
		
		helper.waitFor(UpdateRoleSearchbar);
		helper.highLightElement(driver, UpdateRoleSearchbar);
		helper.selectDropDownValue(UpdateRoleSearchbar, "value", "6");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> selected data into  and updated the role");
		Assert.assertTrue(true, "Failed to Update the role");
		
		helper.waitFor(UpdateRoleSaveButton);
		helper.highLightElement(driver, UpdateRoleSaveButton);
		UpdateRoleSaveButton.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on UpdateRoleSaveButton");
		Assert.assertTrue(true, "Failed to click on UpdateRoleSaveButton");
		Thread.sleep(4000);
		

		
		helper.waitFor(EmloyeeFullDetails);
		helper.highLightElement(driver, EmloyeeFullDetails);
		EmloyeeFullDetails.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on EmloyeeFullDetails");
		Assert.assertTrue(true, "Failed to click on EmloyeeFullDetails");
		Thread.sleep(4000);
		
		helper.waitFor(EmployeeEditButton);
		helper.highLightElement(driver, EmployeeEditButton);
		EmployeeEditButton.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on EmployeeEditButton");
		Assert.assertTrue(true, "Failed to click on EmployeeEditButton");
		Thread.sleep(4000);
		
		helper.waitFor(ExitButton);
		helper.highLightElement(driver, ExitButton);
		helper.Scrollintoview(ExitButton);
		ExitButton.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on ExitButton");
		Assert.assertTrue(true, "Failed to click on ExitButton");
		Thread.sleep(4000);
		
	
		

}
}

