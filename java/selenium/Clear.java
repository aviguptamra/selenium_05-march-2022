package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clear {
	
	
	
		@Test
		public void setup() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://www.google.com");
			
			
			
			WebElement Textbox=driver.findElement(By.name("q"));
			Textbox.sendKeys("Selenium");
			
			Textbox.clear();
			
		}
	

}
