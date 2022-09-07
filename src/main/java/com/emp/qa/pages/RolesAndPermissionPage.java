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
public class RolesAndPermissionPage extends BasePage {
	
	public  RolesAndPermissionPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Roles and Permission')]")
	@CacheLookup
	WebElement RolesAndPermission;
	
	@FindBy(xpath = "//a[@href='#'][contains(.,'Add New Role')]")
	@CacheLookup
	WebElement Addnewrole_Button;
	
	@FindBy(xpath = "//input[@id='roleNameInput']")
	@CacheLookup
	WebElement Rolename;
	
	@FindBy(xpath = "//select[@name='locationDept[1][location]']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//option[contains(text(),'Node JS Team')]")
	@CacheLookup
	WebElement Nodejs;
	
	@FindBy(xpath = "//button[@id='addeditRole']")
	@CacheLookup
	WebElement Save_Button;
	public void RolesAndPermissionPage()throws InterruptedException{
		
		helper.waitFor(RolesAndPermission);		
		helper.highLightElement(driver, RolesAndPermission);
		RolesAndPermission.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on RolesAndPermission");
		Assert.assertTrue(true, "Failed To Select RolesAndPermission");
		
		helper.waitFor(Addnewrole_Button);		
		helper.highLightElement(driver, Addnewrole_Button);
		Addnewrole_Button.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Addnewrole_Button");
		Assert.assertTrue(true, "Failed To Select Addnewrole_Button");
		
		helper.waitFor(Rolename);		
		helper.highLightElement(driver,Rolename);
		Rolename.sendKeys("AutomationCode");
		Rolename.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Rolename");
		Assert.assertTrue(true, "Failed To Select Rolename");
		
		helper.waitFor(Location);		
		helper.highLightElement(driver,Location);
		helper.selectDropDownValue(Location, "value", "2");
		//helper.waitFor(Location);
		helper.jsCLick(Location);
		//Location.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Location");
		Assert.assertTrue(true, "Failed To Select Location");
		
		
		helper.waitFor(Department);		
		helper.highLightElement(driver,Department);
		//helper.selectDropDownValue(Department, "value", "1");
		//helper.jsCLick(Department);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Department");
		Assert.assertTrue(true, "Failed To Select Department");
		
//		helper.waitFor(Nodejs);		
//		helper.highLightElement(driver,Nodejs);
//		helper.jsCLick(Nodejs);
//		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> selected nodejs");
//		Assert.assertTrue(true, "Failed To Select NodeJs value");
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver,Save_Button);
		Save_Button.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on save butto");
		Assert.assertTrue(true, "Failed To clik on save button");
	
}
}


