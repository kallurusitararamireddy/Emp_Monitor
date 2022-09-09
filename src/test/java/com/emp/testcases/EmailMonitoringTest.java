package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmailMonitoringPage;
import com.emp.qa.pages.EmployeeAttendanePage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SkipPopUpPage;

public class EmailMonitoringTest extends TestBase {

	@Test
	public void EmailMonitoringTest() throws Exception {
		// SkipPopUpPage sk= new SkipPopUpPage(getDriver());
		// sk.SkipPopup();

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(2000);
		homePage.Skip();
		homePage.clickEmployee();

		EmailMonitoringPage Emailmonitor = new EmailMonitoringPage(getDriver());
		Emailmonitor.EmailMonitoringPage();

	}

}
