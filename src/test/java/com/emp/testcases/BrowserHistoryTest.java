package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.ApplicationsUsedPage;
import com.emp.qa.pages.BrowserHistoryPage;
import com.emp.qa.pages.HomePage;

public class BrowserHistoryTest extends TestBase {
	
	@Test
	public void BrowserHistoryTest() throws InterruptedException{
		BrowserHistoryPage Browser=new BrowserHistoryPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		Browser.BrowserHistoryPage();

}


}
