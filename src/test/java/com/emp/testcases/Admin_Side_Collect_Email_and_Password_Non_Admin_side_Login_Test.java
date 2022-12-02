package com.emp.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin_Side_Collect_Email_and_Password_Non_Admin_side_Login_Page;

public class Admin_Side_Collect_Email_and_Password_Non_Admin_side_Login_Test extends TestBase
{
	@Test
	public void Non_Admin_side_Login() throws InterruptedException, AWTException, IOException
	{
		Admin_Side_Collect_Email_and_Password_Non_Admin_side_Login_Page a=new Admin_Side_Collect_Email_and_Password_Non_Admin_side_Login_Page(getDriver());
		a.Non_Employee_login();
	}
	

}
