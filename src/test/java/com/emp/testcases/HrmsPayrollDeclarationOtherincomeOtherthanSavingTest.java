package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomeOtherthanSavingPage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomePage;

public class HrmsPayrollDeclarationOtherincomeOtherthanSavingTest extends TestBase{
	
	@Test
	public void HrmsPayrollDeclarationOtherincomeOtherthanSavingTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDeclarationOtherincomeOtherthanSavingPage otherthan = new HrmsPayrollDeclarationOtherincomeOtherthanSavingPage(getDriver());
		homePage.SkipPopup();
		otherthan.HrmsPayrollDeclarationOtherincomeOtherthanSavingPage();
	}

}
