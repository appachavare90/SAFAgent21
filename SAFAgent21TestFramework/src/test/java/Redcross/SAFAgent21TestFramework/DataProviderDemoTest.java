package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderDemoTest {
	
	@Test(dataProvider = "test",dataProviderClass = DataProviders.class)
	public void testMethod1(String firstName,String midleName,String lastName)
	{
		System.out.println("FirstName="+firstName);
		System.out.println("Middle Name="+midleName);
		System.out.println("LastName="+lastName);
	}
	
	@Test(dataProvider = "test",dataProviderClass = DataProviders.class)
	public void testMethod2(String firstName,String lastName)
	{
		System.out.println("FirstName="+firstName);
	
		System.out.println("LastName="+lastName);
	}
	
		
}
