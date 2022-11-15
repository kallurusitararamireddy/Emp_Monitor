package com.emp.testcases;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.EmailMonitoringPage;
import com.emp.qa.pages.HomePage;

public class EmailMonitoringTest extends TestBase {

	@Test
	public void EmailMonitoringTest() throws Exception {
		

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(2000);
		homePage.clickEmployee();

		EmailMonitoringPage Emailmonitor = new EmailMonitoringPage(getDriver());
		Emailmonitor.EmailMonitoringPage();

	}

}
