package com.emp.qa.pages;

import java.awt.AWTException;

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
public class ManageLocationsAndDepartmentPage extends BasePage {
	
	public  ManageLocationsAndDepartmentPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id='addLocationModal']/div/div/div[2]/div[1]/div[3]/span[1]/span[1]/span/ul/li/input")
	@CacheLookup
	WebElement EnterDepartments;
	
	@FindBy(xpath="//li[@id='select2-addLocGetDepartments-result-h204-1']")
	@CacheLookup
	WebElement Nodejs;
	
	@FindBy(xpath="//button[@id='addLocId']")
	@CacheLookup
	WebElement AddLocation_Button;
	
	public void ManageLocationsAndDepartmentPage()throws InterruptedException, AWTException{
		
		helper.highLightElement(driver,ManageLocationsAnd_Departmets);
		ManageLocationsAnd_Departmets.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on Settings Module ans Selected  Manage-Locations-And-Departmets Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Settings Module ans Selected  Manage-Locations-And-Departmets Sub-Module ");
		  
		helper.waitFor(AddLocationsandDepartments); 
		helper.highLightElement(driver,AddLocationsandDepartments);
		AddLocationsandDepartments.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Add Locations-and-Departments Button");
		Assert.assertTrue(true, "Failed to Click on Add Locations-and-Departments Button ");
		
		
		helper.waitFor(SelectTimezone);
		helper.highLightElement(driver,SelectTimezone);
		helper.selectDropDownValue(SelectTimezone, "value", "AsiaKolkata");
		SelectTimezone.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Timezone Drop-down and  Selected Time Zone");
		Assert.assertTrue(true, "Failed to Click on Timezone Drop-down and  Selected Time Zone");
		
		
		
		helper.waitFor(Type_Location);
		helper.highLightElement(driver,Type_Location);
		Type_Location.sendKeys("Vizag");
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Location Text field and Entered Location name  ");
		Assert.assertTrue(true, "Failed to Click on Location Text field and Entered Location name ");
		
		
		helper.waitFor(EnterDepartments);
		helper.highLightElement(driver,EnterDepartments);
		helper.move_to_element_click_target(EnterDepartments);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Departments Drop-Down and  Selected Department ");
		Assert.assertTrue(true, "Failed to  Click on Departments Drop-Down and  Selected Department");
		
		helper.waitFor(AddLocation_Button);
		helper.highLightElement(driver,AddLocation_Button);
		helper.jsCLick(AddLocation_Button);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Add-Location Button ");
		Assert.assertTrue(true, "Failed to Click on Add-Location Button");
		Thread.sleep(5000);
	
	
}
}


