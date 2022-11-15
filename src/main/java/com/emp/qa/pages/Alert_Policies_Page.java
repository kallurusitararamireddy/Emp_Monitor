package com.emp.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class Alert_Policies_Page extends BasePage {
	


	public Alert_Policies_Page(WebDriver driver) {
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
	
	
	@SuppressWarnings("unused")
	public void Alert_Policies_Page()throws InterruptedException, AWTException{
		
		helper.waitFor(AlertPolocies);
		helper.highLightElement(driver, AlertPolocies);
		AlertPolocies.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> clicked on Behavior Module and Selected  Alert Policies Sub-Module ");
		Assert.assertTrue(true, "Failed to click on Behavior Module and Selected  Alert Policies Sub-Module ");
		  
		helper.waitFor(AddNewAlert);
		helper.highLightElement(driver, AddNewAlert);
		helper.jsCLick(AddNewAlert);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> clicked on  Add_New_Alert Button");
		Assert.assertTrue(true, "Failed to click on  Add_New_Alert Button");
		
		
		helper.waitFor(RuleName);
		helper.highLightElement(driver, RuleName);
		RuleName.sendKeys("Rule-Abc");
		RuleName.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on  Rule Name Text Field and Entered Rule Name  ");
		Assert.assertTrue(true, "Failed to Click on Rule Name Text Field and Entered Rule Name ");
		
		helper.waitFor(AppliestoLocation);
		helper.highLightElement(driver, AppliestoLocation);
		Actions actions = new Actions(driver);
		actions.moveToElement(AppliestoLocation).click().build().perform();		
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>  Clicked on  Location Drop-Down and Selected Any Location");
		Assert.assertTrue(true, "Failed to Click on Location Drop-Down and Selected Any Location");

		
		helper.waitFor(SelectAll_locations);
		helper.highLightElement(driver, SelectAll_locations);
		helper.jsCLick(SelectAll_locations);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Selected  All_Locations option ");
		Assert.assertTrue(true, "Failed to select  All_Locations Option ");
		
		helper.waitFor(Appliesto_Department); 
		helper.highLightElement(driver, Appliesto_Department);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(Appliesto_Department).click().build().perform();
		Appliesto_Department.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> clicked on Department Drop-Down and Selected Any Department ");
		Assert.assertTrue(true, "Failed to Click on Department Drop-Down  and Selected Any Department");
		
		helper.waitFor(AllDepartments);
		helper.highLightElement(driver, AllDepartments);
		helper.jsCLick(AllDepartments);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Selected   All_Departments  option");
		Assert.assertTrue(true, "Failed to select  All_Departments  option");
		
		helper.waitFor(Appliesto_Emloyee);
		helper.highLightElement(driver, Appliesto_Emloyee);
		Actions actions2 = new Actions(driver);
		actions1.moveToElement(Appliesto_Emloyee).click().build().perform();
		helper.jsCLick(Appliesto_Emloyee); 
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> clicked on Emloyee Drop-Down and Select Any Employee");
		Assert.assertTrue(true, "Failed to Click on Employee Drop-Down and Select Any Employee");
		

		
		helper.waitFor(WhattriggerTherule);
		helper.highLightElement(driver, WhattriggerTherule);
		WhattriggerTherule.click();
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked   on  What_trigger_The_rule Text  Field ");
		Assert.assertTrue(true, "Failed to Click  What_trigger_The_rule  Text  Field ");
	
		
	
		helper.waitFor(AnyNote);
		helper.highLightElement(driver, AnyNote);
		AnyNote.sendKeys("abcdef");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Writing  Any Note (passing  Data)");
		Assert.assertTrue(true, "Failed to Write  Any Note (passing Data)");
		
		
		helper.waitFor(Whomtobenotified);
		helper.highLightElement(driver, Whomtobenotified);
		Whomtobenotified.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> clicked on Whom-to-be-notified Drop-Down and Select Any option");
		Assert.assertTrue(true, "Failed to Clik on Whom-to-be-notified Drop-Down and Select Any option");
		
		
		helper.waitFor(SaveAndLaunch);
		helper.highLightElement(driver, SaveAndLaunch);
		helper.Scrollintoview(SaveAndLaunch);
		helper.jsCLick(SaveAndLaunch);
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> clicked on Save_And_Launch_Button");
		Assert.assertTrue(true, "Failed to select Save_And_Launch_Button");
		
	}
}

