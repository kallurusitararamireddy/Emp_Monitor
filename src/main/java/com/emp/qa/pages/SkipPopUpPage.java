package com.emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.emp.qa.util.Helpers;

public class SkipPopUpPage extends BasePage{

	public SkipPopUpPage(WebDriver driver) {
		super(driver);
	}
		
		Helpers helper=new Helpers();
		
		@FindBy(css=".introjs-tooltip-header > a[role='button']")
		WebElement SkipPopUP;
		public void SkipPopup( ) {
			try {
			helper.waitFor(SkipPopUP);
			helper.highLightElement(driver, SkipPopUP);
			helper.Scrollintoview(SkipPopUP);
			//helper.Robotclick(SkipPopUP);
			Thread.sleep(5000);
			//helper.click(SkipPopUP);
	        helper.jsCLick(SkipPopUP);
			helper.waitForpage();
			}catch(Exception e) {
				System.out.println("Skip pop is not Dislayed");
			}
			
	}
	}


