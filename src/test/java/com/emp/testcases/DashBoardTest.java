package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.DashBoardPage;
import com.emp.qa.pages.EmployeeFullDetailsPage;
import com.emp.qa.pages.HomePage;

public class DashBoardTest extends TestBase {

	@Test
	public void DashBoardTest() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		DashBoardPage DashBoardpage = new DashBoardPage(getDriver());
//		homePage.SkipPopup();
		homePage.clickDashboard();
		homePage.Skip();
		DashBoardpage.DashBoardPage();
	}

}
