package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SystemActivityLogsPage;

public class SystemActivityLogsTest extends TestBase{
	
	@Test
	public void SystemActivityLogsTest() throws Exception{
		SystemActivityLogsPage Systemactivity=new SystemActivityLogsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		Systemactivity.SystemActivityLogsPage();
}
}

