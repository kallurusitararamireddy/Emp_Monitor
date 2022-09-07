package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.CreateShiftPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ShiftManagementPage;

public class CreateShiftTest extends TestBase{
	
	@Test
	public void CreateShiftTest() throws InterruptedException{
		CreateShiftPage Shift=new CreateShiftPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		///homePage.SkipPopup();
		homePage.ManageLocationsAndDepartmentPage();
		Shift.CreateShiftPage();

}

}
