package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage;

public class HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage HrmsEmployeeotherthanSavings = new HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage(getDriver());
		HrmsEmployeeotherthanSavings.HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage();
	}

}
