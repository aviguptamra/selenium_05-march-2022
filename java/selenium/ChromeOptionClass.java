package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionClass {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--incognito");
		
		//opt.addArguments("--headless");
		
		opt.addArguments("disable--inforbars");

		opt.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		
		
		
	}
	

}
