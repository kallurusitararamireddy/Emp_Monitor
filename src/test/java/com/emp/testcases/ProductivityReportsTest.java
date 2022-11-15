package com.emp.testcases;


import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityReportsPage;

public class ProductivityReportsTest extends TestBase {
	
	@Test(priority = 1)
	public void ProductivityReportsTest1() throws Exception{
		ProductivityReportsPage productivityR=new ProductivityReportsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		productivityR.ProductivityReports_pdf();

}
	
	@Test(priority = 2)
	public void ProductivityReportsTest2() throws Exception{
		ProductivityReportsPage productivityR=new ProductivityReportsPage(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.ReportsDownloadPage();
		productivityR.ProductivityReports_CSV();

}
	
}