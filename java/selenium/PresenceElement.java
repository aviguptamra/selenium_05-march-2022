package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PresenceElement {
	
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement Displayed=driver.findElement(By.id("checkBoxOption1"));
		boolean IsDisplayed=Displayed.isDisplayed();
		System.out.println(IsDisplayed);
		
		
		WebElement Enabled=driver.findElement(By.id("alertbtn"));
		boolean IsEnabled=Enabled.isEnabled();
		System.out.println(IsEnabled);
		
		
		WebElement Selected= driver.findElement(By.id("checkBoxOption1"));
		boolean IsSelected=Selected.isSelected();
		System.out.println(IsSelected);
	}
	

}
