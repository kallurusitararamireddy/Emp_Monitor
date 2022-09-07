package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollRunpayrollPage;
import com.emp.qa.pages.HrmsRunPayrollPage;

public class HrmsPayrollRunpayrollRunpayrollTest extends TestBase {
	@Test
	public void HrmsPayrollRunpayrollRunpayrollTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunpayrollRunpayrollPage runpayrollPage = new HrmsPayrollRunpayrollRunpayrollPage(getDriver());
		homePage.SkipPopup();
		runpayrollPage.HrmsPayrollRunpayrollRunpayrollPage();
	}


}


