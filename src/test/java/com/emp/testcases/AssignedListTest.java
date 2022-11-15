package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.AssignedListPage;
import com.emp.qa.pages.HomePage;
import com.opencsv.exceptions.CsvException;

public class AssignedListTest extends TestBase{
	
	@Test
	public void AssignedListTest() throws InterruptedException, IOException, AWTException, CsvException{
		
		HomePage homePage =new HomePage(getDriver());
		AssignedListPage AssignedList = new AssignedListPage(getDriver());

		homePage.TimeSheets();
		AssignedList.AssignedList();  


}

}
