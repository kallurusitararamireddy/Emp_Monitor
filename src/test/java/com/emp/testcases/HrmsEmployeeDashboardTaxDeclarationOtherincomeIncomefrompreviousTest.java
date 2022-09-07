package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage;

public class HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage HrmsEmployeeincomefrom = new HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage(getDriver());
		HrmsEmployeeincomefrom.HrmsEmployeeDashboardTaxDeclarationOtherincomeIncomefrompreviousPage();
	

}
}
