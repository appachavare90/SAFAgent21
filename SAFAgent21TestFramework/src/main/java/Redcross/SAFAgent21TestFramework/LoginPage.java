package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='notification-message']")
	WebElement emptyCredentials;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgotPassword;
	
	@FindBy(className ="a5-logo-signin")
	WebElement agentLogo;
	//Initializing the objects
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateAgentLogo() {
		return agentLogo.isDisplayed();
		
	}
	
	public String validateForgotPasswordLink() {
		return forgotPassword.getText();
	}
	//method to perform login
	public void login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		loginBtn.click();
		//return new HomePage();
	}
	
	public String validateLoginWithEmptyCredentials()
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		loginBtn.click();
		return emptyCredentials.getText();
	}
	
	public String validateLoginWithInvalidCredentials(String un,String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		loginBtn.click();
		return emptyCredentials.getText();
	}
	
	public String validateURL()
	{
		return driver.getCurrentUrl();
	}

}
