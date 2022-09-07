package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollPayregisterPage;
import com.emp.qa.pages.HrmsPayrollRunpayrollRunpayrollPage;

public class HrmsPayrollRunpayrollPayregisterTest extends TestBase {
	
	@Test
	public void HrmsPayrollRunpayrollPayregisterTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunpayrollPayregisterPage PayregisterPage = new HrmsPayrollRunpayrollPayregisterPage(getDriver());
		homePage.SkipPopup();
		PayregisterPage.HrmsPayrollRunpayrollPayregisterPage();
	}


}
