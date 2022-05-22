package Retryfailed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryfail implements IRetryAnalyzer {
	int counter = 0;
	int Retrylimit=3;
	public boolean retry(ITestResult result) {
		if(counter<Retrylimit) {
			counter++;
			return true;
		}
		return false;
	}

}
