package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	@Test
	public void setup() throws InterruptedException, MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> Links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		int Size=Links.size();
		System.out.println(Size);
		
		
		for(WebElement ele:Links)
		{
			String Text=ele.getAttribute("href");
			
			HttpURLConnection connect=(HttpURLConnection)new URL(Text).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int RC=connect.getResponseCode();
			System.out.println(RC);
			String RM=connect.getResponseMessage();
			System.out.println(RM);
			
		}
		
		
		
	}
	

}
