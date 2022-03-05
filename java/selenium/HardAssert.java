package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	@Test(retryAnalyzer = retryAnalyzer.class)
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement ele=driver.findElement(By.id("alertbtn"));
		String Value=ele.getAttribute("value");
		System.out.println(Value);
		
		Assert.assertEquals(Value, "Aler");
		
		driver.findElement(By.id("alertbtn")).click();
		
		
	}
	

}
