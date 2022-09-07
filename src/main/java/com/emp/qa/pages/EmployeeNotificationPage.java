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
public class EmployeeNotificationPage extends BasePage {
	public  EmployeeNotificationPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Employee-Notification')]")
	@CacheLookup
	WebElement EmployeeNotification;
	
	@FindBy(xpath = "//select[@onchange='locChanged(this);']")
	@CacheLookup
	WebElement SelectLocation;
	
	@FindBy(xpath = "//select[@id='deptoption']")
	@CacheLookup
	WebElement SelectDepartment;
	
	@FindBy(xpath = "//select[@id='empoption']")
	@CacheLookup
	WebElement Allemployee;
	
	@FindBy(xpath = "//*[@id=\"empoption\"]/option[2]")
	@CacheLookup
	WebElement Allemploye;
	
	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement Date;
	
	@FindBy(xpath = "//li[contains(text(),'Last Month')]")
	@CacheLookup
	WebElement Lastmonth;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	@CacheLookup
	WebElement CSV;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement PDF;
	
	
	
	
	public void EmployeeNotification()throws InterruptedException{
		helper.waitFor(EmployeeNotification);
		helper.highLightElement(driver, EmployeeNotification);
		EmployeeNotification.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on Employee Notification Tab");
		Assert.assertTrue(true, "Failed to clicke on Employee Notification Tab");
		
		helper.waitFor(SelectLocation);
		helper.highLightElement(driver, SelectLocation);
		helper.selectDropDownValue(SelectLocation, "visibletext", "Bangalore");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Select Location DropDown");
		Assert.assertTrue(true, "Failed To Select Location DropDown");
		
		helper.waitFor(SelectDepartment);
		helper.highLightElement(driver, SelectDepartment);
		helper.selectDropDownValue(SelectDepartment, "index", "2");
		SelectDepartment.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Department DropDown");
		Assert.assertTrue(true, "Failed to Select Department DropDown");
		
		helper.waitFor(Allemployee);
		helper.highLightElement(driver, Allemployee);
		//helper.selectDropDownValue(Allemployee, "value", "All Employee");
		Allemployee.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Allemployee DropDown");
		Assert.assertTrue(true, "Failed Select Allemployee DropDown");
		
		helper.waitFor(Allemploye);
		helper.highLightElement(driver, Allemploye);
		//helper.selectDropDownValue(Allemployee, "value", "All Employee");
		Allemploye.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on Allemploye DropDown");
		Assert.assertTrue(true, "Failed Select Allemploye DropDown");
		
		
		
		helper.waitFor(Date);
		helper.highLightElement(driver, Date);
		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
		Date.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Date");
		Assert.assertTrue(true, "Failed to Select  Date");
		
		helper.waitFor(Lastmonth);
		helper.highLightElement(driver, Lastmonth);
		//helper.selectDropDownValue(Date, "visibletext", "Yesterday");
		Lastmonth.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on Lastmonth");
		Assert.assertTrue(true, "Failed to Select Lastmonth");
		
		helper.waitFor(CSV);
		helper.highLightElement(driver, CSV);
		CSV.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on CSV Button");
		Assert.assertTrue(true, "Failed to click on CSV Button");
		
		
		helper.waitFor(PDF);
		helper.highLightElement(driver, PDF);
		PDF.click();
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on PDF Button");
		Assert.assertTrue(true, "Failed to click on PDF Button");
		Thread.sleep(6000);
		
	
}
}

