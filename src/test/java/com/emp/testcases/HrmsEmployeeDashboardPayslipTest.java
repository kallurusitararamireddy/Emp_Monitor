package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardPayslipPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage;

public class HrmsEmployeeDashboardPayslipTest extends TestBase {
	@Test
	public void HrmsEmployeeDashboardPayslipTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardPayslipPage HrmsEmployeePayslip = new HrmsEmployeeDashboardPayslipPage(getDriver());
		HrmsEmployeePayslip.HrmsEmployeeDashboardPayslipPage();
	

}

}
