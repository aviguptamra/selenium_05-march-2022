package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		
	    driver.findElement(By.id("autocomplete"));
	    
	    driver.findElement(By.name("checkBoxOption1"));
	    
	    driver.findElement(By.xpath("//input[@name='radioButton']"));
	    
	    driver.findElement(By.cssSelector("input#name"));
	    
	    driver.findElement(By.className("radioButton"));
	    
	    driver.findElement(By.linkText("Discount Coupons"));
	    
	    driver.findElement(By.partialLinkText("Latest N"));
	    
	    driver.findElement(By.tagName("a"));
	    
	    
		
		
		
		
		
		
	}
	

}
