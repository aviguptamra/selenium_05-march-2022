package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class selenumGrid {
	
	
	public void grid() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		WebDriver driver=new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),cap);
        
		
		
		//java -jar selenium standlone.jar -role hub
		//java -Dwebdriver.chrome.driver="browser driver.exe file" - jar -role node -hub http://127.0.0.1:4444/wd/hub
		
	
	
		
		
		
	}
	
	
	

}
