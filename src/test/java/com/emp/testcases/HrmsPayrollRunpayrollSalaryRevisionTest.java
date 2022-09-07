package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollAttendanceandLeavePage;
import com.emp.qa.pages.HrmsPayrollRunpayrollSalaryRevisionPage;

public class HrmsPayrollRunpayrollSalaryRevisionTest extends TestBase {
	
	@Test
	public void HrmsPayrollRunpayrollSalaryRevisionTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollRunpayrollSalaryRevisionPage SalaryRevisionPage = new HrmsPayrollRunpayrollSalaryRevisionPage(getDriver());
		homePage.SkipPopup();
		SalaryRevisionPage.HrmsPayrollRunpayrollSalaryRevisionPage();
	}


}
