package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SystemActivityLogsPage;
import com.emp.qa.pages.TimeClaimPage;

public class SystemActivityLogsTest extends TestBase{
	
	@Test
	public void SystemActivityLogsTest() throws Exception{
		SystemActivityLogsPage Systemactivity=new SystemActivityLogsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.ReportsDownloadPage();
		Systemactivity.SystemActivityLogsPage();
}
}

