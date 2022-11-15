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
	WebElement AlertPolicies;
	

	@FindBy(xpath = "(//*[@id='policyTableBody']//td[8]/a)[1]")
	@CacheLookup
	WebElement EditButton;
	
	
	@FindBy(xpath = "(//label[@for='isMultiple'])[1]")
	@CacheLookup
	WebElement MultipleAlertsInAday;
	
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch;
	
	
	public void BehaviourAlertPoliciesPage()throws InterruptedException{
		
		helper.waitFor(AlertPolicies);
		helper.highLightElement(driver, AlertPolicies);
		AlertPolicies.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Alert_Policies ");
		Assert.assertTrue(true, "Failed to click on Alert_Policies");	
		Thread.sleep(2000);
		
		helper.waitFor(EditButton);
		helper.highLightElement(driver, EditButton);
		helper.move_to_element(EditButton);
		EditButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on Edit_Button ");
		Assert.assertTrue(true, "Failed to click on Edit_Button");
		
		helper.waitFor(MultipleAlertsInAday);
		helper.highLightElement(driver, MultipleAlertsInAday);
		helper.move_to_element_click_target(MultipleAlertsInAday);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on Multiple_Alerts_In_A_day ");
		Assert.assertTrue(true, "Failed to click on Multiple_Alerts_In_A_day");
		Thread.sleep(5000);
		
		
		helper.waitFor(SaveAndLaunch);
		helper.highLightElement(driver, SaveAndLaunch);
		helper.Scrollintoview(SaveAndLaunch);
		helper.jsCLick(SaveAndLaunch);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Save_And_Launch_Button");
		Assert.assertTrue(true, "Failed to select Save_And_Launch_Button");
		Thread.sleep(4000);
		
		
		
		
	}

}
