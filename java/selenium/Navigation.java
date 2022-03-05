

package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Navigation {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		
	    driver.navigate().back();
	    
	    driver.navigate().forward();
	    
	    driver.navigate().refresh();
	    
	    
	    Actions act=new Actions(driver);
	    
	    act.sendKeys(Keys.F5).build().perform();
		
		
	}
	

}
