package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.LocationsAndDepartmentPage;
import com.emp.qa.pages.ManageLocationsAndDepartmentPage;

public class LocationsAndDepartmentTest extends TestBase {
	
	@Test
	public void LocationsAndDepartmentTest() throws InterruptedException{
		LocationsAndDepartmentPage 	Location=new LocationsAndDepartmentPage(getDriver());
	HomePage homePage =new HomePage(getDriver());
	homePage.SkipPopup();
	homePage.ManageLocationsAndDepartmentPage();
	Location.LocationsAndDepartmentPage();
}

}
