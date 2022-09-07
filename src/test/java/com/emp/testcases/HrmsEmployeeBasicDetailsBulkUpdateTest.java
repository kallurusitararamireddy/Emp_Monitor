package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeBasicDetailsBulkUpdatePage;
import com.emp.qa.pages.HrmsPayrollAdvacedSettingsDeclarationSettingsPage;

public class HrmsEmployeeBasicDetailsBulkUpdateTest extends TestBase {
	
	@Test
	public void HrmsEmployeeBasicDetailsBulkUpdateTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeBasicDetailsBulkUpdatePage BasicBulk = new HrmsEmployeeBasicDetailsBulkUpdatePage(getDriver());
		homePage.SkipPopup();
		BasicBulk.HrmsEmployeeBasicDetailsBulkUpdatePage();
	}

}
