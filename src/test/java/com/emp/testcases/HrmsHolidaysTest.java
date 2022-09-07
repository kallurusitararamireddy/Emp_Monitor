package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsHolidaysPage;
import com.emp.qa.pages.HrmsLeaveTypesPage;

public class HrmsHolidaysTest extends TestBase {
	
	@Test
	public void HrmsHolidaysTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsHolidaysPage HolidaysPage = new HrmsHolidaysPage(getDriver());
		homePage.SkipPopup();
		HolidaysPage.HrmsHolidaysPage();
	}



}
