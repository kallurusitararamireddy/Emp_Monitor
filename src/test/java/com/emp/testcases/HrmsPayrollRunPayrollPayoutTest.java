package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollRunPayrollPayoutPage;
import com.emp.qa.pages.HrmsPayrollRunpayrollPayregisterPage;

public class HrmsPayrollRunPayrollPayoutTest extends TestBase {
	
	@Test
	public void HrmsPayrollRunPayrollPayoutTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunPayrollPayoutPage PayoutPage = new HrmsPayrollRunPayrollPayoutPage(getDriver());
		homePage.SkipPopup();
		PayoutPage.HrmsPayrollRunPayrollPayoutPage();
	}


}
