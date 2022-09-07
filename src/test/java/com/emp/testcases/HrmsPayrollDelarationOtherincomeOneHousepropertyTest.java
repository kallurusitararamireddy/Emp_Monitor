package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollDeclarationOtherincomeOtherthanSavingPage;
import com.emp.qa.pages.HrmsPayrollDelarationOtherincomeOneHousepropertyPage;

public class HrmsPayrollDelarationOtherincomeOneHousepropertyTest extends TestBase{
	
	@Test
	public void HrmsPayrollDelarationOtherincomeOneHousepropertyTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollDelarationOtherincomeOneHousepropertyPage onehouseproperty = new HrmsPayrollDelarationOtherincomeOneHousepropertyPage(getDriver());
		homePage.SkipPopup();
		onehouseproperty.HrmsPayrollDelarationOtherincomeOneHousepropertyPage();
	}


}
