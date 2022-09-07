package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AbsentOptionToTimesheetsPage;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SplitSheetPage;

public class SplitSheetTest extends TestBase {
	@Test
	public void SplitSheetTest () throws InterruptedException, IOException{
		SplitSheetPage split=new SplitSheetPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.TimeSheets();
		split.SplitSheetPage();
	}
	
	

}


