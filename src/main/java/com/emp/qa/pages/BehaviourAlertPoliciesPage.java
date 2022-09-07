package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class BehaviourAlertPoliciesPage extends BasePage {

	public BehaviourAlertPoliciesPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[contains(text(),'Alert Policies')]")
	@CacheLookup
	WebElement AlertPolocies;
	
	
	@FindBy(xpath = "//tbody/tr[@id='tr646']/td[7]/a[1]/i[1]")
	@CacheLookup
	WebElement EditButton;
	
	
	@FindBy(xpath = "(//label[@for='isMultiple'])[1]")
	@CacheLookup
	WebElement MultipleAlertsInAday;
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch;
	
	
	public void BehaviourAlertPoliciesPage()throws InterruptedException{
		
		helper.waitFor(AlertPolocies);
		helper.highLightElement(driver, AlertPolocies);
		AlertPolocies.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on AlertPoloces ");
		Assert.assertTrue(true, "Failed to click on AlertPoloces");	
		
		
		helper.waitFor(EditButton);
		helper.highLightElement(driver, EditButton);
		EditButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on EditButton ");
		Assert.assertTrue(true, "Failed to click on EditButton");
		
		helper.waitFor(MultipleAlertsInAday);
		helper.highLightElement(driver, MultipleAlertsInAday);
		MultipleAlertsInAday.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on MultipleAlertsInAday ");
		Assert.assertTrue(true, "Failed to click on MultipleAlertsInAday");
		
		helper.waitFor(SaveAndLaunch);
		helper.highLightElement(driver, SaveAndLaunch);
		helper.Scrollintoview(SaveAndLaunch);
		helper.jsCLick(SaveAndLaunch);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on SaveAndLaunch_Button");
		Assert.assertTrue(true, "Failed to select SaveAndLaunch_Button");
		Thread.sleep(5000);
		
		
		
		
	}

}
