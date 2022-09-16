package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.ActivatingSuspendedEmployeesPage;
import com.emp.qa.pages.EmployeeRoleUpdatePage;
import com.emp.qa.pages.HomePage;

public class ActivatingSuspendedEmployeesTest extends TestBase {
	
	@Test
	public void EmployeeRoleUpdateTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		ActivatingSuspendedEmployeesPage activatesuspend = new ActivatingSuspendedEmployeesPage(getDriver());
		homePage.clickEmployee();
		homePage.Skip();
		activatesuspend.suspendedemployee();
	}

	

}
