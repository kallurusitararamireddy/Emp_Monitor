package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.UseOfApplicationPage;

public class UseOfApplicationTest extends TestBase {
	
	@Test
	public void UseOfWebsitesPage() throws Exception{
		UseOfApplicationPage APP=new UseOfApplicationPage(getDriver());
		
	HomePage homePage =new HomePage(getDriver());
//	homePage.SkipPopup();
	homePage.Skip();
	homePage.ReportsDownloadPage();
	APP.UseOfApplicationPage();

}

}
