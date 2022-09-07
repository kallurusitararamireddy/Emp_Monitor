package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsDashBoardPage;
import com.emp.qa.pages.HrmsSetupPayrollPage;

public class HrmsSetupPayrollTest extends TestBase {
	@Test
	public void HrmsSetupPayrollTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsSetupPayrollPage SetupPayroll = new HrmsSetupPayrollPage(getDriver());
		homePage.SkipPopup();
		SetupPayroll.HrmsSetupPayrollPage();
		
	

	}
	}
