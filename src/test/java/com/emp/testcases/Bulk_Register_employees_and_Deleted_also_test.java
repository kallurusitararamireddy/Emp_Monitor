package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Bulk_Register_employees_and_Deleted_also_page;
import com.emp.qa.pages.HomePage;

public class Bulk_Register_employees_and_Deleted_also_test extends TestBase {
	
	
	
	@Test
	public void Register_employees_and_Deleted_also() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		Bulk_Register_employees_and_Deleted_also_page add_deleted = new Bulk_Register_employees_and_Deleted_also_page(getDriver());
 
		homePage.clickEmployee();
		add_deleted.Register_employees_and_Deleted_also();
			

	}

}


