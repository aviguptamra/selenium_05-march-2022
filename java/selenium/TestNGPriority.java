package selenium;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority = 3)
	public void setup()
	{
		
	}
	
	@Test(priority = 2)
	public void teardown()
	{
		
	}
	
	@Test(priority = 1)
	public void bear()
	{
		
	}
	
	

}
