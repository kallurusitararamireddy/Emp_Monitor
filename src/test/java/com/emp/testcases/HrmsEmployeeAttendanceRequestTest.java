package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeAttendanceRequestPage;
import com.emp.qa.pages.HrmsEmployeeComponentandPerquisitesPage;

public class HrmsEmployeeAttendanceRequestTest extends TestBase {
	
	@Test
	public void HrmsEmployeeComponentandPerquisitesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeAttendanceRequestPage Employeeatten = new HrmsEmployeeAttendanceRequestPage(getDriver());
		homePage.SkipPopup();
		Employeeatten.HrmsEmployeeAttendanceRequestPage();
	}

	

}
