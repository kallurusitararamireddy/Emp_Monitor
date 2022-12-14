package com.emp.qa.pages;

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

import com.emp.qa.util.Helpers;

public class DashBoardPage extends BasePage {

	public DashBoardPage(WebDriver driver) {
		super(driver);

	}

	Helpers helper = new Helpers();

	@FindBy(xpath = "//h3[@id='registered-employees']")
	@CacheLookup
	WebElement TotalEnrollments;

	@FindBy(xpath = "//button[contains(text(),'Generate CSV')]")
	@CacheLookup
	WebElement TotalEnrollments_csvButton;

	@FindBy(xpath = "//button[@class='close float-right']")
	@CacheLookup
	WebElement TotalEnrollments_CloseButtton;

	@FindBy(xpath = "//h3[@id='online-employees']")
	@CacheLookup
	WebElement CurrentlyACtive;

	@FindBy(xpath = "//button[contains(text(),'Generate CSV')]")
	@CacheLookup
	WebElement CurrentlyACtive_CsvButton;

	@FindBy(xpath = "//*[@id='Online_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement CurrentlyACtive_Close_Button; 

	@FindBy(xpath = "//h3[@id='offline-employees']")
	@CacheLookup
	WebElement CurrentlyIdle;

	@FindBy(xpath = "//button[contains(text(),'Generate CSV')]")
	@CacheLookup
	WebElement CurrentlyIdle_csv_Button;

	@FindBy(xpath = "//*[@id='Offline_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement CurrentlyIdle_close_Button;

	@FindBy(xpath = "//h3[@id='currently-offline-employees']")
	@CacheLookup
	WebElement Currently_Offline;

	@FindBy(xpath = "//*[@id='Currently_Offline_count']/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Currently_offline_csv_Button;

	@FindBy(xpath = "//*[@id='Currently_Offline_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Currentlyoffline_close_Button;

	@FindBy(xpath = "//h3[@id='idle-employees']")
	@CacheLookup
	WebElement Absent_Users;

	@FindBy(xpath = "//*[@id=\"Absent_count\"]/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Absent_Users_Generate_csvButton;

	@FindBy(xpath = "//*[@id=\"Absent_count\"]/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Absent_Users_closeButton;

	@FindBy(xpath = "//h3[@id='suspended-employees']")
	@CacheLookup
	WebElement Suspended_Users;

	@FindBy(xpath = "//*[@id=\"suspended_count\"]/div/div/div[3]/button[1]")
	@CacheLookup
	WebElement Suspended_Users_csvButton;

	@FindBy(xpath = "//*[@id='suspended_count']/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Suspende_Users_closeButton;

	@FindBy(xpath = "//*[@id=\"productive_location\"]")
	
	@CacheLookup
	WebElement Top10ProductiveEmployees_Locations; 

	@FindBy(xpath = "//select[@id='productive_department']")
	@CacheLookup
	WebElement Top10ProductiveEmployees_Departments;

	@FindBy(xpath = "//button[@id='todayProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployeesToday;

	@FindBy(xpath = "//button[@id='yesterdayProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployeesyesterday;

	@FindBy(xpath = "//button[@id='weekProEmp']")
	@CacheLookup
	WebElement Top10ProductiveEmployees_Thisweek;

	@FindBy(xpath = "//select[@id='slacking_location']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Location;

	@FindBy(xpath = "//select[@id='slacking_department']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Department;

	@FindBy(xpath = "//button[@id='todayUnProEmp']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Today;

	@FindBy(xpath = "//button[@id='yesterdayUnProEmp']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Yesterday;

	@FindBy(xpath = "//button[@id='weekUnProEmp']")
	@CacheLookup
	WebElement Top10NonProductiveEmployees_Thisweek;

	@FindBy(xpath = "//select[@id='location_option']")
	@CacheLookup
	WebElement Location_Performance_Productive;

	@FindBy(xpath = "//button[@id='todayPerformance']")
	@CacheLookup
	WebElement Location_Performance_Today;

	@FindBy(xpath = "//button[@id='yesterdayPerformance']")
	@CacheLookup
	WebElement Location_Performance_Yesterday;

	@FindBy(xpath = "//button[@id='weekPerformance']")
	@CacheLookup
	WebElement Location_Performance_Thisweek;

	@FindBy(xpath = "//select[@id='department_option']")
	@CacheLookup
	WebElement Department_Performance_Productive;

	@FindBy(xpath = "//button[@id='todayDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Today;

	@FindBy(xpath = "//button[@id='yesterdayDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Yesterday;

	@FindBy(xpath = "//button[@id='weekDeptPerformance']")
	@CacheLookup
	WebElement Department_Performance_Thisweek;

	@FindBy(xpath = "//button[@id='todayTopWebs']")
	@CacheLookup
	WebElement Top10Websitesusages_Today;

	@FindBy(xpath = "//*[@id=\"yesterdayTopWebs\"]")
	@CacheLookup
	WebElement Top10Websitesusages_Yesterday;

	@FindBy(xpath = "//button[@id='weekTopWebs']")
	@CacheLookup
	WebElement Top10Websitesusages_Thisweek;

	@FindBy(xpath = "//button[@id='viewDetialButton3']")
	@CacheLookup
	WebElement Top10Websitesusages_Viewdetails;

	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[3]")
	@CacheLookup
	WebElement Viewdetails_CloseButton;

	@FindBy(xpath = "//button[@id='todayTopApps']")
	@CacheLookup
	WebElement Top10_Application_Usage_Today;

	@FindBy(xpath = "//*[@id=\"yesterdayTopApps\"]")
	
	@CacheLookup
	WebElement Top10_Application_Usage_Yesterday;

	@FindBy(xpath = "//*[@id=\"weekTopApps\"]")
	@CacheLookup
	WebElement Top10_Application_Usage_Thisweek;

	@FindBy(xpath = "//button[@id='viewDetialButton4']")
	@CacheLookup
	WebElement Top10_Application_Usage_viewdetails;

	@FindBy(xpath = "(//button[@type='button'][contains(.,'Close')])[3]")
	@CacheLookup
	WebElement Top10_Application_Usage_view_details_closebutton;

	public void DashBoardPage() throws InterruptedException, IOException {

		helper.waitFor(TotalEnrollments);
		helper.highLightElement(driver, TotalEnrollments);
		TotalEnrollments.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Total_Enrollments Button ");
		Assert.assertTrue(true, "Failed to Click on  Total_Enrollments Button ");
		
		helper.waitFor(TotalEnrollments_csvButton);
		helper.highLightElement(driver, TotalEnrollments_csvButton); 
		Thread.sleep(7000);
		TotalEnrollments_csvButton.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked on Total_Enrollments csv-Button ");
		Assert.assertTrue(true, "Failed to Click on Total Total_Enrollments csvButton");
		Thread.sleep(7000); 
		
		helper.waitFor(TotalEnrollments_CloseButtton);
		helper.highLightElement(driver, TotalEnrollments_CloseButtton);
		TotalEnrollments_CloseButtton.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on Total_Enrollments_Close-Buttton ");
		Assert.assertTrue(true, "Failed to Click on Total Total_Enrollments_Close-Buttton");
		Thread.sleep(7000);
		
		helper.waitFor(CurrentlyACtive);
		helper.highLightElement(driver, CurrentlyACtive);
		Thread.sleep(4000);
		CurrentlyACtive.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked on Currently_ACtive Button");
		Assert.assertTrue(true, "Failed to Click on  Currently_ACtive Button");
		
		
		helper.waitFor(CurrentlyACtive_CsvButton);
		helper.highLightElement(driver, CurrentlyACtive_CsvButton);
		helper.jsCLick(CurrentlyACtive_CsvButton);
		Thread.sleep(7000);
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on Currently_ACtive Csv-Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_ACtive Csv-Button");
		
		helper.waitFor(CurrentlyACtive_Close_Button);
		helper.highLightElement(driver, CurrentlyACtive_Close_Button);
		CurrentlyACtive_Close_Button.click();
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on Currently_ACtive_Close Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_ACtive_Close Button");
		
		helper.waitFor(CurrentlyIdle);
		helper.highLightElement(driver, CurrentlyIdle);
		CurrentlyIdle.click();
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on Currently_Idle ");
		Assert.assertTrue(true, "Failed to Click on  Currently_Idle");
		
		helper.waitFor(CurrentlyIdle_csv_Button);
		helper.highLightElement(driver, CurrentlyIdle_csv_Button);
		helper.jsCLick(CurrentlyIdle_csv_Button);
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Currently_Idle csv-Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_Idle csv-Button");
		Thread.sleep(5000);
		
		helper.waitFor(CurrentlyIdle_close_Button);
		helper.highLightElement(driver, CurrentlyIdle_close_Button);
		CurrentlyIdle_close_Button.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Currently_Idle_close Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_Idle_close Button");
		
		helper.waitFor(Currently_Offline);
		helper.highLightElement(driver, Currently_Offline);
		Currently_Offline.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Currently_Offline Button");
		Assert.assertTrue(true, "Failed to Click on  Currently_Offline  Button");
		
		
		helper.waitFor(Currently_offline_csv_Button);
		helper.highLightElement(driver, Currently_offline_csv_Button);
		Currently_offline_csv_Button.click();
		Reporter.log("<B><font color = 'blue'>Step11 .</font></B> Clicked on Currently_offline csv-Button ");
		Assert.assertTrue(true, "Failed to Click on  Currently_offline csv-Button");
		Thread.sleep(5000);
		
		
		helper.waitFor(Currentlyoffline_close_Button);
		helper.highLightElement(driver, Currentlyoffline_close_Button);
		Thread.sleep(5000);
		Currentlyoffline_close_Button.click();
		Reporter.log("<B><font color = 'blue'>Step12 .</font></B> Clicked on Currentlyoffline_close Button ");
		Assert.assertTrue(true, "Failed to Click on  Currentlyoffline_close Button");
		
		helper.waitFor(Absent_Users);
		helper.highLightElement(driver, Absent_Users);
		Absent_Users.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step13 .</font></B> Clicked on Absent_Users Button");
		Assert.assertTrue(true, "Failed to Click on  Absent_Users Button");
		
		helper.waitFor(Absent_Users_Generate_csvButton);
		helper.highLightElement(driver, Absent_Users_Generate_csvButton);
		Absent_Users_Generate_csvButton.click();
		Reporter.log("<B><font color = 'blue'>Step14 .</font></B> Clicked on Absent_Users_Generate csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Absent_Users_Generate csv Button");
		Thread.sleep(5000);
		
		helper.waitFor(Absent_Users_closeButton);
		helper.highLightElement(driver, Absent_Users_closeButton);
		Thread.sleep(5000);
		Absent_Users_closeButton.click();
		Reporter.log("<B><font color = 'blue'>Step15 .</font></B> Clicked on Absent_Users close Button ");
		Assert.assertTrue(true, "Failed to Click on  Absent_Users close Button");

		helper.waitFor(Suspended_Users);
		helper.highLightElement(driver, Suspended_Users);
		Suspended_Users.click();
		Thread.sleep(5000);
		Reporter.log("<B><font color = 'blue'>Step16 .</font></B> Clicked on Suspended_Users Button ");
		Assert.assertTrue(true, "Failed to Click on  Suspended_Users Button ");

		helper.waitFor(Suspended_Users_csvButton);
		helper.highLightElement(driver, Suspended_Users_csvButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"suspended_count\"]/div/div/div[3]/button[1]"))).click();
		Suspended_Users_csvButton.click();
		Reporter.log("<B><font color = 'blue'>Step17 .</font></B> Clicked on Suspended_Users csv Button ");
		Assert.assertTrue(true, "Failed to Click on  Suspended_Users csv Button");
		Thread.sleep(5000);

		helper.waitFor(Suspende_Users_closeButton);
		helper.highLightElement(driver, Suspende_Users_closeButton);
		Thread.sleep(5000);
		Suspende_Users_closeButton.click();
		Reporter.log("<B><font color = 'blue'>Step18 .</font></B> Clicked on Suspende_Users close Button ");
		Assert.assertTrue(true, "Failed to Click on  Suspende_Users close Button");

		helper.waitFor(Top10ProductiveEmployees_Locations);
		helper.highLightElement(driver, Top10ProductiveEmployees_Locations);
		helper.Scrollintoview(Top10ProductiveEmployees_Locations);
		helper.selectDropDownValue(Top10ProductiveEmployees_Locations, "value", "0"); 
		Top10ProductiveEmployees_Locations.click();
		Reporter.log("<B><font color = 'blue'>Step19 .</font></B> Clicked on Top_10_Productive_Employees_Locations ");
		Assert.assertTrue(true, "Failed to Click on  Top10ProductiveEmployees_Locations");

		helper.waitFor(Top10ProductiveEmployees_Departments);
		helper.highLightElement(driver, Top10ProductiveEmployees_Departments);
		helper.Scrollintoview(Top10ProductiveEmployees_Departments);
		helper.selectDropDownValue(Top10ProductiveEmployees_Departments, "value", "null");
		Top10ProductiveEmployees_Departments.click();
		Reporter.log("<B><font color = 'blue'>Step20 .</font></B> Clicked on Top_10_Productive_Employees_Departments ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Productive_Employees_Departments");

		helper.waitFor(Top10ProductiveEmployeesToday);
		helper.highLightElement(driver, Top10ProductiveEmployeesToday);
		helper.Scrollintoview(Top10ProductiveEmployeesToday);
		Top10ProductiveEmployeesToday.click();
		Reporter.log("<B><font color = 'blue'>Step21 .</font></B> Clicked on Top_10_Productive_Employees_Today ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Productive_Employees_Today");
		Thread.sleep(2000);

		helper.waitFor(Top10ProductiveEmployeesyesterday);
		helper.highLightElement(driver, Top10ProductiveEmployeesyesterday);
		helper.Scrollintoview(Top10ProductiveEmployeesyesterday);
		Top10ProductiveEmployeesyesterday.click();
		Reporter.log("<B><font color = 'blue'>Step22 .</font></B> Clicked on Top_10_Productive_Employees_yesterday ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Productive_Employees_yesterday");
		Thread.sleep(2000);

		helper.waitFor(Top10ProductiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10ProductiveEmployees_Thisweek);
		helper.Scrollintoview(Top10ProductiveEmployees_Thisweek);
		Top10ProductiveEmployees_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step23 .</font></B> Clicked on Top 10 Productive_Employees_This week ");
		Assert.assertTrue(true, "Failed to Click on  Top 10 Productive_Employees_This week");
		Thread.sleep(2000);

		helper.waitFor(Top10NonProductiveEmployees_Location);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Location);
		helper.Scrollintoview(Top10NonProductiveEmployees_Location);
		helper.selectDropDownValue(Top10NonProductiveEmployees_Location, "value", "0");
		Top10NonProductiveEmployees_Location.click();
		Reporter.log("<B><font color = 'blue'>Step24 .</font></B> Clicked on Top_10_NonProductive_Employees_Location ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_NonProductive_Employees_Location");

		helper.waitFor(Top10NonProductiveEmployees_Department);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Department);
		helper.Scrollintoview(Top10NonProductiveEmployees_Department);
		Thread.sleep(1000);
		helper.selectDropDownValue(Top10NonProductiveEmployees_Department, "value", "null");
		Top10NonProductiveEmployees_Department.click();
		Reporter.log("<B><font color = 'blue'>Step25 .</font></B> Clicked on Top_10_NonProductive_Employees_Department ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_NonProductive_Employees_Department");

		helper.waitFor(Top10NonProductiveEmployees_Today);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Today);
		helper.Scrollintoview(Top10NonProductiveEmployees_Today);
		Top10NonProductiveEmployees_Today.click();
		Reporter.log("<B><font color = 'blue'>Step26 .</font></B> Clicked on Top_10_NonProductive_Employees_Today ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_NonProductive_Employees_Today");
		Thread.sleep(2000);

		helper.waitFor(Top10NonProductiveEmployees_Yesterday);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Yesterday);
		helper.Scrollintoview(Top10NonProductiveEmployees_Yesterday);
		Top10NonProductiveEmployees_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step27 .</font></B> Clicked on Top_10_NonProductive_Employees_Yesterday ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_NonProductive_Employees_Yesterday");
		Thread.sleep(2000);

		helper.waitFor(Top10NonProductiveEmployees_Thisweek);
		helper.highLightElement(driver, Top10NonProductiveEmployees_Thisweek);
		helper.Scrollintoview(Top10NonProductiveEmployees_Thisweek);
		Top10NonProductiveEmployees_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step28 .</font></B> Clicked on Top_10_NonProductive_Employees_Thisweek ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_NonProductive_Employees_Thisweek");
		Thread.sleep(2000);

		helper.waitFor(Location_Performance_Productive);
		helper.highLightElement(driver, Location_Performance_Productive);
		helper.Scrollintoview(Location_Performance_Productive);
		helper.selectDropDownValue(Location_Performance_Productive, "value", "pro");
		Location_Performance_Productive.click();
		Reporter.log("<B><font color = 'blue'>Step29 .</font></B> Clicked on Location_Performance_Productive ");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Productive");

		helper.waitFor(Location_Performance_Today);
		helper.highLightElement(driver, Location_Performance_Today);
		helper.Scrollintoview(Location_Performance_Today);
		Location_Performance_Today.click();
		Reporter.log("<B><font color = 'blue'>Step30 .</font></B> Clicked on Location_Performance_Today ");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Today");
		Thread.sleep(2000);

		helper.waitFor(Location_Performance_Yesterday);
		helper.highLightElement(driver, Location_Performance_Yesterday);
		helper.Scrollintoview(Location_Performance_Yesterday);
		Location_Performance_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step31 .</font></B> Clicked on Location_Performance_Yesterday ");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Yesterday");
		Thread.sleep(2000);

		helper.waitFor(Location_Performance_Thisweek);
		helper.highLightElement(driver, Location_Performance_Thisweek);
		helper.Scrollintoview(Location_Performance_Thisweek);
		Location_Performance_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step32 .</font></B> Clicked on Location_Performance_Thisweek ");
		Assert.assertTrue(true, "Failed to Click on  Location_Performance_Thisweek");
		Thread.sleep(2000);

		helper.waitFor(Department_Performance_Productive);
		helper.highLightElement(driver, Department_Performance_Productive);
		helper.Scrollintoview(Department_Performance_Productive);
		helper.selectDropDownValue(Department_Performance_Productive, "value", "pro");
		Department_Performance_Productive.click();
		Reporter.log("<B><font color = 'blue'>Step33 .</font></B> Clicked on Department_Performance_Productive ");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Productive");

		helper.waitFor(Department_Performance_Today);
		helper.highLightElement(driver, Department_Performance_Today);
		helper.Scrollintoview(Department_Performance_Today);
		Department_Performance_Today.click();
		Reporter.log("<B><font color = 'blue'>Step34 .</font></B> Clicked on Department_Performance_Today ");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Today");
		Thread.sleep(2000);

		helper.waitFor(Department_Performance_Yesterday);
		helper.highLightElement(driver, Department_Performance_Yesterday);
		helper.Scrollintoview(Department_Performance_Yesterday);
		Department_Performance_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step35 .</font></B> Clicked on Department_Performance_Yesterday ");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Yesterday");
		Thread.sleep(2000);

		helper.waitFor(Department_Performance_Thisweek);
		helper.highLightElement(driver, Department_Performance_Thisweek);
		helper.Scrollintoview(Department_Performance_Thisweek);
		Department_Performance_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step36 .</font></B> Clicked on Department_Performance_Thisweek ");
		Assert.assertTrue(true, "Failed to Click on  Department_Performance_Thisweek");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Today);
		helper.highLightElement(driver, Top10Websitesusages_Today);
		helper.Scrollintoview(Top10Websitesusages_Today);
		Top10Websitesusages_Today.click();
		Reporter.log("<B><font color = 'blue'>Step37 .</font></B> Clicked on Top_10_Websites_usages_Today ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Websites_usages_Today");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Yesterday);
		helper.highLightElement(driver, Top10Websitesusages_Yesterday);
		helper.Scrollintoview(Top10Websitesusages_Yesterday);
		Top10Websitesusages_Yesterday.click();
		Reporter.log("<B><font color = 'blue'>Step38 .</font></B> Clicked on Top_10_Websites_usages_Yesterday ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Websites_usages_Yesterday");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Thisweek);
		helper.highLightElement(driver, Top10Websitesusages_Thisweek);
		helper.Scrollintoview(Top10Websitesusages_Thisweek);
		Top10Websitesusages_Thisweek.click();
		Reporter.log("<B><font color = 'blue'>Step39 .</font></B> Clicked on Top_10_Websites_usages_Thisweek ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Websites_usages_Thisweek");
		Thread.sleep(2000);

		helper.waitFor(Top10Websitesusages_Viewdetails);
		helper.highLightElement(driver, Top10Websitesusages_Viewdetails);
		helper.Scrollintoview(Top10Websitesusages_Viewdetails);
		helper.jsCLick(Top10Websitesusages_Viewdetails);
		Reporter.log("<B><font color = 'blue'>Step40 .</font></B> Clicked on Top_10_Websites_usages_View-details ");
		Assert.assertTrue(true, "Failed to Click on  Top_10_Websites_usages_Viewdetails");
		Thread.sleep(2000);

		helper.waitFor(Viewdetails_CloseButton);
		helper.highLightElement(driver, Viewdetails_CloseButton);
		helper.Scrollintoview(Viewdetails_CloseButton);
		helper.jsCLick(Viewdetails_CloseButton);
		Reporter.log("<B><font color = 'blue'>Step41 .</font></B> Clicked on Viewdetails_Close Button ");
		Assert.assertTrue(true, "Failed to Click on  Viewdetails_Close Button");

		helper.waitFor(Top10_Application_Usage_Today);
		helper.highLightElement(driver, Top10_Application_Usage_Today);
		helper.Scrollintoview(Top10_Application_Usage_Today);
		helper.jsCLick(Top10_Application_Usage_Today);
		Reporter.log("<B><font color = 'blue'>Step42 .</font></B> Clicked on Top10_Application_Usage_Today ");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_Today");

		helper.waitFor(Top10_Application_Usage_Yesterday);
		helper.highLightElement(driver, Top10_Application_Usage_Yesterday);
		helper.Scrollintoview(Top10_Application_Usage_Yesterday);
		helper.move_to_element_click(Top10Websitesusages_Yesterday);
		Reporter.log("<B><font color = 'blue'>Step43 .</font></B> Clicked on Top10_Application_Usage_Yesterday ");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_Yesterday");

		helper.waitFor(Top10_Application_Usage_Thisweek);
		helper.highLightElement(driver, Top10_Application_Usage_Thisweek);
		helper.Scrollintoview(Top10_Application_Usage_Thisweek);
		helper.move_to_element_click(Top10_Application_Usage_Thisweek);
		Reporter.log("<B><font color = 'blue'>Step44 .</font></B> Clicked on Top10_Application_Usage_Thisweek ");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_Thisweek");

		helper.waitFor(Top10_Application_Usage_viewdetails);
		helper.highLightElement(driver, Top10_Application_Usage_viewdetails);
		helper.Scrollintoview(Top10_Application_Usage_viewdetails);
		helper.jsCLick(Top10_Application_Usage_viewdetails);
		Reporter.log("<B><font color = 'blue'>Step45 .</font></B> Clicked on Top10_Application_Usage_view-details ");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_view details");
		Thread.sleep(2000);

		helper.waitFor(Top10_Application_Usage_view_details_closebutton);
		helper.highLightElement(driver, Top10_Application_Usage_view_details_closebutton);
		helper.Scrollintoview(Top10_Application_Usage_view_details_closebutton);
		helper.jsCLick(Top10_Application_Usage_view_details_closebutton);
		Reporter.log(
				"<B><font color = 'blue'>Step45 .</font></B> Clicked on Top10_Application_Usage_view_details_close Button ");
		Assert.assertTrue(true, "Failed to Click on  Top10_Application_Usage_view_details_close Button");
		Thread.sleep(2000);

	}

}
