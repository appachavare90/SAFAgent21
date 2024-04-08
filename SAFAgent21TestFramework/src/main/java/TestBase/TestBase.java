package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initilization()
	{
		//String browserName=prop.getProperty("browser");
		String browserName="chrome";
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chromedriver-win32\\chromedriver.exe");
//			ChromeOptions options=new ChromeOptions();
//			options.setBinary("C:\\Users\\61023716\\OneDrive - LTIMindtree\\Desktop\\Selenium\\chrome-win64\\chrome-win64\\chrome.exe");
			//driver=new ChromeDriver();
			//WebDriverManager.chromedriver().browserVersion("119.0.6045.106");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins");
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.get("https://saf.test.redcross.org/agent/console/filters/mywork");
		
	}

}
