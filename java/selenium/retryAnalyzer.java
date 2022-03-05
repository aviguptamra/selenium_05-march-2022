package selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer{
	
	int count=0;
	int limit=2;
	
	public boolean retry(ITestResult result)
	{
		if(count<limit)
		{
			count++;
			
			return true;
		}
		
		return false;
	}

	
	
	
	

}
