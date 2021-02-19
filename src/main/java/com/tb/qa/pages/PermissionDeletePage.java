package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class PermissionDeletePage extends TestBase {

	@FindBy(xpath="//input[@name='TableSearch']")
	WebElement Search_Box;
	
	@FindBy(xpath="//*[self::span][@id='showrecordspan']")
	WebElement Result_Record;
	
	@FindBy(xpath="//i[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement Close_Btn;
	
	@FindBy(xpath="//p[@class='ant-empty-description']")
	WebElement NoData_Txt;
	
	@FindBy(xpath="//*[self::button][@name='mamamamma_Permissions']")
	WebElement Permission_Btn;
	
	@FindBy(xpath="//button[@name='Module_project_Delete']")
	WebElement Delete_Btn;
	
	@FindBy(xpath="(//i[@class='anticon anticon-close ant-modal-close-icon'])[2]")
	WebElement Reason_Closebtn;
	
	@FindBy(xpath="(//div[@class='ant-form-explain'])")
	WebElement Reason_Msg;
	
	@FindBy(xpath="(//button[@name='PopupConfirm'])")
	WebElement Confirm_Btn;
	
	@FindBy(xpath="(//input[@id='Change Reason'])")
	WebElement Reason_Txt;
	
	@FindBy(xpath="//span[@name='AlertMessage']")
	WebElement Success_Msg;
	
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement Ok_Btn;
	
	@FindBy(xpath="//span[@id='showrecordspan']")
	WebElement Search_Msg;
	
	@FindBy(xpath="//i[@class='anticon anticon-close']")
	WebElement Search_Close;
	
	
public PermissionDeletePage()
{
	PageFactory.initElements(driver, this);
}
public PermissionDeletePage Search(String Char)
{
	Search_Box.sendKeys(Char);
	return null;
}
public String Nodata()
{
	return NoData_Txt.getText();
	 
}
public PermissionDeletePage Search1(String Char) throws InterruptedException
{
	Thread.sleep(2000);
	Search_Box.clear();
	Thread.sleep(2000);
	Search_Box.sendKeys(Char);
	return null;
}
public String Nodata1()
{
	return Search_Msg.getText();
	 
}
public PermissionDeletePage permissiondelete() throws InterruptedException
{
	Thread.sleep(2000);
	Permission_Btn.click();
	Thread.sleep(2000);
	Close_Btn.click();
	Thread.sleep(2000);
	Permission_Btn.click();
	Thread.sleep(2000);
	Delete_Btn.click();
	Thread.sleep(2000);
	Reason_Closebtn.click();
	Thread.sleep(2000);
	Delete_Btn.click();
	Thread.sleep(2000);
	Confirm_Btn.click();
	Thread.sleep(2000);
	return null;
}
public String Error_Msg()
{
return Reason_Msg.getText();
}
public PermissionDeletePage permissiondelete1(String Char) throws InterruptedException
{
	Reason_Txt.clear();
	Thread.sleep(2000);
	Reason_Txt.sendKeys(Char);
	Thread.sleep(2000);
	return null;
}
public PermissionDeletePage permissiondelete2(String Char) throws InterruptedException
{
	Reason_Txt.clear();
	Thread.sleep(2000);
	Reason_Txt.sendKeys(Char);
	Thread.sleep(2000);
	Confirm_Btn.click();
	Thread.sleep(2000);
	return null;
}
public String Reason_Msg()
{
	return Success_Msg.getText();
}
public PermissionEditPage permissiondelete3() throws InterruptedException
{
	Ok_Btn.click();
	Thread.sleep(2000);
	Close_Btn.click();
	Thread.sleep(2000);
	Search_Close.click();
	Thread.sleep(2000);
	return null; 
}

}



                                                                                                                          































