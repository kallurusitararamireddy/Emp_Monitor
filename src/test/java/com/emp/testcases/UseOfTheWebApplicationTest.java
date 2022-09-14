package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.TimeSheetsPage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;



	public class UseOfTheWebApplicationTest extends TestBase {
		
		@Test
		public void UseOfTheWebApplicationTest() throws Exception{
	    UseOfTheWebApplicationPage Useofweb=new UseOfTheWebApplicationPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.ReportsDownloadPage();
		Useofweb.UseOfTheWebApplicationPage();
	
	}
		
	}



