package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTableData {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		
		List<WebElement> FullList= driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int Size=FullList.size();
	    System.out.println(Size);
	    
	    
	    for(WebElement ele: FullList)
	    {
	    	String Text=ele.getText();
	    	System.out.println(Text);
	    	
	    	
	    }
	    
	    System.out.println("--------------------");
	    
	    
	   List<WebElement> ele= driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	   int eleSize=ele.size();
	   System.out.println(eleSize);
	   
	   int sum=0;
	   
	    for(int i=0;i<ele.size();i++)
	    	
	    {
	    	
	    	WebElement Get=ele.get(i);
	    	String Text=Get.getText();
	    	System.out.println(Text);
	    	
	    	int Actual=Integer.parseInt(Text);
	    	System.out.println(Actual);
	    	
	    	sum=sum+Actual;
	    	
	    }
	    
	    	System.out.println(sum);
	    
	    	
	    
		WebElement Total=driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']"));
		String Total_Text=Total.getText();
		System.out.println(Total_Text);
		
		String Split=Total_Text.split(":")[1].trim();
		System.out.println(Split);
		
		int Expected=Integer.parseInt(Split);
		System.out.println(Expected);
		
 }
	
}