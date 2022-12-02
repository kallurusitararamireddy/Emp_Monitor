package com.emp.testcases;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.DashBoardPage_Details;
import com.emp.qa.pages.HomePage;

public class DashBoardTest1_checking extends TestBase {

	@Test(priority  = 1)
	public void TotalEnrollments_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		
		homePage.clickDashboard();
		DashBoardpage.TotalEnrollments_1();
	} 
	
	@Test(priority  = 2)
	public void CurrentlyACtive_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.CurrentlyACtive_2(); 
	} 
	
	@Test(priority  = 3)
	public void CurrentlyIdle_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.CurrentlyIdle_3();
	} 
	
	@Test(priority  = 4)
	public void Currently_Offline_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Currently_Offline_4();
	} 
	
	@Test(priority  = 5)
	public void Absent_Users_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Absent_Users_5();
	} 
	
	@Test(priority  = 6)
	public void Suspended_Users_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Suspended_Users_6();
	} 
	
	@Test(priority  = 7)
	public void Top10ProductiveEmployees_Locations_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top10ProductiveEmployees_Locations_7();
	} 
	
	@Test(priority  = 8)
	public void Top10NonProductiveEmployees_Location_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top10NonProductiveEmployees_Location_8();
	} 
	
	@Test(priority  = 9)
	public void Location_Performance_Productive_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Location_Performance_Productive_9();
	} 
	
	@Test(priority  = 10)
	public void Department_Performance_Productive_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Department_Performance_Productive_10();
	} 
	
	@Test(priority  = 11)
	public void Top10Websitesusages_Today_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top10Websitesusages_Today_11();
	} 
	
	@Test(priority  = 12)
	public void Top10_Application_Usage_Today_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage_Details DashBoardpage = new DashBoardPage_Details(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top10_Application_Usage_Today_12();
	} 
 
}
