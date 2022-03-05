 package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDown {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> Ele= driver.findElements(By.xpath("//ul[@role='menu']//li"));
		int Size=Ele.size();
		System.out.println(Size);
		
		
		for(WebElement ele: Ele) {
			
			String Text=ele.getText();
			System.out.println(Text);
			
			if(Text.equalsIgnoreCase("Java Script"))
			{
				ele.click();
				break;
			}
		}
		
	
 }
		
	}
		
		
		
		
		
		
		
		
		
		
		
	

