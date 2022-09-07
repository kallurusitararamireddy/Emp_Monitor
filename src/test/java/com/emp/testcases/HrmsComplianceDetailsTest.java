package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsComplianceDetailsPage; 
import com.emp.qa.pages.HrmsDashBoardPage;

public class HrmsComplianceDetailsTest extends TestBase {
	@Test
	public void HrmsComplianceDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsComplianceDetailsPage ComplianceDetailsPage = new HrmsComplianceDetailsPage(getDriver());
		homePage.SkipPopup();
		ComplianceDetailsPage.HrmsComplianceDetailsPage();
	}

}
