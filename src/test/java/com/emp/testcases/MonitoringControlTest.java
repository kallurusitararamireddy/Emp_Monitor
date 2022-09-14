package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.MonitoringControlPage;
import com.emp.qa.pages.ShiftManagementPage;

public class MonitoringControlTest extends TestBase {
	
	@Test
	public void MonitoringControlTest() throws Exception{
		MonitoringControlPage MonitorControl=new MonitoringControlPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.ManageLocationsAndDepartmentPage();
		MonitorControl.MonitoringControlPage();
		
}
}

