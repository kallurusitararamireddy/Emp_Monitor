package com.emp.testcases;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Attandence_tool_tip_check_Page;

public class Attandence_tool_tip_check_Test extends  TestBase
{
	
	@Test
	public void Attendance_Tool_tip_Showing() throws InterruptedException
	{
		Attandence_tool_tip_check_Page tool=new Attandence_tool_tip_check_Page(getDriver());
		tool.Tool_Tip_showing();
	}

}
