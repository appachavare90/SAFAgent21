package Redcross.SAFAgent21TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClickDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		driver.manage().window().maximize();
		
//		WebElement element=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		
		Actions action=new Actions(driver);
//		
//		//action.contextClick(element).perform();//right click action on button
//		
//		action.doubleClick().perform();
		
		WebElement source=driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		//WebElement target=driver
		

	}

}
