package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		
	    driver.findElement(By.name("q")).sendKeys("Selenium");
	    
	    Thread.sleep(3000);
	    
	  List<WebElement> List= driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	  int List_Size=List.size();
	  System.out.println(List_Size);
	  
	  for(WebElement ele: List)
	  {
		  String List_Text_Value=ele.getText();
		  System.out.println(List_Text_Value);
		  
		  if(List_Text_Value.equalsIgnoreCase("SELENIUMHQ"))
		  {
			  ele.click();
			  break;
		  }
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
