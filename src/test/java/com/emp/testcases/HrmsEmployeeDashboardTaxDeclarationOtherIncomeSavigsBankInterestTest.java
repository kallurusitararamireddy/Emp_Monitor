package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationDedudctionSection80cPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage;

public class HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestTest extends TestBase {
	
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage HrmsEmployeeSavings = new HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage(getDriver());
		HrmsEmployeeSavings.HrmsEmployeeDashboardTaxDeclarationOtherIncomeSavigsBankInterestPage();
	}

}
