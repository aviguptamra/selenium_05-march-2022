package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelector {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("input.radioButton"));
		
		driver.findElement(By.cssSelector("input#autocomplete"));
		
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']"));
		
		driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		
		driver.findElement(By.cssSelector("a[class='btn-style class1 class2']"));
		
		driver.findElement(By.cssSelector("input[type='submit']"));
		
		
		
		
		
		
		
	}
	

}
