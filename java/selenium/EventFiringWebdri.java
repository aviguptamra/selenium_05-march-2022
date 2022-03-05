package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EventFiringWebdri {
	
	@Test
	public void setup() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		WebdriverListener listener=new WebdriverListener();
		event.register(listener);
		
		event.get("https://www.myntra.com");//Before navigate //After navigate
		
		event.navigate().back();//beforeNavigateBack //afterNavigateBack
		
		event.navigate().forward();//beforeNavigateForward //afterNavigateForward
		
		event.findElement(By.cssSelector("input.desktop-searchBar"));
		
		event.findElement(By.cssSelector("input.desktop-searchBar"));

		
		

		
		
	}
	

}
