package com.emp.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ProductivityOfEmployeePage;
import com.emp.qa.pages.ProductivityReportsPage;

public class ProductivityofEmployeeTest extends TestBase{
	
	@Test
	public void ProductivityofEmployeeTest() throws InterruptedException, AWTException{
		
		ProductivityOfEmployeePage Reports=new ProductivityOfEmployeePage(getDriver());
		HomePage homePage =new HomePage(getDriver());
		homePage.SkipPopup();
		homePage.ReportsDownloadPage();
		Reports.ProductivityOfEmployeePage();

}

}
