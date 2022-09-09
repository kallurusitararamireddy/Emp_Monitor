package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeDashBoardPage;
import com.emp.qa.pages.EmployeeDetailspage;
import com.emp.qa.pages.HomePage;

public class EmployeeDashBoardTest extends TestBase {
	@Test
	public void EmployeeDashBoardTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
//		homePage.Skip();
		homePage.Skip();
		EmployeeDashBoardPage EmployeeDashboard = new EmployeeDashBoardPage(getDriver());
		EmployeeDashboard.EmployeeDashBoardPage();
		//homePage.SkipPopup();
			

		}
	

}
