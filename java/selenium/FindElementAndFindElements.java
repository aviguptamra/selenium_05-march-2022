package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementAndFindElements {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		
	   WebElement Link=driver.findElement(By.linkText("Gmail"));
	   String Gmail_Link_Text=Link.getText();
	   System.out.println(Gmail_Link_Text);
		
	   
	   
	   List<WebElement>List= driver.findElements(By.tagName("a"));
	   int Size=List.size();
	   System.out.println(Size);
	   
	   
	   for(WebElement ele: List)
	   {
		  String Link_Text= ele.getText();
		  System.out.println(Link_Text);
	   }
			
	}
	

}
