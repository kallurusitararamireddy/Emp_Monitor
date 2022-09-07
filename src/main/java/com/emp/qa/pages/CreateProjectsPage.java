package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

import jdk.tools.jlink.internal.TaskHelper;

public class CreateProjectsPage extends BasePage {

	public CreateProjectsPage(WebDriver driver) {
		super(driver);
		
	}
	
Helpers helper=new Helpers();


     @FindBy(xpath="//button[@id='addProjectButton']")
     @CacheLookup
     WebElement AddProjectDetails;
     
     @FindBy(xpath="//button[@class='btn btn-secondary nextForm'][contains(.,'Next')]")
     @CacheLookup
     WebElement Next;
     
     @FindBy(xpath="//input[@id='createProject']")
     @CacheLookup
     WebElement ProjectNAme;
     
     @FindBy(xpath="//select[@id='createProjectManagersList']")
     @CacheLookup
     WebElement ManagersName;
     
     @FindBy(xpath="//select[@id='createProjectMembersList']")
     @CacheLookup
     WebElement SelectMembers;
     
     @FindBy(xpath="//input[@id='createProjectStartDate']")
     @CacheLookup
     WebElement Startdate;
     
     @FindBy(xpath="//input[@id='createProjectEndDate']")
     @CacheLookup
     WebElement ProjectEndDate;
     
     @FindBy(xpath="//button[@id='nextButtton']")
     @CacheLookup
     WebElement Next_Button;
     
     @FindBy(xpath="//input[@id='moduleProjectName']")
     @CacheLookup
     WebElement ModuleModuleName;
     
     @FindBy(xpath="//input[@id='moduleStartDate']")
     @CacheLookup
     WebElement ModuleStartDate;
     
     
     @FindBy(xpath="//input[@id='moduleEndDate']")
     @CacheLookup
     WebElement ModuleEndDate;
     
     @FindBy(xpath="//button[@id='moduleNextButtton']")
     @CacheLookup
     WebElement ModuleNext_Button;
     
     @FindBy(xpath="//input[@id='taskName']")
     @CacheLookup
     WebElement TaskName;
     
     
     @FindBy(xpath="//select[@id='taskAssignee']")
     @CacheLookup
     WebElement Assignename;
     
     @FindBy(xpath="//select[@id='taskPriority']")
     @CacheLookup
     WebElement Priority;
     
     @FindBy(xpath="//input[@id='taskStartDate']")
     @CacheLookup
     WebElement TaskStartDate;
     
     @FindBy(xpath="//input[@id='taskEndDate']")
     @CacheLookup
     WebElement TaskEndDate;
     
     
     @FindBy(xpath="//button[@onclick='createProject()']")
     @CacheLookup
     WebElement TaskSave_Button;
     
     
     @FindBy(xpath="//input[@id='createProject']")
     @CacheLookup
     WebElement Projectname;
	
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
	
	@FindBy(xpath="//tbody[@id='projectsList']/tr[1]//b[.='1  Tasks']")
	@CacheLookup
	WebElement ClickOnTask;
	
	@FindBy(xpath="//div[@id='app-kanban']/div[@class='container-fluid p-0']/div[2]/div/div[1]/div/div//div[@class='card']//div[@role='group']/button[1]")
	@CacheLookup   //div[@id='app-kanban']/div[@class='container-fluid p-0']/div[2]/div/div[1]/div/div//div[@class='card']//div[@role='group']/button[1]
	WebElement ClickOnTaskEditButton;
	
	@FindBy(xpath="//select[@id='__BVID__122607___BV_input__']")
	@CacheLookup
	WebElement TaskStatus;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	@CacheLookup
	WebElement Update_Button;
	
