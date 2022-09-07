package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AutoEmailReportsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RolesAndPermissionPage;

public class RolesAndPermissionTest extends TestBase {
	
	@Test
	public void RolesAndPermissionTest() throws InterruptedException{
		RolesAndPermissionPage Rolesandpermission=new RolesAndPermissionPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.ManageLocationsAndDepartmentPage();
		Rolesandpermission.RolesAndPermissionPage();

}
}

