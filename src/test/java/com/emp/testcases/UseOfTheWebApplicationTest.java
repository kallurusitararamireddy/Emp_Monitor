package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;



	public class UseOfTheWebApplicationTest extends TestBase {
		
		@Test
		public void UseOfTheWebApplicationTest() throws InterruptedException{
	    UseOfTheWebApplicationPage Useofweb=new UseOfTheWebApplicationPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		Useofweb.UseOfTheWebApplicationPage();
	
	}
		
	}



