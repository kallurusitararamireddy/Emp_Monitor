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
public class TimeClaimPage extends BasePage  {
	public  TimeClaimPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	
	Helpers helper=new Helpers();
	@FindBy(xpath = "//div[@id='reportrange']")
	@CacheLookup
	WebElement SelctDateRanges;
	
	
	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	
	
	@FindBy(xpath = "//li[contains(text(),'Last 30 Days')]")
	@CacheLookup
	WebElement Last30days;
	
	@FindBy(xpath = "//select[@id='statusField']")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//*[@id=\"statusField\"]/option[2]")
	@CacheLookup
	WebElement All;
	
	@FindBy(xpath = "//input[@id='idle-btn']")
	@CacheLookup
	WebElement Idle_Radio_Button;
	
	@FindBy(xpath = "//input[@id='offline-btn']")
	@CacheLookup
	WebElement offline_Radio_Button;
	
	
	
	public void TimeClaimPage()throws InterruptedException{
		
		
		helper.highLightElement(driver,ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on ShowEntries");
		Assert.assertTrue(true, "Failed to clickeonShowEntries");
		
		helper.waitFor(SelctDateRanges);
		helper.highLightElement(driver, SelctDateRanges);
		SelctDateRanges.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B>Selected  Date ranges DropDown Button");
		Assert.assertTrue(true, "Failed to Select SelctDateRanges Drop Down Button");
		
		helper.waitFor(Last30days);
		helper.highLightElement(driver, Last30days);
		Last30days.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B>Selected  Last30days Button");
		Assert.assertTrue(true, "Failed to Select Last30days Button");
		
		helper.waitFor(Status);
		helper.highLightElement(driver, Status);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>Selected  Status Drop Down ");
		Assert.assertTrue(true, "Failed to Select Status DropDown");
		
//		helper.waitFor(Idle_Radio_Button);
//		helper.highLightElement(driver, Idle_Radio_Button);
//		Reporter.log("<B><font color = 'blue'>Step5 .</font></B>Selected Idle_Radio_Button ");
//		Assert.assertTrue(true, "Failed to Select Idle_Radio_Button");
		
		helper.waitFor(offline_Radio_Button);
		helper.highLightElement(driver, offline_Radio_Button);
		offline_Radio_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B>Selected offline_Radio_Button ");
		Assert.assertTrue(true, "Failed to Select offline_Radio_Button");
		Thread.sleep(5000);
		
		
	}
	
}

