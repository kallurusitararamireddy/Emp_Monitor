package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.ApplicationsUsedPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ReportsDownloadPage;

public class ApplicatonsUsedTest extends TestBase {
	
	@Test
	public void ApplicatonsUsedTest() throws InterruptedException{
		ApplicationsUsedPage App=new ApplicationsUsedPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		App.ApplicationsUsedPage();
		

}

}
