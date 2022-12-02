package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Pages_Data_Checking_features_and_modules_Page;

public class Page_Data_Checking_features_and_modules__Test extends TestBase {
	@Test()
	public void Page_Data_Checking_features_and_modules() throws Exception {

		Pages_Data_Checking_features_and_modules_Page page_Data=new Pages_Data_Checking_features_and_modules_Page(getDriver());
		page_Data.Pages_Data_Info_demo();
		
	
	}
	 
	

}
