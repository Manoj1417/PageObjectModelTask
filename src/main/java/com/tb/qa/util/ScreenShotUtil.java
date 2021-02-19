package com.tb.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtil {

		
		public static void captureScreenshot(WebDriver driver,String screenshotName)
		{
	       try {
			TakesScreenshot screenshot=(TakesScreenshot) driver;
				
				File SrcFile=screenshot.getScreenshotAs(OutputType.FILE);
//	    	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				FileHandler.copy(source, new File("D:\\ScreenShots"+System.currentTimeMillis()+".png"));				
				File DestFile = new File(screenshotName);
				FileUtils.copyFile(SrcFile, DestFile);
				
				System.out.println("taken screenshot");
		}
	       catch (Exception e) 
	       {
			  System.out.println("exception while taking a screenshot"+e.getMessage());
	    	   
		   } 
       }
	}

//.copy(source, new File("./Screenshot/"+screenshotName+".png"));
	       
//	       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(src, new File(".\\Screenshot\\fb"+System.currentTimeMillis()+".png"));
//		}