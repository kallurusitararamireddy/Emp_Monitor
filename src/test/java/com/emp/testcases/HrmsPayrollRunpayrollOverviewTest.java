package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollOverviewPage;
import com.emp.qa.pages.HrmsPayrollRunpayrollRunpayrollPage;

public class HrmsPayrollRunpayrollOverviewTest extends TestBase {
	
		@Test
		public void HrmsPayrollRunpayrollOverviewTest() throws InterruptedException, IOException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsPayrollRunpayrollOverviewPage overviewPage = new HrmsPayrollRunpayrollOverviewPage(getDriver());
			homePage.SkipPopup();
			overviewPage.HrmsPayrollRunpayrollOverviewPage();
		}


}
