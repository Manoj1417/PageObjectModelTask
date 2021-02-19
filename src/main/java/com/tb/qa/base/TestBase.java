package com.tb.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.tb.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
protected static WebDriver driver=null;
	
	public static void initialization(){
		String browserName = "Chrome";
		String Url = "http://172.16.1.246:8032/";
		
		if(browserName.equals("Chrome")){
			WebDriverManager.chromedriver().setup();			
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();			
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("IE")){
			WebDriverManager.iedriver().setup();				
			driver = new InternetExplorerDriver(); 
		}
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WATI, TimeUnit.SECONDS);					
		driver.get(Url);				
	}

}
