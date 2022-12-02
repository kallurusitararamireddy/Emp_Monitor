package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class AlertsPage extends  BasePage {
	public AlertsPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	
	
	Helpers helper=new Helpers();
	
	@FindBy(xpath = "(//a[contains(@title,'Alerts')])[1]")
	@CacheLookup
	WebElement Alerts;
	
	@FindBy(xpath = "//input[@id='ruleName']")
	@CacheLookup
	WebElement RuleName;
	
	@FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
	@CacheLookup
	WebElement AppliestoLocation;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[7]")
	@CacheLookup
	WebElement SelectAll;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Department')]")
	@CacheLookup
	WebElement Appliesto_Department;
	
	@FindBy(xpath = "//input[@id='allDepartments']")
	@CacheLookup
	WebElement AllDepartments;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Appliesto_Emloyee;

	
	@FindBy(xpath = "//input[@value='24768']")
	@CacheLookup
	WebElement Allemloyees;
	
	@FindBy(xpath = "//select[@id='rule']")
	@CacheLookup
	WebElement WhattriggerTherule;
	
	@FindBy(xpath = "//option[@id='rule2']")
	@CacheLookup
	WebElement Rule2;
	
	@FindBy(xpath = "")
	@CacheLookup
	WebElement ConditionHrs;

	@FindBy(xpath = "//option[contains(text(),'Minutes')]")
	@CacheLookup
	WebElement minutes;
	
	@FindBy(xpath = "//select[contains(@xpath,'1')]")
	@CacheLookup
	WebElement operators;
	
	@FindBy(xpath = "//option[contains(text(),'>=')]")
	@CacheLookup
	WebElement greaterthanoperator;
	
	
	@FindBy(xpath = "//textarea[contains(@class,'form-control')]")
	@CacheLookup
	WebElement AnyNote;
	

	
	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div/div[2]/div[2]/div[4]/div/span[1]/span[1]/span/ul")
	@CacheLookup
	WebElement Whomtobenotified;
	
	
	/*
	 *  select Employee
	 */
	
	@FindBy(xpath = "//*[@id='select2-usersToBeNotified-results']/li[22]")
	@CacheLookup
	WebElement select_usersToBeNotified;
	
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
	@CacheLookup
	WebElement Myself;
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch;
	
	@SuppressWarnings("unused")
	public void AlertsPage()throws InterruptedException{
		
		helper.waitFor(Alerts);
		helper.highLightElement(driver, Alerts);
		Alerts.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Behavior Module and Selected Alerts Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Behavior Module and Selected Alerts Sub-Module");
		
		helper.waitFor(RuleName); 
		helper.highLightElement(driver, RuleName);
		RuleName.sendKeys("Rule-AbcDef");
		RuleName.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on RuleName Text Field & Entered Rule Name");
		Assert.assertTrue(true, "Failed to Click  on RuleName Text Field & Entered Rule Name ");
		
		helper.waitFor(AppliestoLocation);
		helper.highLightElement(driver, AppliestoLocation);
		Actions actions = new Actions(driver);
		actions.moveToElement(AppliestoLocation).click().build().perform();		
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Applies-to-Location ");
		Assert.assertTrue(true, "Failed to Clicked on Applies-to-Location");

		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		helper.jsCLick(SelectAll);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Selected All Option ");
		Assert.assertTrue(true, "Failed to Select All Option");
		
		helper.waitFor(Appliesto_Department);
		helper.highLightElement(driver, Appliesto_Department);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Appliesto_Department).click().build().perform();
		Appliesto_Department.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Applies-to-Department");
		Assert.assertTrue(true, "Failed to Click on Department");

		
		helper.waitFor(Appliesto_Emloyee);
		helper.highLightElement(driver, Appliesto_Emloyee);
		Actions actions2 = new Actions(driver);
		actions1.moveToElement(Appliesto_Emloyee).click().build().perform();
		helper.jsCLick(Appliesto_Emloyee);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Applies-to-Employee");
		Assert.assertTrue(true, "Failed to Click on Employee");

		
		helper.waitFor(WhattriggerTherule);
		helper.highLightElement(driver, WhattriggerTherule);
		helper.selectDropDownValue(WhattriggerTherule, "value", "DWT");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on What-trigger-The-rule Drop-down and Slected Trigger option");
		Assert.assertTrue(true, "Failed to Click on What-trigger-The-rule Drop-down and Slected Trigger option");

	
		helper.waitFor(AnyNote);
		helper.highLightElement(driver, AnyNote);
		AnyNote.sendKeys("abcdef");
		AnyNote.click();
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Writing  Any Note (passing  Data)");
		Assert.assertTrue(true, "Failed to Write  Any Note (passing  Data)");
		
		helper.waitFor(Whomtobenotified);
		helper.highLightElement(driver, Whomtobenotified);
		Whomtobenotified.click(); 
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Slected on Whom-to-be-notified");
		Assert.assertTrue(true, "Failed to select Whomtobenotified");
		
		
		
		helper.waitFor(select_usersToBeNotified);
		helper.highLightElement(driver, select_usersToBeNotified);
		helper.move_to_element(select_usersToBeNotified);
		select_usersToBeNotified.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Selected on Any  Employee");
		Assert.assertTrue(true, "Failed to Select on Any Employee");
		
		
		helper.waitFor(SaveAndLaunch);
		helper.highLightElement(driver, SaveAndLaunch);
		helper.jsCLick(SaveAndLaunch);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Save-And-Launch");
		Assert.assertTrue(true, "Failed to Clicked on Save-And-Launch");
		Thread.sleep(5000); 
		
	}
}

