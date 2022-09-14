package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;

public class UseOfWebsitesTest extends TestBase{
	
	@Test
	public void UseOfWebsitesPage() throws Exception{
		com.emp.qa.pages.UseOfWebsitesPage Web=new com.emp.qa.pages.UseOfWebsitesPage(getDriver());
		
	HomePage homePage =new HomePage(getDriver());
//	homePage.SkipPopup();
	homePage.Skip();
	homePage.ReportsDownloadPage();
	Web.UseOfWebsitesPage();

}

}
