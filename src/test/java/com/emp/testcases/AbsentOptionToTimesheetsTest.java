package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AbsentOptionToTimesheetsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.opencsv.exceptions.CsvException;

@SuppressWarnings("unused")
public class AbsentOptionToTimesheetsTest extends TestBase {
	
	@Test
	public void AbsentOptionToTimesheetsTest() throws InterruptedException, IOException, AWTException, CsvException{
		AbsentOptionToTimesheetsPage Absent=new AbsentOptionToTimesheetsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		
		homePage.TimeSheets();
		Absent.AbsentOptionToTimesheetsPage();
		
		
		
	}
	
	

}
