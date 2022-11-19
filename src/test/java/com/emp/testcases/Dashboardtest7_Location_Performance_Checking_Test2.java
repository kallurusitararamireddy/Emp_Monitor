package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Dashboardpage4_Top_10_Non_Productive_Employees_Checking_page;
import com.emp.qa.pages.Dashboardpage5_Top_10_Active_Employees_Checking_page;
import com.emp.qa.pages.Dashboardpage6_Top_10_Non_Active_Employees_Checking_page2;
import com.emp.qa.pages.Dashboardpage7_Location_Performance_Checking_page;
import com.emp.qa.pages.HomePage;

public class Dashboardtest7_Location_Performance_Checking_Test2 extends  TestBase
{

	@Test(priority  = 1)
	public void location_Performance_Checking_page_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Dashboardpage7_Location_Performance_Checking_page DashBoardpage = new Dashboardpage7_Location_Performance_Checking_page(getDriver());
		
		homePage.clickDashboard();
		DashBoardpage.Location_Performance();
	} 
	 

}
