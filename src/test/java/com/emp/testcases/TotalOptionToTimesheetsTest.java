package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.emp.qa.pages.TotalOptionToTimesheetsPage;

public class TotalOptionToTimesheetsTest extends TestBase {
	
	@Test
	public void TotalOptionToTimesheetsPage() throws InterruptedException, IOException{
		TotalOptionToTimesheetsPage Total=new TotalOptionToTimesheetsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.TimeSheets();
		Total.TotalOptionToTimesheets();

}
}

