package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class UsersDeletePage extends TestBase {

	@FindBy(xpath="//input[@name='TableSearch']")
	WebElement Search_Box;
	
	@FindBy(xpath="//p[@class='ant-empty-description']")
	WebElement NoData_Txt;
	
	@FindBy(xpath="//i[@class='anticon anticon-close']")
	WebElement Search_Close;
	
	@FindBy(xpath="//*[self::span][@id='showrecordspan']")
	WebElement Result_Record;
	
	@FindBy(xpath="//button[@name='mamamamma_Delete']")
	WebElement Delete_Btn;
	
	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement Close_Btn;
	
	@FindBy(xpath="//button[@name='PopupCancel']")
	WebElement Cancel_Btn;

	@FindBy(xpath="//button[@name='PopupConfirm']")
	WebElement Confirm_Btn;
	//Error message
	@FindBy(xpath="//div[@Class='ant-form-explain']")
	WebElement Changereason_Txt;
	
	@FindBy(xpath="//input[@id='Change Reason']")
	WebElement Reason_Txt;
	
	@FindBy(xpath="//div[@class='ant-modal-confirm-content']")
	WebElement Success_Msg;
	
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement Ok_Btn;
	
	
public UsersDeletePage()
{
	PageFactory.initElements(driver, this);
}

public UsersDeletePage Search(String Char) throws InterruptedException
{
	Thread.sleep(2000);
	Search_Box.sendKeys(Char);
	return null;
}
public String nodata()
{
	return NoData_Txt.getText();
}
public UsersDeletePage Search1(String Char) throws InterruptedException
{
	Thread.sleep(2000);
	Search_Close.click();
	Thread.sleep(2000);
	Search_Box.sendKeys(Char);
	
	return null;
}
public String ShowingRecord()
{
	return Result_Record.getText();
}
public UsersDeletePage Delete_Btn() throws InterruptedException
{
	Thread.sleep(2000);
	Delete_Btn.click();
	Thread.sleep(2000);
	Close_Btn.click();
	Thread.sleep(2000);
	Delete_Btn.click();
	Thread.sleep(2000);
	Cancel_Btn.click();
	Thread.sleep(2000);
	Delete_Btn.click();
	return null;
	}
public UsersDeletePage Confirm_btn() throws InterruptedException
{
	Thread.sleep(2000);
	 Confirm_Btn.click();
	 Thread.sleep(2000);
	return null;
}
public String Changereason()
{
	return Changereason_Txt.getText();
}
public UsersDeletePage Change_Reason(String SpecialChar) throws InterruptedException
{
	Thread.sleep(2000);
    Reason_Txt.sendKeys(SpecialChar);
	return null;
}
public UsersDeletePage Change_Reason1() throws InterruptedException
{
	Thread.sleep(2000);
	Reason_Txt.clear();
	return null;
}
public UsersDeletePage Change_Reason2(String Char) throws InterruptedException
{
	Thread.sleep(2000);
	Reason_Txt.sendKeys(Char);
	Thread.sleep(2000);
	Confirm_Btn.click();
	return null;
}

public String Suceessmsg()
{
	return Success_Msg.getText();
}
public UsersDeletePage Delete_Success() throws InterruptedException
{
	Thread.sleep(2000);
	Ok_Btn.click();
	Thread.sleep(2000);
	return null;
}


}