package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		Thread.sleep(3000);
		
		
		Actions act=new Actions(driver);
		
		//Action action=(Action)driver;
		//action.perform();
		
		act.clickAndHold(driver.findElement(By.xpath("//a[text()='Men']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Formal Shirts']"))).build().perform();
		act.contextClick(driver.findElement(By.xpath("//a[text()='Men']"))).build().perform();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		act.doubleClick(driver.findElement(By.id("checkBoxOption1"))).build().perform();
		
		act.sendKeys(driver.findElement(By.id("autocomplete")), Keys.NUMPAD4).build().perform();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Selenium");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("name")).sendKeys(Keys.CONTROL+"v");
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		act.dragAndDrop(driver.findElement(By.xpath("//a[text()=' 5000']")),driver.findElement(By.id("amt7"))).build().perform();
		
		
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		act.dragAndDropBy(driver.findElement(By.id("selectable")), 0, 300).build().perform();
	
		
	}
	

}
