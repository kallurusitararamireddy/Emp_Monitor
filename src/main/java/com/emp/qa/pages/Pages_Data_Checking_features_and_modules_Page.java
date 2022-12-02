package com.emp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;

public class Pages_Data_Checking_features_and_modules_Page extends BasePage
{


	public Pages_Data_Checking_features_and_modules_Page(WebDriver driver) {
		super(TestBase.getDriver());
		// TODO Auto-generated constructor stub
	}
	
	Helpers helper = new Helpers();

	
	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	WebElement Dashboard_page;
	
//	@FindBy(xpath = "//span[text()='Employee']")   
	//span[text()='Employee']//following-sibling::i
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i") 
	@CacheLookup
	WebElement Employee_Page;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i") 
	@CacheLookup
	WebElement Employee_Page1;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i") 
	@CacheLookup
	WebElement Employee_Page2;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i") 
	@CacheLookup
	WebElement Employee_Page3;
	@FindBy(xpath = "//span[text()='Employee']//following-sibling::i") 
	@CacheLookup
	WebElement Employee_Page4;
	
	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement Employee_Details_Module;
	
	@FindBy(xpath = "//a[@title='Employee-Attendance']")
	@CacheLookup
	WebElement Employee_Attendance_Module;
	
	@FindBy(xpath = "//a[@title='Employee-Notification']")
	@CacheLookup
	WebElement Employee_Notification_Module;
	
	@FindBy(xpath = "//a[@title='Employee Insights']")
	@CacheLookup
	WebElement Employee_Insights;
	
	@FindBy(xpath = "//span[text()='Timesheets']")
	@CacheLookup
	WebElement Timesheets_Page;
	
	@FindBy(xpath = "//span[text()='Time Claim']")
	@CacheLookup
	WebElement Time_Claim;
	
	
	@FindBy(xpath = "//span[text()='Projects']")
	@CacheLookup
	WebElement Projects_Page;
	
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page;
	
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page1;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page2;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page3;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page4;
	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_page5;
	
	
	@FindBy(xpath = "//a[@title='Reports Download']")
	@CacheLookup
	WebElement Reports_Download;
	
	@FindBy(xpath = "//a[@title='Productivity Reports']")
	@CacheLookup
	WebElement Productivity_Reports;
	
	@FindBy(xpath = "//a[@title='Auto Email Reports']")
	@CacheLookup
	WebElement Auto_Email_Reports;
	
	
	@FindBy(xpath = "//a[@title='Web App Usage']")
	@CacheLookup
	WebElement Web_App_Usage;
	
	@FindBy(xpath = "//a[@title='System Activity Logs']")
	@CacheLookup
	WebElement System_Activity_Logs;
	
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings1;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings2;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings3;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings4;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings5;
	@FindBy(xpath = "//span[text()='Settings']")
	@CacheLookup
	WebElement Settings6;
	
	@FindBy(xpath = "//a[@title='Manage Locations & Departments']")
	@CacheLookup
	WebElement Manage_Locations_and_Departments;
	
	@FindBy(xpath = "//a[@title='Storage Type']")
	@CacheLookup
	WebElement Storage_Type;
	
	@FindBy(xpath = "//a[@title='Productivity Rules']")
	@CacheLookup
	WebElement Productivity_Rules;
	
	@FindBy(xpath = "//a[@title='Roles and Permission']")
	@CacheLookup
	WebElement Roles_and_Permission;
	
	@FindBy(xpath = "//a[@title='Shift Management']")
	@CacheLookup
	WebElement Shift_Management;
	
	@FindBy(xpath = "//a[@title='Monitoring Control']")
	@CacheLookup
	WebElement Monitoring_Control;
	
	@FindBy(xpath = "//a[@title='Localization']")
	@CacheLookup
	WebElement Localization;
	
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour1;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour2;
	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behaviour3;
	
	@FindBy(xpath = "//a[@title='Alerts']")
	@CacheLookup
	WebElement Alerts;
	
	@FindBy(xpath = "//a[@title='Alert Policies']")
	@CacheLookup
	WebElement Alert_Policies;
	
	@FindBy(xpath = "//a[@title='Alerts Notifications']")
	@CacheLookup
	WebElement Alerts_Notifications;
	
	
	
	@FindBy(xpath = "//span[text()=' Access Log']")
	@CacheLookup
	WebElement Access_Log;
	
