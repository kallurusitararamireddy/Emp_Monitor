package com.emp.qa.pages;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class LocationsAndDepartmentPage extends BasePage {

	public LocationsAndDepartmentPage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[contains(text(),'Manage Locations & Departments')]")
	@CacheLookup
	WebElement ManageLocationsAnd_Departmets;

	@FindBy(xpath = "//button[contains(text(),'Add Location & Departments')]")
	@CacheLookup
	WebElement AddLocationsandDepartments;

	@FindBy(xpath = "//select[@id='TimeZoneID']")
	@CacheLookup
	WebElement SelectTimezone;

	@FindBy(xpath = "//input[@id='locatinName']")
	@CacheLookup
	WebElement Type_Location;

	@FindBy(xpath = "//*[@id='addLocationModal']/div/div/div[2]/div[1]/div[3]/span[1]/span[1]/span/ul/li/input")
	@CacheLookup
	WebElement EnterDepartments;

	@FindBy(xpath = "//li[@id='select2-addLocGetDepartments-result-h204-1']")
	@CacheLookup
	WebElement Nodejs;

	@FindBy(xpath = "//button[@id='addLocId']")
	@CacheLookup
	WebElement AddLocation_Button;

	public void LocationsAndDepartmentPage() throws InterruptedException, AWTException {

		helper.highLightElement(driver,ManageLocationsAnd_Departmets);
		ManageLocationsAnd_Departmets.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on ManageLocationsAnd_Departmets");
		Assert.assertTrue(true, "Failed to click on ManageLocationsAnd_Departmets");
		
		helper.waitFor(AddLocationsandDepartments);
		helper.highLightElement(driver,AddLocationsandDepartments);
		AddLocationsandDepartments.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on AddLocations and Departments Button");
		Assert.assertTrue(true, "Failed to click on AddLocations and Departments Button");
		
		
		helper.waitFor(SelectTimezone);
		helper.highLightElement(driver,SelectTimezone);
		helper.selectDropDownValue(SelectTimezone, "value", "AsiaKolkata");
		SelectTimezone.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on SelectTimezone Drop_Down & Select Time Zone ");
		Assert.assertTrue(true, "Failed to click on SelectTimezone Drop_Down & Select Time Zone");
		
		/*
		 *  Checking with  Location name  or  Change the location name
		 */
		
		helper.waitFor(Type_Location);
		helper.highLightElement(driver,Type_Location);
		Type_Location.sendKeys("mumbai");
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Location Drop_Down & Select Location");
		Assert.assertTrue(true, "Failed to click on Location Drop_Down & Select Location");
		
		
		helper.waitFor(EnterDepartments);
		helper.highLightElement(driver,EnterDepartments);
		helper.move_to_element_click_target(EnterDepartments);
		helper.robot_fourth_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Departments Drop-Down & Select Department");
		Assert.assertTrue(true, "Failed to click on Departments & Select Department");
		
		helper.waitFor(AddLocation_Button);
		helper.highLightElement(driver,AddLocation_Button);
		helper.jsCLick(AddLocation_Button);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on AddLocation_Button ");
		Assert.assertTrue(true, "Failed to click on AddLocation_Button");
		Thread.sleep(5000);

	}

}
