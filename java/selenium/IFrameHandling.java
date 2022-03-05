package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameHandling {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
	  
		driver.switchTo().frame(0);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe-name");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("alertbtn")).click();
		
		
	}
	

}
