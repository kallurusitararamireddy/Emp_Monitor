package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ManageLocationsAndDepartmentPage;
import com.emp.qa.pages.StorageTypePage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;


public class ManageLocationsAndDepartmentTest extends TestBase{
	
	@Test
	public void ManageLocationsAndDepartmentTest() throws Exception{
	ManageLocationsAndDepartmentPage ManageLocations=new ManageLocationsAndDepartmentPage(getDriver());
	HomePage homePage =new HomePage(getDriver());

	homePage.ManageLocationsAndDepartmentPage();
	ManageLocations.ManageLocationsAndDepartmentPage();
}
}

