package com.tb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tb.qa.base.TestBase;
import com.tb.qa.pages.ProductControlledTermAddPage;
import com.tb.qa.pages.ProductcontrolledListPage;

public class ProductControlledTermTest extends TestBase{
       ProductcontrolledListPage productcontrolledlist; 
       ProductControlledTermAddPage productcontroladd;

@BeforeMethod()
public void Steup()
{
	productcontrolledlist = new ProductcontrolledListPage();
	productcontroladd = new ProductControlledTermAddPage();
}
@Test(priority=1)
public void BreadChrumb() throws InterruptedException
{  
	String A = productcontrolledlist.Breadchrumb();
	String B = productcontrolledlist.Breadchrumbs();
	String C = productcontrolledlist.BreadchrumbL();
	String Title = A+B+C;
	Assert.assertEquals(Title, "Project/List");
	{
		System.out.println(Title);
	}
} 
@Test(priority=2)
public void setting_Btn() throws InterruptedException
{
	productcontrolledlist.Setting_BTn();
}
@Test(priority=3)
public void BreadChrumb1() throws InterruptedException
{  
	String A = productcontrolledlist.Breadchrumb();
	String B = productcontrolledlist.Breadchrumbs();
	String C = productcontrolledlist.BreadchrumbL();
	String Title = A+B+C;
	Assert.assertEquals(Title, "Product Controlled Term/List");
	{
		System.out.println(Title);
	}
} 
@Test(priority=4)
public void Add_Btn() throws InterruptedException
{
	productcontroladd.Add();
}
//@Test(priority=5)
//public void BreadChrumb2() throws InterruptedException
//{  
//	String A = productcontrolledlist.Breadchrumb();
//	String B = productcontrolledlist.Breadchrumbs();
//	String C = productcontrolledlist.BreadchrumbL();
//	String Title = A+B+C;
//	Assert.assertEquals(Title, "Product Controlled Term/Add");
//	{
//		System.out.println(Title);
//	}
//} 
//@Test(priority=6)
//public void Add_Btn1() throws InterruptedException
//{
//	productcontroladd.add_btn1();
//	String A= productcontroladd.Termname_Err();
//	String B= productcontroladd.TermCode_Err();
//	String C= productcontroladd.ShortValue_Err();
//	String D= productcontroladd.LongValue_Err();
//	Assert.assertEquals(A, "Term Name is mandatory");
//    {
//	System.out.println(A);
//    }
//    Assert.assertEquals(B, "Term Code is mandatory");{
//    	System.out.println(B);
//    }
//    Assert.assertEquals(C, "Short Value is mandatory");{
//    	System.out.println(C);
//    }
//    Assert.assertEquals(D, "Long Value is mandatory");{
//    	System.out.println(D);
//    }
//}
//@Test(priority=7)
//public void TermPage() throws InterruptedException
//{
//	productcontroladd.Termpage("Manoj Mano");
//	productcontroladd.ShortValue("Ms@123");
//	productcontroladd.TermCode("123");
//	productcontroladd.LongValue("Mansa@123");
//	productcontroladd.Clear_Clr();
//}
//@Test(priority=8)
//public void TermPage1() throws InterruptedException
//{
//	productcontroladd.Termpage("Manoj Mano");
//	productcontroladd.ShortValue("Ms@123");
//	productcontroladd.TermCode("123");
//	productcontroladd.LongValue("Mansa@123");
//}
//
//@Test(priority=9)
//public void Negative_Term() throws InterruptedException
//{
//	productcontroladd.Negative_Term("  ");
//	String Title = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title, "Field cannot begins/ends with space");{
//		System.out.println(Title);
//	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Term("@ ");
//	String Title1 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title1, "Field cannot begins/ends with space");{
//	System.out.println(Title1);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Term("@");
//	String Title2 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title2, "Term Name should be between 2-255 characters Term Name should contain only alphabets");{
//    System.out.println(Title2);}
//	productcontroladd.ThreadSleep();
//	
//    productcontroladd.Negative_Term("a@");
//	String Title3 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title3, "Term Name should contain only alphabets");{
//	System.out.println(Title3);	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Term("a  ");
//	String Title4 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title4, "Field cannot begins/ends with space");{
//	System.out.println(Title4);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Term("a");
//	String Title5 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title5, "Term Name should be between 2-255 characters");{
//    System.out.println(Title5);}
//	productcontroladd.ThreadSleep();
//  productcontroladd.ClearTerm();
//	
//	for(int i=1;i<=256;i++)
//	{
//    productcontroladd.Maximum_Term("a");}
//	String Title6 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title6, "Term Name should be between 2-255 characters");{
//	System.out.println(Title6);	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Term("@ 1");
//	String Title7= productcontroladd.Termname_Err();
//	Assert.assertEquals(Title7, "Term Name should contain only alphabets");{
//	System.out.println(Title7);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Term("a 1");
//	String Title8= productcontroladd.Termname_Err();
//	Assert.assertEquals(Title8, "Term Name should contain only alphabets");{
//    System.out.println(Title8);}
//	productcontroladd.ThreadSleep();
//	
//    productcontroladd.Negative_Term("  @");
//	String Title9 = productcontroladd.Termname_Err();
//	Assert.assertEquals(Title9, "Field cannot begins/ends with space");{
//	System.out.println(Title9);	}
//	productcontroladd.ThreadSleep();
//	productcontroladd.ClearTerm();
//	productcontroladd.Termpage("Manoj Mano");
//}

//@Test(priority=10)
//public void Negative_Shortvalue() throws InterruptedException
//{
//	productcontroladd.Negative_Shortvalue("  ");
//	String Title = productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title, "Field cannot begins/ends with space");{
//		System.out.println(Title);
//	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Shortvalue(" a");
//	String Title1 = productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title1, "Field cannot begins/ends with space");{
//	System.out.println(Title1);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Shortvalue("a^");
//	String Title2 = productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title2, "Short Value should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");{
//    System.out.println(Title2);}
//	productcontroladd.ThreadSleep();
//	
//    productcontroladd.Negative_Shortvalue("~");
//	String Title3 = productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title3, "Short Value should be between 2-255 characters Short Value should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");{
//	System.out.println(Title3);	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Shortvalue("a");
//	String Title4 = productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title4, "Short Value should be between 2-255 characters");{
//    System.out.println(Title4);}
//	productcontroladd.ThreadSleep();
//	productcontroladd.Clear_Short();
//	for(int i=1;i<=256;i++)
//	{
//    productcontroladd.Maximum_Short("a");}
//	String Title5 = productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title5, "Short Value should be between 2-255 characters");{
//	System.out.println(Title5);	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Shortvalue("a  1");
//	String Title6= productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title6, "Short Value should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");{
//	System.out.println(Title6);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_Shortvalue("a ");
//	String Title7= productcontroladd.ShortValue_Err();
//	Assert.assertEquals(Title7, "Field cannot begins/ends with space");{
//    System.out.println(Title7);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Clear_Short();
//	productcontroladd.ShortValue("Ms@123");
//}

//@Test(priority=11)
//public void Negative_Termcode() throws InterruptedException
//{
//	productcontroladd.Negative_TermCode("  ");
//	String Title = productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title, "Field cannot begins/ends with space");{
//		System.out.println(Title);
//	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_TermCode(" a");
//	String Title1 = productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title1, "Field cannot begins/ends with space");{
//	System.out.println(Title1);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_TermCode("1^");
//	String Title2 = productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title2, "Term Code should contain only positive numbers");{
//    System.out.println(Title2);}
//	productcontroladd.ThreadSleep();
//	
//    productcontroladd.Negative_TermCode("~");
//	String Title3 = productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title3, "Term Code should contain only positive numbers");{
//	System.out.println(Title3);	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Clear_Code();
//	
//	for(int i=1;i<=11;i++)
//	{
//    productcontroladd.Maximum_Code("a");}
//	String Title5 = productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title5, "Term Code should be between 1-10 characters Term Code should contain only positive numbers");{
//	System.out.println(Title5);	}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_TermCode("1  1");
//	String Title6= productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title6, "Term Code should contain only positive numbers");{
//	System.out.println(Title6);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Negative_TermCode("1 ");
//	String Title7= productcontroladd.TermCode_Err();
//	Assert.assertEquals(Title7, "Field cannot begins/ends with space");{
//    System.out.println(Title7);}
//	productcontroladd.ThreadSleep();
//	
//	productcontroladd.Clear_Code();
//	productcontroladd.TermCode("123");
//}
@Test(priority=12)
public void Negative_Longvalue() throws InterruptedException
{
	productcontroladd.Negative_LongValue("  ");
	String Title = productcontroladd.LongValue_Err();
	Assert.assertEquals(Title, "Field cannot begins/ends with space");{
		System.out.println(Title);
	}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Negative_LongValue(" a");
	String Title1 = productcontroladd.LongValue_Err();
	Assert.assertEquals(Title1, "Field cannot begins/ends with space");{
	System.out.println(Title1);}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Negative_LongValue("@");
	String Title2 = productcontroladd.LongValue_Err();
	Assert.assertEquals(Title2, "Long Value should be between 2-255 characters");{
    System.out.println(Title2);}
	productcontroladd.ThreadSleep();
	
    productcontroladd.Negative_LongValue("a^");
	String Title3 = productcontroladd.LongValue_Err();
	Assert.assertEquals(Title3, "Long Value should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");{
	System.out.println(Title3);	}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Clear_Long();
	
	for(int i=1;i<=256;i++)
	{
    productcontroladd.Maximum_Long("a");}
	String Title5 = productcontroladd.LongValue_Err();
	Assert.assertEquals(Title5, "Long Value should be between 2-255 characters");{
	System.out.println(Title5);	}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Negative_Term("a");
	String Title4 = productcontroladd.LongValue_Err();
	Assert.assertEquals(Title4, "Long Value should be between 2-255 characters");{
    System.out.println(Title4);}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Negative_LongValue("1  1");
	String Title6= productcontroladd.LongValue_Err();
	Assert.assertEquals(Title6, "Long Value should contain only alphanumeric values and special characters(_@!`%*()=${};:<>.'\"/#&+-?)");{
	System.out.println(Title6);}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Negative_LongValue("1 ");
	String Title7= productcontroladd.LongValue_Err();
	Assert.assertEquals(Title7, "Field cannot begins/ends with space");{
    System.out.println(Title7);}
	productcontroladd.ThreadSleep();
	
	productcontroladd.Clear_Long();
	productcontroladd.LongValue("ms@321");
}























}








































