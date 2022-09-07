package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeBankDetailsBulkUpdatePage;
import com.emp.qa.pages.HrmsEmployeeComlianceDetailsBulkUpdatePage;

public class HrmsEmployeeComlianceDetailsBulkUpdateTest extends TestBase {
	
	
		@Test
		public void HrmsEmployeeComlianceDetailsBulkUpdateTest() throws InterruptedException, IOException, AWTException{
			
			HomePage homePage =new HomePage(getDriver());
			HrmsEmployeeComlianceDetailsBulkUpdatePage CompBulk = new HrmsEmployeeComlianceDetailsBulkUpdatePage(getDriver());
			homePage.SkipPopup();
			CompBulk.HrmsEmployeeComlianceDetailsBulkUpdatePage();
		}


}