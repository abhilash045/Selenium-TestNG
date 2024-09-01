package TestNGCLAssignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//WAP using IRetryAnalyzer?

public class Assignment200 implements IRetryAnalyzer {

	int counttestcase = 0;
	int retrycount = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (counttestcase < retrycount) {
			counttestcase++;

			return true;
		}

		return false;
	}

}
