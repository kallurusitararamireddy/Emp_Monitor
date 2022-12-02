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

public class UpdateTheRolePage extends BasePage{

	public UpdateTheRolePage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;
	
	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div[2]/div[2]/div/div/div[4]")
	@CacheLookup
	WebElement Scroller;
	
	@FindBy(xpath = "//*[@id='upgrade' and @data-id='25499']/i")
	WebElement UpdateTheRole;
	
	
	@FindBy(xpath = "//*[@id='upgradeManagerModal']/div/div/div[2]/span[1]/span[1]/span/ul")
	WebElement WhichRole;
	
	@FindBy(xpath = "//button[@id='UpgradeHide']")
	WebElement Yes_Button;
	
	
	
	
	public  void UpdateTheRole() throws InterruptedException, AWTException {
		
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on  Employee Module and Selected  Employee-Details Sub-Module");
		
		helper.waitFor(Scroller);
		helper.highLightElement(driver,Scroller);
		helper.Scrollintoview(Scroller);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Scroller view ");
		Assert.assertTrue(true, "Failed to Click on Scroller view ");
		
		
		helper.waitFor(UpdateTheRole);
		helper.highLightElement(driver, UpdateTheRole);
		helper.jsCLick(UpdateTheRole); 
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Updated Role Drop-down");
		Assert.assertTrue(true, "Failed to Click on  Role Drop-down");
		
		
		helper.waitFor(WhichRole);
		helper.highLightElement(driver, WhichRole);
//		helper.jsCLick(WhichRole);
//		helper.selectDropDownValue(WhichRole, "value", "230");
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step30.</font></B> Clicked on  Any Role");
		Assert.assertTrue(true, "Failed to Click on  role");
		
		   
		helper.waitFor(Yes_Button);
		helper.highLightElement(driver, Yes_Button);
		helper.jsCLick(Yes_Button);
		Reporter.log("<B><font color = 'blue'>Step31.</font></B> Clicked on Yes_Button");
		Assert.assertTrue(true, "Failed to Select YES_button");
	
		
	}

}
