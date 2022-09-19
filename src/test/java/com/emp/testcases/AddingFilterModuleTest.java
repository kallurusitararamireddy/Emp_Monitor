package com.emp.testcases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AddingFilterModulePage;
import com.emp.qa.pages.EditEmployeePage;
import com.emp.qa.pages.HomePage;

public class AddingFilterModuleTest extends TestBase{
	@Test
	public void AddingFilterModuleTest() throws Exception{
		
		HomePage homePage =new HomePage(getDriver());
		AddingFilterModulePage AddingFilter = new AddingFilterModulePage(getDriver());
//		homePage.SkipPopup();
		homePage.Skip();
		homePage.clickEmployee();
		AddingFilter.AddingFilterModule();
		//File listOfFiles[]=folder.listFiles();

}
}

