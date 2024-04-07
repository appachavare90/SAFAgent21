package Redcross.SAFAgent21TestFramework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://timesofindia.indiatimes.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='clickhere']")).click();
		
//		String windowsID=driver.getWindowHandle();
//		System.out.println(windowsID);
		driver.findElement(By.xpath("//a[text()='India']")).click();
		
	Set<String> windowIds=driver.getWindowHandles();
	
	Iterator<String> it=windowIds.iterator();
	String parentWindow=it.next();
	String childWindow=it.next();
	System.out.println("Parent Window="+parentWindow);
	System.out.println("Child Window="+childWindow);
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
	driver.switchTo().window(childWindow);
	System.out.println(driver.getTitle());
	
		
		
		
		
		
	}

}
