package com.tb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tb.qa.base.TestBase;

public class ProjectListPage extends TestBase{

	@FindBy(xpath="//i[@name='ConfigMenu']")
	WebElement ConfigMenu_btn;
	
	@FindBy(xpath="//a[@name='Roles']")
	WebElement Roles_btn;
	
	
	@FindBy(xpath="(//span[@class='ant-breadcrumb-link'])[1]")
	WebElement BreadCrumbP;
	
	@FindBy(xpath="(//span[@class='ant-breadcrumb-separator'])[1]")
	WebElement BreadCrumbs;
	
	@FindBy(xpath="(//span[@class='ant-breadcrumb-link'])[2]")
	WebElement BreadCrumbL;
	
	@FindBy(xpath="//div[@class='ant-breadcrumb']")
	WebElement Breadchrumb;
	
	
	public ProjectListPage()
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
	public ProjectListPage Roles() throws InterruptedException
	{
		Thread.sleep(2000);
	    ConfigMenu_btn.click();
	    Thread.sleep(2000);
	     return null;
	}
	public ProjectListPage Roles1() throws InterruptedException
	{
		 Roles_btn.click();
		    Thread.sleep(2000);
		    return null;
	}
	
}
