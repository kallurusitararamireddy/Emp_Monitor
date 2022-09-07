package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardAttedancePage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOverviewPage;

public class HrmsEmployeeDashboardTaxDeclarationOverviewTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOverviewTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOverviewPage HrmsEmployeeAttendance = new HrmsEmployeeDashboardTaxDeclarationOverviewPage(getDriver());
		HrmsEmployeeAttendance.HrmsEmployeeDashboardTaxDeclarationOverviewPage();
	}
	
	

}
