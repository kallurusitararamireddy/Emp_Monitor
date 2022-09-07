package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeBankDetailsBulkUpdatePage;
import com.emp.qa.pages.HrmsEmployeeBasicDetailsBulkUpdatePage;

public class HrmsEmployeeBankDetailsBulkUpdateTest extends TestBase {
	@Test
	public void HrmsEmployeeBankDetailsBulkUpdateTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeBankDetailsBulkUpdatePage BankBulk = new HrmsEmployeeBankDetailsBulkUpdatePage(getDriver());
		homePage.SkipPopup();
		BankBulk.HrmsEmployeeBankDetailsBulkUpdatePage();
	}

}
