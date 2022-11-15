package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.UseOfApplicationPage;

public class UseOfApplicationTest extends TestBase {

	@Test
	public void UseOfWebsitesPage() throws InterruptedException, AWTException {
		UseOfApplicationPage APP = new UseOfApplicationPage(getDriver());
		HomePage homePage = new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		APP.UseOfApplicationPage();

	}

}
