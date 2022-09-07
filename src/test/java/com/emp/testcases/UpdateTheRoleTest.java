package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeFullDetailsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.UpdateTheRolePage;

public class UpdateTheRoleTest extends TestBase {
	
	@Test
	public void  UpdateTheRoleTest() throws InterruptedException{
		
		HomePage homePage =new HomePage(getDriver());
		UpdateTheRolePage Updaterollpage = new UpdateTheRolePage(getDriver());
		//homePage.SkipPopup();
		homePage.clickEmployee();
		Updaterollpage.UpdateTheRole();
			

	}

}
