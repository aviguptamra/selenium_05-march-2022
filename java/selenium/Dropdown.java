package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	@Test()
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		Select sel=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		sel.selectByIndex(1);
		sel.selectByValue("option2");
		sel.selectByVisibleText("Option3");
		
		
		WebElement GetFirstSelectedOption=sel.getFirstSelectedOption();
		String GetFirstSelectedOption_Text_Value=GetFirstSelectedOption.getText();
		System.out.println(GetFirstSelectedOption_Text_Value);
	  
		
		List<WebElement> GetOptions= sel.getOptions();
		int Size=GetOptions.size();
		System.out.println(Size);
		
		
		for(WebElement ele : GetOptions)
		{
			String GetAllOptions_Value_Text=ele.getText();
			System.out.println(GetAllOptions_Value_Text);
		}
		
		
	  
	    driver.get("https://demoqa.com/select-menu");
	  
	    Select select=new Select(driver.findElement(By.id("cars")));
	   
	    select.selectByIndex(0);
	    select.selectByValue("opel");
	    select.selectByVisibleText("Audi");
	    
	    List<WebElement>Ele= select.getAllSelectedOptions();
	    int getAllSelectedOptions_Size=Ele.size();
	    System.out.println(getAllSelectedOptions_Size);
	    
	    
	    for(WebElement ele:Ele)
	    {
	    	String Text=ele.getText();
	    	System.out.println(Text);
	    }
	    
	  
	    select.deselectByIndex(0);
	    
	    select.deselectAll();

  } 

}