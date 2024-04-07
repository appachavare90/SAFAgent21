package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandlesDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().minimize();
		////table[@id="customers"]/tbody/tr[2]/td[1]
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		for (int i = 2; i <=7; i++) {
			
			String actualXpath=beforeXpath+i+afterXpath;
			
		WebElement element=driver.findElement(By.xpath(actualXpath));
		System.out.println(element.getText());
		
		if(element.getText().equals("Island Trading"))
		{
			System.out.println("Company name is found");
			break;
		}
			
		}
	}

}
