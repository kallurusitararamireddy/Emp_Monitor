package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Dashboardpage4_Top_10_Non_Productive_Employees_Checking_page;
import com.emp.qa.pages.HomePage;

public class Dashboardtest4_Top_10_Non_Productive_Employees_Checking_Test extends  TestBase
{

	@Test(priority  = 1)
	public void Top_10_Non_Productive_Employees_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Dashboardpage4_Top_10_Non_Productive_Employees_Checking_page DashBoardpage = new Dashboardpage4_Top_10_Non_Productive_Employees_Checking_page(getDriver());
		
		homePage.clickDashboard();
		DashBoardpage.Top_10_Non_Productiv();
	} 
	 
	
	
	
	

}
