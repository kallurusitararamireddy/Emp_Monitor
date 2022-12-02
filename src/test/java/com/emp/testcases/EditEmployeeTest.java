package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EditEmployeePage;
import com.emp.qa.pages.HomePage;

public class EditEmployeeTest extends TestBase {
	
	
	
	@Test
	public void EditEmployeeTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		EditEmployeePage EditEmployee = new EditEmployeePage(getDriver());
 
		homePage.clickEmployee();
		EditEmployee.EditEmployee();
			

	}

}


