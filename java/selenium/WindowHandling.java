package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("openwindow")).click();
		
		
		String ParentWindow=driver.getWindowHandle();
	    System.out.println(ParentWindow);
	    
	    
	    Set<String> ChildWindow= driver.getWindowHandles();
	    int Size=ChildWindow.size();
	    System.out.println(Size);
	    System.out.println(ChildWindow);
	    
	    
	    for(String win:ChildWindow)
	    {
	    	if (!ParentWindow.equalsIgnoreCase(win)) 
	    	
	    	{
	    		
	    		driver.switchTo().window(win);
	    		
	    		String Title=driver.getTitle();
	    		System.out.println(Title);
				
			}
	    	
	   
	    }
		
	 	driver.switchTo().window(ParentWindow);
    	
    	String ParentTitle=driver.getTitle();
    	System.out.println(ParentTitle);
	
	
	}	

}
