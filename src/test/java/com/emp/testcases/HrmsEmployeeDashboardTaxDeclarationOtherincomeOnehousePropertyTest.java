package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage;
import com.emp.qa.pages.HrmsEmployeeDashboardTaxDelarationOtherincomeOtherthanSavingsPage;

public class HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyTest extends TestBase{
	
	@Test
	public void HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyTest() throws InterruptedException, IOException, AWTException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage HrmsEmployeeonehouseproperty = new HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage(getDriver());
		HrmsEmployeeonehouseproperty.HrmsEmployeeDashboardTaxDeclarationOtherincomeOnehousePropertyPage();
	}

}
