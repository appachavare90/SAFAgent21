package Redcross.SAFAgent21TestFramework;

import org.testng.annotations.Test;

public class GroupDemoTest {
	@Test(priority = 1,groups = {"smoke", "regression"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 2,groups = {"sanilty"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 3,groups = "regression")
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(priority = 4,groups = "smoke")
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(priority = 5,groups = "sanity")
	public void test5()
	{
		System.out.println("test5");
	}
	@Test(priority = 6,groups = "adhoc")
	public void test6()
	{
		System.out.println("test6");
	}

}
