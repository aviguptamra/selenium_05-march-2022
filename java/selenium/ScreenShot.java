package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	public void setup_1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./ScreenShots/"+"FullScreenShot"+".png"));
	
		WebElement Textbox=driver.findElement(By.id("autocomplete"));
		File TextboxFile=Textbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(TextboxFile, new File("./ParticularWebElementScreenShot/"+"TextboxWebElementScreenShot"+".png"));
		
		
		WebElement Section=driver.findElement(By.id("gf-BIG"));
	    File ParticularSection= Section.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(ParticularSection, new File("./ParticularSectionScreenShot/"+"ParticularSectionScreenShot"+".png"));
		
	}
	

}
