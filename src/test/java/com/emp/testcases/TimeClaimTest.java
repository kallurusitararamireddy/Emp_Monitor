package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeClaimPage;
import com.emp.qa.pages.TimeSheetsPage;

public class TimeClaimTest extends TestBase {
	
	@Test
	public void TimeClaimTest() throws Exception{
		TimeClaimPage Timeclaim=new TimeClaimPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.TimeClaim();
		Timeclaim.TimeClaimPage();
	
	

}
}

