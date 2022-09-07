package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.RegisterEmployeePage;
import com.emp.qa.pages.TimeSheetsPage;

public class TimeSheetsTest extends TestBase {
	
	@Test
	public void TimeSheetsTest() throws InterruptedException, IOException{
		TimeSheetsPage Times=new TimeSheetsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		//homePage.SkipPopup();
		homePage.TimeSheets();
		Times.TimeSheetsPage();
		
}
}

