package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.UseOfTheWebApplicationPage;
import com.emp.qa.pages.WebsiteandApplicationPage;

public class WebsiteandApplicatonTest extends TestBase{
	
	

	@Test
	public void WebsiteandApplicatonTest() throws Exception{
		WebsiteandApplicationPage WebApp=new WebsiteandApplicationPage(getDriver());
	HomePage homePage =new HomePage(getDriver());

	homePage.ReportsDownloadPage();
	WebApp.WebsiteandApplicationPage();

}
	

}
