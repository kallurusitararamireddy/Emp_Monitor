package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;
import com.opencsv.exceptions.CsvException;



	public class UseOfTheWebApplicationTest extends TestBase {
		
		@Test
		public void UseOfTheWebApplicationTest() throws InterruptedException, AWTException, IOException, CsvException{
	    UseOfTheWebApplicationPage Useofweb=new UseOfTheWebApplicationPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		Useofweb.UseOfTheWebApplicationPage();
	
	}
		
	}



