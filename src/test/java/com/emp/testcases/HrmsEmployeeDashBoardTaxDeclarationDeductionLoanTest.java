package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDelarationDeductionLtaPage;

public class HrmsEmployeeDashBoardTaxDeclarationDeductionLoanTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashBoardTaxDeclarationDeductionLoanTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage HrmsEmployeeLoans = new HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage(getDriver());
		HrmsEmployeeLoans.HrmsEmployeeDashBoardTaxDeclarationDeductionLoanPage();
	}

}
