package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.xpath.operations.Or;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sorting {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
		
		List<WebElement> List= driver.findElements(By.xpath("//td[1]"));
		
		
		List<String> OriginalList=List.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(OriginalList);
		
		
		List <String> SortedList= OriginalList.stream().sorted().collect(Collectors.toList());
		System.out.println(SortedList);
		
	}
	

}
