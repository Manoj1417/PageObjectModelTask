package com.tb.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.PermissionAddPage;
import com.tb.qa.pages.PermissionDeletePage;
import com.tb.qa.pages.PermissionEditPage;
import com.tb.qa.pages.PermissionListPage;
import com.tb.qa.pages.ProjectListPage;
import com.tb.qa.pages.UsersAddPage;

public class PermissionListPageTest extends TestBase{
        PermissionListPage permissionlistpage;
        ProjectListPage projectlistpage;
        UsersAddPage Usersaddpage;
        PermissionAddPage permissionaddpage;
        PermissionEditPage permissioneditpage;
        PermissionDeletePage permissiondeletepage;
        @BeforeMethod
    	public void setup()
    	{
    		permissionlistpage = new PermissionListPage();
    		projectlistpage = new ProjectListPage();
    		Usersaddpage = new UsersAddPage();
    		permissionaddpage = new PermissionAddPage();
    		permissioneditpage = new PermissionEditPage();
    		permissiondeletepage = new PermissionDeletePage();
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
     		permissionlistpage.Search1();
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
        public void BreadChrumb4() throws InterruptedException
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
    	@Test(priority=34)
     	public void Permissionsearch() throws InterruptedException
     	{
     		permissioneditpage.SearchNe("mamamamma");
     		String Title = permissioneditpage.ShowingRecord();
          Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
       	   System.out.println(Title);
     	}
            }
    	@Test(priority=35)
     	public void Permission_Edit() throws InterruptedException
     	{
    		permissioneditpage.Edit();
     	}
    	
    	@Test(priority=36)
     	public void Permission_edit() throws InterruptedException
     	{
     		String title = permissioneditpage.Mandatory_msg();
     		Assert.assertEquals(title, "Object Name should be selected");{
     			System.out.println(title);
     		}
     	}
     	@Test(priority=37)
     	public void Permission_Edit1() throws InterruptedException
     	{
     		String title = permissioneditpage.Mandatory_msg1();
     		Assert.assertEquals(title,"Permission Level should be selected");{
     			System.out.println(title);
     		}
     	}
     	@Test(priority=38)
     	public void Permission_edit2() throws InterruptedException
     	{
     		permissioneditpage.Edit1();
         		String title = permissioneditpage.Mandatory_msg();
         		Assert.assertEquals(title,"Permission Level should be selected");{
         			System.out.println(title);
         	}
     	}
     	@Test(priority=39)
     	public void PermissionEdit1() throws InterruptedException
     	{
     		permissioneditpage.Edit2();
     		String title = permissioneditpage. Reason_msg1();
     		Assert.assertEquals(title,"Change Reason is required");{
     			 System.out.println(title);
     	}
     	}
     	@Test(priority=40)
     	public void Permissionedit3() throws InterruptedException
     	{
     		permissioneditpage.Edit3("^");
     		String title = permissioneditpage.Reason_msg1();
     		Assert.assertEquals(title,"Change Reason should contain only alphanumeric and special characters(.,-;_())");{
     			System.out.println(title);
     	}
     	}
     	@Test(priority=41)
     	public void Permissionedit4() throws InterruptedException
     	{
     		permissioneditpage.Edit4("mm");
     	}
     	@Test(priority=42)
     	public void PermissionEdit5() throws InterruptedException
     	{
     		permissioneditpage.Edit5();
     		String title = permissioneditpage. Reason_msg2();
     		Assert.assertEquals(title,"permission updated successfully!");{
     			System.out.println(title);
     	}
     	}
     	@Test(priority=43)
     	public void Permissionedit6() throws InterruptedException
     	{
     		permissioneditpage.Edit6();
     	}
     	@Test(priority=44)
     	public void PermissiondeleteSearch() throws InterruptedException
     	{
     		permissiondeletepage.Search("mamamama");
     		String title = permissiondeletepage.Nodata();
    	     Assert.assertEquals(title, "No Data");{
    	    	 System.out.println(title);
    	     }	
     	}
     	@Test(priority=45)
        public void BreadChrumb5() throws InterruptedException
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
     	@Test(priority=46)
     	public void Permissiondeletesearch() throws InterruptedException
     	{
     		permissiondeletepage.Search1("mamamamma");
     		String Title = permissiondeletepage.Nodata1();
          Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
       	   System.out.println(Title);
     	}
     	}
          @Test(priority=47)
       	public void Permissiondelete1() throws InterruptedException
       	{
       		permissiondeletepage.permissiondelete();
       		String title = permissiondeletepage.Error_Msg();
       		Assert.assertEquals(title,"Change Reason is required");{
       			System.out.println(title);
       	}
       	}
       	@Test(priority=48)
       	public void Permissionedelete3() throws InterruptedException
       	{
       		permissiondeletepage.permissiondelete1("^");
       		String title = permissiondeletepage.Error_Msg();
       		Assert.assertEquals(title,"Change Reason should contain only alphanumeric and special characters(.,-;_())");{
       			System.out.println(title);
       	}
     	}
    	@Test(priority=49)
     	public void Permissionedelete() throws InterruptedException
     	{
     		permissiondeletepage.permissiondelete2("mm");
     		String title = permissiondeletepage. Reason_Msg();
     		Assert.assertEquals(title,"permission deleted successfully!");{
     			System.out.println(title);
     		}
     	}
    	@Test(priority=50)
     	public void Permissiondelete5() throws InterruptedException
     	{
    		permissiondeletepage.permissiondelete3();
     	}
    	@Test(priority=51)
        public void BreadChrumb6() throws InterruptedException
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
     	
    	
    	
    	
     	}
     	

