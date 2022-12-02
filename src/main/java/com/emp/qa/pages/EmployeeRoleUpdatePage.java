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
	
	@FindBy(css = "(//select[@id='AllRolesAppend']/..//preceding-sibling::span)[1]")
	@CacheLookup
	WebElement UpdateRoleSearchbar;
	
	@FindBy(css = "button#UpgradeHide")
	@CacheLookup
	WebElement UpdateRoleSaveButton;
	
	@FindBy(xpath = "(//td[@class='text-center'])[1]/a")
	@CacheLookup
	WebElement EmloyeeFullDetails;
	
	@FindBy(xpath = "//div[@id='UnaccessModal']/following-sibling::a[text()='Edit ']")
	@CacheLookup
	WebElement EmployeeEditButton;
	
	@FindBy(css = "#Emp-edit [data-dismiss]")
	@CacheLookup
	WebElement ExitButton;
	
	
	
	
public  void EmployeeDetailsFilter() throws InterruptedException, AWTException {
		
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-Module");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver, Scroller);
		Scroller.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Scroller ");
		Assert.assertTrue(true, "Failed to Click on Scroller");
		
		helper.waitFor(UpdateRoleButton);
		helper.highLightElement(driver, UpdateRoleButton);
		helper.Scrollintoview(UpdateRoleButton);
	    helper.jsCLick(UpdateRoleButton);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Update-Role Button");
		Assert.assertTrue(true, "Failed to Click on Update-Role Button");
		
		
		helper.waitFor(UpdateRoleSaveButton);
		helper.highLightElement(driver, UpdateRoleSaveButton);
		UpdateRoleSaveButton.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on UpdateRoleSaveButton");
		Assert.assertTrue(true, "Failed to Click on UpdateRoleSaveButton");
		Thread.sleep(4000);
		

		
		helper.waitFor(EmloyeeFullDetails);
		helper.highLightElement(driver, EmloyeeFullDetails);
		EmloyeeFullDetails.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on EmloyeeFullDetails");
		Assert.assertTrue(true, "Failed to Click on EmloyeeFullDetails");
		Thread.sleep(4000);
		
		helper.waitFor(EmployeeEditButton);
		helper.highLightElement(driver, EmployeeEditButton);
		helper.jsCLick(EmployeeEditButton);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on EmployeeEditButton");
		Assert.assertTrue(true, "Failed to Click on EmployeeEditButton");
		Thread.sleep(4000);
		
		helper.waitFor(ExitButton);
		helper.highLightElement(driver, ExitButton);
		helper.Scrollintoview(ExitButton);
		helper.jsCLick(ExitButton);
	    Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on ExitButton");
		Assert.assertTrue(true, "Failed to Click on ExitButton");
		Thread.sleep(4000);
		
	
		

}
}

