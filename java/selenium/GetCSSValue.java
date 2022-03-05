package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCSSValue {
	
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		WebElement Gmail= driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		
		String background=Gmail.getCssValue("background-color");
		System.out.println(background);
		
		
		String color=Gmail.getCssValue("color");
		System.out.println(color);
		
		
		String FontFamily=Gmail.getCssValue("font-family");
		System.out.println(FontFamily);
		
		
		String FontSize=Gmail.getCssValue("font-size");
		System.out.println(FontSize);
		
	}
	

}
