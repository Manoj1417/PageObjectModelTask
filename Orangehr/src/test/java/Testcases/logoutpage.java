package Testcases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Browser.Launching;
import POM.Logout_Pages_Objects;
import Screenshot.Screen;


public class logoutpage extends Launching {
	
	static Logger logger = Logger.getLogger(logoutpage.class);
	@Test
	public void logout_page()
	{
		logger.info("Log out Application");
		test = extent.createTest("logout_page","failedtestcases");
		Assert.assertTrue(true);
		
	PageFactory.initElements(driver,Logout_Pages_Objects.class);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Logout_Pages_Objects.logoutimage.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Logout_Pages_Objects.LogoutButton.click();
	
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


