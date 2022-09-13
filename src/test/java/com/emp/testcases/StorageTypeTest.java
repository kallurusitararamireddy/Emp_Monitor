package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.HomePage;
import com.emp.qa.pages.ManageLocationsAndDepartmentPage;
import com.emp.qa.pages.StorageTypePage;

public class StorageTypeTest extends TestBase{
	
	@Test
	public void StorageTypeTest() throws Exception{
	StorageTypePage StorageType=new StorageTypePage(getDriver());
	HomePage homePage =new HomePage(getDriver());
//	homePage.SkipPopup();
	homePage.Skip();
	homePage.ManageLocationsAndDepartmentPage();
	StorageType.StorageTypePage();

}
}


