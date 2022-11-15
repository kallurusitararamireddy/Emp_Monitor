package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.MonitorControlPage;
import com.emp.qa.pages.MonitoringControlPage;

public class MonitorControlTest extends TestBase {

	@Test
	public void MonitorControlTest() throws InterruptedException, AWTException{
		MonitorControlPage MonitorControl=new MonitorControlPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ManageLocationsAndDepartmentPage();
		MonitorControl.MonitorControlPage();
		
}
	
}
