package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmployeeFullDetailsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TrackUserSettingsPage;

public class TrackUserSettingsTest extends TestBase {

	@Test
	public void TrackUserSettingsTest() throws InterruptedException{
		
		HomePage homePage =new HomePage(getDriver());
		TrackUserSettingsPage Trackuser = new TrackUserSettingsPage(getDriver());
		homePage.SkipPopup();
		homePage.clickEmployee();
		Trackuser.TrackUserSettings();
	
}
}

