package Redcross.SAFAgent21TestFramework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WIndowsHandleDemo {
	@Test
	public void windowHandlesDemoTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentWindow=it.next();
		
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.linkText("Contact")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).sendKeys("Appa");
		System.out.println(driver.getTitle());
	}

}
