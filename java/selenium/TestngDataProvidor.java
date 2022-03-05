package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvidor {
	
	@Test(dataProvider = "data")
	public void setup(String un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.findElement(By.id("autocomplete")).sendKeys(un);
		driver.findElement(By.id("autocomplete")).sendKeys(pwd);
	
		
		
		
	}
	     @DataProvider
	    public Object[][] data()
	    
	    {
	    	
	    	Object[][] obj=new Object[3][2];
	    	
	    	
	    	obj[0][0] ="avi.gupta";
	    	obj[0][1]="cspl@1234";
	    	obj[1][0]="avigupta";
	    	obj[1][1]="cspl";
	    	obj[2][0]="avi.g";
	    	obj[2][1]="cspl.@1234";
	    	
			return obj;
	    	
	    	
        	 
        }
	

}
