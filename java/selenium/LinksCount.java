package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksCount {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> List= driver.findElements(By.tagName("a"));
		int Size=List.size();
		System.out.println(Size);
		
		for(WebElement ele:List)
		{
			String Ele=ele.getText();
			System.out.println(Ele);
		}
		
		
		 WebElement Ele=driver.findElement(By.id("gf-BIG"));
		 List<WebElement> ele= Ele.findElements(By.xpath("//div[@id='gf-BIG']//li"));
		 int eleSize=ele.size();
		 System.out.println(eleSize);
		
		 
		 for(WebElement web:ele)
		 {
			 String Text=web.getText();
			 System.out.println(Text);
		 }
		 
		 
		String Home_Link_Open_In_Another_Tab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		 
		 driver.findElement(By.xpath("//button[text()='Home']")).sendKeys(Home_Link_Open_In_Another_Tab);
		 
		 
		 
		
	}
	

}
