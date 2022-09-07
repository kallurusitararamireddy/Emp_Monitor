package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsAttendancePage;
import com.emp.qa.pages.HrmsEmployeeRequestDetailsPage;

public class HrmsEmployeeRequestDetailsTest extends TestBase {
	
	@Test
	public void HrmsEmployeeRequestDetailsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeRequestDetailsPage HrmsAttend = new HrmsEmployeeRequestDetailsPage(getDriver());
		homePage.SkipPopup();
		HrmsAttend.HrmsEmployeeRequestDetailsPage();
	}


}
