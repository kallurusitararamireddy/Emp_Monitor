package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class LocationsAndDepartmentPage extends BasePage{

	public LocationsAndDepartmentPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
Helpers helper=new Helpers();
	
	@FindBy(xpath="//a[contains(text(),'Manage Locations & Departments')]")
	@CacheLookup
	WebElement ManageLocationsAnd_Departmets;
	
	@FindBy(xpath="//button[contains(text(),'Add Location & Departments')]")
	@CacheLookup
	WebElement AddLocationsandDepartments;
	
	@FindBy(xpath="//select[@id='TimeZoneID']")
	@CacheLookup
	WebElement SelectTimezone;
	
	@FindBy(xpath="//input[@id='locatinName']")
	@CacheLookup
	WebElement Type_Location;
	
	@FindBy(xpath="//select[@id='addLocGetDepartments']")
	@CacheLookup
	WebElement EnterDepartments;
	
	@FindBy(xpath="//li[@id='select2-addLocGetDepartments-result-h204-1']")
	@CacheLookup
	WebElement Nodejs;
	
	@FindBy(xpath="//button[@id='addLocId']")
	@CacheLookup
	WebElement AddLocation_Button;
	
	public void LocationsAndDepartmentPage()throws InterruptedException{
		
		helper.highLightElement(driver,ManageLocationsAnd_Departmets);
		ManageLocationsAnd_Departmets.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on ManageLocationsAnd_Departmets");
		Assert.assertTrue(true, "Failed to click on ManageLocationsAnd_Departmets");
		
		helper.waitFor(AddLocationsandDepartments);
		helper.highLightElement(driver,AddLocationsandDepartments);
		AddLocationsandDepartments.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on AddLocationsandDepartments");
		Assert.assertTrue(true, "Failed to click on AddLocationsandDepartments");
		
		
		helper.waitFor(SelectTimezone);
		helper.highLightElement(driver,SelectTimezone);
		helper.selectDropDownValue(SelectTimezone, "value", "AsiaKolkata");
		SelectTimezone.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on SelectTimezone");
		Assert.assertTrue(true, "Failed to click on SelectTimezone");
		
		
		
		helper.waitFor(Type_Location);
		helper.highLightElement(driver,Type_Location);
		Type_Location.sendKeys("Patna");
		//Type_Location.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Type_Location");
		Assert.assertTrue(true, "Failed to click on Type_Location");
		
		
		helper.waitFor(EnterDepartments);
		helper.highLightElement(driver,EnterDepartments);
	    helper.selectDropDownValue(EnterDepartments, "value", "1");
		helper.jsCLick(EnterDepartments);
		//EnterDepartments.click();
		//helper.waitFor(Nodejs);
		//Nodejs.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on EnterDepartments");
		Assert.assertTrue(true, "Failed to click on EnterDepartments");
		
		helper.waitFor(AddLocation_Button);
		helper.highLightElement(driver,AddLocation_Button);
		helper.jsCLick(AddLocation_Button);
		//AddLocation_Button.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on AddLocation_Button ");
		Assert.assertTrue(true, "Failed to click on AddLocation_Button");
		Thread.sleep(5000);
	
	
}
	

}
