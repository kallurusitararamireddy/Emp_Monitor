package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class UpdateTheRolePage extends BasePage{

	public UpdateTheRolePage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//tbody/tr[@id='24756']/td[@id='act24756']/a[@id='upgrade']/i[1]")
	WebElement UpdateTheRole;
	
	
	@FindBy(xpath = "//select[@id='AllRolesAppend']")
	WebElement WhichRole;
	
	@FindBy(xpath = "//button[@id='UpgradeHide']")
	WebElement Yes_Button;
	
	
	
	
	public  void UpdateTheRole() throws InterruptedException {
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on EmployeeDetails");
		Assert.assertTrue(true, "Failed to click on EmployeeDetails");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Scroller");
		Assert.assertTrue(true, "Failed to click on Scroller");
		
		
		helper.waitFor(UpdateTheRole);
		helper.highLightElement(driver, UpdateTheRole);
		helper.jsCLick(UpdateTheRole);
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Updated the role");
		Assert.assertTrue(true, "Failed to Update the role");
		
		
		helper.waitFor(WhichRole);
		helper.highLightElement(driver, WhichRole);
		helper.jsCLick(WhichRole);
		helper.selectDropDownValue(WhichRole, "value", "230");
		Reporter.log("<B><font color = 'blue'>Step30.</font></B> Selected  the role");
		Assert.assertTrue(true, "Failed to Select the role");
		
		
		helper.waitFor(Yes_Button);
		helper.highLightElement(driver, Yes_Button);
		helper.jsCLick(Yes_Button);
		Reporter.log("<B><font color = 'blue'>Step31.</font></B> Clicked on YesButton");
		Assert.assertTrue(true, "Failed to Select YESbutton");
	
		
	}

}
