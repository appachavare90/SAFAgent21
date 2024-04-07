package Redcross.SAFAgent21TestFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	@Test
	public void takeScreenshotDemoTest() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		
//		File Source=ts.getScreenshotAs(OutputType.FILE);
//		
//		File Target=new File(".\\screenshots\\Appa.png");
//		
//		FileUtils.copyFile(Source, Target);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\\\screenshots\\\\Appa.png");
		FileUtils.copyFile(source, target);
		
	}

}
