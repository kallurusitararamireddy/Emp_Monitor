package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsLeaveTypesPage;
import com.emp.qa.pages.HrmsLeavesPage;

public class HrmsLeaveTypesTest extends TestBase {
	
	

	@Test
	public void HrmsLeaveTypesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsLeaveTypesPage HrmsLeaveType = new HrmsLeaveTypesPage(getDriver());
		homePage.SkipPopup();
		HrmsLeaveType.HrmsLeaveTypesPage();
	}


}
