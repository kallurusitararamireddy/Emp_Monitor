package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityReportsPage;
import com.emp.qa.pages.ReportsDownloadPage;

public class ProductivityReportsTest extends TestBase {
	
	@Test
	public void ProductivityReportsTest() throws Exception{
		ProductivityReportsPage productivityR=new ProductivityReportsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.ReportsDownloadPage();
		productivityR.ProductivityReportsPage();

}
}