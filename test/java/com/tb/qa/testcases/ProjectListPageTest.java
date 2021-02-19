package com.tb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.LoginPage;
import com.tb.qa.pages.ProjectListPage;
import com.tb.qa.pages.UsersAddPage;
import com.tb.qa.pages.UsersDeletePage;
import com.tb.qa.pages.UsersListPage;



public class ProjectListPageTest extends TestBase {

//	LoginPage loginPage;
	ProjectListPage projectlistpage;
	UsersAddPage Usersaddpage;
	UsersListPage Userslistpage;
	UsersDeletePage Usersdeletepage;
	@BeforeMethod
	public void setup()
	{
		
//		initialization();
//		loginPage = new LoginPage();
		projectlistpage = new ProjectListPage();
		Usersaddpage = new UsersAddPage();
		Userslistpage= new UsersListPage();
		Usersdeletepage = new UsersDeletePage();
	}
	
	@Test(priority=1)
	public void breadcrumb()
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
	public void projectlistpage() throws InterruptedException
	{
		projectlistpage.Roles();
		projectlistpage.Roles1();
	}
	
	@Test(priority=3)
	public void Usersaddpage() throws InterruptedException
	{
		Usersaddpage.ThreadSleep();
		 Usersaddpage.Add();
	}
	@Test(priority=4)
	public void Usersadd() throws InterruptedException
	{
		Usersaddpage.ThreadSleep();
		 Usersaddpage.Add_Btn();
		 String Title = Usersaddpage.Clear();
		    Assert.assertEquals(Title, "Role Name is mandatory");
		    {
			System.out.println(Title);
		    }
	}
	
