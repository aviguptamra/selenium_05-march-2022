package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		

		SoftAssert ass=new SoftAssert();
		
		WebElement Home=driver.findElement(By.xpath("//button[text()='Home']"));
		String Text=Home.getText();
		System.out.println(Text);
		
		ass.assertEquals(Text, "Homeeee");
		
		driver.findElement(By.id("openwindow")).click();
		
		ass.assertAll();
		
		
	}
	

}
