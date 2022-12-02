package com.emp.testcases;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Bulk_Register_Page;
import com.emp.qa.pages.HomePage;

public class BulkRegisterTest extends TestBase {

	@Test
	public void Employee() throws Exception {
		Bulk_Register_Page Employee = new Bulk_Register_Page(getDriver());
		HomePage hp = new HomePage(getDriver());


		hp.clickEmployee();
		Employee.BulkRegister();

		
  }
	

}
