package com.tb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.CopyPermissionPage;
import com.tb.qa.pages.PermissionAddPage;
import com.tb.qa.pages.PermissionListPage;
import com.tb.qa.pages.ProjectListPage;
import com.tb.qa.pages.UsersAddPage;
import com.tb.qa.util.ScreenShotUtil;

public class CopyPermissionPageTest extends TestBase{
	 ProjectListPage projectlistpage;
     UsersAddPage Usersaddpage;
     PermissionListPage permissionlistpage;
     PermissionAddPage permissionaddpage;
     CopyPermissionPage copypermissionpage ;
     ScreenShotUtil screenshot;
     
     
@BeforeMethod
public void setup()
{
	projectlistpage = new ProjectListPage();
	Usersaddpage = new UsersAddPage();
	permissionlistpage = new PermissionListPage();
	permissionaddpage = new PermissionAddPage();
	copypermissionpage = new CopyPermissionPage();
	screenshot = new ScreenShotUtil();
}
@Test(priority=1)
public void BreadChrumb() throws InterruptedException
{  
	String A = projectlistpage.Breadchrumb();
	String B = projectlistpage.Breadchrumbs();
	String C = projectlistpage.BreadchrumbL();
	String Title = A+B+C;
	Assert.assertEquals(Title, "Project/List");
	{
		System.out.println(Title);
	}
}
@Test(priority=2)
public void Usersaddpage() throws InterruptedException
{
	
projectlistpage.Roles();
projectlistpage.Roles1();	
}
@Test(priority=3)
public void BreadChrumb1() throws InterruptedException
{
	String A = projectlistpage.Breadchrumb();
	String B = projectlistpage.Breadchrumbs();
	String C = projectlistpage.BreadchrumbL();
	String Title = A+B+C;
	Assert.assertEquals(Title, "Roles/List");
	{
		System.out.println(Title);
	}
}
@Test(priority=4)
public void BreadChrumb2() throws InterruptedException
{
 Usersaddpage.Add();
 {
 	String A = projectlistpage.Breadchrumb();
 	String B = projectlistpage.Breadchrumbs();
 	String C = projectlistpage.BreadchrumbL();
 	String Title = A+B+C;
 	Assert.assertEquals(Title, "Roles/Add");
 	{
 		System.out.println(Title);}
 	}
 }
@Test(priority=5)
public void Usersaddpage1() throws InterruptedException 
{
	Usersaddpage.ThreadSleep();
	 Usersaddpage.Add_Btn();
	 String Title = Usersaddpage.Clear();
	    Assert.assertEquals(Title, "Role Name is mandatory");
	    {
		System.out.println(Title);
	    }
}
@Test(priority=6)
public void mandatoryspaceerror() throws InterruptedException
{
	 Usersaddpage.mandatorySpaceerror("     ");
	String Title = Usersaddpage.Clear();
    Assert.assertEquals(Title, "Field cannot begins/ends with space");
    {
	System.out.println(Title);
    }
}
@Test(priority=7)
public void mandatorynumericerror() throws InterruptedException
{
	Usersaddpage.ThreadSleep();
	Usersaddpage.Clear_Clr();
	Usersaddpage.mandatoryNumericerror("123456789");
	String Title = Usersaddpage.Clear();
	Assert.assertEquals(Title, "Role Name should contain only alphabets");
	{
	System.out.println(Title);	
}
}
@Test(priority=8)
public void mandatoryminerror() throws InterruptedException
{
	Usersaddpage.ThreadSleep();
	Usersaddpage.Clear_Clr();
	Usersaddpage.Mandatoryminerror("a");
	String Title = Usersaddpage.Clear();
	Assert.assertEquals(Title, "Role Name should be between 2-255 characters");
	{
	System.out.println(Title);	
}
}
@Test(priority=9)
public void maatoryMaxerror() throws InterruptedException
{   
	Usersaddpage.ThreadSleep();
	Usersaddpage.Clear_Clr();
	for(int i=1;i<=256;i++)
	{
		Usersaddpage.mandatoryMaxerror("a");
	}
		String Title = Usersaddpage.Clear();
		Assert.assertEquals(Title, "Role Name should be between 2-255 characters");
		{
		System.out.println(Title);	
	}
}
@Test(priority=10)
public void RolesSpeChar() throws InterruptedException
{
	Usersaddpage.Clear_Clr();
	Usersaddpage.RolesSpeChar("@");
	String Title = Usersaddpage.Clear();
	Assert.assertEquals(Title, "Role Name should be between 2-255 characters Role Name should contain only alphabets");
	{
		System.out.println(Title);	
}
}
@Test(priority=11)
public void Rolesadd() throws InterruptedException
{
	Usersaddpage.Clear_Clr();
	Usersaddpage.Rolesadd("manoj");
	String Title = Usersaddpage.Clear();
	Assert.assertEquals(Title, "Role Name not available!");
	{
	System.out.println(Title);	
}
}
@Test(priority=12)
public void RolesdesMin() throws InterruptedException
{
	Usersaddpage.Clear_Clr();
	Usersaddpage.RolesDesMin("a");
	String Title = Usersaddpage.Clear1();
	Assert.assertEquals(Title, "Role Description should be between 2-255 characters");
	{
	System.out.println(Title);	
}
}
@Test(priority=13)
public void RolesDesMax() throws InterruptedException{
	Usersaddpage.ThreadSleep();
	Usersaddpage.Clear_Clr();
	for(int i=1;i<=256;i++)
	{
		Usersaddpage.RolesDesMax("a");
	}
	{
		String Title = Usersaddpage.Clear1();
		Assert.assertEquals(Title, "Role Description should be between 2-255 characters");
		System.out.println(Title);	
	}		
}
@Test(priority=14)
public void RolesDesSpechar() throws InterruptedException
{
	Usersaddpage.Clear_Clr();
	Usersaddpage.RolesDesMin("^");
	String Title = Usersaddpage.Clear1();
	Assert.assertEquals(Title, "Role Description should be between 2-255 characters Role Description should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");
	{
		System.out.println(Title);	
}
}
@Test(priority=15)
public void RolesDes() throws InterruptedException
{
	Usersaddpage.Clear_Clr();
	Usersaddpage.RolesDes("ma@123");	
}	
@Test(priority=16)
public void RolesNaDes() throws InterruptedException
{
	Usersaddpage.Clear_Clr();
	Usersaddpage.RolesNaDes("mamamamma","Ma@123");
	}
@Test(priority=17)
public void Addbutt() throws InterruptedException
{
	Usersaddpage.AddButt();
	String Title = Usersaddpage.Success_Msg();
	Assert.assertEquals(Title, "Roles added successfully!");
	{
	System.out.println(Title);	
	}
} 
@Test(priority=18)
public void Popupok() throws InterruptedException
{
	Usersaddpage.Popupok();
}
@Test(priority=19)
public void BreadChrumb3() throws InterruptedException
{
	String A = projectlistpage.Breadchrumb();
	String B = projectlistpage.Breadchrumbs();
	String C = projectlistpage.BreadchrumbL();
	String Title = A+B+C;
	Assert.assertEquals(Title, "Roles/List");
	{
		System.out.println(Title);
	}
}
@Test(priority=20)
	public void searchne() throws InterruptedException
	{
	     permissionlistpage.SearchNe("mamamama");
	    String title = permissionlistpage.Nodata();
	     Assert.assertEquals(title, "No Data");{
	    	 System.out.println(title);
	     }
	}
	@Test(priority=21)
	public void search() throws InterruptedException
	{
		permissionlistpage.Search("mamamamma");
    String Title = permissionlistpage.ShowingRecord();
    Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
 	   System.out.println(Title);
    }
	}
	@Test(priority=22)
 	public void Permission() throws InterruptedException
 	{
 		permissionaddpage.Permission_btn("mamamamma");
 		permissionaddpage.Permissionadd_Btn();
 	}
 	@Test(priority=23)
 	public void Permission_Add() throws InterruptedException
 	{
 		
 		String title = permissionaddpage.Mandatory_msg();
 		Assert.assertEquals(title,"Object Category should be selected");{
 			System.out.println(title);
 		}
 	}
 	@Test(priority=24)
 	public void Permission_Add1() throws InterruptedException
 	{
 		String title = permissionaddpage.Mandatory_msg1();
 		Assert.assertEquals(title, "Object Name should be selected");{
 			System.out.println(title);
 		}
 	}
 	@Test(priority=25)
 	public void Permission_Add2() throws InterruptedException
 	{
 		String title = permissionaddpage.Mandatory_msg2();
 		Assert.assertEquals(title,"Permission Level should be selected");{
 			System.out.println(title);
 		}
 	}
 	@Test(priority=26)
 	public void Permissionaddpage() throws InterruptedException
 	{
 		permissionaddpage.Category_Std();
 	}
 	@Test(priority=27)
 	public void Permission_Add3() throws InterruptedException
 	{
 		String title = permissionaddpage.Mandatory_msg();
 		Assert.assertEquals(title, "Object Name should be selected");{
 			System.out.println(title);
 		}
 	}
 	@Test(priority=28)
 	public void Permission_Add4() throws InterruptedException
 	{
 		String title = permissionaddpage.Mandatory_msg1();
 		Assert.assertEquals(title,"Permission Level should be selected");{
 			System.out.println(title);
 		}
 	}
 	@Test(priority=29)
 	public void Permissionaddpage1() throws InterruptedException
 	{
 		permissionaddpage.Objectname();
     		String title = permissionaddpage.Mandatory_msg();
     		Assert.assertEquals(title,"Permission Level should be selected");{
     			System.out.println(title);
     	}
     		 
     		
 	}
 	@Test(priority=30)
 	public void Permissionlevel() throws InterruptedException
 	{
 		permissionaddpage.Permissionlevel();
 		screenshot.captureScreenshot(driver, "D:\\ScreenShots"+System.currentTimeMillis()+".png");
 		permissionaddpage.permissionsave();
 	}
 	@Test(priority=31)
 	public void success_msg() throws InterruptedException
 	{
 		String title = permissionaddpage.Success_msg();
 		Assert.assertEquals(title, "Permission added successfully!");{
 			System.out.println(title);
 		}
 	}
 	@Test(priority=32)
 	public void PermissionAdd() throws InterruptedException
 	{
 		permissionaddpage.permissionok();
 	}
 	@Test(priority=33)
	public void search1() throws InterruptedException
	{
		permissionlistpage.Search("mamamamma");
    String Title = permissionlistpage.ShowingRecord();
    Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
 	   System.out.println(Title);
    }
	}
 	@Test(priority=34)
    public void Usersaddpage01() throws InterruptedException 
    {
 		copypermissionpage.Copy_Btn();
		 Usersaddpage.Add_Btn();
		 String Title = Usersaddpage.Clear();
		    Assert.assertEquals(Title, "Role Name is mandatory");
		    {
			System.out.println(Title);
		    }
	}
	@Test(priority=35)
	public void mandatoryspaceerror1() throws InterruptedException
	{
		 Usersaddpage.mandatorySpaceerror("     ");
		String Title = Usersaddpage.Clear();
	    Assert.assertEquals(Title, "Field cannot begins/ends with space");
	    {
		System.out.println(Title);
	    }
	}
	@Test(priority=36)
	public void mandatorynumericerror1() throws InterruptedException
	{
		Usersaddpage.ThreadSleep();
		Usersaddpage.Clear_Clr();
		Usersaddpage.mandatoryNumericerror("123456789");
		String Title = Usersaddpage.Clear();
		Assert.assertEquals(Title, "Role Name should contain only alphabets");
		{
		System.out.println(Title);	
	}
	}
	@Test(priority=37)
	public void mandatoryminerror1() throws InterruptedException
	{
		Usersaddpage.ThreadSleep();
		Usersaddpage.Clear_Clr();
		Usersaddpage.Mandatoryminerror("a");
		String Title = Usersaddpage.Clear();
		Assert.assertEquals(Title, "Role Name should be between 2-255 characters");
		{
		System.out.println(Title);	
	}
	}
	@Test(priority=38)
	public void maatoryMaxerror1() throws InterruptedException
	{
		Usersaddpage.ThreadSleep();
		Usersaddpage.Clear_Clr();
		for(int i=1;i<=256;i++)
		{
			Usersaddpage.mandatoryMaxerror("a");
		}
			String Title = Usersaddpage.Clear();
			Assert.assertEquals(Title, "Role Name should be between 2-255 characters");
			{
			System.out.println(Title);	
		}
	}
	@Test(priority=39)
	public void RolesSpeChar1() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesSpeChar("@");
		String Title = Usersaddpage.Clear();
		Assert.assertEquals(Title, "Role Name should be between 2-255 characters Role Name should contain only alphabets");
		{
			System.out.println(Title);	
	}
	}
	@Test(priority=40)
	public void Rolesadd1() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.Rolesadd("manoj");
		String Title = Usersaddpage.Clear();
		Assert.assertEquals(Title, "Role Name not available!");
		{
		System.out.println(Title);	
	}
	}
	@Test(priority=41)
	public void RolesdesMin1() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesDesMin("a");
		String Title = Usersaddpage.Clear1();
		Assert.assertEquals(Title, "Role Description should be between 2-255 characters");
		{
		System.out.println(Title);	
	}
	}
	@Test(priority=42)
	public void RolesDesMax01() throws InterruptedException{
		Usersaddpage.ThreadSleep();
		Usersaddpage.Clear_Clr();
		for(int i=1;i<=256;i++)
		{
			Usersaddpage.RolesDesMax("a");
		}
		{
			String Title = Usersaddpage.Clear1();
			Assert.assertEquals(Title, "Role Description should be between 2-255 characters");
			System.out.println(Title);	
		}		
	}
	@Test(priority=43)
	public void RolesDesSpechar1() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesDesMin("^");
    	String Title = Usersaddpage.Clear1();
		Assert.assertEquals(Title, "Role Description should be between 2-255 characters Role Description should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");
		{
			System.out.println(Title);	
	}
	}
	@Test(priority=44)
	public void RolesDes1() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesDes("ma@123");	
	}	
	@Test(priority=45)
	public void RolesNaDes1() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesNaDes("Mansa","Mas@123");
		}

	@Test(priority=46)
		public void Ok_btn() throws InterruptedException
		{
		    Usersaddpage.AddButt();
			copypermissionpage.Ok_Btn();
		}
	@Test(priority=47)
	public void search2() throws InterruptedException
	{
		permissionlistpage.Search("Mansa");
    String Title = permissionlistpage.ShowingRecord();
    Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
 	   System.out.println(Title);
    }
	}
	@Test(priority=48)
	public void Ok_btn1() throws InterruptedException
	{
	    copypermissionpage.Permission_Check();
	    screenshot.captureScreenshot(driver, "D:\\ScreenShots"+System.currentTimeMillis()+".png");
	    copypermissionpage.Permission_ScreenShot();
	}
	
	}


