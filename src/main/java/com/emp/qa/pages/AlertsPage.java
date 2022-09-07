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
	
//	@FindBy(xpath = "//input[@id='allEmployees']")
//	@CacheLookup
//	WebElement Allemloyees;
	
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
	
//	@FindBy(xpath = "//select[@id='usersToBeNotified']")
//	@CacheLookup
//	WebElement Whomtobenotified;
	
	@FindBy(xpath = "//select[@id='usersToBeNotified']")
	@CacheLookup
	WebElement Whomtobenotified;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
	@CacheLookup
	WebElement Myself;
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch;
	
	public void AlertsPage()throws InterruptedException{
		
		helper.waitFor(Alerts);
		helper.highLightElement(driver, Alerts);
		Alerts.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Alerts");
		Assert.assertTrue(true, "Failed to click on Alerts");
		
		helper.waitFor(RuleName);
		helper.highLightElement(driver, RuleName);
		RuleName.sendKeys("Rule-AbcDef");
		RuleName.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on RuleName");
		Assert.assertTrue(true, "Failed to click on RuleName");
		
		helper.waitFor(AppliestoLocation);
		helper.highLightElement(driver, AppliestoLocation);
		Actions actions = new Actions(driver);
		actions.moveToElement(AppliestoLocation).click().build().perform();		
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> clicked on AppliestoLocation");
		Assert.assertTrue(true, "Failed to select Location");

		
		helper.waitFor(SelectAll);
		helper.highLightElement(driver, SelectAll);
		helper.jsCLick(SelectAll);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> clicked on Appliesto_Department");
		Assert.assertTrue(true, "Failed to select Department");
		
		helper.waitFor(Appliesto_Department);
		helper.highLightElement(driver, Appliesto_Department);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Appliesto_Department).click().build().perform();
		Appliesto_Department.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> clicked on Appliesto_Department");
		Assert.assertTrue(true, "Failed to select Department");
		
		helper.waitFor(AllDepartments);
		helper.highLightElement(driver, AllDepartments);
		helper.jsCLick(AllDepartments);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on AllDepartments");
		Assert.assertTrue(true, "Failed to select AllDepartments");
		
		helper.waitFor(Appliesto_Emloyee);
		helper.highLightElement(driver, Appliesto_Emloyee);
		Actions actions2 = new Actions(driver);
		actions1.moveToElement(Appliesto_Emloyee).click().build().perform();
		helper.jsCLick(Appliesto_Emloyee);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on Appliesto_Emloyee");
		Assert.assertTrue(true, "Failed to select Appliesto_Emloyee");
		
		helper.waitFor(Allemloyees);
		helper.highLightElement(driver, Allemloyees);
		helper.jsCLick(Allemloyees);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Allemloyees");
		Assert.assertTrue(true, "Failed to select Allemloyees");
		
		helper.waitFor(WhattriggerTherule);
		helper.highLightElement(driver, WhattriggerTherule);
		helper.selectDropDownValue(WhattriggerTherule, "value", "DWT");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> clicked on WhattriggerTherule");
		Assert.assertTrue(true, "Failed to select WhattriggerTherule");
		
//		helper.waitFor(Rule2);
//		helper.highLightElement(driver, Rule2);
//		Rule2.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Rule2");
//		Assert.assertTrue(true, "Failed to select Rule2");
		
		
//		helper.waitFor(ConditionHrs);
//		helper.highLightElement(driver, ConditionHrs);
//		ConditionHrs.click();
//		helper.Scrollintoview(ConditionHrs);
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on ConditionHrs");
//		Assert.assertTrue(true, "Failed to select ConditionHrs");
//		
//		helper.waitFor(minutes);
//		helper.highLightElement(driver, minutes);
//		minutes.click();
//		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on minutes");
//		Assert.assertTrue(true, "Failed to select minutes");
//		
//		helper.waitFor(operators);
//		helper.highLightElement(driver, operators);
//		//helper.selectDropDownValue(operators, "value", "<=");
//		operators.click();
//		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on operators");
//		Assert.assertTrue(true, "Failed to select operators");
//		
//		helper.waitFor(greaterthanoperator);
//		helper.highLightElement(driver, greaterthanoperator);
//		//helper.selectDropDownValue(operators, "value", "<=");
//		greaterthanoperator.click();
//		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on greaterthanoperator");
//		Assert.assertTrue(true, "Failed to select greaterthanoperator");
//		
		
	
		helper.waitFor(AnyNote);
		helper.highLightElement(driver, AnyNote);
		AnyNote.sendKeys("abcdef");
		AnyNote.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on AnyNote");
		Assert.assertTrue(true, "Failed to select AnyNote");
		
		helper.waitFor(Whomtobenotified);
		helper.highLightElement(driver, Whomtobenotified);
		helper.selectDropDownValue(Whomtobenotified, "value", "51247");
		//Whomtobenotified.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Whomtobenotified");
		Assert.assertTrue(true, "Failed to select Whomtobenotified");
		
//		helper.waitFor(Myself);
//		helper.highLightElement(driver, Myself);
//		Myself.click();
//		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on Myself");
//		Assert.assertTrue(true, "Failed to select Myself");
		
		helper.waitFor(SaveAndLaunch);
		helper.highLightElement(driver, SaveAndLaunch);
		helper.jsCLick(SaveAndLaunch);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on SaveAndLaunch");
		Assert.assertTrue(true, "Failed to select SaveAndLaunch");
		Thread.sleep(5000);
		
	}
}

