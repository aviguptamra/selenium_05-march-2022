package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTip {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32(87)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Mouse Hover']"))).build().perform();
		
		WebElement MouseHover_Text=driver.findElement(By.xpath("//a[text()='Top']"));
		String Get_MouseHover_Text=MouseHover_Text.getText();
		System.out.println(Get_MouseHover_Text);
		
		Assert.assertEquals(Get_MouseHover_Text, "Top");
		
		
	}
	

}
