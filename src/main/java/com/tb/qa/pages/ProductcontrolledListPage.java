package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class ProductcontrolledListPage extends TestBase{
	
	@FindBy(xpath="(//i[@class='fas fa-cog'])")
	WebElement SettingIcon_Btn;
	
	@FindBy(xpath="(//li[@class='ant-menu-item'])[7]")
	WebElement ProductControlledterm_Btn;
	
	@FindBy(xpath="(//span[@class='ant-breadcrumb-link'])[1]")
	WebElement BreadCrumbP;
	
	@FindBy(xpath="(//span[@class='ant-breadcrumb-separator'])[1]")
	WebElement BreadCrumbs;
	
	@FindBy(xpath="(//span[@class='ant-breadcrumb-link'])[2]")
	WebElement BreadCrumbL;


public ProductcontrolledListPage()
{
	PageFactory.initElements(driver, this);
}

public String Breadchrumb()
{
	return BreadCrumbP.getText();
}
public String Breadchrumbs()
{
	return BreadCrumbs.getText();
}
public String BreadchrumbL()
{
	return BreadCrumbL.getText();
}
public ProductcontrolledListPage Setting_BTn() throws InterruptedException
{
	SettingIcon_Btn.click();
	Thread.sleep(2000);
	ProductControlledterm_Btn.click();
	Thread.sleep(2000);
	return null;
}
}