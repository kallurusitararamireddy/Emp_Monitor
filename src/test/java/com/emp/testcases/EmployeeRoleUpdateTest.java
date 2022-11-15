package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeRoleUpdatePage;
import com.emp.qa.pages.HomePage;

public class EmployeeRoleUpdateTest extends TestBase {
	
	@Test
	public void EmployeeRoleUpdateTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		EmployeeRoleUpdatePage emproleupdate = new EmployeeRoleUpdatePage(getDriver());
	
		homePage.clickEmployee();
		emproleupdate.EmployeeDetailsFilter();
	}

}