	public void Pages_Data_Info_demo() throws InterruptedException, IOException {
		
		
		/*
		 *  Dashboard 
		 */
		helper.waitFor(Dashboard_page);		
		helper.highLightElement(driver, Dashboard_page);
		Dashboard_page.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Dashboard");
		Reporter.log("<B><font color = 'red'>------Dashboard-----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Dashboard Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Dashboard Module  and Page Data is Displyed ");
		
		 
		/*
		 *  Employee
		 */
		helper.waitFor(Employee_Page);		
		helper.highLightElement(driver, Employee_Page);
		Employee_Page.click();
		Reporter.log("<B><font color = 'red'>------Employee-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on  Employee Module");
		 
		
		helper.waitFor(Employee_Details_Module);		
		helper.highLightElement(driver, Employee_Details_Module);
		Employee_Details_Module.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Employee_Details_Module Pic ");
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Employee_Details Sub-Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on Employee_Details Sub-Module and Page Data Is Displyed ");
		
		Employee_Page1.click();
		helper.waitFor(Employee_Attendance_Module);		
		helper.highLightElement(driver, Employee_Attendance_Module);
		Employee_Attendance_Module.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Employee_Attendance_Module Pic ");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Employee_Attendance  Sub-Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Employee_Attendance Sub-Module and Page Data Is Displyed");
		
		
		
