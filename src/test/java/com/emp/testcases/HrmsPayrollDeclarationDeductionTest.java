package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollDeclarationDeductionPage;
import com.emp.qa.pages.HrmsPayrollDeclarationTaxSchemePage;

public class HrmsPayrollDeclarationDeductionTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationDeductionTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationDeductionPage Deduction = new HrmsPayrollDeclarationDeductionPage(getDriver());
		homePage.SkipPopup();
		Deduction.HrmsPayrollDeclarationDeductionPage();
	}


}
