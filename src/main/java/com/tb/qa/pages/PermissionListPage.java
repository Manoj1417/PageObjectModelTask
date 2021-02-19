package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PermissionListPage extends TestBase {

	@FindBy(xpath="//input[@name='TableSearch']")
	WebElement Search_Box;
	
	
	
	@FindBy(xpath="//i[@class='anticon anticon-close']")
	WebElement Search_Close; 
	
	@FindBy(xpath="//p[@class='ant-empty-description']")
	WebElement NoData_Txt;
	
	@FindBy(xpath="//*[self::span][@id='showrecordspan']")
	WebElement Result_Record;
	
	public PermissionListPage()
	{
		PageFactory.initElements(driver, this);
	}
	public PermissionListPage SearchNe(String Char) throws InterruptedException
	{
		Thread.sleep(1000);
		Search_Box.sendKeys(Char);
		Thread.sleep(2000);
		return null;
	}
	public String Nodata()
	{
		return NoData_Txt.getText();
	}
	public PermissionListPage Search1() throws InterruptedException
	{
		Thread.sleep(2000);
		Search_Close.click();
		Search_Box.clear();
		Thread.sleep(2000);
		return null;
	}
	public PermissionListPage Search(String Char) throws InterruptedException 
	{
		Search_Box.clear();
	Thread.sleep(2000);
		Search_Box.sendKeys(Char);
		Thread.sleep(2000);
		return null;
}

		
	public String ShowingRecord()
	{
		return Result_Record.getText();
	}
	
}
