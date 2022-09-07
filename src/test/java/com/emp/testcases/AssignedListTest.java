package com.emp.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AddingFilterModulePage;
import com.emp.qa.pages.AssignedListPage;
import com.emp.qa.pages.HomePage;

public class AssignedListTest extends TestBase{
	
	@Test
	public void AssignedListTest() throws InterruptedException, IOException{
		
		HomePage homePage =new HomePage(getDriver());
		AssignedListPage AssignedList = new AssignedListPage(getDriver());
		///homePage.SkipPopup();
		homePage.TimeSheets();
		AssignedList.AssignedList();


}

}
