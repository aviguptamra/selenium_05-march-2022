package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert ConfirmAlert=driver.switchTo().alert(); 
		ConfirmAlert.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert PromptAlert=driver.switchTo().alert();
		PromptAlert.sendKeys("Prompt Alert");
		String PromptAlert_Text=PromptAlert.getText();
		System.out.println(PromptAlert_Text);
		PromptAlert.accept();
		
		
		
	    
		
	}
	

}
