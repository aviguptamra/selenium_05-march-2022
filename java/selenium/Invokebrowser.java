package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invokebrowser {
	
	@Test
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		
	}
	

}
