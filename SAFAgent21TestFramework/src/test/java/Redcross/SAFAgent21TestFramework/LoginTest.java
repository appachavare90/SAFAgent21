package Redcross.SAFAgent21TestFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeTest
	public void loginTestApplication()
	{
		System.out.println("Login to test application");
	}
	
	@AfterTest
	public void logoutTestApplication()
	{
		System.out.println("logout to test application");
	}
	@BeforeMethod
	public void connetiontoDB()
	{
		System.out.println("database connected");
	}
	@AfterMethod
	public void closedDBConnection()
	{
		System.out.println("database closed");
	}
	@Test(priority = 1)
	public void blogitest()
	{
		System.out.println("test1");
	}
	@Test(priority = 2,groups = "smoke")
	public void alogout()
	{
		System.out.println("test2");
	}

}
