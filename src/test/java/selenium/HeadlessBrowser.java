package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	
	
  @Test
  public void f() {
	  

	 // System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	  
  }
}
