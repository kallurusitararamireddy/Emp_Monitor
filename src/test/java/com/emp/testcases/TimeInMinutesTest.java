package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.emp.qa.pages.TotalOptionToTimesheetsPage;

public class TimeInMinutesTest extends TestBase {
	
	@Test
	public void TimeInMinutesPage() throws InterruptedException, IOException{
		com.emp.qa.pages.TimeInMinutesPage Total=new com.emp.qa.pages.TimeInMinutesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.TimeSheets();
		Total.TimeInMinutes();

}
}

