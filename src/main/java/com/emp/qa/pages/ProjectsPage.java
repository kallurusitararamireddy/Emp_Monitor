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
public class ProjectsPage extends BasePage {
	public  ProjectsPage(WebDriver driver) {
		super(TestBase.getDriver());

}
	Helpers helper=new Helpers();
	
	@FindBy(xpath="//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;
	
	
	@FindBy(xpath="//select[@id='filterStatusList']")
	@CacheLookup
	WebElement SelectStatus;
	
	@FindBy(xpath="//b[contains(text(),'testing4')]")
	@CacheLookup
	WebElement ProjectName;
	
	@FindBy(xpath="//a[@id='myBtn1']")
	@CacheLookup
	WebElement ShowMore;
	
	@FindBy(xpath="//a[contains(text(),'Add Module')]")
	@CacheLookup
	WebElement AddModule;
	
	@FindBy(xpath="//button[@id='addModuleButton']")
	@CacheLookup
	WebElement AddModule_Button;
	
	@FindBy(xpath="//select[@id='projectsList']")
	@CacheLookup
	WebElement projectname;
	

	@FindBy(xpath="//input[@id='createModuleName']")
	@CacheLookup
	WebElement ModuleName;
	
	@FindBy(xpath="//input[@id='createModuleStartDate']")
	@CacheLookup
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='createModuleEndDate']")
	@CacheLookup
	WebElement EndDate;
	
	@FindBy(xpath="//*[@id=\"newModule\"]/div/div/div[3]/button")
	@CacheLookup
	WebElement Save;
	
	public void ProjectsPage()throws InterruptedException{
	
	
		helper.highLightElement(driver,ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "4");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on ShowEntries DropDown");
		Assert.assertTrue(true, "Failed to click on ShowEntries Drop Down");
		
		helper.highLightElement(driver,SelectStatus);
		helper.selectDropDownValue(SelectStatus, "value", "1");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on SelectStatus Drop Down");
		Assert.assertTrue(true, "Failed to click on SelectStatus Drop Down");
		
		helper.highLightElement(driver,ProjectName);
		//helper.selectDropDownValue(ProjectName, "value", "1");
		ProjectName.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on ProjectName");
		Assert.assertTrue(true, "Failed to click on ProjectName");
		
		helper.highLightElement(driver,ShowMore);
		ShowMore.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on ShowMore");
		Assert.assertTrue(true, "Failed to click on ShowMore");
		
		helper.highLightElement(driver,AddModule);
		AddModule.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on AddModule");
		Assert.assertTrue(true, "Failed to click on AddModule");
		
		helper.highLightElement(driver,AddModule_Button);
		AddModule_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on AddModule_Button");
		Assert.assertTrue(true, "Failed to click on AddModule_Button");
		
		
		helper.highLightElement(driver,projectname);
		//ModuleName.click();
		helper.selectDropDownValue(projectname, "value", "645");
		//ModuleName.sendKeys("AutomationCode");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on projectname");
		Assert.assertTrue(true, "Failed to click on projectname");
		
		
		
		
		helper.highLightElement(driver,ModuleName);
		//ModuleName.click();
		//helper.selectDropDownValue(ModuleName, "value", "645");
		ModuleName.sendKeys("AutomationCode");
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on ModuleName");
		Assert.assertTrue(true, "Failed to click on ModuleName");
		
		
		
		
		
		helper.highLightElement(driver,StartDate);
		StartDate.click();
		StartDate.sendKeys("05072020");
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		
		helper.highLightElement(driver,EndDate);
		EndDate.click();
		EndDate.sendKeys("06052021");
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
	
		helper.highLightElement(driver,Save);
		Save.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Save Button");
		Assert.assertTrue(true, "Failed to click on Save Button");
	
}
}

