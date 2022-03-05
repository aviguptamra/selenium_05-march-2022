package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		

		
		
		driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
		
		driver.findElement(By.xpath("//button[text()='Open Window']"));
		
		driver.findElement(By.xpath("//a[contains(text(),'Open T')]"));
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1' or @name='checkBoxOption1']"));
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1' and @name='checkBoxOption1']"));
		
		driver.findElement(By.xpath("//input[starts-with(@id,'checkBoxOption1')]"));
		
		driver.findElement(By.xpath("//td[text()='Alex']//following-sibling::td[1]"));
		
		driver.findElement(By.xpath("//td[text()='Engineer']//preceding::td[text()='Alex']"));
		
				
		
		
		
		
		
	}
	

}
