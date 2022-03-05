package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InnerIFrameHandling {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames");
		
		
		//driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		
		driver.switchTo().frame("iamframe");
		
		driver.switchTo().frame(driver.findElement(By.id("frame3")));
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iframe");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		
		
		
		
	}
	

}
