package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ShiftManagementPage;

public class ShiftManagementTest extends TestBase {
	
	@Test
	public void ShiftManagementTest() throws InterruptedException{
		ShiftManagementPage Shiftmanagement=new ShiftManagementPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		Shiftmanagement.ShiftManagementPage();

}
}

