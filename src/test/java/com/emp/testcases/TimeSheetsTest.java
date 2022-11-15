package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RegisterEmployeePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.opencsv.exceptions.CsvException;

public class TimeSheetsTest extends TestBase {
	
	@Test(priority = 1)
	public void TimeSheetsTest_CSV() throws InterruptedException, IOException, CsvException, AWTException{
		TimeSheetsPage Times=new TimeSheetsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.TimeSheets();
		Times.Time_Sheets_Page_CSV_File();
		
}
	
	@Test(priority = 2)
	public void TimeSheetsTest_PDF() throws InterruptedException, IOException, CsvException, AWTException{
		TimeSheetsPage Times=new TimeSheetsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.TimeSheets();
		Times.Time_Sheets_Page_PDF_File();
		
}
}

