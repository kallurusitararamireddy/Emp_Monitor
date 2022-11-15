package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.opencsv.exceptions.CsvException;

public class TimeInMinutesTest extends TestBase {
	
	@Test
	public void TimeInMinutesPage() throws InterruptedException, IOException, AWTException, CsvException{
		com.emp.qa.pages.TimeInMinutesPage Total=new com.emp.qa.pages.TimeInMinutesPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.TimeSheets();
		Total.TimeInMinutes();

}
}

