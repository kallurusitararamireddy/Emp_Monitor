package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsAttendancePage;
import com.emp.qa.pages.HrmsLeavesPage;

public class HrmsLeavesTest extends TestBase {
	
	
	@Test
	public void HrmsLeavesTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsLeavesPage HrmsLeaves = new HrmsLeavesPage(getDriver());
		homePage.SkipPopup();
		HrmsLeaves.HrmsLeavesPage();
	}


}
