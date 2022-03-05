package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNGExpectedException {
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com");
				
		Actions act=new Actions(driver);
		
		act.clickAndHold(driver.findElement(By.xpath("//span[text()='Tutorial1']"))).build().perform();
		
	}
	
	
	
	

}