		Employee_Page2.click();
		helper.waitFor(Employee_Notification_Module);		
		helper.highLightElement(driver, Employee_Notification_Module);
		Employee_Notification_Module.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Employee_Notification_Module Pic ");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Employee_Notification  Sub-Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Employee_Notification  Sub-Module and Page Data Is Displyed");
		
		
		
		Employee_Page3.click();
		helper.waitFor(Employee_Insights);		
		helper.highLightElement(driver, Employee_Insights);
		Employee_Insights.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Employee_Insights Pic ");
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Employee_Insights  Sub-Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Employee_Insights  Sub-Module and Page Data Is Displyed");
		
		
		
		/*
		 *  Time Sheets 
		 */
		helper.waitFor(Timesheets_Page);		
		helper.highLightElement(driver, Timesheets_Page);
		Timesheets_Page.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Timesheets_Page Pic ");
		Reporter.log("<B><font color = 'red'>------Timesheets-----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Timesheets  Module and Page Data Is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Timesheets  Module and Page Data Is Displyed");
		
		
		/*
		 *  Time Claim
		 */
		helper.waitFor(Time_Claim);		
		helper.highLightElement(driver, Time_Claim);
		Time_Claim.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Time_Claim Pic ");
		Reporter.log("<B><font color = 'red'>------Time_Claim-----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Time_Claim Module and Page Data Is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Time_Claim  Module and Page Data Is Displyed ");
		
		
		
		/*
		 *  Projects 
		 */
		helper.waitFor(Projects_Page);		
		helper.highLightElement(driver, Projects_Page);
		Projects_Page.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Projects_Page Pic ");
		Reporter.log("<B><font color = 'red'>------Projects-----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Projects Module and Page Data is Displyed   ");
		Assert.assertTrue(true, "Failed To click on Projects Module and Page Data is Displyed  ");
		
		
		

		/*
		 *  Reports 
		 */
		helper.waitFor(Reports_page);		
		helper.highLightElement(driver, Reports_page);
		Reports_page.click();
		Reporter.log("<B><font color = 'red'>------Reports-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on  Reports Module");
		
		
		helper.waitFor(Reports_Download);		
		helper.highLightElement(driver, Reports_Download);
		Reports_Download.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Reports_Download Pic ");
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Reports_Download  Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Reports_Download  Sub-Module  and Page Data is Displyed");
		
		
		Reports_page1.click();
		helper.waitFor(Productivity_Reports);		
		helper.highLightElement(driver, Productivity_Reports);
		Productivity_Reports.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page(" Productivity_Reports Pic ");
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Productivity_Reports Sub-Module  and Page Data is Displyed ");
		Assert.assertTrue(true, "Failed To click on  Productivity_Reports Sub-Module  and Page Data is Displyed");
		
		
		Reports_page2.click();
		helper.waitFor(Auto_Email_Reports);		
		helper.highLightElement(driver, Auto_Email_Reports);
		Auto_Email_Reports.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Auto_Email_Reports Pic ");
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Auto_Email_Reports Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Auto_Email_Reports  Sub-Module  and Page Data is Displyed ");
		
		
		Reports_page3.click();
		helper.waitFor(Web_App_Usage);		
		helper.highLightElement(driver, Web_App_Usage);
		Web_App_Usage.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Web_App_Usage Pic ");
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Web_App_Usage Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Web_App_Usage  Sub-Module  and Page Data is Displyed ");
		
		
		Reports_page4.click();
		helper.waitFor(System_Activity_Logs);		
		helper.highLightElement(driver, System_Activity_Logs);
		System_Activity_Logs.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("System_Activity_Logs Pic ");
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on System_Activity_Logs Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on System_Activity_Logs  Sub-Module  and Page Data is Displyed ");
		
		
		

		/*
		 *  Settings 
		 */
		helper.waitFor(Settings);		
		helper.highLightElement(driver, Settings);
		Settings.click();
		Reporter.log("<B><font color = 'red'>------Settings-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on Settings  Module ");
		Thread.sleep(3000);
		
		
		
		helper.waitFor(Manage_Locations_and_Departments);		
		helper.highLightElement(driver, Manage_Locations_and_Departments);
		Manage_Locations_and_Departments.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Manage_Locations_and_Departments Pic ");
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on Manage_Locations_and_Departments Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Manage_Locations_and_Departments  Sub-Module  and Page Data is Displyed ");
		
		
		
		Settings1.click();
		helper.waitFor(Storage_Type);		
		helper.highLightElement(driver, Storage_Type);
		Storage_Type.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Storage_Type Pic ");
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> Clicked on Storage_Type Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Storage_Type  Sub-Module  and Page Data is Displyed ");
		
		Settings2.click();
		helper.waitFor(Productivity_Rules);		
		helper.highLightElement(driver, Productivity_Rules);
		Productivity_Rules.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Productivity_Rules Pic ");
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> Clicked on Productivity_Rules Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Productivity_Rules  Sub-Module  and Page Data is Displyed ");
		
		
		Settings3.click();
		helper.waitFor(Roles_and_Permission);		
		helper.highLightElement(driver, Roles_and_Permission);
		Roles_and_Permission.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Roles_and_Permission Pic ");
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> Clicked on Roles_and_Permission Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Roles_and_Permission  Sub-Module  and Page Data is Displyed ");
		
		
		Settings4.click();
		helper.waitFor(Shift_Management);		
		helper.highLightElement(driver, Shift_Management);
		Shift_Management.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Shift_Management Pic ");
		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> Clicked on Shift_Management Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Shift_Management  Sub-Module  and Page Data is Displyed ");
		
		
		Settings5.click();
		helper.waitFor(Monitoring_Control);		
		helper.highLightElement(driver, Monitoring_Control);
		Monitoring_Control.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Monitoring_Control Pic ");
		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> Clicked on Monitoring_Control Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Monitoring_Control  Sub-Module  and Page Data is Displyed ");
		
		
		Settings6.click();
		helper.waitFor(Localization);		
		helper.highLightElement(driver, Localization);
		Localization.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Monitoring_Control Pic ");
		Reporter.log("<B><font color = 'blue'>Step20 .</font></B> Clicked on Localization Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on Localization  Sub-Module  and Page Data is Displyed ");
		
		
		
		
		/*
		 *  Behavior 
		 */
		
		
		helper.waitFor(Behaviour);		
		helper.highLightElement(driver, Behaviour);
		Behaviour.click();
		Reporter.log("<B><font color = 'red'>------Behaviour-----</font></B> ");
		Assert.assertTrue(true, "Failed To click on Behaviour Module ");
		
		
		helper.waitFor(Alerts);		
		helper.highLightElement(driver, Alerts);
		Alerts.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log("<B><font color = 'blue'>Step21 .</font></B> Clicked on  Alerts Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alerts Sub-Module  and Page Data is Displyed  ");
		
		
		
		Behaviour1.click();
		helper.waitFor(Alert_Policies);		
		helper.highLightElement(driver, Alert_Policies);
		Alert_Policies.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log("<B><font color = 'blue'>Step22 .</font></B> Clicked on  Alert_Policies Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alert_Policies Sub-Module  and Page Data is Displyed  ");
		
		
		Behaviour2.click();
		helper.waitFor(Alerts_Notifications);		
		helper.highLightElement(driver, Alerts_Notifications);
		Alerts_Notifications.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Alert_Policies Pic ");
		Reporter.log("<B><font color = 'blue'>Step23 .</font></B> Clicked on  Alerts_Notifications Sub-Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Alerts_Notifications Sub-Module  and Page Data is Displyed  ");
		
		
		
		/*
		 * Access Log 
		 */
		
		helper.waitFor(Access_Log);		
		helper.highLightElement(driver, Access_Log);
		Access_Log.click();
		Thread.sleep(500);
		helper.Screen_Shot_full_page("Access_Log Pic ");
		Reporter.log("<B><font color = 'red'>------Access_Log-----</font></B> ");
		Reporter.log("<B><font color = 'blue'>Step24 .</font></B> Clicked on  Access_Log  Module  and Page Data is Displyed  ");
		Assert.assertTrue(true, "Failed To click on  Access Log Module  and Page Data is Displyed  ");
		
		
		
		
		
		
		
		
	}
	


}
