package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RolesAndPermissionPage;
import com.emp.qa.pages.RolesPermissionPage;

public class RolesPermissionTest extends TestBase {
	
	@Test
	public void RolesPermissionTest() throws InterruptedException{
		RolesPermissionPage Rolespermission=new RolesPermissionPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ManageLocationsAndDepartmentPage();
		Rolespermission.RolesPermissionPage();

}

}
