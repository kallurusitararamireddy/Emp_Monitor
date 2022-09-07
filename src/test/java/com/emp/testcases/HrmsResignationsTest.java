package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsComplianceDetailsPage;
import com.emp.qa.pages.HrmsResignationsPage;

public class HrmsResignationsTest extends TestBase {
	@Test
	public void HrmsResignationsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsResignationsPage ResignationPage = new HrmsResignationsPage(getDriver());
		homePage.SkipPopup();
		ResignationPage.HrmsResignationsPage();
	}

}
