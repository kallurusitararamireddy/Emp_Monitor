package com.emp.qa.pages;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class Project_Add_Project_Details_Page extends BasePage
{

	public Project_Add_Project_Details_Page(WebDriver driver) {
		super(TestBase.getDriver());

		// TODO Auto-generated constructor stub
	}





	Helpers helper=new Helpers();
	
	@FindBy(id  = "addProjectButton")
	@CacheLookup
	WebElement add_project_Details_button;
	
	
	@FindBy(css = "[class='btn btn-secondary nextForm']")
	@CacheLookup
	WebElement Next_button;
	
	
	@FindBy(css  = "#createProject")
	@CacheLookup
	WebElement project_name;
	
	@FindBy(xpath  = "//*[@id='pro_detail']/div[2]/div[2]/div[1]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_manager;
	
	@FindBy(xpath  = "//*[@id=\"pro_detail\"]/div[2]/div[2]/div[2]/div/span/span[1]/span/ul")
	@CacheLookup
	WebElement select_members;
	
	
	@FindBy(xpath  = "//*[@id='createProjectStartDate']")
	@CacheLookup
	WebElement create_Project_StartDate;
	
	@FindBy(xpath  = "//*[@id='createProjectEndDate']")
	@CacheLookup
	WebElement create_Project_EndDate;
	
	@FindBy(xpath  = "//*[@id='nextButtton']")
	@CacheLookup
	WebElement Next_buttom_project;
	
	
	/*
	 *   Add Module Details
	 */
	
	@FindBy(xpath  = "//*[@id='moduleProjectName']")
	@CacheLookup
	WebElement module_project_name;
	
	@FindBy(xpath  = "//*[@id='moduleStartDate']")
	@CacheLookup
	WebElement module_StartDate;
	
	@FindBy(xpath  = "//*[@id='moduleEndDate']")
	@CacheLookup
	WebElement module_EndDate;
	
	@FindBy(xpath  = "//*[@id='moduleNextButtton']")
	@CacheLookup
	WebElement Next_Button_Module;
	
	/*
	 *   Add task
	 */
	
	@FindBy(xpath  = "//*[@id='taskName']")
	@CacheLookup
	WebElement task_name;
	
	@FindBy(xpath  = "//*[@id='taskPriority']")
	@CacheLookup
	WebElement Priority;
	
	@FindBy(xpath  = "//*[@id='taskStartDate']")
	@CacheLookup
	WebElement Task_start_Date;
	
	@FindBy(xpath  = "//*[@id='taskEndDate']")
	@CacheLookup
	WebElement task_Enddate;
	
	@FindBy(xpath  = "//*[@id='pro_task']/div[3]/div[2]/button[1]")
	@CacheLookup
	WebElement Save_project_button;
	
	
	@FindBy(xpath = "//tbody[@id='projectsList']/tr[1]//b[.='1  Tasks']")
	@CacheLookup
	WebElement ClickOnTask;

	@FindBy(xpath = "//*[@class='editTask']/i")
	@CacheLookup
	WebElement ClickOnTaskEditButton;

	@FindBy(xpath = "//*[@id='taskUpdateStatus']")
	@CacheLookup
	WebElement TaskStatus;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	@CacheLookup
	WebElement Update_Button;
	
	
	public void Add_project_Details_P()throws InterruptedException, AWTException{
	
		helper.highLightElement(driver,add_project_Details_button);
		add_project_Details_button.click(); 
		Reporter.log("<B><font color = 'blue'>Step1.</font></B> clicked on add_project_button ");
		Assert.assertTrue(true, "Failed to click on add_project_button");
		 
		helper.highLightElement(driver,Next_button);
		Next_button.click();
		Reporter.log("<B><font color = 'blue'>Step2.</font></B> clicked on Next_button");
		Assert.assertTrue(true, "Failed to click on Next_button");
		
		 
		
		Random g = new Random();
		int num = g.nextInt(1000);
		String Actactual_Name = "Test dev Emp project ";
		String expected_name = Actactual_Name + num;
		
		 
		helper.highLightElement(driver,project_name);
		project_name.click();
		project_name.sendKeys(expected_name);
		Reporter.log("<B><font color = 'blue'>Step3.</font></B> clicked on Next_button");
		Assert.assertTrue(true, "Failed to click on Next_button");
		
		
		helper.highLightElement(driver,select_manager);
		select_manager.click();
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step4.</font></B> Select on manager");
		Assert.assertTrue(true, "Failed to Select on manager");
		
		helper.highLightElement(driver,select_members);
		select_members.click(); 
		helper.robot_frist_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step5.</font></B> Select on member");
		Assert.assertTrue(true, "Failed to select on member");
		
		  
		 
		helper.highLightElement(driver,create_Project_StartDate);
		create_Project_StartDate.click();
		create_Project_StartDate.clear(); 
		String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime()); 
		create_Project_StartDate.sendKeys(timeStamp);
		Reporter.log("<B><font color = 'blue'>Step6.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		
		helper.highLightElement(driver,create_Project_EndDate);
		create_Project_EndDate.click();
		create_Project_EndDate.sendKeys("01122024");
		Reporter.log("<B><font color = 'blue'>Step7.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
		
		
		helper.highLightElement(driver,Next_buttom_project);
		Next_buttom_project.click();
		Reporter.log("<B><font color = 'blue'>Step8.</font></B> clicked on next_button");
		Assert.assertTrue(true, "Failed to click on next_button");
		Thread.sleep(2000);
		
		/*
		 *  Add  module 
		 */
		
		
		Random r1 = new Random();
		int num1 = r1.nextInt(1000);
		String Actactual_Name1 = "dev emp module  ";
		String expected_name1 = Actactual_Name1 + num1;
		
		
		helper.highLightElement(driver,module_project_name);
		module_project_name.click();
		module_project_name.sendKeys(expected_name1);
		Reporter.log("<B><font color = 'blue'>Step9.</font></B> Entered module name");
		Assert.assertTrue(true, "Failed to Entered module name ");
		
		
		helper.highLightElement(driver,module_StartDate);
		module_StartDate.click();
		module_StartDate.clear();
		String timeStampm = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		module_StartDate.sendKeys(timeStampm);
		Reporter.log("<B><font color = 'blue'>Step10.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		
		helper.highLightElement(driver,module_EndDate);
		module_EndDate.click();
		Thread.sleep(1000);
		module_EndDate.sendKeys("27112023");
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
		
		
		helper.highLightElement(driver,Next_Button_Module);
		Next_Button_Module.click();
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> clicked on next_button");
		Assert.assertTrue(true, "Failed to click on next_button");
		Thread.sleep(1000);
		 
		/* 
		 *  Add Task 
		 */  
		
		  
		Random r2 = new Random();
		int num2 = r2.nextInt(1000);
		String Actactual_Name2 = "dev emp task  ";
		String expected_name2 = Actactual_Name2 + num2;
		
		helper.highLightElement(driver,task_name);
		task_name.click();
		task_name.sendKeys(expected_name2);
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Entered task name ");
		Assert.assertTrue(true, "Failed to Entered task name ");
		

		helper.highLightElement(driver,Priority);
		helper.selectDropDownValue(Priority, "value", "3");
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Entered task name ");
		Assert.assertTrue(true, "Failed to Entered task name ");
		Thread.sleep(1000);
		
		helper.highLightElement(driver,Task_start_Date);
		Task_start_Date.click();
		Task_start_Date.click(); 
		String timeStampt = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
		Task_start_Date.sendKeys(timeStampt);
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> clicked on StartDate");
		Assert.assertTrue(true, "Failed to click on StartDate");
		
		helper.highLightElement(driver,task_Enddate);
		task_Enddate.click();
		task_Enddate.sendKeys("24122022"); 
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> clicked on EndDate");
		Assert.assertTrue(true, "Failed to click on EndDate");
		
		helper.highLightElement(driver,Save_project_button);
		helper.jsCLick(Save_project_button);
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> clicked on save button");
		Assert.assertTrue(true, "Failed to click on save_button");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);

		helper.highLightElement(driver, ClickOnTask);
		helper.jsCLick(ClickOnTask);
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on ClickOnTask");
		Assert.assertTrue(true, "Failed to ClickOnTask");
		Thread.sleep(2000);

		helper.highLightElement(driver, ClickOnTaskEditButton);
		helper.move_to_element_click_target(ClickOnTaskEditButton);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> ClickOnTaskEditButton");
		Assert.assertTrue(true, "Failed to ClickOnTaskEditButton");

		helper.highLightElement(driver, TaskStatus);
		helper.selectDropDownValue(TaskStatus, "value", "1");
		Reporter.log("<B><font color = 'blue'>Step20.</font></B> Selected TaskStatus(In Progress)");
		Assert.assertTrue(true, "Failed to Selected Task_Status(In Progress)");

		helper.highLightElement(driver, Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step21.</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to Clicked On Update_Button");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
	}
	public void Task_is_In_Progress_to_complete()throws InterruptedException, AWTException{
		
		helper.highLightElement(driver, ClickOnTask);
		helper.jsCLick(ClickOnTask);
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> Clicked on ClickOnTask");
		Assert.assertTrue(true, "Failed to ClickOnTask");
		Thread.sleep(2000);

		helper.highLightElement(driver, ClickOnTaskEditButton);
		helper.move_to_element_click_target(ClickOnTaskEditButton);
		Reporter.log("<B><font color = 'blue'>Step23.</font></B> Clicked On Task_Edit_Button (Progress_to_complete) ");
		Assert.assertTrue(true, "Failed to Clicked On Task_Edit_Button (Progress_to_complete)");
		Thread.sleep(1000);
		
		helper.highLightElement(driver, TaskStatus);
		helper.move_to_element(TaskStatus);
		helper.selectDropDownValue(TaskStatus, "value", "2");
		Reporter.log("<B><font color = 'blue'>Step22.</font></B> Selected TaskStatus(Completed)");
		Assert.assertTrue(true, "Failed to Selected TaskStatus(Completed)");

		helper.highLightElement(driver, Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step24.</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to ClickOnT Update_Button");
		Thread.sleep(3000);
		
	}
	
	
public void task_complete_to_On_Hold()throws InterruptedException, AWTException{
		
		helper.highLightElement(driver, ClickOnTask);
		helper.jsCLick(ClickOnTask);
		Reporter.log("<B><font color = 'blue'>Step25.</font></B> Clicked on ClickOnTask");
		Assert.assertTrue(true, "Failed to ClickOnTask");
		Thread.sleep(2000);

		helper.highLightElement(driver, ClickOnTaskEditButton);
		helper.move_to_element_click_target(ClickOnTaskEditButton);
		Reporter.log("<B><font color = 'blue'>Step26.</font></B> Clicked  On Task_Edit_Button (complete_to_On_Hold) ");
		Assert.assertTrue(true, "Failed to Clicked  On Task_Edit_Button (complete_to_On_Hold)");
		Thread.sleep(1000);
		
		helper.highLightElement(driver, TaskStatus);
		helper.selectDropDownValue(TaskStatus, "value", "0");
		Reporter.log("<B><font color = 'blue'>Step27.</font></B> Selected TaskStatus(on hold)");
		Assert.assertTrue(true, "Failed to Selected TaskStatus(on hold)");

		helper.highLightElement(driver, Update_Button);
		helper.jsCLick(Update_Button);
		Reporter.log("<B><font color = 'blue'>Step28.</font></B> clicked on Update_Button");
		Assert.assertTrue(true, "Failed to Click On Update_Button");
		Thread.sleep(8000);

	 	
		
	}

	
	}
	

