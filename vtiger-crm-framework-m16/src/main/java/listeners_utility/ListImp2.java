package listeners_utility;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListImp2 implements IRetryAnalyzer {
	int count = 0;
	int initCount = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (count < initCount) {
			count++;
			return true;
		}else {
			return false;
		}
	}

	@Test(retryAnalyzer = listeners_utility.ListImp2.class)
	public void add() {
		System.out.println("hey there");
		Assert.assertTrue(false);
	}
}
