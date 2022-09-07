package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomePensionPage;

public class HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerTest extends TestBase {
	
	@Test
	public void HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage previousEmployer = new HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage(getDriver());
		homePage.SkipPopup();
		previousEmployer.HrmsPayrollDeclarationOtherincomeIncomefromPreviousEmployerPage();
	}

}
