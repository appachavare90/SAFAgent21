package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	@DataProvider(name="loginTestData")
	public Object[][] getData()
	{
		return new Object[][] {{"tsafmgmt","Password1!"},{"tsysadmin","Password1!"}};
	}
	@Test(dataProvider = "loginTestData")
	public void verifyLogin(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://saf.dev.redcross.org/Agent/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
}
