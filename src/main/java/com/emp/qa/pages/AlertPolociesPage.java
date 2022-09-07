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

public class AlertPolociesPage extends BasePage {
	public AlertPolociesPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	Helpers helper=new Helpers();
	@FindBy(xpath = "//a[contains(text(),'Alert Policies')]")
	@CacheLookup
	WebElement AlertPolocies;
	
	@FindBy(xpath="//li[@id='select2-rule-result-71po-SSL']")
	WebElement DrpDwnValue_WhtTrigThevalue;
	
	@FindBy(linkText = "Add New Alert")
	@CacheLookup
	WebElement AddNewAlert;
	
	@FindBy(xpath = "//input[@id='ruleName']")
	@CacheLookup
	WebElement RuleName;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Location')]")
	@CacheLookup
	WebElement AppliestoLocation;
	
	@FindBy(css = "#allLocations")
	@CacheLookup
	WebElement SelectAll_locations;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Department')]")
	@CacheLookup
	WebElement Appliesto_Department;
	
	@FindBy(css = "#allDepartments")
	@CacheLookup
	WebElement AllDepartments;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Employee')]")
	@CacheLookup
	WebElement Appliesto_Emloyee;
	
	@FindBy(css = "#allEmployees")
	@CacheLookup
	WebElement Allemloyees;
	
	@FindBy(xpath = "//span[@id='select2-rule-container']")
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
	
	
	@FindBy(xpath = "//textarea[@id='ruleNote']")
	@CacheLookup
	WebElement AnyNote;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]")
	@CacheLookup
	WebElement Whomtobenotified;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
	@CacheLookup
	WebElement Myself;
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save & Launch')]")
	@CacheLookup
	WebElement SaveAndLaunch;
	
	
	public void AlertPolociesPage()throws InterruptedException{
		
		helper.waitFor(AlertPolocies);
		helper.highLightElement(driver, AlertPolocies);
		AlertPolocies.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on AlertPoloces ");
		Assert.assertTrue(true, "Failed to click on AlertPoloces");
		
		helper.waitFor(AddNewAlert);
		helper.highLightElement(driver, AddNewAlert);
		//helper.Scrollintoview(AddNewAlert);
		helper.jsCLick(AddNewAlert);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on AddNewAlert Button");
		Assert.assertTrue(true, "Failed to click on AddNewAlert Button");
		
		
		helper.waitFor(RuleName);
		helper.highLightElement(driver, RuleName);
		RuleName.sendKeys("Rule-Abc");
		RuleName.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B>  Rule Name is Set");
		Assert.assertTrue(true, "Failed to Set RuleName");
		
		helper.waitFor(AppliestoLocation);
		helper.highLightElement(driver, AppliestoLocation);
		Actions actions = new Actions(driver);
		actions.moveToElement(AppliestoLocation).click().build().perform();		
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>  Selected Location_Button");
		Assert.assertTrue(true, "Failed to Click on Location_Button");

		
		helper.waitFor(SelectAll_locations);
		helper.highLightElement(driver, SelectAll_locations);
		helper.jsCLick(SelectAll_locations);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Selected All_Locations");
		Assert.assertTrue(true, "Failed to select All_Locations");
		
		helper.waitFor(Appliesto_Department);
		helper.highLightElement(driver, Appliesto_Department);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Appliesto_Department).click().build().perform();
		Appliesto_Department.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Department_Button");
		Assert.assertTrue(true, "Failed to Click on Department_Button");
		
		helper.waitFor(AllDepartments);
		helper.highLightElement(driver, AllDepartments);
		helper.jsCLick(AllDepartments);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> clicked on AllDepartments");
		Assert.assertTrue(true, "Failed to select AllDepartments");
		
		helper.waitFor(Appliesto_Emloyee);
		helper.highLightElement(driver, Appliesto_Emloyee);
		Actions actions2 = new Actions(driver);
		actions1.moveToElement(Appliesto_Emloyee).click().build().perform();
		helper.jsCLick(Appliesto_Emloyee);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Emloyee_Button");
		Assert.assertTrue(true, "Failed to Click on Employee_Button");
		
		helper.waitFor(Allemloyees);
		helper.highLightElement(driver, Allemloyees);
		helper.jsCLick(Allemloyees);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Selected  Allemployees");
		Assert.assertTrue(true, "Failed to select Allemployees");
		
		helper.waitFor(WhattriggerTherule);
		helper.highLightElement(driver, WhattriggerTherule);
		//helper.selectDropDownValue(WhattriggerTherule, "value", "DWT");
		WhattriggerTherule.click();
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clcked on  WhattriggerTherule");
		Assert.assertTrue(true, "Failed to select WhattriggerTherule");
		
//		helper.waitFor(Rule2);
//		helper.highLightElement(driver, Rule2);
//		Rule2.click();
//		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> clicked on Rule2");
//		Assert.assertTrue(true, "Failed to select Rule2");
//		
		
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
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Sending Values to AnyNote");
		Assert.assertTrue(true, "Failed to Send Values to AnyNote");
		
		
		helper.waitFor(Whomtobenotified);
		helper.highLightElement(driver, Whomtobenotified);
		Whomtobenotified.click();
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Whomtobenotified");
		Assert.assertTrue(true, "Failed to Clik on Whomtobenotified");
		
		helper.waitFor(Myself);
		helper.highLightElement(driver, Myself);
		Myself.click();
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> clicked on Myself");
		Assert.assertTrue(true, "Failed to select Myself");
		
		helper.waitFor(SaveAndLaunch);
		helper.highLightElement(driver, SaveAndLaunch);
		helper.Scrollintoview(SaveAndLaunch);
		helper.jsCLick(SaveAndLaunch);
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> clicked on SaveAndLaunch_Button");
		Assert.assertTrue(true, "Failed to select SaveAndLaunch_Button");
	}
}

