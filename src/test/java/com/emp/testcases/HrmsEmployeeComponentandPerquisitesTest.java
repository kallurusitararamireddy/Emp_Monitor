package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeComponentandPerquisitesPage;
import com.emp.qa.pages.HrmsPayrollRunPayrollPayoutPage;

public class HrmsEmployeeComponentandPerquisitesTest extends TestBase {
	
	@Test
	public void HrmsEmployeeComponentandPerquisitesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeComponentandPerquisitesPage component = new HrmsEmployeeComponentandPerquisitesPage(getDriver());
		homePage.SkipPopup();
		component.HrmsEmployeeComponentandPerquisitesPage();
	}


}
