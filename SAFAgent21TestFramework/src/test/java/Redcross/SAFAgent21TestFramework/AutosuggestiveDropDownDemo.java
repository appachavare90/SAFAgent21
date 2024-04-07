package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDownDemo {

	public void autosuggestiveDropDownDemoTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
