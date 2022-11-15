package com.emp.testcases;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.SplitSheetPage;

public class SplitSheetTest extends TestBase {
	@Test
	public void SplitSheetTest () throws Exception{
		SplitSheetPage split=new SplitSheetPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
 
		homePage.TimeSheets();
		split.SplitSheetPage();
	}
	
	

}


