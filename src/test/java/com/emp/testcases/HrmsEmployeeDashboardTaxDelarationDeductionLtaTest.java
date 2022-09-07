package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDelarationDeductionLtaPage;

public class HrmsEmployeeDashboardTaxDelarationDeductionLtaTest extends TestBase {
	
		
	@Test
	public void HrmsEmployeeDashboardTaxDelarationDeductionLtaTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDelarationDeductionLtaPage HrmsEmployeeSection80 = new HrmsEmployeeDashboardTaxDelarationDeductionLtaPage(getDriver());
		HrmsEmployeeSection80.HrmsEmployeeDashboardTaxDelarationDeductionLtaPage();
	}
	

}
