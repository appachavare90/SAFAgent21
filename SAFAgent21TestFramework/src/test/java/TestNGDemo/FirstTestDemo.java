package TestNGDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ITestListenerCLass.class)
public class FirstTestDemo {
	@Test
	public void testGoogle()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		assertEquals(actTitle, "selenium - Google Search");
	}
	@Test
	public void testFacebook()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("appachavare");
		driver.findElement(By.id("pass")).sendKeys("Password12!@");
		driver.findElement(By.id("loginbutton")).click();
		String actErrorMessage=driver.findElement(By.xpath("//div[@id='error_box']/div")).getText();
		assertEquals(actErrorMessage, "Wrong credentials");
		
	}
	
	@Test
	public void test()
	{
		String a="120";
		int b=120;
		assertEquals(Integer.parseInt(a),b , "Test Pass");
	}

}
