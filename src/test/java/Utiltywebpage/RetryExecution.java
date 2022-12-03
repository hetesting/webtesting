package Utiltywebpage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
// in order to implement this we need to add parameter retryAnalyzer after @test annotation
public class RetryExecution implements IRetryAnalyzer
{
	private int retryCount=0;
	private static final int maxRetryCount=0;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(retryCount<maxRetryCount)
		{
			retryCount++;
			return true;
		}
		return false;
	}

}
