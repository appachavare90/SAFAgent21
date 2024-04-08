package TestCases;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Redcross.SAFAgent21TestFramework.LoginPage;
import TestBase.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	//HomePage homePage;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage=new LoginPage();
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		//driver.quit();
	}
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String title=loginPage.validateLoginPageTitle();
		assertEquals(title, "Agent");
	}
	@Test(priority = 2)
	public void safAgentLogoTest()
	{
		boolean flag=loginPage.validateAgentLogo();
		assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void forgotPasswordLinkTest()
	{
		String forgotpasswordlink=loginPage.validateForgotPasswordLink();
		assertEquals(forgotpasswordlink,"Forgot your password?");
	}
	
	@Test(priority = 4)
	public void loginTest() {
		loginPage.login("tsafmgmt", "Password1!");
		String actUrl=loginPage.validateURL();
		String expectedUrl="https://saf.test.redcross.org/agent/console/filters/mywork";
		assertEquals(actUrl, expectedUrl);
	}
	@Test(priority = 5)
	public void loginEmptyCredentialsTest() {
		String actMessage=loginPage.validateLoginWithEmptyCredentials();
		String expectedMessage="UserName Password cannot be empty";
		assertEquals(actMessage, expectedMessage);
	}
	
	@Test(priority = 6)
	public void loginInvalidCredentialsTest() {
		String actMessage=loginPage.validateLoginWithInvalidCredentials("Appa123", "Password123");
		String expectedMessage="The user name or password is not correct.";
		assertEquals(actMessage, expectedMessage);
	}

}
