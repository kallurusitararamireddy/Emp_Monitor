
package com.emp.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.emp.qa.base.TestBase;
import com.emp.qa.util.Helpers;
@Listeners(ITestNGListener.class)
public class RegisterEmployeePage extends BasePage {

	public RegisterEmployeePage(WebDriver driver) {
		super(TestBase.getDriver());

	}

	Helpers helper = new Helpers(); 

	@FindBy(xpath = "//a[@title='Employee-Details']")
	@CacheLookup
	WebElement EmployeeDetails;

	@FindBy(xpath = "//button[@id='add_btn']")
	@CacheLookup
	WebElement RegisterEmployee;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement Firstname;

	@FindBy(xpath = "//input[@id='f_name']")
	@CacheLookup
	WebElement Lastname;

	@FindBy(xpath = "//input[@id='emp_email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@id='c_passwd']")
	@CacheLookup
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id='telephone']")
	@CacheLookup
	WebElement Mobilenumber;

	@FindBy(xpath = "//input[contains(@name,'empCode')]")
	@CacheLookup
	WebElement Employeecode;

	@FindBy(xpath = "//select[@id='locations-addEmp']")
	@CacheLookup
	WebElement Location;

	@FindBy(xpath = "//*[@id='emp-register']/div[1]/div/div[9]/div/span[1]/span[1]/span/ul")
	
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath= "//li[@class='select2-selection__choice'][contains(.,'×Software Tester')]")
	@CacheLookup
	WebElement SoftwareTester;

	@FindBy(xpath= "//select[@id='EmpReg_departments']")
	@CacheLookup
	WebElement Department;

	@FindBy(xpath = "//input[@id='date_joinCalender']")
	@CacheLookup
	WebElement Dateofjoining;

	@FindBy(xpath = "//select[@id='timeZoneAppend']")
	@CacheLookup
	WebElement Timezone;
	
	@FindBy(xpath = "//select[@id='timeZoneAppend']//option[@id='tz-opt-32']")
	@CacheLookup
	WebElement AsiaKolkata;

	@FindBy(xpath = "//input[@id='f_upload']")
	@CacheLookup
	WebElement Image_up_load;
	
	
	@FindBy(xpath = "//select[@id='Shiftfilteradd']")
	@CacheLookup
	WebElement selectshift;
	

	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement Address;

	@FindBy(xpath = "//button[@id='empReg']")
	@CacheLookup
	WebElement Register;

	@FindBy(xpath = "//li[@id='select2-role-addEmp-result-8oh9-81']")
	WebElement SoftwareDev;

	public void RegisterEmployee() throws InterruptedException, AWTException {
		helper.waitFor(EmployeeDetails);
		helper.highLightElement(driver, EmployeeDetails);
		EmployeeDetails.click();
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B> Clicked on Employee_Details");
		Assert.assertTrue(true, "Failed to Click on Employee_Details");

		helper.waitFor(RegisterEmployee);
		helper.highLightElement(driver, RegisterEmployee);
		RegisterEmployee.click();
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B> Clicked  on Register_Employee Button");
		Assert.assertTrue(true, "Failed to Click on Register_Employee Button");

		helper.waitFor(Firstname);
		helper.highLightElement(driver, Firstname);
		Firstname.sendKeys("Automation12");
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B> Clicked on First_name text space  & Enter Name");
		Assert.assertTrue(true, "Failed to Click  on First_name text space  & Enter Name");

		helper.waitFor(Lastname);
		helper.highLightElement(driver, Lastname);
		Lastname.sendKeys("CodeeeAuto");
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B> Clicked  on Lastname text space & Enter name ");
		Assert.assertTrue(true, "Failed to Click  on Lastname text space & enter name");

		Random g=new Random();
		int num=g.nextInt(100); 
		String Act_g="skabcdef";
		String Exp_g=Act_g+num;
		
		
		helper.waitFor(email);
		helper.highLightElement(driver, email);
		email.sendKeys(Exp_g+"@gmail.com");
		
		
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B> Clicked on email Text space & Enter email");
		Assert.assertTrue(true, "Failed to Click on email Text space & enter email");

		helper.waitFor(password);
		helper.highLightElement(driver, password);
		password.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B> Clicked on password text space & Enter password ");
		Assert.assertTrue(true, "Failed to Click on password text space & enter password");

		helper.waitFor(confirmpassword);
		helper.highLightElement(driver, confirmpassword);
		confirmpassword.sendKeys("Abc@$123");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B> Clicked on confirm_password text space & Enter confirm_password");
		Assert.assertTrue(true, "Failed to Click on confirm_password text space & enter confirm_password");

		helper.waitFor(Mobilenumber);
		helper.highLightElement(driver, Mobilenumber);
		Mobilenumber.sendKeys("9876543210");
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B> Clicked on Mobile_number & Enter Phone number");
		Assert.assertTrue(true, "Failed to Click on Mobile_number & Enter Phone number");

		Random r=new Random();
		int num1=r.nextInt(100);
		String Act_code="Emp-Abzcde-12345";
		String Exp_code=Act_code+num1;
		
		helper.waitFor(Employeecode);
		helper.highLightElement(driver, Employeecode);
		Employeecode.sendKeys(Exp_code);
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B> Clicked on Employee_code text space & Enter Employee code ");
		Assert.assertTrue(true, "Failed to Click on Employee_code text space & Enter Employee code");

		helper.waitFor(Location);
		helper.highLightElement(driver, Location);
		helper.selectDropDownValue(Location, "visibletext", "Bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Reporter.log("<B><font color = 'blue'>Step10 .</font></B> Clicked on Location Drop down & select location");
		Assert.assertTrue(true, "Failed to Click on Location Drop down & select location");
		
		

		helper.waitFor(Role);
		helper.highLightElement(driver, Role);
		helper.jsCLick(Role); 
		helper.move_to_element(Role);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step11.</font></B> Clicked on Role Drop down &  Select  Role ");
		Assert.assertTrue(true, "Failed to Click on Role Drop down &  Select  Role");
		
	
		
		helper.waitFor(Department);
		Department.click();
		helper.highLightElement(driver, Department);
		helper.selectDropDownValue(Department, "value", "Testing");
		Reporter.log("<B><font color = 'blue'>Step12.</font></B> Clicked on Department Drop down & select Dept");
		Assert.assertTrue(true, "Failed to Clicked on Department Drop down & select Dept");
		
	

		helper.waitFor(Dateofjoining);
		helper.highLightElement(driver, Dateofjoining);
		Dateofjoining.sendKeys("01-03-2021");
		Dateofjoining.click();
		Reporter.log("<B><font color = 'blue'>Step13.</font></B> Clicked on Date_of_joining ");
		Assert.assertTrue(true, "Failed to Click on   Date_of_joining");
		

		helper.waitFor(Timezone);
		helper.highLightElement(driver, Timezone);
		Timezone.click();
		Reporter.log("<B><font color = 'blue'>Step14.</font></B> Clicked on Timezone Drop down & Select Time zone ");
		Assert.assertTrue(true, "Failed to selecte Timezone");
		
		
		helper.waitFor(AsiaKolkata);
		helper.highLightElement(driver, AsiaKolkata);
		AsiaKolkata.click();
		Reporter.log("<B><font color = 'blue'>Step15.</font></B> Clicked on Asia_Kolkata");
		Assert.assertTrue(true, "Failed to Click  Asia_Kolkata");
		
		
		helper.waitFor(Image_up_load);
		helper.highLightElement(driver, Image_up_load);
		helper.jsCLick(Image_up_load);
		Thread.sleep(1000);
		helper.uploadFile("C:\\Users\\GLB-BLR-449\\Pictures\\Saved Pictures\\Automation.jpg");
		Thread.sleep(1000);
		Reporter.log("<B><font color = 'blue'>Step16.</font></B> Clicked on Image_Uploaded Button and Selected Employee Image ");
		Assert.assertTrue(true, "Failed to Click on Image_Uploaded Button  and Selected Employee Image");

		 

		helper.waitFor(selectshift);
		helper.highLightElement(driver, selectshift);
//		helper.selectDropDownValue(selectshift, "value", "475");
		helper.move_to_element_click_target(selectshift);
		helper.robot_Second_option_selectClick();
		Reporter.log("<B><font color = 'blue'>Step17.</font></B> Clicked on select shift Drop down & select shift ");
		Assert.assertTrue(true, "Failed to Click on select shift Drop down & select shift");

		
		helper.waitFor(Address);
		helper.highLightElement(driver, Address);
		Address.sendKeys("Hno:123,Banglore");
		Reporter.log("<B><font color = 'blue'>Step18.</font></B> Clicked on Address Text space & Enter Address");
		Assert.assertTrue(true, "Failed to Click on Address Text space & Enter Address");

		 
		helper.waitFor(Register);
		helper.highLightElement(driver, Register);
		helper.Scrollintoview(Register);
		helper.jsCLick(Register);
		Reporter.log("<B><font color = 'blue'>Step19.</font></B> Clicked on Register Button ");
		Assert.assertTrue(true, "Failed to Click on  Register Button ");
		Thread.sleep(4000);

	}

}
