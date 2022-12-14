package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class AlertsNotificationPage extends BasePage{
	public AlertsNotificationPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[contains(text(),'Alerts Notifications')]")
	@CacheLookup
	WebElement AlertsNotification;
	
	@FindBy(xpath = "//select[@id='locationdept']")
	@CacheLookup
	WebElement Location;
	
	@FindBy(xpath = "//select[@id='getDepartments']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath = "//select[@id='employee']")
	@CacheLookup
	WebElement Employees;
	
	@FindBy(xpath = "//i[contains(@class,'fa fa-calendar')]")
	@CacheLookup
	WebElement SelectDateranges;
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30Days;
	
	public void AlertsNotificationPage()throws InterruptedException{
		
		helper.waitFor(AlertsNotification);
		helper.highLightElement(driver, AlertsNotification);
		AlertsNotification.click(); 
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Behavior Module and Selected Alerts Notification Sub-Module");
		Assert.assertTrue(true, "Failed to Click on Behavior Module and Selected Alerts Notification Sub-Module");
		
		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "value", "0");
		Location.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Location Drop-Down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-Down and Selected Any Location");
		
		helper.waitFor(Department);
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "0");
		Department.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Department Drop-Down and Selected Any Department");
		Assert.assertTrue(true, "Failed to Click on Department Drop-Down and Selected Any Department");
		
		helper.waitFor(Employees);
		helper.highLightElement(driver, Employees); 
	    helper.jsScrollintoview(Employees);
		helper.selectDropDownValue(Employees, "value","0");
		helper.jsCLick(Employees);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee Drop-Down and Selected Any employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-Down and Selected Any employee");
		
		helper.waitFor(SelectDateranges);
		helper.highLightElement(driver, SelectDateranges); 
		SelectDateranges.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Calender Drop-Down and Selected Days ");
		Assert.assertTrue(true, "Failed to Click on Calender Drop-Down and Selected Days");
		
		helper.waitFor(Last30Days);
		helper.highLightElement(driver, Last30Days);
		Last30Days.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Last_30_Days");
		Assert.assertTrue(true, "Failed to Click on Last_30_Days");
		Thread.sleep(5000);  
	
		
		
	}
}

