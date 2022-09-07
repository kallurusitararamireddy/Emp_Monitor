package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage;

public class HrmsEmployeeDashboardTaxDeclarationDeductionHouserentTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationDeductionHouserentTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage HrmsEmployeeHouserent = new HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage(getDriver());
		HrmsEmployeeHouserent.HrmsEmployeeDashboardTaxDeclarationDeductionHouserentPage();
	}
	

}
