package com.emp.qa.pages;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
	
	@FindBy(xpath="(//tbody[@id='projectsList']//a)[1]")
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
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> Clicked on Project Module and Clicked on Show-Entries DropDown and Selected value");
		Assert.assertTrue(true, "Failed to Click on Project Module and Clicked on Show-Entries DropDown and Selected value");
		
		helper.highLightElement(driver,SelectStatus);
		Thread.sleep(1000);
		helper.selectDropDownValue(SelectStatus, "value", "All");
		ShowEntries.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> Clicked on Status Drop-down and Selected Status ");
		Assert.assertTrue(true, "Failed to Click on SelectStatus Drop Down");
		Thread.sleep(2000);
		
		helper.highLightElement(driver,ProjectName);
		helper.move_to_element_click_target(ProjectName);
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> Clicked on Project-Name Text Field and Entered Project Name ");
		Assert.assertTrue(true, "Failed to Click on Project-Name Text Field and Entered Project Name");
		
		helper.highLightElement(driver,ShowMore);
		ShowMore.click();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Clicked on Show-More option ");
		Assert.assertTrue(true, "Failed to Click on Show-More option ");
		
		helper.highLightElement(driver,AddModule);
		AddModule.click();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Clicked on Add-Module ");
		Assert.assertTrue(true, "Failed to Click on Add-Module");
		 
		helper.highLightElement(driver,AddModule_Button);
		AddModule_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Clicked on Add-Module Button");
		Assert.assertTrue(true, "Failed to Click on Add-Module Button");
		
		
		helper.highLightElement(driver,Project_name);
		helper.selectDropDownValue(Project_name, "value", "951");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Clicked on project-name Text Field and Entered Project Name ");
		Assert.assertTrue(true, "Failed to Click on project-name Text Field and Entered Project Name");
		
		
		helper.highLightElement(driver,ModuleName);
		ModuleName.sendKeys("AutomationCode");
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Clicked on Module-Name Text Field and Entered Module Name ");
		Assert.assertTrue(true, "Failed to Click on Module-Name Text Field and Entered Module Name");
		
		
		helper.highLightElement(driver,StartDate);
		StartDate.click();
		String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime()); 
		StartDate.sendKeys(timeStamp);			
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Clicked on Claendar and Entered Start-Date");
		Assert.assertTrue(true, "Failed to Click on Claendar and Entered Start-Date");
		
		helper.highLightElement(driver,EndDate);
		EndDate.click();
		EndDate.sendKeys("25112024");
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Clicked on Claendar and Entered End-Date");
		Assert.assertTrue(true, "Failed to Click on Claendar and Entered End-Date");
	 
		helper.highLightElement(driver,Save);
		Save.click();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Save Button");
		Assert.assertTrue(true, "Failed to Click on Save Button");
		Thread.sleep(1000);
		
		/*
		 *  Add Task 
		 */
		
		helper.highLightElement(driver,Add_plus); 
		Add_plus.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to Click on Add_plus Button");
		 
		helper.highLightElement(driver,task_name);
        task_name.sendKeys("Demo");
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Task Name Text Field and Entered Task Name ");
		Assert.assertTrue(true, "Failed to Click on Task Name Text Field and Entered Task Name");
		
		helper.highLightElement(driver,Assignee);
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on Assig Drop-down and Selected Any Employee");
		Assert.assertTrue(true, "Failed to Click on Assig Drop-down and Selected Any Employee");
		
		helper.highLightElement(driver,Task_Priority);
		Task_Priority.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Clicked on Task Priority Drop-down and Slected Value ");
		Assert.assertTrue(true, "Failed to Click on Task Priority Drop-down and Slected Value");
		
		
		helper.highLightElement(driver,taskUpdateStatus);
		taskUpdateStatus.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked on Add_plus Button");
		Assert.assertTrue(true, "Failed to Click on Add_plus Button");
		
		
		helper.highLightElement(driver,Task_StartDate);
		Task_StartDate.click();
		String timeStamp1 = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime()); 
		Task_StartDate.sendKeys(timeStamp1);		
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Clicked on Calendar and Entered Start-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Entered Start-Date");
		 
		helper.highLightElement(driver,Task_EndDate);
		Task_EndDate.click();
		Task_EndDate.sendKeys("20112023");
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> Clicked on Calendar and Entered End-Date");
		Assert.assertTrue(true, "Failed to Click on Calendar and Entered End-Date");
	 
		helper.highLightElement(driver,Task_save);
		Task_save.click();
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on Save Button");
		Assert.assertTrue(true, "Failed to Click on Save Button");
		
		 
		
		
	
}
}

