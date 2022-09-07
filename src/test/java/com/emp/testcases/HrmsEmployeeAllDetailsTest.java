package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeAllDetailsPage;
import com.emp.qa.pages.HrmsPayrollRunPayrollPayoutPage;

public class HrmsEmployeeAllDetailsTest extends TestBase {
	@Test
	public void HrmsEmployeeAllDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeAllDetailsPage PayoutPage = new HrmsEmployeeAllDetailsPage(getDriver());
		homePage.SkipPopup();
		PayoutPage.HrmsEmployeeAllDetailsPage();
	}


}
