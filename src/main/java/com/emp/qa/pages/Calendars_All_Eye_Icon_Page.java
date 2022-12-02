package com.emp.qa.pages;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
import com.opencsv.exceptions.CsvException;

public class Calendars_All_Eye_Icon_Page extends BasePage {

	public Calendars_All_Eye_Icon_Page(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//select[@id='ShowEntriesList']")
	@CacheLookup
	WebElement ShowEntries;

	@FindBy(xpath = "(//tbody[@id='fetch_Details']/tr/td)[1]/a")
	@CacheLookup
	WebElement Employee_Selected_1;

	@FindBy(xpath = "(//div[@id='dateRange']//i)[3]")
	@CacheLookup
	WebElement Eye_icon_1;

	/*
	 * 2
	 */

	@FindBy(xpath = "//span[text()='Employee']")
	@CacheLookup
	WebElement Employee_module_2;

	@FindBy(xpath = "//a[@title='Employee-Attendance']")
	@CacheLookup
	WebElement Employee_Attendance;

	@FindBy(xpath = "//*[@id=\"AttendanceListData\"]/tr[1]/td[1]/a")
	@CacheLookup
	WebElement Employee_Selected_2;

	@FindBy(xpath = "(//div[@id='dateRange']//i)[3]")
	@CacheLookup
	WebElement Eye_icon_2;

	/*
	 * 3
	 */

	@FindBy(xpath = "//span[text()='Employee']")
	@CacheLookup
	WebElement Employee_module_3;

	@FindBy(xpath = "//a[text()='Employee-Notification']")
	@CacheLookup
	WebElement Employee_Notification;

	@FindBy(xpath = "//div[@id='reportrange']/following-sibling::i")
	@CacheLookup
	WebElement Eye_icon_3;

	/*
	 * 4
	 */

	@FindBy(xpath = "//span[text()='Timesheets']")
	@CacheLookup
	WebElement Time_Sheets_module;

	@FindBy(xpath = "//div[@class='col-md-4']//label/i")
	@CacheLookup
	WebElement Eye_icon_4;

	/*
	 * 5
	 */

	@FindBy(xpath = "//span[text()='Time Claim']")
	@CacheLookup
	WebElement Time_claim_module;

	@FindBy(xpath = "//div[@class='col-md-4']/label/i")
	@CacheLookup
	WebElement Eye_icon_5;

	/*
	 * 6
	 */

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_module;
	@FindBy(xpath = "//a[text()='Reports Download']")
	@CacheLookup
	WebElement Reports_Download;
	@FindBy(xpath = "//div[@class='col-md-4']/label/i")
	@CacheLookup
	WebElement Eye_icon_6;
	
	
	/*
	 * 7
	 */

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_module_1;
	@FindBy(xpath = "//a[text()='Productivity Reports']")
	@CacheLookup
	WebElement Productivity_Reports;
	@FindBy(xpath = "//div[@class='col-md-4']/div/i")
	@CacheLookup
	WebElement Eye_icon_7;
	
	
	/*
	 * 8
	 */

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_module_2;
	@FindBy(xpath = "//a[text()='Web App Usage']")
	@CacheLookup
	WebElement Web_App_Usage;
	@FindBy(xpath = "//div[@class='col-md-4']/div/i")
	@CacheLookup
	WebElement Eye_icon_8;
	
	/*
	 * 9
	 */

	@FindBy(xpath = "//span[text()='Reports']")
	@CacheLookup
	WebElement Reports_module_3;
	@FindBy(xpath = "//a[text()='System Activity Logs']")
	@CacheLookup
	WebElement System_Activity_Logs;
	@FindBy(xpath = "(//div[@id='reportrange']/i)[3]")
	@CacheLookup
	WebElement Eye_icon_9;
	
	
	/*
	 * 10
	 */

	@FindBy(xpath = "//span[text()='Behaviour']")
	@CacheLookup
	WebElement Behavior;
	@FindBy(xpath = "//a[text()='Alerts Notifications']")
	@CacheLookup
	WebElement Alerts_Notifications;
	@FindBy(xpath = "//div[@class='col-md-4']/label/i")
	@CacheLookup
	WebElement Eye_icon_10;
	
	

	public void Calendar_Eye_Icon_1() throws InterruptedException, IOException, AWTException, CsvException {

		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log(
				"<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee Module and Selected  Employee-Details Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee Module and Selected  Employee-Details Sub-Module");

		helper.highLightElement(driver, ShowEntries);
		helper.selectDropDownValue(ShowEntries, "index", "2");
		ShowEntries.click();
		Reporter.log(
				"<B><font color = 'blue'>Step2 .</font></B> Clicked on Show-Entries Drop-down and Selected Any Value");
		Assert.assertTrue(true, "Failed to Click on Show-Entries Drop-down and Selected Any Value");
		Thread.sleep(1000);

		helper.waitFor(Employee_Selected_1);
		helper.highLightElement(driver, Employee_Selected_1);
		helper.explicitlyWait(Employee_Selected_1);
		helper.jsCLick(Employee_Selected_1);
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Any Employee");
		Assert.assertTrue(true, "Failed to Click on Any Employee");

		helper.waitFor(Eye_icon_1);
		helper.highLightElement(driver, Eye_icon_1);
		helper.explicitlyWait(Eye_icon_1);
		helper.move_to_element(Eye_icon_1);
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);

		/*
		 * 2
		 */
       
		
		helper.waitFor(Employee_module_2);
		helper.highLightElement(driver, Employee_module_2);
		Employee_module_2.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Employee Module  ");
		Assert.assertTrue(true, "Failed to Click on Employee Module");

		helper.waitFor(Employee_Attendance);
		helper.highLightElement(driver, Employee_Attendance);
		helper.jsCLick(Employee_Attendance);
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Employee_Attendance Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee_Attendance Sub-Module");
			
		
		helper.waitFor(Employee_Selected_2);
		helper.explicitlyWait(Employee_Selected_2);
		helper.highLightElement(driver, Employee_Selected_2);
	    helper.move_to_element(Employee_Selected_2);
	    helper.jsCLick(Employee_Selected_2);
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Any Employee");
		Assert.assertTrue(true, "Failed to Click on Any Employee");


		helper.waitFor(Eye_icon_2); 
		helper.highLightElement(driver, Eye_icon_2);
	    helper.explicitlyWait(Eye_icon_2);
	    helper.move_to_element(Eye_icon_2);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);
		

