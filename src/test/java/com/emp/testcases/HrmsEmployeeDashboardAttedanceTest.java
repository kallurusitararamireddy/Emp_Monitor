package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashBoardPage;
import com.emp.qa.pages.HrmsEmployeeDashboardAttedancePage;

public class HrmsEmployeeDashboardAttedanceTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardAttedanceTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardAttedancePage HrmsEmployeeAttendance = new HrmsEmployeeDashboardAttedancePage(getDriver());
		HrmsEmployeeAttendance.HrmsEmployeeDashboardAttedancePage();
	}
	

}
