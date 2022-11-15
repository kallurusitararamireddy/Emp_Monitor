package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeDetailsFilterPage;
import com.emp.qa.pages.HomePage;

public class EmployeeDetailsFilterTest extends TestBase {
	
	@Test
	public void EmployeeDetailsFilterTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		EmployeeDetailsFilterPage empDetailspage = new EmployeeDetailsFilterPage(getDriver());
		
		homePage.clickEmployee();
		empDetailspage.EmployeeDetailsFilter();
	}

}
