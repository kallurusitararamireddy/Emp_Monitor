package com.emp.qa.pages;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.util.Helpers;

public class CreateProjectsPage extends BasePage {

	public CreateProjectsPage(WebDriver driver) {
		super(driver);

	}

	Helpers helper = new Helpers();

	@FindBy(id = "addProjectButton")
	@CacheLookup
	WebElement add_project_Details_button;

	@FindBy(css = "[class='btn btn-secondary nextForm']")
	@CacheLookup
	WebElement Next_button;

	@FindBy(css = "#createProject")
	@CacheLookup
	WebElement project_name;

	@FindBy(xpath = "//*[@id='pro_detail']/div[2]/div[2]/div[1]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_manager;

	@FindBy(xpath = "//*[@id=\"pro_detail\"]/div[2]/div[2]/div[2]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_members;

	@FindBy(xpath = "//*[@id='createProjectStartDate']")
	@CacheLookup
	WebElement create_Project_StartDate;

	@FindBy(xpath = "//*[@id='createProjectEndDate']")
	@CacheLookup
	WebElement create_Project_EndDate;

	@FindBy(xpath = "//*[@id='nextButtton']")
	@CacheLookup
	WebElement Next_buttom_project;

	/*
	 * Add Module Details
	 */

	@FindBy(xpath = "//*[@id='moduleProjectName']")
	@CacheLookup
	WebElement module_project_name;

	@FindBy(xpath = "//*[@id='moduleStartDate']")
	@CacheLookup
	WebElement module_StartDate;

	@FindBy(xpath = "//*[@id='moduleEndDate']")
	@CacheLookup
	WebElement module_EndDate;

	@FindBy(xpath = "//*[@id='moduleNextButtton']")
	@CacheLookup
	WebElement Next_Button_Module;

	/*
	 * Add task
	 */

	@FindBy(xpath = "//*[@id='taskName']")
	@CacheLookup
	WebElement task_name;

	@FindBy(xpath = "//*[@id='taskPriority']")
	@CacheLookup
	WebElement Priority;

	@FindBy(xpath = "//*[@id='taskStartDate']")
	@CacheLookup
	WebElement Task_start_Date;

	@FindBy(xpath = "//*[@id='taskEndDate']")
	@CacheLookup
	WebElement task_Enddate;

	@FindBy(xpath = "//*[@id='pro_task']/div[3]/div[2]/button[1]")
	@CacheLookup
	WebElement Save_project_button;

	@FindBy(xpath = "//input[@id='createProject']")
	@CacheLookup
	WebElement Projectname;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	@FindBy(xpath = "//select[@id='filterStatusList']")
	@CacheLookup
	WebElement SelectStatus;

	@FindBy(xpath = "//b[contains(text(),'testing4')]")
	@CacheLookup
	WebElement ProjectName;

	@FindBy(xpath = "//a[@id='myBtn1']")
	@CacheLookup
	WebElement ShowMore;

	@FindBy(xpath = "//a[contains(text(),'Add Module')]")
	@CacheLookup
	WebElement AddModule;

	@FindBy(xpath = "//button[@id='addModuleButton']")
	@CacheLookup
	WebElement AddModule_Button;

	@FindBy(xpath = "//select[@id='projectsList']")
	@CacheLookup
	WebElement projectname;

	@FindBy(xpath = "//input[@id='createModuleName']")
	@CacheLookup
	WebElement ModuleName;

	@FindBy(xpath = "//input[@id='createModuleStartDate']")
	@CacheLookup
	WebElement StartDate;

	@FindBy(xpath = "//input[@id='createModuleEndDate']")
	@CacheLookup
	WebElement EndDate;

	@FindBy(xpath = "//*[@id=\"newModule\"]/div/div/div[3]/button")
	@CacheLookup
	WebElement Save;

	
	
	
	

	public void CreateProjectsPage() throws InterruptedException, AWTException {

		helper.highLightElement(driver, add_project_Details_button);
		add_project_Details_button.click();
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on add_project_button ");
		Assert.assertTrue(true, "Failed to click on add_project_button");

		helper.highLightElement(driver, Next_button); 
		Next_button.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Next_button");
		Assert.assertTrue(true, "Failed to click on Next_button");

		Random g = new Random();
		int num = g.nextInt(1000);
		String Actactual_Name = "Test dev Emp project ";
		String expected_name = Actactual_Name + num;

		helper.highLightElement(driver, project_name);
		project_name.click();
		project_name.sendKeys(expected_name);
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Next_button");
		Assert.assertTrue(true, "Failed to click on Next_button");

		helper.highLightElement(driver, select_manager);
		select_manager.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Selected on manager");
		Assert.assertTrue(true, "Failed to Select on manager");

		helper.highLightElement(driver, select_members);
		select_members.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Selected on member");
		Assert.assertTrue(true, "Failed to select on member");

		helper.highLightElement(driver, create_Project_StartDate);
		create_Project_StartDate.click();
		create_Project_StartDate.clear();
		String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
//		 LocalDate timeStamp = LocalDate.now();
//		 LocalDate timeStamp1 = timeStamp.plusMonths(2);

		create_Project_StartDate.sendKeys(timeStamp);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");

		helper.highLightElement(driver, create_Project_EndDate);
		create_Project_EndDate.click();
		create_Project_EndDate.sendKeys("01122024");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");

		helper.highLightElement(driver, Next_buttom_project);
		Next_buttom_project.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on next_button");
		Assert.assertTrue(true, "Failed to click on next_button");
		Thread.sleep(2000);

		/*
		 * Add module
		 */

		Random r1 = new Random();
		int num1 = r1.nextInt(1000);
		String Actactual_Name1 = "dev emp module  ";
		String expected_name1 = Actactual_Name1 + num1;

		helper.highLightElement(driver, module_project_name);
		module_project_name.click();
		module_project_name.sendKeys(expected_name1);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Entered module name");
		Assert.assertTrue(true, "Failed to Entered module name ");

		helper.highLightElement(driver, module_StartDate);
		module_StartDate.click();
		module_StartDate.clear();
		String timeStampm = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		module_StartDate.sendKeys(timeStampm);
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");

		helper.highLightElement(driver, module_EndDate);
		module_EndDate.click();
		Thread.sleep(1000);
		module_EndDate.sendKeys("27112023");
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");

		helper.highLightElement(driver, Next_Button_Module);
		Next_Button_Module.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on next_button");
		Assert.assertTrue(true, "Failed to click on next_button");
		Thread.sleep(1000);

		/*
		 * Add Task
		 */

		Random r2 = new Random();
		int num2 = r2.nextInt(1000);
		String Actactual_Name2 = "dev emp task  ";
		String expected_name2 = Actactual_Name2 + num2;

		helper.highLightElement(driver, task_name);
		task_name.click();
		task_name.sendKeys(expected_name2);
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Entered task name ");
		Assert.assertTrue(true, "Failed to Entered task name ");

		helper.highLightElement(driver, Priority);
		helper.selectDropDownValue(Priority, "value", "3");
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Clicked Priority Drop--Down and Select Priority ");
		Assert.assertTrue(true, "Failed to Click on  Priority Drop--Down and Select Priority ");
		Thread.sleep(1000);

		helper.highLightElement(driver, Task_start_Date);
		Task_start_Date.click();
		Task_start_Date.click();
		String timeStampt = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		Task_start_Date.sendKeys(timeStampt);
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");

		helper.highLightElement(driver, task_Enddate);
		task_Enddate.click();
		task_Enddate.sendKeys("24122022");
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");

		helper.highLightElement(driver, Save_project_button);
		helper.jsCLick(Save_project_button);
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on save button");
		Assert.assertTrue(true, "Failed to click on save_button");
		Thread.sleep(5000);
		driver.navigate().refresh();

		Thread.sleep(8000);



	}

}
