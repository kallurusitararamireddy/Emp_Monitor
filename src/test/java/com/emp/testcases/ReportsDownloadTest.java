package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ReportsDownloadPage;
import com.emp.qa.pages.TimeClaimPage;

public class ReportsDownloadTest extends TestBase {
	@Test
	public void ReportsDownloadTes() throws InterruptedException{
		ReportsDownloadPage ReportD=new ReportsDownloadPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		ReportD.ReportsDownloadPage();

}
}
