package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPage;
import com.emp.qa.pages.HrmsPayrollAdvancedSettingsPfPage;

public class HrmsPayrollAdvancedSettingsPfTest extends TestBase{
	
	@Test
	public void HrmsPayrollAdvancedSettingsPfTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		HrmsPayrollAdvancedSettingsPfPage Pf = new HrmsPayrollAdvancedSettingsPfPage(getDriver());
		homePage.SkipPopup();
		Pf.HrmsPayrollAdvancedSettingsPfPage();
	}

}
