package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollDeclarationDeductionPage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomePage;

public class HrmsPayrollDeclarationOtherincomeTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationOtherincomeTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationOtherincomePage otherincome = new HrmsPayrollDeclarationOtherincomePage(getDriver());
		homePage.SkipPopup();
		otherincome.HrmsPayrollDeclarationOtherincomePage();
	}


}
