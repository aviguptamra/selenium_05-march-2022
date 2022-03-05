package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttribute {
	
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		WebElement GmailLink=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		String Class_Attribute=GmailLink.getAttribute("class");
		System.out.println(Class_Attribute);
		
		String data_pid_Attribute=GmailLink.getAttribute("data-pid");
		System.out.println(data_pid_Attribute);
		
		String HREF_Attribute=GmailLink.getAttribute("href");
		System.out.println(HREF_Attribute);
		
		String InnerHTML=GmailLink.getAttribute("innerHTML");
		System.out.println(InnerHTML);
		
	}
	

}
