package Testcases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Browser.Launching;
import POM.Admin_page_object;
import Screenshot.Screen;

public class Admin_page extends Launching {
	
	Logger logger = Logger.getLogger(Admin_page.class);
	@Test
	public void Movetouserpage ()
	{
		logger.info("Create a Users");
		test = extent.createTest("Movetouserpage","passedtestcases");
		Assert.assertTrue(true);
		
     	PageFactory.initElements(driver, Admin_page_object.class);
		
     	
		Admin_page_object.Admin.click();
		Admin_page_object.UserManagement.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Admin_page_object.Username.sendKeys(properties.getProperty("Username"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Admin_page_object.UserRole.click();
		Admin_page_object.EmployeeName.sendKeys(properties.getProperty("EmployeeName"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Admin_page_object.Status.click();
		Admin_page_object.AddButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		}

	@AfterMethod
	public void screenshot(ITestResult result)
	{
	
	if(ITestResult.FAILURE==result.getStatus())
	{
		logger.info("Failed Test Cases Taken Screenshot");
		Screen.screen(driver, result.getName());
	}
	
	}
	}


