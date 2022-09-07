package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsAttendanceSettingsPage;
import com.emp.qa.pages.HrmsHolidaysPage;

public class HrmsAttendanceSettingsTest extends TestBase {
	
	@Test
	public void HrmsAttendanceSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendanceSettingsPage SettingsPage = new HrmsAttendanceSettingsPage(getDriver());
		homePage.SkipPopup();
		SettingsPage.HrmsAttendanceSettingsPage();
	}


}
