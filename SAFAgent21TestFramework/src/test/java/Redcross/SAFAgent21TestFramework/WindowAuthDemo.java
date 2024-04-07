package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAuthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://appa.chavare@redcross.org:Mynameiswaghmode12@saf.dev.redcross.org/bolt/sql.asp");
		
	}

}