	@Test(priority=5)
	public void mandatoryspaceerror() throws InterruptedException
	{
		 Usersaddpage.mandatorySpaceerror("     ");
		String Title = Usersaddpage.Clear();
	    Assert.assertEquals(Title, "Field cannot begins/ends with space");
	    {
		System.out.println(Title);
	    }
	}
	@Test(priority=6)
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
	@Test(priority=7)
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
	@Test(priority=8)
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
	@Test(priority=9)
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
	@Test(priority=10)
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
	@Test(priority=11)
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
	@Test(priority=12)
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
	@Test(priority=13)
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
	@Test(priority=14)
	public void RolesDes() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesDes("ma@123");	
	}	
	@Test(priority=15)
	public void RolesNaDes() throws InterruptedException
	{
		Usersaddpage.Clear_Clr();
		Usersaddpage.RolesNaDes("mamamamma","Ma@123");
		}
	@Test(priority=16)
	public void Addbutt() throws InterruptedException
	{
		Usersaddpage.AddButt();
		String Title = Usersaddpage.Success_Msg();
		Assert.assertEquals(Title, "Roles added successfully!");
		{
		System.out.println(Title);	
		}
	}
	@Test(priority=17)
	public void Popupok() throws InterruptedException
	{
		Usersaddpage.Popupok();
	}
	@Test(priority=18)
	public void searchne() throws InterruptedException
	{
	     Userslistpage.SearchNe("mamamama");
	    String title = Userslistpage.Nodata();
	     Assert.assertEquals(title, "No Data");{
	    	 System.out.println(title);
	     }
	}
	@Test(priority=19)
	public void search() throws InterruptedException
	{
		Userslistpage.Search("mamamamma");
       String Title = Userslistpage.ShowingRecord();
       Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
    	   System.out.println(Title);
       }
	}
	@Test(priority=20)
	public void edit() throws InterruptedException
	{
		Userslistpage.Edit();
	}
	@Test(priority=21)
	public void Cancel() throws InterruptedException
	{
		Userslistpage.Cancel("mamamamma");
	}
	@Test(priority=22)
	public void EditRolrdes() throws InterruptedException
	{
		Userslistpage.EditRolrdes();
	}
	@Test(priority=23)
	public void rolesdesmin() throws InterruptedException
	{
		Userslistpage.RolesDesMin("a");
		String Char = Userslistpage.DesNegChar();
		Assert.assertEquals(Char, "Role Description should be between 2-255 characters");{
			System.out.println(Char);
		}
	}
	@Test(priority=24)
	public void Rolrdes() throws InterruptedException
	{
		Userslistpage.Rolesdes();
	}
	@Test(priority=25)
	public void Rolesdesmax() throws InterruptedException
	{
		
		for(int i=1;i<=256;i++)
		{
			Userslistpage.RolesDesMax("a");
		}
			String Char = Userslistpage.DesNegChar();
			Assert.assertEquals(Char, "Role Description should be between 2-255 characters");{
				System.out.println(Char);
		}
	}
	@Test(priority=26)
	public void Rolesdesspe() throws InterruptedException
	{
		Userslistpage.RolesDesSpechar("^");
		String Char = Userslistpage.DesNegChar();
		Assert.assertEquals(Char, "Role Description should be between 2-255 characters Role Description should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");{
			System.out.println(Char);
		}
	}
	
	@Test(priority=27)
	public void RoledEdit() throws InterruptedException
	{
		Userslistpage.RoleDesdit();
	}
	@Test(priority=28)
	public void Dropdown() throws InterruptedException
	{
		Userslistpage.RolesAcIn("23@a");
	}
	@Test(priority=29)
	public void rolesAc() throws InterruptedException
	{
		Userslistpage.RolesAc();
	}
	@Test(priority=30)
	public void Roles() throws InterruptedException
	{
		String Title=Userslistpage.UpdateRoles();
		Assert.assertEquals(Title, "Change Reason is required");{
			System.out.println(Title);
		}
		
	}
	@Test(priority=31)
	public void Changereasn() throws InterruptedException
	{
		Userslistpage.Changereason("&");
		String Title=Userslistpage.UpdateRoles();
		Assert.assertEquals(Title, "Change Reason should contain only alphanumeric and special characters(.,-;_())");{
			System.out.println(Title);
		}
	}
	@Test(priority=32)
	public void Changereason01() throws InterruptedException
	{
		Userslistpage.Changereason1("mm");
	}
	@Test(priority=33)
	public void Changeconfirmbtn01() throws InterruptedException
	{
		Userslistpage.ChangeConfirmBtn();
		String Title = Userslistpage.Donemsg();
		Assert.assertEquals(Title, "Roles updated successfully!");{
			System.out.println(Title);
		}
	}
	@Test(priority=34)
	public void Okbtn() throws InterruptedException
	{
		Userslistpage.okBtn();
	}
	@Test(priority=35)
	public void Search() throws InterruptedException
	{
		Usersdeletepage.Search("mamamamama");
		 String title = Usersdeletepage.nodata();
	     Assert.assertEquals(title, "No Data");{
	    	 System.out.println(title);
	}
	}
	@Test(priority=36)
	public void Search1() throws InterruptedException
	{
		Usersdeletepage.Search1("mamamamma");
		 String Title = Usersdeletepage.ShowingRecord();
       Assert.assertEquals(Title, "Showing 1 to 1 of 1 records");{
    	   System.out.println(Title);
       }
	}
	@Test(priority=37)
	public void Deletebtn() throws InterruptedException
	{
		Usersdeletepage.Delete_Btn();
	}
	@Test(priority=38)
	public void roles() throws InterruptedException
	{
		Usersdeletepage.Confirm_btn();
		String Title=Usersdeletepage.Changereason();
		Assert.assertEquals(Title, "Change Reason is required");{
			System.out.println(Title);
		}
		
	}
	@Test(priority=39)
	public void Changereason() throws InterruptedException
	{
		Usersdeletepage.Change_Reason("^");
        String Title=Usersdeletepage.Changereason();
		Assert.assertEquals(Title, "Change Reason should contain only alphanumeric and special characters(.,-;_())");{
			System.out.println(Title);
		}
	}
	@Test(priority=40)
	public void Changereason1() throws InterruptedException
	{
		Usersdeletepage.Change_Reason1();
	}
	
	@Test(priority=41)
	public void Changereason2() throws InterruptedException
	{
		Usersdeletepage.Change_Reason2("mm");
		String Title = Usersdeletepage.Suceessmsg();
		Assert.assertEquals(Title, "Roles deleted successfully!");{
			System.out.println(Title);
		}
	}
	@Test(priority=42)
	public void Changeconfirmbtn() throws InterruptedException
	{
	    Usersdeletepage.Delete_Success();
		
	}
}


