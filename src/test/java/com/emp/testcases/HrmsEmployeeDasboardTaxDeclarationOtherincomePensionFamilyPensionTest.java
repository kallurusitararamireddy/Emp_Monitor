package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage;

public class HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionTest extends TestBase {
	
	@Test
	public void HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage HrmsEmployeepension = new HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage(getDriver());
		HrmsEmployeepension.HrmsEmployeeDasboardTaxDeclarationOtherincomePensionFamilyPensionPage();
	}

}
