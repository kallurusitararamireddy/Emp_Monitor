package com.emp.qa.pages;

import java.awt.AWTException;

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
	
	
	@FindBy(xpath="//*[@id='filterStatusList']")
	@CacheLookup
	WebElement SelectStatus;
	
	@FindBy(xpath="//*[@id='951']/td[2]/a/b")
	@CacheLookup
	WebElement ProjectName;
	
	@FindBy(xpath="//a[@id='myBtn1']")
	@CacheLookup
	WebElement ShowMore;
	
	
	/*
	 *  add Module 
	 */
	
	@FindBy(xpath="//a[contains(text(),'Add Module')]")
	@CacheLookup
	WebElement AddModule;
	
	@FindBy(xpath="//button[@id='addModuleButton']")
	@CacheLookup
	WebElement AddModule_Button;
	
	@FindBy(xpath="//select[@id='projectsList']")
	@CacheLookup
	WebElement Project_name;
	

	@FindBy(xpath="//input[@id='createModuleName']")
	@CacheLookup
	WebElement ModuleName;
	
	@FindBy(xpath="//input[@id='createModuleStartDate']")
	@CacheLookup
	WebElement StartDate;
	
	@FindBy(xpath="//input[@id='createModuleEndDate']")
	@CacheLookup
	WebElement EndDate;
	
	@FindBy(xpath="//*[@id='newModule']/div/div/div[3]/button")
	@CacheLookup
	WebElement Save;
	
	/*
	 *  Add  Task 
	 */
	
	@FindBy(xpath="//*[@aria-labelledby='actionBtn']/a[3]")
	@CacheLookup
	WebElement Add_plus;
	
	@FindBy(xpath="//*[@id='newTaskName']")
	@CacheLookup
	WebElement task_name;
	
	@FindBy(xpath="//*[@id='newTaskAssignee']")
	@CacheLookup
	WebElement Assignee;
	
	@FindBy(xpath="//*[@id=\"newTaskPriority\"]")
	@CacheLookup
	WebElement Task_Priority;
	
	@FindBy(xpath="//*[@id='taskUpdateStatus']")
	@CacheLookup
	WebElement taskUpdateStatus;
	
	
//	@FindBy(xpath="//*[@id='newTaskStartDate' and  @ type='date' ]")
	@FindBy(xpath="//*[contains(@id,'TaskStartDate')]")
	@CacheLookup
	WebElement Task_StartDate;
	
	@FindBy(xpath="//*[@id='newTaskEndDate']")
	@CacheLookup
	WebElement Task_EndDate;
	
	@FindBy(xpath="//*[@id='task_list_add']/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Task_save;
	
	
	
	
	
	
	
	public void ProjectsPage()throws InterruptedException, AWTException{
	
	
		helper.highLightElement(driver,ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "3");
		ShowEntries.click(); 
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on ShowEntries DropDown");
		Assert.assertTrue(true, "Failed to click on ShowEntries Drop Down");
		
		helper.highLightElement(driver,SelectStatus);
		Thread.sleep(1000);
		helper.selectDropDownValue(SelectStatus, "value", "All");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on SelectStatus Drop Down");
		Assert.assertTrue(true, "Failed to click on SelectStatus Drop Down");
		Thread.sleep(2000);
		
		helper.highLightElement(driver,ProjectName);
		helper.move_to_element_click_target(ProjectName);
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
		
		
		helper.highLightElement(driver,Project_name);
		helper.selectDropDownValue(Project_name, "value", "951");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on projectname");
		Assert.assertTrue(true, "Failed to click on projectname");
		
		
		helper.highLightElement(driver,ModuleName);
		ModuleName.sendKeys("AutomationCode");
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on ModuleName");
		Assert.assertTrue(true, "Failed to click on ModuleName");
		
		
		helper.highLightElement(driver,StartDate);
		StartDate.click();
		StartDate.sendKeys("15112022");
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		
		helper.highLightElement(driver,EndDate);
		EndDate.click();
		EndDate.sendKeys("25112022");
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
	 
		helper.highLightElement(driver,Save);
		Save.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Save Button");
		Assert.assertTrue(true, "Failed to click on Save Button");
		Thread.sleep(1000);
		
		/*
		 *  Add Task 
		 */
		
		helper.highLightElement(driver,Add_plus); 
		Add_plus.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to click on Add_plus Button");
		
		helper.highLightElement(driver,task_name);
        task_name.sendKeys("Demo");
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to click on Add_plus Button");
		
		helper.highLightElement(driver,Assignee);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to click on Add_plus Button");
		
		helper.highLightElement(driver,Task_Priority);
		Task_Priority.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to click on Add_plus Button");
		
		
		helper.highLightElement(driver,taskUpdateStatus);
		taskUpdateStatus.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to click on Add_plus Button");
		
		
		helper.highLightElement(driver,Task_StartDate);
		Task_StartDate.click();
		Task_StartDate.sendKeys("17112022");
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		 
		helper.highLightElement(driver,Task_EndDate);
		Task_EndDate.click();
		Task_EndDate.sendKeys("20112022");
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
	 
		helper.highLightElement(driver,Task_save);
		Task_save.click();
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> clicked on Save Button");
		Assert.assertTrue(true, "Failed to click on Save Button");
		
		
		
		
	
}
}

