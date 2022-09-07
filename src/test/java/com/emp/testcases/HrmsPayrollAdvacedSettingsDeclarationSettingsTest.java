package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollAdvacedSettingsDeclarationSettingsPage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPfPage;

public class HrmsPayrollAdvacedSettingsDeclarationSettingsTest extends TestBase {
	
	@Test
	public void HrmsPayrollAdvacedSettingsDeclarationSettingsTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvacedSettingsDeclarationSettingsPage Declaration = new HrmsPayrollAdvacedSettingsDeclarationSettingsPage(getDriver());
		homePage.SkipPopup();
		Declaration.HrmsPayrollAdvacedSettingsDeclarationSettingsPage();
	}

}
