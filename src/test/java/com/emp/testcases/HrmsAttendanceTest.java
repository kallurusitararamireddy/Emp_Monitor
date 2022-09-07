package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsAttendancePage;
import com.emp.qa.pages.HrmsTerminationPage;

public class HrmsAttendanceTest extends TestBase {
	
	@Test
	public void HrmsAttendanceTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendancePage HrmsAttend = new HrmsAttendancePage(getDriver());
		homePage.SkipPopup();
		HrmsAttend.HrmsAttendancePage();
	}

}
