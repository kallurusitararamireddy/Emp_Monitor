package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomePensionPage;
import com.emp.qa.pages.HrmsPayrollDelarationOtherincomeOneHousepropertyPage;

public class HrmsPayrollDeclarationOtherincomePensionTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationOtherincomePensionTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationOtherincomePensionPage pension = new HrmsPayrollDeclarationOtherincomePensionPage(getDriver());
		homePage.SkipPopup();
		pension.HrmsPayrollDeclarationOtherincomePensionPage();
	}


}
