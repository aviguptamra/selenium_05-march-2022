package selenium;

import org.testng.annotations.Test;

public class TestNGDependOnMethod {
	
	

	
	@Test(dependsOnMethods = "teardown")
	public void setup()
	{
		
	}
	
	@Test
	public void teardown()
	{
		
	}
	
	@Test(dependsOnMethods = "setup")
	public void geardown()
	{
		
	}
	

}
