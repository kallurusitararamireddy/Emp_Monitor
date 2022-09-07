package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsAttendanceOverridePage;
import com.emp.qa.pages.HrmsAttendancePage;

public class HrmsAttendanceOverrideTest extends TestBase {
	
	@Test
	public void HrmsAttendanceOverrideTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsAttendanceOverridePage HrmsAttendover = new HrmsAttendanceOverridePage(getDriver());
		homePage.SkipPopup();
		HrmsAttendover.HrmsAttendanceOverridePage();
	}


}
