package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Calendars_All_Eye_Icon_Page;
import com.emp.qa.pages.HomePage;
import com.opencsv.exceptions.CsvException;

public class Calendar_All_Eye_Icon_Test extends TestBase {
	
	@Test
	public void Calendar_Eye_Icon_1_Message_Checking() throws InterruptedException, AWTException, IOException, CsvException{
		Calendars_All_Eye_Icon_Page eye_icon_Test=new Calendars_All_Eye_Icon_Page(getDriver());
		HomePage homePage =new HomePage(getDriver());

		homePage.clickEmployee();
		eye_icon_Test.Calendar_Eye_Icon_1();
		
		
		
} 

}

