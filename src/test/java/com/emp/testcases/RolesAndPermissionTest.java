package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RolesAndPermissionPage;

public class RolesAndPermissionTest extends TestBase {
	
	@Test
	public void RolesAndPermissionTest() throws InterruptedException, AWTException{
		RolesAndPermissionPage Rolesandpermission=new RolesAndPermissionPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		Rolesandpermission.RolesAndPermissionPage();

}
}