	public void CreateProjectsPage()throws InterruptedException{
		
		
		
		
		helper.highLightElement(driver,AddProjectDetails);
		AddProjectDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on AddProjectDetails");
		Assert.assertTrue(true, "Failed to click on AddProjectDetails");
		
		helper.highLightElement(driver,Next);
		helper.jsCLick(Next);
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Next");
		Assert.assertTrue(true, "Failed to click on Next");
		
		
		helper.highLightElement(driver,ProjectNAme);
		ProjectNAme.sendKeys("TestAutomation");
		ProjectNAme.click();
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Projectname");
		Assert.assertTrue(true, "Failed to click on Projectname");
		
		helper.highLightElement(driver,ManagersName);
        helper.selectDropDownValue(ManagersName, "value", "54351");	
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Selected Managers Name");
		Assert.assertTrue(true, "Failed to click select Managers name");
		
		helper.highLightElement(driver,SelectMembers);
        helper.selectDropDownValue(SelectMembers, "value", "54363");	
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Selected Members");
		Assert.assertTrue(true, "Failed to select Members");
	
		helper.highLightElement(driver,Startdate);
		Startdate.sendKeys("16-08-2022");
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> Entered Project Start date");
		Assert.assertTrue(true, "Failed to Enter Project Start date");
		
		helper.highLightElement(driver,ProjectEndDate);
		ProjectEndDate.sendKeys("16-08-2023");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> Entered Project end date");
		Assert.assertTrue(true, "Failed to Entere Project end date");
		
		
		helper.highLightElement(driver,Next_Button);
		Next_Button.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> Selected NextButton");
		Assert.assertTrue(true, "Failed to selet NextButton");
		
		helper.highLightElement(driver,ModuleModuleName);
		ModuleModuleName.sendKeys("SCRIPT");
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Entered Module Name ");
		Assert.assertTrue(true, "Failed to Entere Module Name");
		
		helper.highLightElement(driver,ModuleStartDate);
		ModuleStartDate.sendKeys("16-08-2022");
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> Entered Module Start date");
		Assert.assertTrue(true, "Failed to Entered Module Start date");
		
		helper.highLightElement(driver,ModuleEndDate);
		ModuleEndDate.sendKeys("04-04-2023");
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Entered Module end date");
		Assert.assertTrue(true, "Failed to Entere Module end dateend Data");
		
		helper.highLightElement(driver,ModuleNext_Button);
		helper.jsCLick(ModuleNext_Button);
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on NextButton");
		Assert.assertTrue(true, "Failed to Click Next Button");
		
		
		helper.highLightElement(driver,TaskName);
		TaskName.sendKeys("FirstTask");
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> First Task is Created");
		Assert.assertTrue(true, "Failed to Create First Task ");
		
		helper.highLightElement(driver,Assignename);
		helper.selectDropDownValue(Assignename, "value", "54363");
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Selected Assigne");
		Assert.assertTrue(true, "Failed to slect Assigney");
		
		helper.highLightElement(driver,Priority);
		helper.selectDropDownValue(Priority, "value", "2");
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Selected Priority");
		Assert.assertTrue(true, "Failed to slect Priority DropDown");
		
		helper.highLightElement(driver,TaskStartDate);
		TaskStartDate.sendKeys("16082022");
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Entered Task start Date ");
		Assert.assertTrue(true, "Failed to sendData");
		
		helper.highLightElement(driver,TaskEndDate);
		TaskEndDate.sendKeys("04042023");
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> Entered Task End Date");
		Assert.assertTrue(true, "Failed to send Data");
		
		helper.highLightElement(driver,TaskSave_Button);
		helper.jsCLick(TaskSave_Button);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on Save Button");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(8000);
		
		helper.highLightElement(driver,ClickOnTask);
		helper.jsCLick(ClickOnTask);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> Clicked on ClickOnTask");
		Assert.assertTrue(true, "Failed to ClickOnTask");
		
		helper.highLightElement(driver,ClickOnTaskEditButton);
		helper.jsCLick(ClickOnTaskEditButton);
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> ClickOnTaskEditButton");
		Assert.assertTrue(true, "Failed to ClickOnTaskEditButton");
		
		helper.highLightElement(driver,TaskStatus);
        helper.selectDropDownValue(TaskStatus, "value", "0");	
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> Selected TaskStatus");
		Assert.assertTrue(true, "Failed to select TaskStatus");
		
		helper.highLightElement(driver,Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to ClickOnT Update_Button");
		
	
//		helper.highLightElement(driver,ShowEntries);
//		helper.selectDropDownValue(ShowEntries, "index", "4");
//		ShowEntries.click();
//		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on ShowEntries DropDown");
//		Assert.assertTrue(true, "Failed to click on ShowEntries Drop Down");
//		
//		helper.highLightElement(driver,SelectStatus);
//		helper.selectDropDownValue(SelectStatus, "value", "1");
//		ShowEntries.click();
//		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on SelectStatus Drop Down");
//		Assert.assertTrue(true, "Failed to click on SelectStatus Drop Down");
//		
//		helper.highLightElement(driver,ProjectName);
//		//helper.selectDropDownValue(ProjectName, "value", "1");
//		ProjectName.click();
//		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on ProjectName");
//		Assert.assertTrue(true, "Failed to click on ProjectName");
//		
//		helper.highLightElement(driver,ShowMore);
//		ShowMore.click();
//		Reporter.log("<B><font color = 'blue'>Step4.</font></B> clicked on ShowMore");
//		Assert.assertTrue(true, "Failed to click on ShowMore");
//		
//		helper.highLightElement(driver,AddModule);
//		AddModule.click();
//		Reporter.log("<B><font color = 'blue'>Step5.</font></B> clicked on AddModule");
//		Assert.assertTrue(true, "Failed to click on AddModule");
//		
//		helper.highLightElement(driver,AddModule_Button);
//		AddModule_Button.click();
//		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on AddModule_Button");
//		Assert.assertTrue(true, "Failed to click on AddModule_Button");
//		
//		
//		helper.highLightElement(driver,projectname);
//		//ModuleName.click();
//		helper.selectDropDownValue(projectname, "value", "645");
//		//ModuleName.sendKeys("AutomationCode");
//		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on projectname");
//		Assert.assertTrue(true, "Failed to click on projectname");
//		
//		
//		
//		
//		helper.highLightElement(driver,ModuleName);
//		//ModuleName.click();
//		//helper.selectDropDownValue(ModuleName, "value", "645");
//		ModuleName.sendKeys("AutomationCode");
//		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on ModuleName");
//		Assert.assertTrue(true, "Failed to click on ModuleName");
//		
//		
//		
//		
//		
//		helper.highLightElement(driver,StartDate);
//		StartDate.click();
//		StartDate.sendKeys("05072020");
//		Reporter.log("<B><font color = 'blue'>Step9.</font></B> clicked on StartDate");
//		Assert.assertTrue(true, "Failed to click on StartDate");
//		
//		helper.highLightElement(driver,EndDate);
//		EndDate.click();
//		EndDate.sendKeys("06052021");
//		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on EndDate");
//		Assert.assertTrue(true, "Failed to click on EndDate");
//	
//		helper.highLightElement(driver,Save);
//		Save.click();
//		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on Save Button");
//		Assert.assertTrue(true, "Failed to click on Save Button");
//	
}
	

}
