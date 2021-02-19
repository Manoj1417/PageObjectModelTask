package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class CopyPermissionPage extends TestBase{
	

	@FindBy(xpath="(//button[@class='ant-btn sc-ifAKCX fcfmNQ ant-btn-circle ant-btn-sm'])[4]")
	WebElement Copypermission_Btn;
	
	@FindBy(xpath="(//button[@class='ant-btn sc-ifAKCX fcfmNQ ant-btn-danger'])")
	WebElement Cancel_Btn;
	
	@FindBy(xpath="//button[@name='AlertOK']")
	WebElement Ok_Btn;
	
	@FindBy(xpath="(//button[@class='ant-btn sc-ifAKCX fcfmNQ ant-btn-circle ant-btn-sm'])[3]")
	WebElement Permisson_Btn;
	
	@FindBy(xpath="(//i[@class='anticon anticon-close ant-modal-close-icon'])")
	WebElement Clos_Btn;
	
	@FindBy(xpath="(//i[@class='anticon anticon-close'])")
	WebElement Search_Close;
	
	
public CopyPermissionPage()
{
	PageFactory.initElements(driver, this);
}

public CopyPermissionPage Copy_Btn() throws InterruptedException
{
	Copypermission_Btn.click();
	Thread.sleep(2000);
	Cancel_Btn.click();
	Thread.sleep(2000);
	Copypermission_Btn.click();
	Thread.sleep(2000);
	return null;
}
public CopyPermissionPage Ok_Btn() throws InterruptedException
{
	Ok_Btn.click();
	Thread.sleep(2000);
     return null;
}
public CopyPermissionPage Permission_Check() throws InterruptedException
{
	Permisson_Btn.click();
	Thread.sleep(2000);
	
     return null;
}
public CopyPermissionPage Permission_ScreenShot() throws InterruptedException
{
	Clos_Btn.click();
	Thread.sleep(2000);
	Search_Close.click();
	return null;
}
}
