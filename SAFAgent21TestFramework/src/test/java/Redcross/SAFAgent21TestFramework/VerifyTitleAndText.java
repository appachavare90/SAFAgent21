package Redcross.SAFAgent21TestFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleAndText {
	@Test
	public void titleTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		SoftAssert softassert=new SoftAssert();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBaydf";
		String actualResult=driver.getTitle();
		softassert.assertEquals(actualResult, expectedTitle);
		System.out.println("Verify the text");
		WebElement searchButton=driver.findElement(By.id("gh-btn"));
		String actualText=searchButton.getAttribute("value");
		String expectedText="Search";
		softassert.assertEquals(actualText, expectedText);
		System.out.println("browser close");
		softassert.assertAll();
	}

}
