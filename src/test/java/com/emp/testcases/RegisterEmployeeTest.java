package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeDetailspage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RegisterEmployeePage;

public class RegisterEmployeeTest extends TestBase {

	@Test
	public void RegisterEmployeeTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		RegisterEmployeePage REP=new RegisterEmployeePage(getDriver());
		
		homePage.clickEmployee();
		REP.RegisterEmployee();
	}
  
}