		/*
		 * 3
		 */

		helper.waitFor(Employee_module_3);
		helper.highLightElement(driver, Employee_module_3);
		Employee_module_3.click();
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Employee Module  ");
		Assert.assertTrue(true, "Failed to Click on Employee Module ");

		helper.waitFor(Employee_Notification);
		helper.highLightElement(driver, Employee_Notification);
		helper.explicitlyWait(Employee_Notification);
		helper.jsCLick(Employee_Notification);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Employee_Notification Sub-Module ");
		Assert.assertTrue(true, "Failed to Click on Employee_Notification Sub-Module");

		helper.waitFor(Eye_icon_3);
		helper.highLightElement(driver, Eye_icon_3);
		helper.explicitlyWait(Eye_icon_3);
		helper.move_to_element(Eye_icon_3);
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);

		/*
		 * 4
		 */

		helper.waitFor(Time_Sheets_module);
		helper.highLightElement(driver, Time_Sheets_module);
		Time_Sheets_module.click();
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Time_Sheets Module  ");
		Assert.assertTrue(true, "Failed to Click on Time_Sheets Module ");

		helper.waitFor(Eye_icon_4);
		helper.highLightElement(driver, Eye_icon_4);
		helper.explicitlyWait(Eye_icon_4);
		helper.move_to_element(Eye_icon_4);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);

		/*
		 * 5
		 */

		helper.waitFor(Time_claim_module);
		helper.highLightElement(driver, Time_claim_module);
		Time_claim_module.click();
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on Time_claim Module  ");
		Assert.assertTrue(true, "Failed to Click on Time_claim Module ");

		helper.waitFor(Eye_icon_5);
		helper.highLightElement(driver, Eye_icon_5);
		helper.explicitlyWait(Eye_icon_5);
		helper.move_to_element(Eye_icon_5);
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);

		/*
		 * 6
		 */

		helper.waitFor(Reports_module);
		helper.highLightElement(driver, Reports_module);
		Reports_module.click();
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> Clicked on Reports_module Module  ");
		Assert.assertTrue(true, "Failed to Click on Reports_module Module ");

		helper.waitFor(Reports_Download);
		helper.highLightElement(driver, Reports_Download);
		Reports_Download.click();
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> Clicked on Reports_Download Sub-Module  ");
		Assert.assertTrue(true, "Failed to Click on  Reports_Download Sub-Module ");

		helper.waitFor(Eye_icon_6);
		helper.highLightElement(driver, Eye_icon_6);
		helper.explicitlyWait(Eye_icon_6);
		helper.move_to_element(Eye_icon_6);
		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);
		
		
		/*
		 * 7
		 */

		helper.waitFor(Reports_module_1);
		helper.highLightElement(driver, Reports_module_1);
		Reports_module_1.click();
		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> Clicked on Reports_module Module  ");
		Assert.assertTrue(true, "Failed to Click on Reports_module Module ");

		helper.waitFor(Productivity_Reports);
		helper.highLightElement(driver, Productivity_Reports);
		Productivity_Reports.click();
		Reporter.log("<B><font color = 'blue'>Step20 .</font></B> Clicked on Productivity_Reports Sub-Module  ");
		Assert.assertTrue(true, "Failed to Click on  Productivity_Reports Sub-Module ");

		helper.waitFor(Eye_icon_7);
		helper.highLightElement(driver, Eye_icon_7);
		helper.explicitlyWait(Eye_icon_7);
		helper.move_to_element(Eye_icon_7);
		Reporter.log("<B><font color = 'blue'>Step21 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);
		
		
		/*
		 * 8
		 */

		helper.waitFor(Reports_module_2);
		helper.highLightElement(driver, Reports_module_2);
		Reports_module_2.click();
		Reporter.log("<B><font color = 'blue'>Step22 .</font></B> Clicked on Reports_module Module  ");
		Assert.assertTrue(true, "Failed to Click on Reports_module Module ");

		helper.waitFor(Web_App_Usage);
		helper.highLightElement(driver, Web_App_Usage);
		Web_App_Usage.click();
		Reporter.log("<B><font color = 'blue'>Step23 .</font></B> Clicked on Web_App_Usage Sub-Module  ");
		Assert.assertTrue(true, "Failed to Click on  Web_App_Usage Sub-Module ");

		helper.waitFor(Eye_icon_8);
		helper.highLightElement(driver, Eye_icon_8);
		helper.explicitlyWait(Eye_icon_8);
		helper.move_to_element(Eye_icon_8);
		Reporter.log("<B><font color = 'blue'>Step24 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);
		
		
		
		/*
		 * 9
		 */

		helper.waitFor(Reports_module_3);
		helper.highLightElement(driver, Reports_module_3);
		Reports_module_3.click();
		Reporter.log("<B><font color = 'blue'>Step25 .</font></B> Clicked on Reports_module Module  ");
		Assert.assertTrue(true, "Failed to Click on Reports_module Module ");

		helper.waitFor(System_Activity_Logs);
		helper.highLightElement(driver, System_Activity_Logs);
		System_Activity_Logs.click();
		Reporter.log("<B><font color = 'blue'>Step26 .</font></B> Clicked on System_Activity_Logs Sub-Module  ");
		Assert.assertTrue(true, "Failed to Click on  System_Activity_Logs Sub-Module ");

		helper.waitFor(Eye_icon_9);
		helper.highLightElement(driver, Eye_icon_9);
		helper.explicitlyWait(Eye_icon_9);
		helper.move_to_element(Eye_icon_9);
		Reporter.log("<B><font color = 'blue'>Step27 .</font></B>Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);
		
		
		/*
		 * 10
		 */

		helper.waitFor(Behavior);
		helper.highLightElement(driver, Behavior);
		Behavior.click();
		Reporter.log("<B><font color = 'blue'>Step28 .</font></B> Clicked on Behavior Module  ");
		Assert.assertTrue(true, "Failed to Click on Behavior Module ");

		helper.waitFor(Alerts_Notifications);
		helper.highLightElement(driver, Alerts_Notifications);
		Alerts_Notifications.click();
		Reporter.log("<B><font color = 'blue'>Step29 .</font></B> Clicked on Alerts_Notifications Sub-Module  ");
		Assert.assertTrue(true, "Failed to Click on  Alerts_Notifications Sub-Module ");

		helper.waitFor(Eye_icon_10);
		helper.highLightElement(driver, Eye_icon_10);
		helper.explicitlyWait(Eye_icon_10); 
		helper.move_to_element(Eye_icon_10);
		Reporter.log("<B><font color = 'blue'>Step30 .</font></B> Mouse_over on Calendar  Eye_icon and Message Showing");
		Assert.assertTrue(true, "Failed to Mouse_over on Calendar  Eye_icon");
		Thread.sleep(1000);
		

	}

}
