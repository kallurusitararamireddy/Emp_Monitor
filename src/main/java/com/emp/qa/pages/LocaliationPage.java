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
public class LocaliationPage extends BasePage {
	public  LocaliationPage(WebDriver driver) {
		super(TestBase.getDriver());
	

}
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "//a[contains(text(),'Localization')]")
	@CacheLookup
	WebElement Localiation;
	
	@FindBy(xpath = "//select[@id='localeTimezones']")
	@CacheLookup
	WebElement SelectTimezone;
	
	@FindBy(xpath = "//select[contains(@name,'language')]")
	@CacheLookup
	WebElement SelectLanguage;
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	WebElement Save_Button;
	
	public void LocaliationPage()throws InterruptedException{
		
		helper.waitFor(Localiation);		
		helper.highLightElement(driver, Localiation);
		Localiation.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Settings Module and Selected  Localiation Sub-Module ");
		Assert.assertTrue(true, "Failed To Click on Settings Module and Selected  Localiation Sub-Module");
		
		helper.waitFor(SelectTimezone);		
		helper.highLightElement(driver, SelectTimezone); 
		helper.selectDropDownValue(SelectTimezone, "id", "Asia/Kolkata");
		SelectTimezone.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Time-Zone Drop-down  and Selected Time Zone");
		Assert.assertTrue(true, "Failed To Click on  Time-Zone Drop-down and Selected Time Zone");
		
		helper.waitFor(Save_Button);		
		helper.highLightElement(driver, Save_Button);
	    Save_Button.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Save_Button");
		Assert.assertTrue(true, "Failed To Click on  Save_Button");
		
 
}
}


