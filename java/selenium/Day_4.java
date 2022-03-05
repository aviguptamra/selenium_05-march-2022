package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_4 {
	
	WebDriver driver;
	
		@Test
		public void setup() throws InterruptedException, IOException
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/v4/");
			
			
			
			WebElement UserName=driver.findElement(By.xpath("//input[@name='uid']"));
			UserName.sendKeys("mngr328922");
			
			WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
			Password.sendKeys("bupYtYn");
			
			WebElement LoginButton=driver.findElement(By.xpath("//input[@value='LOGIN']"));
			LoginButton.click();
			
			String ActualURL=driver.getCurrentUrl();
			
			String ExpectedURL="http://demo.guru99.com/v4/manager/Managerhomepagee.php";//forcefully put invalid url to take the failed test case screenshot
			
			if(ExpectedURL.equalsIgnoreCase(ActualURL))
				
			{
				System.out.println("Passed");
			}
			
			else
			{
				System.out.println("Failed");
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				File file=ts.getScreenshotAs(OutputType.FILE);
				
				
				
				Date date=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy_hhmmss");
				String timeStamp=sdf.format(date);
				
				String Filename="Image"+timeStamp;
				
				FileUtils.copyFile(file, new File("./screenshot/"+Filename+".png"));
			}
			
			Assert.assertEquals(ActualURL, ExpectedURL);
			
			
			
			
		}
	

}
